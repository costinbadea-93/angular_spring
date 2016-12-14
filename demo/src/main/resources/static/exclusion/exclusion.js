'use strict';

angular.module('myApp.exclusion', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/exclusion', {
    templateUrl: 'exclusion/exclusion.html',
    controller: 'exclusionCtrl'
  });
}])

.directive('createExclusion', function () {
  return {
    //restrict: 'E',
    templateUrl: 'exclusion/createExclusionModal.html'
   };
})

.controller('exclusionCtrl', ['$rootScope','$scope','$http',function($rootScope,$scope,$http) {
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
	 $scope.getUsers = function(){
		 $http.get(getPath).then(function (response) {
				$scope.exclusionsObj = response.data._embedded.exclusions;
				console.log($scope.exclusionsObj);
	         //return response;
	     });
	 }
	 //retrive all exclusions

	
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
		 $scope.getUsers();
	}
	 


}]);