let compra = parseInt(prompt('Ingresa el monto de la compra:'));
let precioTotal;
if (compra >= 0 && compra < 100){
    precioTotal = compra*.9
    imprimir(precioTotal)
}else if(compra >=100 && compra < 200){
    precioTotal = compra*.8
    imprimir(precioTotal)
}else if(compra >=200){
    precioTotal = compra*.7
    imprimir(precioTotal)
}else{
    alert("Me rompiste")
}
function imprimir(impresion){
    document.write("<h1>" + impresion + "</h1>");
}