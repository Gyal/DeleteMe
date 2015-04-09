(function(angular) {
    var CustomerFactory = function ($resource) {
        return $resource('/api/customer/list', {
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

    CustomerFactory.$inject = ['$resource'];
    angular.module('deleteMeApp.services').factory('customerService', CustomerFactory);
}(angular));