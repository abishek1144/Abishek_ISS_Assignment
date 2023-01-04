function verification(){
	var fname = document.forms.registration.firstname;
	var lname = document.forms.registration.lastname;
	var age = document.forms.registration.age;
	var address = document.forms.registration.address;
	var username = document.forms.registration.username;
    var password = document.forms.registration.password;
    var cpassword = document.forms.registration.cpassword;
    if(fname.value == null || fname.value == ""){
		window.alert("First Name filled is empty");
		fname.focus();
		return false;
	}
	else if(lname.value == null || lname.value == ""){
		window.alert("Last Name filled is empty");
		lname.focus();
		return false;
	}
	else if(age.value == null || age.value == ""){
		window.alert("Age filled is empty");
		age.focus();
		return false;
	}
	else if(address.value == null || address.value == ""){
		window.alert("Address is empty");
		address.focus();
		return false;
	}
	else if(username.value == null || username.value == ""){
		window.alert("Username is empty");
		username.focus();
		return false;
	}
	else if(password.value != cpassword.value){
		window.alert("Re enter the correct password as above.");
		password.focus();
		return false;
		
	}
	
	}