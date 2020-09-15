function validatePass() {
    var passwd = document.getElementById("passwd");
    var passwdRegex = /^(?=.*\d)(?=.*[A-Z]).{6,20}$/;
    if (!passwd.value.match(passwdRegex)) {
        alert("Invalid password!");
        passwd.focus();
        return false;
    }
}

function validateDetails() {
    var userID = document.getElementById("userID").value;
    var passwd = document.getElementById("passwd").value;
    var dob = document.getElementById("dob").value;
    var contact = document.getElementById("contact").value;

    var userIDregex = /.{4,8}/;
    var passwdRegex = /^(?=.*\d)(?=.*[A-Z]).{6,20}$/;
    var contactRegex = /(?=.*\d){10}/;
    var dobDate = new Date(dob);
    var today = new Date();

    if (
        userID.match(userIDregex) &&
        passwd.match(passwdRegex) &&
        dobDate.getTime() < today.getTime() &&
        contact.match(contactRegex)
    ) {
        return true;
    } else {
        alert("Invalid Details!");
        return false;
    }
}
