/*



*/

function procesadorDeFrutas(){
    let jugo = 'Jugo de' + manzanas + 'manzanas y ' + naranjas + 'naranjas';
    return jugo;
}

let jugoDeManzana = procesadorDeFrutas (4,0);
console.log(jugoDeManzana);

let jugoDeNarnaja = procesadorDeFrutas(0,4);
console.log(jugoDeNarnaja)