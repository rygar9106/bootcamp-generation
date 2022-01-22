class Animalito{
    constructor(nombre,edad,especie,revisado){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.enfermo = revisado;
        this.revisado = false;
    }
    saludar(){
        return console.log(`Hola mi nombre es ${this.nombre}`)
    }
}
class Veterinario{
    constructor(){
        this.cantidadPacientes = 0;
        this.pacientesRevisados = 0;
        this.listaPacientes = [];
    }
    agregarPaciente(paciente){
        this.listaPacientes.push(paciente);
        this.cantidadPacientes +=1;
        let mensaje = `Paciente agregado <br>`;
        return document.write(mensaje);
    }
    modificarPacientesRevisados(){
        this.pacientesRevisados ++;
    }

    revisarPaciente(paciente){
        if(paciente.revisado === false){
            paciente.revisado= true;
            this.modificarPacientesRevisados();
            document.write(`<br> Paciente ha sido revisado<br>`);
        }else{
            document.write(`Este paciente ya fue revisado<br>`)
        }

    }
    mostrarLista(){
        for (let i = 0; i< this.listaPacientes.length;i++){
            document.write(` ${this.listaPacientes[i].nombre}`)
        }
        document.write(`<br> Cantidad de pacientes : ${this.cantidadPacientes}<br>`)
    }
}

const VeterinarioPanchito = new Veterinario();
const Animalito1 = new Animalito('Manchas', 5 , 'Perro', false);
const Animalito2 = new Animalito('Galleta', 2 , 'Gato' , true);
console.log(Animalito1);
console.log(Animalito2);

VeterinarioPanchito.agregarPaciente(Animalito1);
VeterinarioPanchito.agregarPaciente(Animalito2);

console.log(VeterinarioPanchito.listaPacientes);

VeterinarioPanchito.mostrarLista();
VeterinarioPanchito.revisarPaciente(Animalito1);
VeterinarioPanchito.mostrarLista();
VeterinarioPanchito.revisarPaciente(Animalito1);