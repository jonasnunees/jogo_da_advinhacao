import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("*** Advinhe o número ***");

        int numeroAleatorio = new Random().nextInt(100);
        int contador = 0;

        while (contador <= 5) {

            System.out.println("Digite um número: ");
            int n = scan.nextInt();

            if (n == numeroAleatorio) {
                System.out.println("Parabéns... você acertou!");
                break;
            } else {
                contador ++;
                int chances = 5 - contador;

                if (chances == 0) {
                    System.out.println("Essa é a sua última chance! Não desperdice!");
                } else if (chances > 0 && chances < 4) {
                    System.out.println("Ainda restam %d chances!".formatted(chances));
                } else if (chances < 0) {
                    System.out.println("Você perdeu... tente novamente!");
                    System.out.println("O número que o computador escolheu foi %d".formatted(numeroAleatorio));
                    break;
                }

            }

            if (n < numeroAleatorio) {
                System.out.println("O número escolhido é menor do que o computador escolheu");
            } else {
                System.out.println("O número escolhido é maior do que o computador escolheu");
            }
        }

        scan.close();

    }
}
