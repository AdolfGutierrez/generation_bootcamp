//importando el objeto average

const {average}=require("../para_probar")

describe("average",()=>{
   /*  test("Ingresar un solo valor", ()=>{
        const resultado=average([1])

        expect(resultado).toBe(1)
    }) */

    test("Ingresar un solo valor", ()=>{
        expect(average([1])).toBe(1)
    })

    test("usando multiples valores", ()=>{
        expect(average([1,2,3,4,5,6])).toBe(3.5)
    })

    //crear un test para probarr un valor undefined
    //expect(average()).toBe()

    test("usando un valor undefined",()=>{
        expect(average()).toBe(undefined)
    })

    test("usando un array vacio",()=>{
        expect(average([])).toStrictEqual([])
    })
})



