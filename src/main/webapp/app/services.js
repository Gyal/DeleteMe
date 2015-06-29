(function(angular) {
    var UserFactory = function ($resource) {
        return $resource('/api/user/list', {
          //  id: 'id'
        }, {
            update: {
                method: 'PUT'
            },
            remove: {
                method: 'DELETE'
            }
        });
    };

    UserFactory.$inject = ['$resource'];
    angular.module('deleteMeApp.services').factory('userService', UserFactory);
}(angular));