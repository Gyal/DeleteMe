(function(){
    var UserCtrl = function($scope, userService) {

        userService.query(function(response) {
            $scope.users = response || [];
        });

    };

    UserCtrl.$inject = ['$scope', 'userService'];
    angular.module("deleteMeApp.controllers").controller("UserCtrl", UserCtrl);
}(angular));