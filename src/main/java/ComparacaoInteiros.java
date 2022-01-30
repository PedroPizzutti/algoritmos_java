import java.sql.SQLOutput;
import java.util.Scanner;

public class ComparacaoInteiros {

    private int num1;
    private int num2;
    private Scanner scan;


    public void compararDoisInteiros(){

        scan = new Scanner(System.in);

        System.out.println("--- QUAL NÚMERO INTEIRO É MAIOR? ---");
        System.out.print("Insira o primeiro número: ");
        num1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = scan.nextInt();

        if(num1 == num2){

            System.out.println("Os números possuem o mesmo valor.");

        } else if (num1 > num2) {

            System.out.println("O primeiro número é maior que o segundo.");

        } else {

            System.out.println("O segundo número é maior que o primeiro.");

        }

    }

}
