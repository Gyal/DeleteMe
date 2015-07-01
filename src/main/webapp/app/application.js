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
            .when('/api/user/new', {templateUrl: '/template/createUser.html'})
            .when('/api/deleteRequest', {templateUrl: '/template/deleteForm.html'})
            .when('/api/deleteRequest/:id', {templateUrl: '/template/listDemandesUser.html'})
            .when('/api/profile/1', {templateUrl: '/template/profileAdmin.html'})
            .when('/api/profile/:id', {templateUrl: '/template/profileUser.html'})
            .when('/api/service', {templateUrl: '/template/service.html'})
            .when('/api/contact', {templateUrl: '/template/contact.html'})

            .otherwise({redirectTo: '/'});
    });
    angular.module("deleteMeApp.controllers", []);
    angular.module("deleteMeApp.services", []);

}(angular));