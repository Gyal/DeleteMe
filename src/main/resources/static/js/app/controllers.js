(function(){
    var CustomerCtrl = function($scope, customerService) {

        customerService.query(function(response) {
            $scope.customers = response || [];
        });

    };

    CustomerCtrl.$inject = ['$scope', 'customerService'];
    angular.module("deleteMeApp.controllers").controller("CustomerCtrl", CustomerCtrl);
}(angular));