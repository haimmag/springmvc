app.controller('StudentsCtrl', function($scope, $http, $routeParams) {
	$http.get('/University/students.json').success(function(data) {
		$scope.students = data;

		if ($routeParams.id) {
			$scope.student = $scope.students.filter(function(elm) {
				return elm.id == $routeParams.id;
			});

			$scope.student = $scope.student[0];
		}
	});
});

app.controller('MainCtrl', function($scope, $http) {
	$scope.phones = [ {
		'name' : 'Nexus S',
		'snippet' : 'Fast just got faster with Nexus S.'
	}, {
		'name' : 'Motorola XOOM™ with Wi-Fi',
		'snippet' : 'The Next, Next Generation tablet.'
	}, {
		'name' : 'MOTOROLA XOOM™',
		'snippet' : 'The Next, Next Generation tablet.'
	} ];
});

app.controller('CoursesCtrl', function($scope, $http, $routeParams) {
	$http.get('/University/courses.json').success(function(data) {
		$scope.courses = data;

		if ($routeParams.id) {
			$scope.course = $scope.courses.filter(function(elm) {
				return elm.id == $routeParams.id;
			});

			$scope.course = $scope.course[0];
		}
	});
});

app.controller('AppCtrl', function($scope, $http, $location) {
	$scope.isActive = function(viewLocation) {
		var active = (viewLocation === $location.path());
		return active;
	};
});