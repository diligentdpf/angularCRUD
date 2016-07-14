var mobile = angular.module("mobile",["ngRoute"]);
mobile.config(['$routeProvider',function ($routeProvider) {  
    $routeProvider  
        .when('/mobile', {  
            templateUrl: 'mobilelist.html',  
            controller: 'queryMobileController'  
        })  
        .when('/addmobile', {  
            templateUrl: 'addmobile.html',  
            controller: 'addMobileController'  
        }) 
        .when('/queryMobileById/:id', {  
            templateUrl: 'detail.html',  
            controller: 'queryMobileByIdController'  
        }) 
        .otherwise({  
            redirectTo: '/mobile'  
        });  
}]);

mobile.config(postMethod);