import java.sql.SQLOutput;
import java.util.Scanner;

public class Delta {

    Scanner scan;
    int a;
    int b;
    int c;
    double delta;

    public void acharDelta(){

        scan = new Scanner(System.in);

        System.out.println("--- Encontrando o Delta ---");
        System.out.print("Insira o valor do termo a: ");
        a = scan.nextInt();
        System.out.print("Insira o valor do termo b: ");
        b = scan.nextInt();
        System.out.print("Insira o valor do termo c: ");
        c = scan.nextInt();

        delta = Math.pow(b, 2) - 4*a*c;

        System.out.println("O valor do Delta é: " + delta);

    }

}
