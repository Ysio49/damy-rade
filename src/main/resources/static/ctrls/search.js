
angular.module('code4life.search', ['ngRoute','ngMaterial'])

code4life.controller('searchCtrl', [ '$scope', '$routeParams', '$http', function($scope, $routeParams, $http) {
    var city = $routeParams.city;
    $scope.noResult = false;
    $scope.noFilters = false;
    $scope.offersMeta = [];
    $scope.offers = [];
    $

    $scope.filters = {
        city: city,
        contractType: Array,
        field: Array,
        jobType: Array,
        skills: Array,
        timeType: Array
    };

    $scope.selectedFilters = {
        city: Array,
        contractType: Array,
        field: Array,
        jobType: Array,
        skills: Array,
        timeType: Array
    };

    $http({
        method: 'GET',
        url: 'api/getAllOffer/'
    }).then(function successCallback(response) {
        $scope.offersMeta = response.data;
        $scope.offers = response.data;
        console.log($scope.offers, "$scope.offers");  
    }, function errorCallback(response) {
        $scope.offers = [];
        $scope.noResult = true;
        console.log("nie ma takiego kanału");
    });

    $http({
        method: 'GET',
        url: 'filters/getAllFilters'
    }).then(function successCallBack(response) {
        $scope.filters = response.data;
        console.log($scope.filters);
    }, function errorCallBack(response) {
        $scope.filters = undefined;
        $scope.noFilters = true;
        console.log("brak filtrów");
    });

    $scope.$watch('selectedFilters', function (newValue,oldValue) {
        filter();
    }, true);

    var filter = function() {
        console.log("coś się zmienia. najs!")
    };

}]);

