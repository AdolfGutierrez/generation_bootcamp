/**
* crear un documento ejercicio 1.html y ejercicio1.js
* -crear una plicación que registre y muestre la tecla presionada
* Mostrar key keycode y code
*/

const $textAreaInput = document.getElementById('textIn');
const $textAreaOutput = document.getElementById('textOut');

window.addEventListener('keydown', function (event) {
    this.setTimeout(function () {
        $textAreaOutput.innerHTML = event.key + ' ' + event.keyCode + ' ' + event.code;
    }, 500);
    console.log(event.key, event.keyCode);
});