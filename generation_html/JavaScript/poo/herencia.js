//aqui se crean los pokemones 
class Pokemon{
    #nombre = ""
    #edad = 0
    #evolucion = ""
    

    constructor (nombre,edad,evolucion){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion=evolucion;
        

    }
     //get se usa para modificar variables privadas #
     get nombre(){
        return this.#nombre
    }

    atacar(){
        
        return this.#nombre

    }

    evolucionar(){
        // aqui se conoce como cortocircuito ||
        // false => tomara el valor de la izquierda
        // true => va a tomar el valor de la derecha
        const EVOLUCION = this.#evolucion ;
        let mensaje = '';
    
        console.log(EVOLUCION);
        if(EVOLUCION === ''){      
            mensaje = 'No puedo evolucionar';
        }else{
            // this.#nombre = this.#evolucion;  
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`
            this.#nombre = this.#evolucion;
        }
        return console.log(mensaje);
    }
    


}

/* const moscardo = new Pokemon("Moscardo", 2, "Moscardio", "aire")
const lukardo = new Pokemon("Lukardo", 3, "Lukardiño", "fuego" )

console.log(moscardo);
console.log(lukardo);

moscardo.atacar()
lukardo.atacar()

moscardo.evolucionar()
console.log(moscardo);
 */


//aqui se crean los tipos de pokemones
//extends extiende los atributos de donde se le llama
//el metodo super manda llamar los elementos del constructor de la clase padre 
class TipoFuego extends Pokemon{
    //atributos
    #tipo = "";
    
    constructor (nombre,edad,evolucion){
        super(nombre, edad, evolucion) 
        this.#tipo="fuego"

    }
    
    
    atacar(){
        return console.log(`${this.nombre}, está lanzando un ataque de tipo ${this.#tipo}`);

    }


}
const moscardo = new TipoFuego("Moscardo",2,"Moscardio") 
console.log(moscardo);

moscardo.atacar()
moscardo.evolucionar()



