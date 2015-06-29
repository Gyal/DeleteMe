/**
 * Created by Mélina on 16/03/2015.
 */

// Déclaration de l'application
(function(){
    angular.module("deleteMeApp.controllers", []);
    angular.module("deleteMeApp.services", []);
    angular.module("deleteMeApp", ["ngResource", "deleteMeApp.controllers", "deleteMeApp.services"]);
}(angular));