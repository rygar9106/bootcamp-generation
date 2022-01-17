/* function sumar(numero1,numero2){
    return numero1 + numero2;
    console.log('hola desde consola');
};
 */
const sumar = (numero1,numero2) =>{
    return numero1 + numero2;
    console.log('hola desde consola');
};
let numero1 = parseInt(prompt("Numero 1:"));
let numero2 = parseInt(prompt("Numero 2:"));
let suma = sumar(numero1,numero2);

document.write(`La suma de ${numero1} y ${numero2} es ${suma}<br>`);