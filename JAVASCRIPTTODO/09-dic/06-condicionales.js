/*
    Condicionales nos ayudan a saber si un condicion se cumple y toma decisiones
*/
/*
if(condificion){
    codigo
    codigo
    codigo
}
*/

let edad = parseInt(prompt('Ingresa tu edad:'));

if (edad >= 18 && edad < 30){
    document.write("Eres joven");
}else if(edad >=30 && edad < 60){
    document.write("Eres un adulto");
}else if(edad >=60){
    document.write("Eres un adulto mayor");
}else{
    document.write("Eres un niño");
}