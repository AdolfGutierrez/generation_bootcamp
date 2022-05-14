// pruebas unitarias nos permite hacer pruebas pequeñas a nuestro programa en funciones, clases, etiquetas, el objetivo principal es hacer que todo el programa funcione correctamente en todos sus procedimientos y cumpla con todo lo establecido 

const suma=(a,b)=>{
    return a-b
}

/* console.log(suma(1,3)===4);
console.log(suma(0,0)===0);
console.log(suma(5,5)===10); */

/* console.assert(suma(1,3)===4, "El resultado de la suma de 1 y 3 deberia ser 4") */


const arr=[
    {a:1,b:3,resultado:4},
    {a:0,b:0,resultado:0},
    {a:5,b:5,resultado:10},
    {a:10,b:30,resultado:40},

]

arr.forEach(prueba=>{
    const {a,b,resultado}=prueba //destructuracion
    console.assert(suma(a,b)===resultado,
    `suma de ${a} y ${b} deberia ser ${resultado}`)
})

