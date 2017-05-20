
angular.module('code4life.search', ['ngRoute'])

code4life.controller('searchCtrl', [ '$scope', '$routeParams', '$http', function($scope, $routeParams, $http) {
    var city = $routeParams.city; 
    $scope.offersMeta = [];
    $scope.offers = [];
    $scope.filters = {
        city: city,
        contractType: "",
        field: "",
        jobType: "",
        skills: "",
        timeType: ""
    };
    $http({
        method: 'GET',
        url: 'api/getAllOffer/'
    }).then(function successCallback(response) {
        response.data.forEach((el)=>{
            el.showMore = false;
        });
        $scope.offers = response.data;
        $scope.offersMeta = response.data;

        $scope.filter();
        console.log($scope.offers, "$scope.offers");  
    }, function errorCallback(response) {
        $scope.offers = [];
        console.log("nie ma takiego kanału");
    });

    $scope.$watch('filters', $scope.filter, true);

    $scope.filter = ()=>{
        var arr = $scope.offersMeta;
        $scope.offers = [];
        for( key in $scope.filters ){   
            arr = arr.filter((elem)=>{
                console.log(elem[key], $scope.filters[key], "elem[key], $scope.filters[key]");
                if( $scope.filters[key] != "" ) {
                    return elem[key] == $scope.filters[key];
                } else {
                    return true;
                }
            });
        }
        $scope.offers = arr;
        console.log($scope.offers, "$scope.offers");
    }
}]);

