window.addEventListener("load", function(){
    this.alert("se ha terminado de cargar la pagina")
})

function saludar(){
    alert("hola")
}


/* manejador de eventos semanticos = maneja una sola funcion por elemento */
const $botonSemantico = document.getElementById("evento-semantico")

$botonSemantico.onclick = saludar
$botonSemantico.onclick = function(evento){
    /* alert("hola desde un manejador semantico") */
    console.log(evento.target)
}

/* manejador de eventos multiples = maneja distintas ejecuciones o funciones y al mismo tiempo*/
const $botonMultiple = document.getElementById("evento-multiple")


$botonMultiple.addEventListener("click", saludarMultiple)
$botonMultiple.addEventListener("click", function(e){
    console.log(e.target)
})

function saludarMultiple(){
    alert("hola desde manejador multiple")
}


