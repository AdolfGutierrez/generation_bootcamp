const idInfo = window.location.href.split("=").pop()
console.log(idInfo);

const urlID = `https://api.jikan.moe/v4/anime/${idInfo}`

const imagenPortada = document.getElementById("imagenPortada")
const informacionAnime = document.getElementById("informacionAnime")

fetch(urlID).then(resp=>resp.json()).then(datos=>{
    /* console.log(datos.data); */

    const datosNecesarios ={
        id: datos.data.mal_id,
        imagen: datos.data.images.jpg.image_url,
        sinopsis: datos.data.synopsis,
        nombre: datos.data.title,
    }

    const templateImg = `<img src="${datosNecesarios.imagen}" class="img-fluid">`
    imagenPortada.innerHTML = templateImg

    /* insertar informacion */

    const template = `<h1>${datosNecesarios.nombre}</h1>
                        <p>${datosNecesarios.sinopsis}</p>
                            <div class="favorito">
                              <button id ="agregarFavoritos" type="button" class="btn btn-dark">Agregar a favorito</button>
                           </div>`
        
        informacionAnime.innerHTML = template

    /* console.log(datosNecesarios); */

    const agregarFavoritos = document.getElementById("agregarFavoritos")
    console.log(agregarFavoritos);

    agregarFavoritos.addEventListener("click", ()=>{
        /* console.log("agregado"); */
        const datos = {
            id: datosNecesarios.id,
            nombre: datosNecesarios.nombre,
            imagen: datosNecesarios.imagen
        }
        if(localStorage.getItem("favoritos")){
            console.log("Existe un elemento");
            const favoritos = JSON.parse(localStorage.getItem("favoritos"));
            favoritos.push(datos)
            console.log(favoritos);
            localStorage.setItem("favoritos", JSON.stringify(favoritos))

        }
        else{
            console.log(("No tienes favoritos"));
            const favoritos = []
            favoritos.push(datos)
            localStorage.setItem("favoritos", JSON.stringify(favoritos))
        }

            /* JSON.parse(localStorage.getItem("favoritos")) */
            
    })

})

