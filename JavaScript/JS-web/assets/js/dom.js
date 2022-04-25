/* algunas cosas que podemos hacer con dom */


/* ETIQUETAS o propiedades del document.*/

console.log(window.document)/* regresa el documento completo */
console.log(document)/* regresa el documento completo */
console.log(document.head)/* regresa el encabezado del documento */
console.log(document.body)/* regresa el cuerpo  */
console.log(document.documentElement)/* regresa todo el html */
console.log(document.doctype)/* muestra la primera liga del documento */
console.log(document.charset)
console.log(document.links)/* regresa los links de anclaje que hay en la pag */
console.log(document.images)/* regresa todas las imagenes en la pag */
console.log(document.styleSheets)/* regresa los documentos de CSS */
console.log(document.scripts)/* regresa las etiquetas de script */


/* METODOS */
/* setTimeout ejecuta una accion despues de cierto tiempo  */

setTimeout(()=> {
    console.log(document.getSelection().toString());
}, 3000);

/* document.write inserta el mensaje dentro del body del documento  */
document.write("Hola mundo desde document write")
document.write("<h2>Hola mundo desde document write</h2>")










