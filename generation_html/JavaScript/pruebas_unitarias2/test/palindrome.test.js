//importando el objeto

const{palindrome}=require(`../para_probar`)

//primer test unitario
test(`palindrome de generation`,()=>{
    const resultado=palindrome("generation")

    //comparacion
expect(resultado).toBe("noitareneg")
})

/////////////////////////////////////////////////

test(`palindrome usando un string vacio`,()=>{
    const resultado=palindrome("")
    
    //comparacion
expect(resultado).toBe("")
})

/////////////////////////////////////////////////

test(`palindrome usando undefined`,()=>{
    const resultado=palindrome()
    
    //comparacion
expect(resultado).toBe(undefined)
})
