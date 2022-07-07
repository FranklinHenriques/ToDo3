    //Pacote
        package devCalc;
    // Bibliotecas

        import java.util.Scanner;

    // Classe
        public class Calculadora {

//Atributos
        static Scanner entrada = new Scanner(System.in);

// Métodos e Funções > Método ele faz e da retorno > Função só faz

    public static void main(String[] args){
// Exibi o menu da calculadora
        System.out.println(">> CALCULADORA <<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("escolha a Calculo desejado: ");
// Recebe a opcao desejada

        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;

// Pergunta os valores a serem usados no calculo

        if (opcao >= 1 && opcao <= 4) {
            System.out.print("Entre o 1º numero: ");
            num1 = entrada.nextInt();
            System.out.print("Entre o 2º numero: ");
            num2 = entrada.nextInt();
            System.out.print(" O resultado é: ");
        }
// Chama a função do calculo desejado

        switch (opcao){
            case 1:
                System.out.println(somarDoisNumeros(num1 , num2));
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }
    public static int somarDoisNumeros(int num1, int num2){
//ou faz no retun ou faz nessa linha  int soma = num1 + num2;
    return num1 + num2;
}
//




}
