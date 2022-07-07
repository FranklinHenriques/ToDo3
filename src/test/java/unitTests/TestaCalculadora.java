package unitTests;

import devCalc.Calculadora;
import org.testng.annotations.Test;

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
        public void testarMain(){


}


}
