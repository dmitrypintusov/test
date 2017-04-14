/**
 * Created by USER on 14.04.17.
 */

var TRIES = 3;
do {
    var name = prompt("Please, enter admin login", "");

    if (name == "Dmitry") {
        TRIES = 0;
        var password = prompt("Enter admin password:", "");

        if (password == "dmitry0506") {
            var age = prompt("How old are you?", "");

            var message = (age < 18) ? "You are too young for access" :
                (age < 100) ? "Hello, " + name :
                "Fantastic, you are " + age + " years old!";
            alert(message);
        } else if (password == null){
            alert("Enter canceled!");
        } else {
            alert("Password is incorrect!");
        }

    } else if (name == null) {
        alert ("Enter canceled!");
    } else {
        TRIES--;

        if (TRIES != 0) {
            alert("Please, enter admin login, " + TRIES + " tries left!");
        } else {
            alert("No tries left!");
        }

    }
} while (TRIES !=0);