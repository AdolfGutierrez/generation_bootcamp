window.addEventListener("keypress", registro)

const $parrafo = document.getElementById("par")
document.getElementById("resert").addEventListener("click", ()=> {
    $parrafo.textContent = "";
    console.clear()
})

function registro(e){
    console.log(e.key, e.keyCode, e.code)
    $parrafo.textContent += e.key + "   " + e.keyCode + "   " e.code + "     ";
}