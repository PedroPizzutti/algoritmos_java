import java.text.DecimalFormat;
import java.util.Scanner;

public class RealDolar {

    private double reais;
    private double dolares;
    Scanner scan;
    DecimalFormat formatador;

    public void converterRealDolar(){

        scan = new Scanner(System.in);

        System.out.println("--- Quantos dolares posso comprar ---");
        System.out.println("Quantos reais você têm na carteira? ");
        reais = scan.nextFloat();

        dolares = reais / 5.5;

        formatador = new DecimalFormat("0.##");

        System.out.println("Você pode comprar " + formatador.format(dolares) + " dolares com o que você tem na carteira.");
        System.out.println("Taxa de conversão 5.50 Real Brasileiro.");

    }

}
