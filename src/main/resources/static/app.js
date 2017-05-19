var code4life = angular.module('code4life', ['ngMaterial', 'ngRoute']);

code4life.controller('testCtrl', ['$scope', function ($scope) {
    var vm = this;
    vm.test = "hello world";
}]);

code4life.config(function ($routeProvider) {

  /**
   * $routeProvider
   */
  path = "/templates/pages/";

  $routeProvider
  .when('/', {
    templateUrl: 'dashboard.html',
    controller: 'testCtrl'
  })
  .when('/test', {
    templateUrl: 'test.html',
    controller: 'testCtrl'
  })
  .otherwise({
    redirectTo: '/',
    controller: 'testCtrl'
  });

});