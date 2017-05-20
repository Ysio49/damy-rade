var code4life = angular.module('code4life', [
    'ngMaterial', 
    'ngRoute',
    'code4life.home',
    'code4life.chooseCity',
    'code4life.search']);


code4life.controller('mainCtrl', ['$scope', '$location', function ($scope, $location) {
    $scope.notChoose = true;
    console.log("dzialan");

    $scope.routeTo = (url)=>{
        $location.url(`/${url}`);
    }
}]);

code4life.config(function ($routeProvider) {

  /**
   * $routeProvider
   */

  $routeProvider
  .when('/', {
    templateUrl: 'pages/home.html',
    controller: 'homeCtrl'
  })
  .when('/search', {
    templateUrl: 'pages/first-filter.html',
    controller: 'chooseCityCtrl'
  })
  .when('/search/:city', {
    templateUrl: 'pages/search.html',
    controller: 'searchCtrl'
  })
  .otherwise({
    redirectTo: '/'
  });


});