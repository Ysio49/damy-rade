
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
        city: "",
        contractType: "",
        field: "",
        jobType: "",
        skills: "",
        timeType: ""
    };

    $http({
        method: 'GET',
        url: 'api/getOffersByCity?city=' + city
    }).then(function successCallback(response) {
        response.data.forEach((el)=>{
            el.showMore = false;
        });
        $scope.offers = response.data;
        $scope.offersMeta = response.data;
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

        var subOffers = [];
        for(var i=0; i<$scope.offersMeta.length;i++) {

            if($scope.offersMeta[i].contractType.includes($scope.selectedFilters.contractType) &&
                $scope.offersMeta[i].field.includes($scope.selectedFilters.field) &&
                $scope.offersMeta[i].jobType.includes($scope.selectedFilters.jobType) &&
                $scope.offersMeta[i].skills.includes($scope.selectedFilters.skills) &&
                $scope.offersMeta[i].timeType.includes($scope.selectedFilters.timeType)) {
                subOffers.push($scope.offersMeta[i]);
            }


        }
        $scope.offers = subOffers;

    };

    $scope.cleanFilter = function ()  {
        $scope.offers = $scope.offersMeta;
        $scope.selectedFilters.field = "";
        $scope.selectedFilters.contractType = "";
        $scope.selectedFilters.jobType = "";
        $scope.selectedFilters.skills = "";
        $scope.selectedFilters.timeType = "";
    };

    $scope.aktualizuj = function() {
        filter();
    }

}]);

