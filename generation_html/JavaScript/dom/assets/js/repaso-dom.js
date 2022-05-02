//se llama el elemento padre 
const $padre = document.querySelector(".padre")

//se crea un elemento nuevo
const $parr = document.createElement("p")
$parr.textContent += " Lorem ipsum"
$parr.textContent += " Lorem ipsum"
$parr.textContent += " Lorem ipsum"
//nos permite añadirle hijos al div padre

$padre.appendChild($parr)

//agregando elementos con inerHTML 

const $cuadro = document.querySelector (".cuadro")//elemento
$cuadro.innerHTML = ''   ;//inicializar el contenido del elemento 

$cuadro.innerHTML =`
                     <a href="#" >Este es un enlace </a>
                     <ol>//lista ordenada
                         <li>Elemento1</li>
                         <li>Elemento2</li>
                         <li>Elemento3</li>
                    </ol>`




const estaciones = ['primavera', 'verano', 'otoño ', 'invierno']

const $lista = document.createElement("ul")
estaciones.forEach(estacion =>{
    const $li = document.createElement("li")
    $li.textContent = estacion
    $lista.appendChild($li)

})
$cuadro.appendChild($lista)
/* document.body.appendChild($lista) */

/////////////////////////////////////////////////

const continentes = [`africa`,`asia`,`america`,`oceania`,`europa`]
const $ol = document.createElement("ol")
$cuadro.appendChild($ol)



continentes.forEach(continente => {$ol.innerHTML = `<li>${continentes}</li>`})






                      



