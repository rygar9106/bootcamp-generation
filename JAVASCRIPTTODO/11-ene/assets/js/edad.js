function calculaEdad(){
    let anio = document.getElementById("edad");
    anio = 2022 - parseInt(anio.value);
    alert("Tu edad es : " + anio + " años, ya estás viejo")
}