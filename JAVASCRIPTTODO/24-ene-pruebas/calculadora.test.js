const {sumar, restar, multiplicar, dividir} = require('./calculadora')

describe('Pruebas en el componente de calculadora', () =>{
    test('Pruebas en la funcion sumar', ()=>{
        expect(sumar(3,5)).toBe(8);
    });
    test('Pruebas en la funcion restar', ()=>{
        expect(restar(3,5)).toBe(-2);
    });
    test('Pruebas en la funcion multiplicar', ()=>{
        expect(multiplicar(3,5)).toBe(15);
    });
    test('Pruebas en la funcion dividir', ()=>{
        expect(dividir(9,3)).toBe(3);
    });
});