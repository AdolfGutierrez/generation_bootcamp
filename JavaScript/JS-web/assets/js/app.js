/* Selectores: para usarlos en JS se llama el elemento y se guarda en una variable */
/* para almacener elementos en una variable de HTML se usa $ */


/* toma un elemento con un id */
const $parrafo = document.getElementById ("parrafo");
console.log($parrafo)

/* selecciona un elemento y nos da diversas formas de seleccionarlo */
const $titulo = document.querySelector(".titulo")
console.log($titulo)

const $parrafos = document.querySelectorAll("p")
console.log($parrafos[1])

const $titulos = document.querySelectorAll("div h1")
console.log($titulos)