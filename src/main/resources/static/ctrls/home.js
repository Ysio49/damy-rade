
angular.module('code4life.home', ['ngRoute'])

code4life.controller('homeCtrl', [function() {
    var vm = this;
    vm.test = "test - działa!";
    console.log( vm.test, "vm.test");
}]);