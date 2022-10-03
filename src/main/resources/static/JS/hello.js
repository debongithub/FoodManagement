function callGoogle() {
	console.log("Calling Function");
	var settings = {
		"url": "localhost:8080/createItems",
		"method": "POST",
		"timeout": 0,
	};
	$.ajax(settings).done(function(response) {
		console.log(response);
	});
}