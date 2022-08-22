package unitTests;

import devCalc.Calculadora;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestarCalculadora22_08 {
    @Test
    public static void  testarSomarDoisNumeros(){

    // 1 Prepara - Configuara - Given

    int num1 = 5;
    int num2 = 7;
    int resultadoEsperado = 12;

    // 2 - Executar - When
      int resultadoAtual = Calculadora.somarDoisNumeros(num1,num2);

    // 3 - Validar - Then
    assertEquals(resultadoEsperado,resultadoAtual);

    }
    @Test
public void testarMain(){
        // 1 Prepara - Configuara - Given
        int num1 = 3;
        int num2 = 2;
        int resultadoEsperado = 6;
        // 2 - Executar - When
        int resultadoAtual = Calculadora.multiplicarDoisNumeros(num1,num2);
        // 3 - Validar - Then
        assertEquals(resultadoEsperado,resultadoAtual);


    }
    @Test
    public void testarMainMultiplicacao(){
        // 1 Prepara - Configuara - Given /Dado
        int num1 = 10;
        int num2 = 5;
        int resultadoEsperado = 2;
        // 2 - Executar - When / Quando
        int resultadoAtual = Calculadora.dividirDoisNumeros(num1,num2);

        // 3 - Validar - Then / Então
        assertEquals(resultadoEsperado,resultadoAtual);
    }

}
