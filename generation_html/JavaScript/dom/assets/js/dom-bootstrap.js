const bd = [
    {
        url: `https://placeimg.com/200/200/animals`,
        title: `animales`,
        description: `Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!`
    },
    {
        url: `https://placeimg.com/200/200/tech`,
        title: `tecnologia`,
        description: `Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!`
    },
    {
        url: `https://placeimg.com/200/200/people`,
        title: `personas`,
        description: `Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!`
    },
    {
        url: `https://placeimg.com/200/200/nature`,
        title: `naturaleza`,
        description: `Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!`
    },
    {
        url: `https://placeimg.com/200/200/arch`,
        title: `arquitectura`,
        description: `Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!`
    },
]

console.log(bd[0]);

const $cards = document.getElementById("cards")
$cards.innerHTML = ``

bd.forEach(objeto => {
    $cards.innerHTML += `
    <div class="col mb-4">
    <div class="card">
      <img src="${objeto.url}" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">${objeto.title}</h5>
        <p class="card-text">${objeto.description}</p>
      </div>
    </div>
  </div>`

})


console.log(bd);
//  JSON o parse

const bdJSON = JSON.stringify(bd) //sringify convierte un objeto en cadena de texto 
console.log(bdJSON);





