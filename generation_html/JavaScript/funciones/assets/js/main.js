/* las funciones nos permiten reutilizar codigo */

function saludar(nombre = "Panchito", apellido =""){
    
    //string normal
    //console.log("hola mi nombre es:" , nombre, apellido) 
    //${} temple strings sirve para insertar JS dentro del string
    //console.log(`hola mi nombre es: , ${nombre?"Adolfo":"Desconocido"}`) 
    return `Mi nombre es ${nombre} ${apellido}`
    
}
saludar("Pedro, Perez") //invocacion o llamda de la funcion

let funcionSaludar = saludar("Sofia", "Alvarez")
//console.log(funcionSaludar)

//console.log(saludar("Celina","Gomez"))

//console.log(funcionSaludar.toLocaleLowerCase())
/* document.write(`<h1>Hola mi nombre es Adolfo</h1>`)
console.log("<h1>Hola mi nombre es Adolfo</h1>") */

/* Funcion declarada */

function suma(a,b){
    return a+b;
}
console.log(suma(10,20))

/* Funciones expresadas o funcion expresion*/
const resta = function(a,b){
    return a-b
}
console.log(resta(30,10))


const multiplicacion = (a,b) => a*b //funcion flecha
console.log(multiplicacion(40,5))

/* setTimeout(()=>{
},3000) */



