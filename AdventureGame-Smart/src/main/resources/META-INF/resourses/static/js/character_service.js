'use strict';

App.factory('RESTService', ['$http', '$q', function($http, $q){
  return {
    fetchAllCharacters: function() {
      return $http.get('http://localhost:8080/User/')
                            .then( function(response){
                                        return response.data;
                                    },
                                    function(errResponse){
                                        console.error('Error while fetching characters');
                                        return $q.reject(errResponse);
                                    }
                              );
    },
                //More functions that perform CRUD operations ...
  };
}]);
