var app = angular.module('app', [ 'ngRoute' ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider
	.when('/', {
		templateUrl : 'resources/app/partials/main.html',
		controller : 'MainCtrl'
	})
	.when('/students', {
		templateUrl : 'resources/app/partials/students-list.html',
		controller : 'StudentsCtrl'
	})
	.when('/students/:id', {
		templateUrl : 'resources/app/partials/students-courses.html',
		controller : 'StudentsCtrl'
	})
	.when('/courses', {
		templateUrl : 'resources/app/partials/courses-list.html',
		controller : 'CoursesCtrl'
	})
	.when('/courses/:id', {
		templateUrl : 'resources/app/partials/courses-students.html',
		controller : 'CoursesCtrl'
	})
	.otherwise({
		redirectTo : '/'
	});
} ]);