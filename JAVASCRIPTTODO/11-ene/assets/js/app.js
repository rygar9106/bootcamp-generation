let title = document.getElementById("titulo")

console.log(title);

title.textContent = "Este titulo está escrito desde JS";

let parrafos = document.getElementsByTagName("p");

/* parrafos[0].textContent = "Parrafo escrito desde JS";

for(i=0; i< parrafos.length; i++){
    parrafos[i].textContent = "Parrafo " + i + " escrito desde JS";
} */

let email = document.getElementById("correo");
let password = document.getElementById("contra")

function getInformation(){
    console.log(email.value);
    console.log(password.value)
}