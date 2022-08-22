package unitTests;

import devCalc.Calculadora;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static org.testng.Assert.assertEquals;

public class TestaCalculadora {

    @Test
    public void testarSomarDoisNumeros () {
    // 1 Prepara - configura - given
    int num1 = 5;
    int num2 = 5;
    int resultadoEsperado = 10;

        // 2 Executor - when

        int resultadoAtual =  Calculadora.somarDoisNumeros(num1, num2);

        // 3 validar - The
        assertEquals(resultadoEsperado,resultadoAtual);
        System.out.println("o Resultado Esperado e: " + resultadoEsperado + " O resultado Atual foi: " + resultadoAtual);


    }
    @Test
    public void testasSubtrairDoisNumeros(){
        int num1 = 6;
        int num2 = 2;
        int resultadoEsperado = 4;
        int resultadoAtual = Calculadora.subtrairDoisNumeros(num1,num2);
        System.out.println("O Resultado Esperado e:" + resultadoEsperado + "e o Resultado atual e: " + resultadoAtual);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test //Positivo
    public  void testarMultiplicarDoisNumeros(){
        int num1 = 2;
        int num2 = 2;
        int resultadoEsperado = 4;
        int resultadoAtual = Calculadora.multiplicarDoisNumeros(num1,num2);
        System.out.println("O Resultado Esperado e: "  + resultadoEsperado + "Resultado Atual e: " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);

    }

    @Test // com Falha
    public void falhaNoResultadoDaMultiplicacaoDeDoisNumeros(){
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 2;
        int resultadoAtual = Calculadora.multiplicarDoisNumeros(num1,num2);
        System.out.println("O Resultado Esperado e:" + resultadoEsperado + "Resultado Atual e: " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);

    }

    @Test
    public void DividirDoisNumeros(){
        int num1 = 6;
        int num2 = 1;
        int resultadoEsperado = 2;
        int resultadoAtual = Calculadora.dividirDoisNumeros(num1,num2);
        System.out.println("O Resultado Esperado e:" + resultadoEsperado + "O Resultado Atual e:" + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }




    @Test
        public void testarMain(){


}


}
