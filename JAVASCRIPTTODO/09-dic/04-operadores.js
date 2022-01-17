/*

Operadores aritmeticos nos sirven para hacer operaciones

    + Sirve para sumar o concatenar
    - Sirve para restar
    * Sirve para multiplicar 2 numeros
    % Modulo nos sirve para obtener el residuo de una división
    / Nos sirve para dividir dos números

*/

const numero1 = parseInt(prompt('Ingresa el número 1:'));
const numero2  = parseInt(prompt('Ingresa el número 2:'));
const suma = numero1 + numero2;
const resta = numero1 -numero2;
const multipicacion = numero1 * numero2;
const division = numero1 / numero2;
console.log("El número 1 es : " + numero1);
console.log("El número 2 es : " + numero2)
console.log("La suma es : " + suma);
console.log("La resta es : " + resta);
console.log("La multipliación es : " + multipicacion);
console.log("La división es : "+ division);

console.log(5%3);