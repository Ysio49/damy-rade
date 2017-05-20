var code4life = angular.module('code4life', ['ngMaterial','ngRouter']);

code4life.controller('testCtrl', ['$scope', '$http', '$window', function ($scope, $http, $window) {

    $scope.test = "hello world";

    $scope.lookingForJob = function () {
        console.log("powinienem przejść na nową stronę");
        $http({
            method: 'POST',
            url: '/api/test',

        });
    };
}]);


code4life.controller('searchCtrl', function($scope) {
   $scope.test2 = "dzialam numer dwa!";
});

code4life.config(function($routeProvider) {
    $routeProvider
        .when("/job-search", {
            templateUrl : "job-search.html"
        })

});