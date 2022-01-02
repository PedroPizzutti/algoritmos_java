import java.util.Scanner;

public class MaiorMenor {

    private int numero1;
    private int numero2;

    private Scanner scan;

    public void verificarMaiorMenorNumeral(){

        scan = new Scanner(System.in);

        System.out.println(" --- VERIFICA MAIOR-MENOR NÚMERO ---");
        System.out.print("Insira o primeiro número: ");
        numero1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        numero2 = scan.nextInt();

        if(numero1 > numero2) {
            System.out.println("O primeiro valor é maior!");

        } else if(numero1 < numero2) {
            System.out.println("O segundo valor é maior!");

        } else {
            System.out.println("Os números são iguais!");

        }
    }
}
