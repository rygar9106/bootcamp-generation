/*

Arreglos

*/

const comidas = ['Pozole', 'Quesadillas', 'Tacos'];

//Length es la longitud del arreglo # de elementos

console.log(comidas.length);

/*

push    agrega al final del arreglo
pop     retira al final del arreglo
unshift agregar al inicio del arreglo algo que queramos
shift   eliminar el primer valor

*/

comidas.push('Tortas');
console.log(comidas);

comidas.unshift('Pancita');
console.log(comidas);

comidas.pop();
console.log(comidas);

comidas.shift();
console.log(comidas);

/*
console.log(comidas[0]);
console.log(comidas[1]);
console.log(comidas[2]);
*/

comidas.forEach(function (el){
    console.log(el);
});

const numeros =[1,4,7,8];
console.log(numeros);

numeros.forEach(function(el){
    let suma = el +1;
    console.log(suma);
});

const arr = [];

function suma(num){
    let sumNum = num +1;
    return arr.push(sumNum);
}

suma(3);
suma(5);
suma(6);
suma(2);
suma(78);

console.log(suma);