import java.util.Scanner;

public class CumprimentarPessoa {

    public void cumprimentar(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String nome = scan.nextLine();

        System.out.println("Olá, " + nome + " seja bem-vindo(a)");

    }

}
