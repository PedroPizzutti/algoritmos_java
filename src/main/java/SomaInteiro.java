import java.util.Scanner;

public class SomaInteiro {

    public void somar(){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Soma inteiro ---");
        System.out.print("Insira o primeiro termo: ");
        int numero1 = scan.nextInt();
        System.out.print("Insira o segundo termo: ");
        int numero2 = scan.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);

    }

}
