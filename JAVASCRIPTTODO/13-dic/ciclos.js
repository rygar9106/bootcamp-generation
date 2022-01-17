/*

Ciclos - Bucles - Loops

let condicion = 1; valor inicial

while(condicion){
    tu codigo
}

*/

let condicion = 10;

while(condicion<=10){
    console.log(condicion);
    //condicion = condicion + 1;
    condicion++;
}

/* let numero = 1;

numero++;
numero++;
numero++;
numero--;
numero--;
numero--;
console.log(numero); */

/*
do while
*/

let numero = 10;
do{
    console.log(numero);
    numero++;
}while(numero <=10);

/*
for
*/

for (let control = 0; control <=10; control++) {
    console.log(control);
    
}

const comidas = ['Pozole', 'Tacos', 'Tamales', 'Tortas'];
for (let i = 0; i <= comidas.length; i++) {
    console.log(comidas[i]);
    
}