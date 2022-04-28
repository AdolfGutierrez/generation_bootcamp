const nombre ="Adolfo"
const nombre2 = new String("Mario")

console.log(nombre.toLocaleLowerCase())
console.log(nombre2.toLocaleLowerCase())

const persona = new Object()
persona.nombre="Adolfo"
persona.apellido="Rodriguez"
persona.edad ="28"

console.log(persona)

const nuevaPersona = {
    /* atributos o datos como info */
    nombreCompleto:{
        nombre: "Adolfo",
        apellido:"Gutierrez"
    },

     edad: 28,
     pasatiempos: ["ajedrez", "box", "barras"],
     tieneTrabajo: true,
     /* metodo por que tiene una funcion (){} */
     saludar: function (){
         console.log("Hola")
    },   

    sumar: function (n1,n2){
        console.log(`El resultado de la suma es ${n1+n2}`)
    }
 }
     "Hola".length //atributo o propiedad
     "Hola".toLocaleLowerCase() //metodo
     
     console.log(nuevaPersona.edad)
     console.log(nuevaPersona.nombreCompleto.nombre)
     console.log(nuevaPersona.pasatiempos[1])

     nuevaPersona.saludar()
     nuevaPersona.sumar(5,10)

     /* para cambiar el valor  */

     nuevaPersona.edad= 10
     console.log(nuevaPersona.edad)

     /* agregrar nuevo atributo */
     nuevaPersona.colorFavotito = "Azul"
     console.log(nuevaPersona)

     console.log(nuevaPersona.hasOwnProperty("edades"))
     console.log(Object.keys(nuevaPersona))
     console.log(Object.values(nuevaPersona))

     const Adolfo = {
        /* atributos o datos como info */
        nombreCompleto:{
            nombre: "Adolfo",
            apellido:"Gutierrez"
        },
    
         edad: 28,
         pasatiempos: ["ajedrez", "box", "leer"],
    }
    const Abi = {
        nombreCompleto:{
            nombre: "Abigail",
            apellido: "Moreno"
        }, 
        edad:23, 
        pasatiempos: ["bailar", "plantas", "fotografía"], 
    }
    const Pedro = {
        nombreCompleto: {
            nombre: "Antonio",
            apellido: "Castañón"
        },
        edad: 18,
        pasatiempos: ["jugar","salir","series"],
    }
    const manuManito = {
        nombre: "Manuel Adán",
        apellido: "Carrillo Zavala",
        edad: 29,
        pasaTiempos: ['Leer', 'Tomar cafésito', 'Estar en casa', 'Echar chismecito'],
    }
    const Mitzi = {
        nomCompleto: {
            nom: "Mitzi",
            app: "Hernandez"
        },
        edad: 23,
        pasatiempo: ["jugar", "dibujar", "ver series"],
    }
    
    
    
    



