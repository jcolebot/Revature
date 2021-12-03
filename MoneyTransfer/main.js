const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const loginErrorMsg = document.getElementById("login-error");

// Event listener for submit button 
loginButton.addEventListener("click", (e) => {
    // Stop page refresh upon clicking
    e.preventDefault();

    const userEmail = loginForm.email.value;
    const password = loginForm.password.value;

    // Check email and password, then confirm with alerts
    if (userEmail === "admin@mtb.com" && password === "password") {
        alert("Your login was succesful!");
        location.replace("../MoneyTransfer/dashboard.html");
    } else {
        alert("Incorrect email and/or password.");
    }
})