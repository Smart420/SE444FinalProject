
'use strict';

App.controller('CharacterController', [
		'$scope',
		'RESTService',
		function($scope, RESTService) {
			var self = this;

			self.character = { id :'' , username :null, password:null, name:null,age:''};
			self.characters = [];
			self.fetchAllCharacters = function() {
				RESTService.fetchAllCharacters().then(function(d) {
					self.characters = d;
				}, function(errResponse) {
					console.error('Error while fetching Characters');
				});
			};


			self.fetchAllCharacters();
		} ]);
