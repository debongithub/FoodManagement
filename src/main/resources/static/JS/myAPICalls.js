function createItem() {
	console.log("Calling Function");
	var formData = $("#frm1").serializeArray();
	console.log(formData);
	myProperJsonData = {}
	console.log(formData.length)
	for(var i=0;i< formData.length;i++){
		item = formData[i];
		//console.log(item)
		key = item["name"]
		val = item["value"]
		myProperJsonData[key] = val
	}
		
	console.log(myProperJsonData)
	
	fetch("http://localhost:8080/createItems", {
		method: "POST",
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify(myProperJsonData)
	}).then(res => {
		console.log("Request complete! response:", res);
	});
}