let miVariable = 10;

console.log(miVariable);

/* Buenos dias 6 - 11
Buenas tardes 12 - 18
Buenas noches 19 - 23
Dejame dormir 0 - 5 */

let hora = parseInt(prompt("Que Hora es?"));

if(hora<=5){
    document.write(`Dejame dormir`);
}else if(hora <=11){
    document.write(`Buenos días`);   
}else if(hora <=18){
    document.write(`Buenas tardes`);
}else if(hora <=23){
    document.write(`Buenas noches`);
}else{
    document.write(`Me rompiste`);
}
