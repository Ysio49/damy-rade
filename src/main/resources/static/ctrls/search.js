
angular.module('code4life.search', ['ngRoute'])

code4life.controller('searchCtrl', [ '$scope', '$routeParams', '$http', function($scope, $routeParams, $http) {
    var city = $routeParams.city; 
    $scope.offers = [];
    $http({
        method: 'GET',
        url: 'api/getAllOffer/'
    }).then(function successCallback(response) {
        $scope.offers = response.data;
        console.log($scope.offers, "$scope.offers");  
    }, function errorCallback(response) {
        $scope.offers = [];
        console.log("nie ma takiego kanału");
    });
}]);