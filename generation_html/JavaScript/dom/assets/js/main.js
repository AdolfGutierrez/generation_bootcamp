/* este es un nodo de comentario */

const $titulo = document.querySelector("h1");
const $parr = document.querySelector("p");
const $card = document.querySelector(".card");

//nodeName
console.log($parr.nodeName);
console.log($titulo.nodeName);

//textContent
console.log($parr.textContent);
$parr.textContent += "Hola mundo";

$titulo.textContent +=
  "Modificando elementos con JavaScript haciendo uso de DOM";

//innerText - mejor no utlizarla

//innerHTML
console.log($parr.innerHTML);
/* 
$parr.innerHTML = '<a href="#">Este es un enlace <a/>'; */

//outerHtml
//$parr.outerHTML = '<a href="#">Este es un enlace <a/>';
//reemplaza todo, incluido el elemento que seleccionamos

//Crear elementos de HTML
console.log(document);

function crearElemento() {
  const img = document.createElement("img");
  img.src =
    "https://cosasdemascotas.net/wp-content/uploads/2020/06/ijgk7otlk58-scaled.jpg";

  //appendChild
  $card.appendChild(img);
}

crearElemento();