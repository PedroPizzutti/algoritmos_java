import java.text.DecimalFormat;
import java.util.Scanner;

public class DobroTerçaParte {

    public void dobrarTerçar (){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Dobro e Terça Parte ---");
        System.out.print("Digite um número real: ");
        float numeroUsuario = scan.nextFloat();

        float dobro = numeroUsuario * 2;
        float terçaParte = numeroUsuario / 3;

        DecimalFormat formatador = new DecimalFormat("0.###");

        System.out.println("\nO dobro de " + numeroUsuario + " é: " + formatador.format(dobro));
        System.out.println("A terça parte de " + numeroUsuario + " é: " + formatador.format(terçaParte));

    }

}
