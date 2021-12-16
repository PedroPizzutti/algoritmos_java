import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class NomeSalario {

    public void apresentarNomeSalario(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o nome do(a) funcionário(a)?");
        String nomeFunc = scan.nextLine();
        System.out.println("Qual o salário do(a) funcionário(a)?");
        float salarioFunc = scan.nextFloat();


        System.out.println("\nNome do(a) funcionário(a): " + nomeFunc + "\n" +
                "Salário: R$" + salarioFunc);

    }

}
