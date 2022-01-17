function sumar(numero1,numero2){
    return numero1 + numero2;
    console.log('hola desde consola');
};

function restar(numero1,numero2){
    document.write(`La resta de ${numero1} y ${numero2} es ${numero1 - numero2}<br>`);
    console.log("Holis");
};

let numero1 = parseInt(prompt("Numero 1:"));
let numero2 = parseInt(prompt("Numero 2:"));

let suma = sumar(numero1,numero2);

document.write(`La suma de ${numero1} y ${numero2} es ${suma}<br>`);
restar(numero1,numero2);
document.write('La suma de ' + numero1 +' y ' + numero2 +' es '+ suma);