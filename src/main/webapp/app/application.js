/**
 * Created by Mélina on 16/03/2015.
 */

// Déclaration de l'application
/**
 * Created by Mélina on 16/03/2015.
 */

// Déclaration de l'application

(function () {
    var app = angular.module('deleteMeApp',["ngResource", "deleteMeApp.controllers", "deleteMeApp.services", "ngRoute"]);
    app.config(function ($routeProvider) {
        $routeProvider
            .when('/connexion', {templateUrl: '/template/connexion.html'})
            .otherwise({redirectTo: '/'});
    });
    angular.module("deleteMeApp.controllers", []);
    angular.module("deleteMeApp.services", []);

}(angular));