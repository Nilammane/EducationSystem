var purchescourse = function(){
	var stud_name = $("#stud_name").val();
	var stud_phone = $("#stud_phone").val();
	var stud_email = $("#stud_email").val();
	var courseselection = $("#service-select").val();
	if((stud_name || stud_phone || stud_email || courseselection) ==""){
		alert("please enter all details");
	}else{
		$.ajax({
			type: "POST",
			contenttype: "application/json",
		    url:"/coursedetail",
		    data:{
				"stud_name" : stud_name,
				"stud_phone" : stud_phone,
				"stud_email" : stud_email,
				"courseselection" : courseselection
			},
			dataType: "json"
		});
	}
}