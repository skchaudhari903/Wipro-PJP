var myVar;
function myTimeout() {
    myVar = setTimeout(alertFunc, 180000);
}
function alertFunc() {
    alert("3 mins passed! Timeout");
}

function validate() {
    var mobile = document.forms["myform"]["mobile"].value;
    var dob = document.forms["myform"]["dob"].value;
    var firstname = document.forms["myform"]["fname"].value;
    var lastname = document.forms["myform"]["lname"].value;
    var password1 = document.forms["myform"]["pass1"].value;
    var password2 = document.forms["myform"]["pass2"].value;
    var email = document.forms["myform"]["email"].value;

    var letters = /^[A-Za-z]+$/;
    var phoneno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
    var eregex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var dobPattern = /^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;

    // First name
    if (!letters.test(firstname)) {
        document.getElementById("error-lname").innerHTML = "* First name can't contain number or special characters";
        return false;
    }

    // Last name
    if (!letters.test(lastname)) {
        document.getElementById("error-lname").innerHTML = "* Last name can't contain number or special characters";
        return false;
    }

    // Password
    if (password1.length > 5 && password1.length < 20) {
        if (password1 !== password2) {
            document.getElementById("error-pass1").innerHTML = "* Passwords did't match";
            return false;
        }
    } else {
        document.getElementById("error-pass1").innerHTML = "* Entered password should be between 6 and 20 characters ";
        return false;
    }

    // Phone Number
    if (!phoneno.test(mobile)) {
        document.getElementById("error-mob").innerHTML = "* Follow XXX XXX XXXX or XXX-XXX-XXXX or XXX.XXX.XXXX format";
        return false;
    }

    // DOB
    if (!dobPattern.test(dob)) {
        document.getElementById("error-dob").innerHTML = "* Invalid DOB";
        return false;
    }

    // Email
    if (!eregex.test(email)) {
        document.getElementById("error-email").innerHTML = "* Enter a valid email address";
        return false;
    }
}

function startTime() {
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    var dt = new Date();

    var amPm = h < 12 ? "AM" : "PM";
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById("clock").innerHTML = "Time : " + h + ":" + m + ":" + s + " " + amPm;
    var t = setTimeout(startTime, 500);

    document.getElementById("date").innerHTML =
        "Date : " +
        ("0" + dt.getDate()).slice(-2) +
        "." +
        ("0" + (dt.getMonth() + 1)).slice(-2) +
        "." +
        dt.getFullYear();
}

function checkTime(i) {
    if (i < 10) {
        i = "0" + i;
    } // add zero in front of numbers < 10
    return i;
}
