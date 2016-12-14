'use strict';

angular.module('myApp.view1', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view1', {
    templateUrl: 'view1/view1.html',
    controller: 'View1Ctrl'
  });
}])

.controller('View1Ctrl', ['$rootScope','$scope','$http',function($rootScope,$scope,$http) {
	 var postPath = "http://localhost:8080/rest/exclusion";
	 var getPath = "http://localhost:8080/exclusions";
	 $scope.name = "abc";
	 $scope.lastName = "abc2";
	 var JSON = {
			 firstName:$scope.name,
			 lastName:$scope.lastName
	 }
	
	 var config = {
             headers : {
                 'Content-Type': 'application/json'
             }
         }
	 
	$scope.postUser = function(){
		 $http.post(postPath, JSON, config)
		         .success(function (data, status, headers, config) {
		        	 console.log(data);
		        	 console.log(status);
		        	 console.log(headers);
		        	 console.log(config);
		         })
		         .error(function (data, status, header, config) {
         });
	}
	
	$scope.getUsers = function(){
		$http.get(getPath).then(function (response) {
					console.log(response);
		            return response;
		        });
	}


}]);