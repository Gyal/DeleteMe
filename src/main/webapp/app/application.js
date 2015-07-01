
// Déclaration de l'application

(function () {
    var app = angular.module('deleteMeApp',["ngResource", "deleteMeApp.controllers", "deleteMeApp.services", "ngRoute"]);

    app.config(['$httpProvider', function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }
    ]);
        app.config(function ($routeProvider) {
        $routeProvider
            .when('/connexion', {templateUrl: '/template/connexion.html'})
            .when('/api/user/new', {templateUrl: '/template/createUser.html'})
            .when('/api/deleteRequest', {templateUrl: '/template/deleteForm.html'})
            .when('/api/deleteRequest/:id', {templateUrl: '/template/listDemandesUser.html'})
            .when('/search', {templateUrl: '/template/test.html'})
            .when('/api/profile/1', {templateUrl: '/template/profileAdmin.html'})
            .when('/api/profile/:id', {templateUrl: '/template/profileUser.html'})
            .when('/api/service', {templateUrl: '/template/service.html'})
            .when('/api/contact', {templateUrl: '/template/contact.html'})
            .when('/api/modification/user', {templateUrl: '/template/updateUser.html'})
            .when('/api/modification/identifiant', {templateUrl:'/template/updateLogin.html'})
           // .when('/api/search/google', {templateUrl:'/template/google-search-api.html'})
            .otherwise({redirectTo: '/'});
    });
    angular.module("deleteMeApp.controllers", []);
    angular.module("deleteMeApp.services", []);

}(angular));