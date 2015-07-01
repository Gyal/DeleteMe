angular.module("deleteMeApp.controllers", ['ngCookies'])

    .controller('LoginCtrl', function ($scope, loginService) {
        $scope.connexionLogin = "Identifiant";
        $scope.connexionPassword = "Mot de passe";

        $scope.login = function () {
            loginService.login($scope.connexionLogin, $scope.connexionPassword, function (response) {

                $scope.user = response || [];
            });
        }
        $scope.logOut = function () {
            loginService.logOut();
        }

    })
    .controller('UserCtrl', function ($scope, userService) {
        $scope.createUser = function () {
            alert("innn createUser");
            userService.createUser($scope.userCiv, $scope.userLastName, $scope.userFirstName, $scope.userLogin, $scope.userPassword, $scope.userDateBirth, $scope.userMail, $scope.userPhone, $scope.userAdresse, $scope.userVille, $scope.userCP, $scope.userPays, function (response) {

                $scope.user = response || [];
            });
        }
    })

    .controller('DeleteRequestCtrl', function ($scope, deleteRequestService) {
        $scope.deleteRequest = function () {
            deleteRequestService.deleteRequest($scope.emailFrom,$scope.objectReq, $scope.commentReq,$scope.linkReq, function (response) {
            });
        }

        // Réqupération des demandes de l'user courant au lancement
        $scope.init = function () {
            deleteRequestService.requestUserListRessource.query(function (response) {
                $scope.requestList = response || [];
            });
        }


        $scope.init();
    })


