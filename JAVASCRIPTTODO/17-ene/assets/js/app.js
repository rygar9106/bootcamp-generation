/* let titulo = document.getElementById("titulo");
titulo.textContent = 'Título escrito desde JS' */

/* Para el query selector asi se ven
.clase entras a las clases
#id entras al ID
etiqueta solo entras a la etiqueta
 */

let $titulo = document.querySelector('#titulo');
$titulo.textContent = 'Título desde JS'

let $parrafo = document.querySelector('p');
console.log($parrafo);

let $parrafos = document.querySelectorAll('p');
console.log($parrafos[1].textContent);

let subtitulo = document.createElement('h3');

subtitulo.textContent = 'Este es un subtitulo en JS';

$titulo.insertAdjacentElement("beforebegin",subtitulo);
//document.body.append(subtitulo);

let $contenido = document.querySelector('#contenido');
console.log($contenido.textContent);

/* $contenido.textContent = 'Hola';
$contenido.innerHTML = '<br>';
$contenido.outterHTML = '<br>'; */

let contenidoParrafo = document.createElement('p');
contenidoParrafo.textContent = 'Contenido de mi nuevo parrafo';
$contenido.appendChild(contenidoParrafo);