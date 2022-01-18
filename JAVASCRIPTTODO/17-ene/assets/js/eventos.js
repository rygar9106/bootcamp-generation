let $titulo = document.querySelector('#titulo');
let $mensaje = document.querySelector('#mensaje');
let $btnMensaje = document.querySelector('#btnMensaje');
let $spanError = document.querySelector('span');

$btnMensaje.addEventListener('click',()=>{
    console.log('No me presiones');
});

$mensaje.addEventListener('keydown',(e)=>{
    console.log(e.target.value);
    if(e.target.value.length <= 5){
        $spanError.classList.remove('hide');
        $spanError.classList.add('error');
    }else{
        $spanError.classList.remove('error');
        $spanError.classList.add('hide');
    }
});

/* function mostrarConsola(){
    console.log('Presionaste algo')
}; */