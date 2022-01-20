//Clases, molde  que nos permite crear objetos

class Animal{
    /* nombre;
    especie; */
    //constructor es una funcion
    constructor(nombre,especie){
        //this hace referencia al contexto en que se está utilizando
        this.nombre = nombre;
        this.especie = especie;
    }

    //getter y setter
    get getNombre(){
        return this.nombre;
    }
    set setNombre(nombre){
        this.nombre=nombre;
    }
    get getEspecie(){
        return this.especie;
    }
    set setEspecie(especie){
        this.especie = especie;
    }
    //metodos == funcion
    presentarse(){
        document.write(`Hola soy un ${this.especie} y me llamo ${this.nombre}<br>`);
    }
    cambiarNombre(nuevoNombre){
        this.nombre = nuevoNombre;
        let mensaje = `Mi nuevo nombre es ${this.nombre} y soy un ${this.especie}<br>`;
        return document.write(mensaje);
    }
        //metodos estaticos
        //Pertenece sólo a la clase, no se heredan a los objetos
    static saludar(){
        console.log("Hola soy un método estatico")
    }
}

Animal.saludar();

const Animal1 = new Animal('Scooby', 'Perro');//Creamos un objeto
console.log(Animal1);

const Animal2 = new Animal('Garfield', 'Gato');
console.log(Animal2);

const Animal3 = new Animal();
console.log(Animal3);

Animal1.presentarse();
Animal2.presentarse();
Animal3.presentarse();

console.log(Animal1.nombre);
Animal1.nombre = 'Scrappy';//metodo punto para cambiar nombre
console.log(Animal1.nombre);
console.log(Animal1);

Animal1.cambiarNombre('Oddie');//metodo para cambiar nombre

/*Getter y setter

get es para obtener informacion sobre la clase
set es para aplicar esa informacion sobre el objeto
*/

console.log(Animal1.getNombre);
Animal1.setNombre = 'Machas';
console.log(Animal1.getNombre);
console.log(Animal1)