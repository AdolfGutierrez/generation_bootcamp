const url = "https://api.thecatapi.com/v1/images/search"
const imagen = document.getElementById("imagenGatito")
const imagen2 = document.getElementById("imagenGatito2")


fetch(url).then((respuesta) => respuesta.json()).then(datos=>{
    console.log(datos[0]);
    imagen.src = datos.message
})

async function obtenerGatito(){
    const infoGatitos =await fetch(url)
    console.log(infoGatitos);

    const gatito = await infoGatitos.json()
    console.log(gatito);
    imagen2.src = gatito.message
}
obtenerGatito()
