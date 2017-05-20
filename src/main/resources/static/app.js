var code4life = angular.module('code4life', [
    'ngMaterial', 
    'ngRoute',
    'code4life.home',
    'code4life.chooseCity',
    'code4life.search']);

code4life.controller('testCtrl', ['$scope', function ($scope) {
    var vm = this;
    vm.test = "hello world";
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
  .when('/choose-city', {
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