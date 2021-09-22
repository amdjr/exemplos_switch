
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o segundo número");
        float n2 = teclado.nextFloat();
        System.out.println("Digite o primeiro número");
        System.out.println("Escolha a operação:");
        System.out.println("[1]-Somar");
        System.out.println("[2]-Subtrair");
        System.out.println("[3]-Multiplicar");
        System.out.println("[4]-Dividir");
        System.out.println("[0]-sair");

        byte opcao = teclado.nextByte();

        float resultado;

        switch (opcao) {
            case 1:
                resultado = somar(n1, n2);
                System.out.printf("A soma é %.2f", resultado);
                break;
            case 2:
                resultado = subtrair(n1, n2);
                System.out.printf("A subtração é %.2f", resultado);
                break;
            case 3:
                resultado = multiplicar(n1, n2);
                System.out.printf("A multiplicação é %.2f", resultado);
                break;
            case 4:
                resultado = dividir(n1, n2);
                System.out.printf("A divisão é %.2f", resultado);
                break;
            case 0:
                System.out.println("Obrigado por usar a aplicação");
                break;
            default:
                System.out.println("Operação inválida");

        }
        teclado.close();

    }

    private static float somar(float n1, float n2) {
        return n1 + n2;
    }

    private static float subtrair(float n1, float n2) {
        return n1 - n2;
    }

    private static float multiplicar(float n1, float n2) {
        return n1 + n2;
    }

    private static float dividir(float n1, float n2) {
        return n1 + n2;
    }

}
