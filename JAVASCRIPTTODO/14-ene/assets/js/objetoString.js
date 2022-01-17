let cadena = "Hola";

console.log(cadena);

let cadena2 = new String ("Adios");
console.log(cadena2);

console.log(cadena2.toLowerCase().includes("a"));

console.log(cadena2.toLowerCase());

console.log(cadena2.toUpperCase());


function invertirPalabra(palabra){
    let arreglo = palabra.split("");
    arreglo.reverse();
    var elem = document.getElementById('pala');
    elem
    console.log(arreglo.join(""));
}

function evaluar(){
    let cadena3 = prompt("Dame una palabra:");

    invertirPalabra(cadena3);
}
