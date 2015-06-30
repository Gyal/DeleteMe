angular.module('deleteMeApp.services', ['ngCookies'])

/*************Controleur permettant la connexion d'un utilisateur et le stockage de son id dans un cookie :
 *l'id de l'user est renvoyé par la méthode api/connexion*********************************************************************/
    .factory('loginService', function ($http, $location, $cookieStore) {

        var login = function (username, password) {
            var req = {
                method: 'POST',
                url: '/api/connexion/',
                headers: {
                    'Content-Type': 'charset=UTF-8'
                },
                params: {
                    "connexionLogin": username,
                    "connexionPassword": password
                }
            };
            $http(req).success(function (data) {

                // Transfert de l'id de l'utilisateur par cookie
                $cookieStore.put('JSESSIONID', data);
                $location.path('/account/' + data);

            });
        };

        var logOut = function () {
            $cookieStore.remove('JSESSIONID');
            $location.path('/connexion');
        };
        return {
            // si pas return de login : la requete ne se sera exécuté en GET
            login: login,
            logOut: logOut
        };

    })