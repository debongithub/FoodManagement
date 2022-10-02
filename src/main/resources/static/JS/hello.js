function callGoogle() {
	console.log("Calling Function");
	var settings = {
		"url": "google.com",
		"method": "GET",
		"timeout": 0,
		"headers": {
			"Cookie": "NID=511=ZUKFFa-ccZR04C5om6MQWJinrgsyJHQ3m4oZ5Zfou2Iyo9RZS_FujsuEQxLfLJwkBjwr5DI1PDHhmdTpVIGuPNUvvOrVDhk8vBiJiDJvXaaSn_37TKBpQxnZ-XNtKgvjXBcTJNWZ9IwuLi2lyhBn8CYe1mLuAxvgi9Qb6zNmYks"
		},
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
	});
}