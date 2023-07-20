function clearErrors() {
  errors = document.getElementsByClassName("formerror");
  for (let item of errors) {
    item.innerHTML = "";
  }
}
function seterror(id, error) {
  //sets error inside tag of id
  element = document.getElementById(id);
  element.getElementsByClassName("formerror")[0].innerHTML = error;
}

function validateForm() {
  var returnval = true;
  clearErrors();

//perform validation and if validation fails, set the value of returnval to false
var mobileNumber = document.forms["myForm"]["mobileNumber"].value;
  var mobNumRegex = /^(\+\d{2}( )?)?((\(\d{3}\))|\d{3})[- .]?\d{3}[- .]?\d{4}$/;
  if (!mobNumRegex.test(mobileNumber)) {
    seterror("mobile_field", "*Invalid mobile number format");
    returnval = false;
  }


  var emailId = document.forms["myForm"]["emailId"].value;
  var emailRegex = /^(.+)@(.+)$/;
  if (!emailRegex.test(emailId)) {
    seterror("emailId_field", "*Invalid email id format");
    returnval = false;
  }

  
  var pincode = document.forms["myForm"]["pincode"].value;
  if(pincode <= 100000 || pincode >= 999999) {
    seterror("pincode_field", "*Invalid pincode");
    returnval = false;
  }
  return returnval;
}
