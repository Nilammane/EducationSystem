$(document).ready(function(){
	getCourseDetails();
});

var getCourseDetails = function(){debugger
	$.ajax({
		url : "/coursedetailsjs",
		success : function(data){
			var parsedData = JSON.parse(data);
			var html1 = '<ul class="course-list">';
			for(var displaycourse = 0; displaycourse < parsedData.length-1; displaycourse++){
				console.log(parsedData[displaycourse].courses);
				html1 += '<li class="justify-content-between d-flex"><p>"'+parsedData[displaycourse].courses+'"</p><a class="primary-btn text-uppercase" href="#" id="getCourseDetails" onclick = "getcoursedetails()">View Details</a></li>';
			}
			
				html1 += '</ul">'
			
			$("#addcoursedata").html(html1);
		}
	});
}

var getcoursedetails = function(){
var	coursedetail = '<ul>'
				 +				'<li>'
				 +					'<a class="justify-content-between d-flex" href="#">'
				 +						'<p>Trainer’s Name</p>'
				 +						'<span class="or">George Mathews</span>'
				 +					'</a>'
				 +				'</li>'
				 +				'<li>'
				 +					'<a class="justify-content-between d-flex" href="#">'
				 +						'<p>Course Fee </p>'
				 +						'<span>$230</span>'
				 +					'</a>'
				 +				'</li>'
				 +				'<li>'
				 +					'<a class="justify-content-between d-flex" href="#">'
				 +						'<p>Available Seats </p>'
				 +						'<span>15</span>'
				 +					'</a>'
				 +				'</li>'
				 +  			'<li>'
				 +					'<a class="justify-content-between d-flex" href="#">'
				 +						'<p>Schedule </p>'
				 +						'<span>2.00 pm to 4.00 pm</span>'
				 +					'</a>'
				 +				'</li>'
				 +			'</ul>';
				 
				 $("#coursedetails").html(coursedetail);
}
