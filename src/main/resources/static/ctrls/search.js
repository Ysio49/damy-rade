
angular.module('code4life.search', ['ngRoute'])

code4life.controller('searchCtrl', [ '$scope', '$routeParams', function($scope, $routeParams) {
    var city = $routeParams.city;
    console.log(city, "city");
}]);