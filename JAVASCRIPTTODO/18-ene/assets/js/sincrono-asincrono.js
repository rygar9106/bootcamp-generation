//Codigo sincrono
let variableSincrona;
variableSincrona = 10*3;
console.log(variableSincrona);

//Codigo asincrono

let variableAsincrona;
 setTimeout(()=>{
    variableAsincrona = 10*3;
    console.log(variableAsincrona);
 },2000);
console.log(variableAsincrona);