import java.util.Scanner;

public class AntecessorSucessor {

    public void antecederSuceder(){

        Scanner scan = new Scanner(System.in);

        int numeroUser = 0;
        int antecessor = 0;
        int sucessor = 0;

        System.out.println("--- Sucessor - Antecessor ---");
        System.out.print("Insira um número inteiro: ");
        numeroUser = scan.nextInt();

        antecessor = numeroUser - 1;
        sucessor = numeroUser + 1;

        System.out.println("\nO sucessor de " + numeroUser + " é " + sucessor);
        System.out.println("O antecessor de " + numeroUser + " é " + antecessor);
    }

}
