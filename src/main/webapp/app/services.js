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
                $location.path('/api/profile/:id' + data);

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
    .factory('userService', function ($http, $location) {

        var createUser = function (userCiv,userLastName,userFirstName,userDateBirth,userAdresse,userVille,userPays,userCP,userMail,userPhone,userLogin,userPassword) {
            var req = {
                method: 'POST',
                url: '/api/user/new',
                headers: {
                    'Content-Type': 'charset=UTF-8'
                },
                params: {
                    "userCiv": userCiv,
                    "userLastName": userLastName,
                    "userFirstName": userFirstName,
                    'userDateBirth': userDateBirth,
                    'userAdresse': userAdresse,
                    'userVille': userVille,
                    'userPays': userPays,
                    'userCP': userCP,
                    'userMail': userMail,
                    'userPhone': userPhone,
                    'userLogin': userLogin,
                    'userPassword': userPassword

        }
            };
            $http(req).success(function () {

                // Transfert de l'id de l'utilisateur par cookie
                alert("OK crée")
                $location.path('/api/user/new');
            });
        };

        return {
            // si pas return de login : la requete ne se sera exécuté en GET
            createUser: createUser
        };

    })
    .factory('deleteRequestService', function ($http, $cookieStore, $resource) {
        var idUser = $cookieStore.get('JSESSIONID');
        var deleteRequest = function (emailFrom,objectReq, commentReq, linkReq) {
            var req = {
                method: 'POST',
                url: 'api/deleteRequest/',
                headers: {
                    'Content-Type': 'charset=UTF-8'
                },
                params: {
                    "emailFrom":emailFrom,
                    "objectReq": objectReq,
                    "commentReq": commentReq,
                    "linkReq": linkReq

                }
            };
            $http(req).success(function (data) {
                alert("mail envoyé");

            });
        };

        return {
            // si pas return de login : la requete ne se sera exécuté en GET
            deleteRequest: deleteRequest,
            requestUserListRessource: $resource('api/deleteRequest/'+idUser)
        };

    })

.factory('searchService', function ($http, $resource){
  var searchRequest = function () {
  alert("in shezrhs");
  var req = {
                method: 'GET',
                url: "http://api.duckduckgo.com/?q=DuckDuckGo&format=json",
                headers: {
                    'Content-Type':'application/x-www-form-urlencoded',
                   'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*//*;//q=0.8'
                   }
            };
            $http(req).success(function (data) {
                alert("okokk");
            });
            };

        return {
            searchRequest:searchRequest
        };
   })

