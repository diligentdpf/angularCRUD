var autoSystem = angular.module("autoSystem",['ngRoute']);

autoSystem.controller('APIController',function($scope,$http){
	$scope.queryList = function(){
		var tempUrl = "apiTest"
		 $http(
				 {
					 url:tempUrl,
					 method:"POST",
					 data:{id:"1",pid:"4et4"},
				 }
				 ).success(function(data, status, headers, config){
			 $scope.item = data;
         }).error(function(data, status, headers, config){
         
         })
     }
});

autoSystem.controller("formController",function($scope,$http){
	$scope.save = function(user){
		var tempUrl = "add"
		$http(
				{
						method:"POST",
						url:tempUrl,
						data:user
				}
				
		).success(function(data, status, headers, config){
			 $scope.user.name="";
			 $scope.user.realname="";
             $scope.msg=data;
         }).error(function(data, status, headers, config){
             alert("error");
         })
	}
});


autoSystem.controller("angularController",function($scope,$http){
	
	$scope.auglarTest = function(){
		var value  = $scope.testFiled;
		var tempUrl = "angularTest";
		$http(
				{
						method:"GET",
						url:tempUrl,
						params: {"id":value}//get请求发送
				}
		).success(function(data, status, headers, config){
			$scope.result = data;
         }).error(function(data, status, headers, config){
             alert("error");
         })
	}
});


autoSystem.controller("angularPostController",function($scope,$http){
	
	$scope.save = function(){
		var tempUrl = "angularPostTest";
		$http(
				{
						method:"POST",
						url:tempUrl,
						data: {"mobile.name":$scope.mobile.name,"mobile.mobile":$scope.mobile.mobile}//get请求发送
				}
		).success(function(data, status, headers, config){
			$scope.result = data;
         }).error(function(data, status, headers, config){
             alert("error");
         })
	}
});