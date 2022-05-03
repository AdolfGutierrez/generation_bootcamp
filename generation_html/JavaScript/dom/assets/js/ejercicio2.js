/* Ejercicio #2
Escriba una función JavaScript para obtener los valores de Nombre y Apellido del siguiente formulario.

Imprima los nombres en la consola.

Archivo HTML de ejemplo: */
const formulario = document.getElementById ("form1")
// const button = document.getElementById ("")

function getFormvalue(e)

{
  var x=document.getElementById("form1");
  for (var i=0;i<x.length;i++)
  {
   if (x.elements[i].value!='Submit')
    {  
        e.preventDefault();
      console.log(x.elements[i].value);
    
     }  
   }
}

formulario.addEventListener("submit",getFormvalue)

