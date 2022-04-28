const Adolfo = {
    /* atributos o datos como info */
    nombreCompleto:{
        nombre: "Adolfo",
        apellido:"Gutierrez"
    },

     edad: 28,
     pasatiempos: ["ajedrez", "box", "leer"],
}
const Abi = {
    nombreCompleto:{
        nombre: "Abigail",
        apellido: "Moreno"
    }, 
    edad:23, 
    pasatiempos: ["bailar", "plantas", "leer"], 
}
const Pedro = {
    nombreCompleto: {
        nombre: "Antonio",
        apellido: "Castañón"
    },
    edad: 18,
    pasatiempos: ["jugar","salir","series"],
}
const manuManito = {
    nombreCompleto:{
        nombre: "Manuel Adán",
        apellido: "Carrillo Zavala",
    }, 
    edad: 29,
    pasatiempos: ['Leer', 'Tomar cafésito', 'Estar en casa', 'Echar chismecito'],
}
const Mitzi = {
    nombreCompleto: {
        nombre: "Mitzi",
        app: "Hernandez"
    },
    edad: 23,
    pasatiempos: ["jugar", "dibujar", "ver series"],
}
const Katia = {
    nombreCompleto: {
        nombre: "Katia",
      apellido: "Alvarez",
    },
    edad: 28,
    pasatiempos: ["Cine", "Musica", "Baile"],
  };
  

const cohorte12 = [Abi,Pedro,manuManito,Mitzi,Adolfo,Katia]

for(let i=0; i<cohorte12.length; i++){
    if(cohorte12[i].pasatiempos.includes("leer")){
        console.log(cohorte12[i].nombreCompleto.nombre)

    }
/*  console.log(cohorte12[i].pasatiempos.includes("leer"))    */
}

