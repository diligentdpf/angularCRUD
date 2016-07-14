mobile.controller("queryMobileController",function($scope,$http){
	
		$scope.queryMobile = function(){
				
				var tempUrl = "queryMobile";
				$http(
						{
								method:"GET",
								url:tempUrl
						}
				).success(function(data, status, headers, config){
		             $scope.results=data;
		         }).error(function(data, status, headers, config){
		             alert("error");
		         })
			}
});

mobile.controller("addMobileController",function($scope,$http){

	$scope.save = function(){
		
		var tempUrl = "doAddMobile";
		$http(
				{
						method:"POST",
						url:tempUrl,
						data:{
									"mobile.name":$scope.mobile.name,
									"mobile.avart":$scope.mobile.avart,
									"mobile.position":$scope.mobile.position,
									"mobile.mobile":$scope.mobile.mobile,
								}
				}
		).success(function(data, status, headers, config){
             $scope.msg=data;
         }).error(function(data, status, headers, config){
             alert("error");
         })
	}
});


mobile.controller("queryMobileByIdController",function($scope,$http,$routeParams){
	var id = $routeParams.id;
	$scope.queryMobileById = function(){
		var tempUrl = "queryMobileById";
		$http(
				{
						method:"GET",
						url:tempUrl,
						params:{"id":id}
				}
		).success(function(data, status, headers, config){
             $scope.results=data;
         }).error(function(data, status, headers, config){
             alert("error");
         })
	}
});