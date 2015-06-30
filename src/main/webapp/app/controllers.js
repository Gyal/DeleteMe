angular.module("deleteMeApp.controllers", ['ngCookies'])

    .controller('LoginCtrl', function ($scope, loginService) {
        $scope.connexionLogin = "test";
        $scope.connexionPassword = "test";

        $scope.login = function () {
            loginService.login($scope.connexionLogin, $scope.connexionPassword, function (response) {

                $scope.user = response || [];
            });
        }
        $scope.logOut = function () {
            loginService.logOut();
        }

    })


