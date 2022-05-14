//Las Interfaces de Programación de Aplicaciones: APIS
/*  permiten a los desarrolladores crear funcionalidades complejas de una manera simple. Estas abstraen el código más complejo para proveer una sintaxis más fácil de usar en su lugar. 


Existen dos alternativas populares para consumir o comunicarnos una API REST desde javascript; Fetch API y la Biblioteca Axios.


Las APIs interactúan con tu código usando uno o más Objetos JavaScript que sirven como contenedores para los datos que usa la API (contenidos en las propiedades del objeto), y la funcionalidad que la API provee (contenida en los métodos del objeto).




*/



const url = "https://api.thecatapi.com/v1/images/search"
const imagen = document.getElementById("imagenGatito")
const imagen2 = document.getElementById("imagenGatito2")

/* Fetch API: La API Fetch proporciona una interfaz para obtener recursos (incluso a través de la red) 

El único parámetro requerido de fetch() es una url. El método por defecto en este caso es GET.*/

fetch(url)
.then((respuesta) => respuesta.json())
.then(datos=>{
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
