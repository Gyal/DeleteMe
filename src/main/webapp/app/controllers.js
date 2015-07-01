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
            userService.createUser($scope.userCiv, $scope.userLastName, $scope.userFirstName, $scope.userDateBirth, $scope.userAdresse, $scope.userVille, $scope.userPays, $scope.userCP, $scope.userMail, $scope.userPhone, $scope.userLogin,$scope.userPassword, function (response) {

                $scope.user = response || [];
            });
        }
    })

    .controller('DeleteRequestCtrl', function ($scope, deleteRequestService) {
        $scope.deleteRequest = function () {
            deleteRequestService.deleteRequest($scope.emailFrom,$scope.objectReq, $scope.commentReq,$scope.linkReq, function (response) {
            });
        }

        // Récupération des demandes de l'user courant au lancement
        $scope.init = function () {
            deleteRequestService.requestUserListRessource.query(function (response) {
                $scope.requestList = response || [];
            });
        }


        $scope.init();
    })

    .controller('SearchCtrl', function ($scope, searchService){
    alert ("in controller");
                 $scope.searchRequest = function () {
              searchService.searchRequest(function(response){
                $scope.hello = response || [];
                          });
                      }
                      })


