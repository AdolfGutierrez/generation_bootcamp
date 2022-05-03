/* let tiempo = 5000

setTimeout(()=>{
    let datos = "Adolfo"
    console.log("datos");
},tiempo)

console.log("Hola"); */

const datos = [
    {
        nombre: "Adolfo",
        edad: 28,

    },
    {
        nombre: "Sofia",
        edad: 27,

    },
    {
        nombre: "Mario",
        edad: 26,

    },
]
// este es codigo asincrono por que pide los datos en un determinado tiempo
function obtenerDatos(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve (datos)
        },3000)
    })

}

//este es codigo sincrono por que pide los datos inmediatamente

   console.log(obtenerDatos());  
 obtenerDatos().then((datos)=>{
    console.log(datos);
}) //indica que promesa se cunplira de la funcion 


async function obtenerDatosAsync (){
    const datosObtenidos = await obtenerDatos()
    console.log(datosObtenidos);
}
obtenerDatosAsync()
