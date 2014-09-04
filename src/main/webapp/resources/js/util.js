/***
 * Controller to handle interfacing with the RESTful endpoint
 */
$.ajaxSetup({
    cache:false,
});

var utils = {
    _url:'',
    setup:function (u) {
        this._url = u;
    },
    url:function (u) {
        return this._url + u;
    },
    get:function (url, data, cb) {
        $.ajax({
            type:'GET',
            url:url,
            cache:false,
            dataType:'json',
            contentType:'application/json; charset=utf-8',
            success:cb,
            error: function (xhr, ajaxOptions, thrownError) {
            	if(xhr.status == 901) {
            		alert("로그인이 필요합니다.");
            		location.href = "/login";
            	} else {
            		alert('error trying to retrieve ' + url + '.\r' + xhr.status + "/" + thrownError);
            	}
            }
        });
    },
    put:function (url, data, cb) {
        var k = '_method',
            v = 'PUT';
        data[k] = v;
        var headers = {};
        headers[k] = v;
        $.ajax({
            type:'POST',
            url:url,
            cache:false,
            data:data,
            headers:headers,
            success:function (result) {
                cb(result);
            },
            error: function (xhr, ajaxOptions, thrownError) {
            	if(xhr.status == 901) {
            		alert("로그인이 필요합니다.");
            		location.href = "/login";
            	} else {
            		alert('error PUT\'ing to url ' + url + '.\r' + xhr.status + "/" + thrownError);
            	}
            }
        });
    },
    post:function (u, data, cb) {
        $.ajax({
            type:'POST',
            url:u,
            cache:false,
            dataType:'json',
            data:data,
            contentType:'application/json; charset=utf-8',
            success:cb,
            error: function (xhr, ajaxOptions, thrownError) {
            	if(xhr.status == 901) {
            		alert("로그인이 필요합니다.");
            		location.href = "/login";
            	} else {
            		alert('error trying to post to ' + u + '.\r' + xhr.status + "/" + thrownError);
            	}
            }
        });
    }
};

var NavigationCtrl = function ($scope, $location) {
	$scope.relativePath = $location.absUrl().substr("http://".length, $location.absUrl().length);
	$scope.relativePath = $scope.relativePath.substr($location.$$host.length, $scope.relativePath.length);
	if($location.$$port != 80) $scope.relativePath = $scope.relativePath.substr((":"+$location.$$port).length, $scope.relativePath.length);
	
	$scope.isLoaded = function(path) {
	    if ($scope.relativePath === path) return "active";
	    else return "";
	};
};