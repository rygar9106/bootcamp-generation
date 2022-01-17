let nombre = document.getElementById('nambre');

function cambiarNombre(nombrecambiado){
    nombrecambiado = prompt("Escribe tu nombre:");
    nombre.textContent=nombrecambiado;
}