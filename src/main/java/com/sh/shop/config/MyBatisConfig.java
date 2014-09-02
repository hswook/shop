package com.sh.shop.config;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import oracle.jdbc.driver.OracleDriver;

import java.beans.PropertyVetoException;
import java.io.IOException;

/**
 * MyBatis 설정 빈
 *
 * MapperScan은 spring.examples.module 패키지 이하에서 {@link spring.examples.core.mybatis.Mapper}
 * 애노테이션이 선언된 클래스를 찾아 스프링 빈으로 등록한다.
 *
 * @author arawn.kr@gmail.com
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.sh.shop", annotationClass = org.springframework.stereotype.Repository.class)
public class MyBatisConfig {
	
//	@Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String jdbcUrl;
//    @Value("${jdbc.username}")
//    private String jdbcUserName;
//    @Value("${jdbc.password}")
//    private String jdbcPassword;
	
	@Bean
    public ComboPooledDataSource dataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
        try {
			dataSource.setDriverClass("oracle.jdbc.driver.OracleDriver");
	        dataSource.setJdbcUrl("jdbc:oracle:thin:@110.45.144.55:1521:ORCLPMO");
	        dataSource.setUser("petshop");
	        dataSource.setPassword("petshop");
	        dataSource.setIdleConnectionTestPeriod(60);
	        dataSource.setPreferredTestQuery("SELECT 1 FROM DUAL");
	        dataSource.setTestConnectionOnCheckin(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return dataSource;
    }

    /**
     * myBatis의 {@link org.apache.ibatis.session.SqlSessionFactory}을 생성하는 팩토리빈을 등록한다.
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(
    		ComboPooledDataSource dataSource, ApplicationContext applicationContext) throws IOException {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();

        // 마이바티스가 사용한 DataSource를 등록
        factoryBean.setDataSource(dataSource);

        // 마이바티스 설정파일 위치 설정
        factoryBean.setConfigLocation(applicationContext.getResource("classpath:sqlmap-config.xml"));

        // spring.examples.model 패키지 이하의 model 클래스 이름을 짧은 별칭으로 등록
        factoryBean.setTypeAliasesPackage("com.sh.shop.domain");

        // META-INF/mybatis/mappers 패키지 이하의 모든 XML을 매퍼로 등록
        factoryBean.setMapperLocations(applicationContext.getResources("classpath*:sqlmap*/**/*.xml"));

        return factoryBean;
    }

    /**
     * 마이바티스 {@link org.apache.ibatis.session.SqlSession} 빈을 등록한다.
     *
     * SqlSessionTemplate은 SqlSession을 구현하고 코드에서 SqlSession를 대체하는 역할을 한다.
     * 쓰레드에 안전하게 작성되었기 때문에 여러 DAO나 매퍼에서 공유 할 수 있다.
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory, ExecutorType.SIMPLE);
    }
    
    @Bean
    DataSourceTransactionManager transactionManager(ComboPooledDataSource dataSource){
    	DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
    	
    	dataSourceTransactionManager.setDataSource(dataSource);
    	
    	return dataSourceTransactionManager;
    }

}