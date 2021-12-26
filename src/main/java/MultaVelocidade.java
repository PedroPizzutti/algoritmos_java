import java.text.DecimalFormat;
import java.util.Scanner;

public class MultaVelocidade {

    private final int LIMITE_VELOCIDADE = 80;
    private final int VALOR_MULTA_POR_KM = 5;
    private double velocidadeCondutor;
    private double velocidadeAcimaLimite;
    private double valorMulta;
    private Scanner scan;
    private DecimalFormat formatadorNumerico;

    public void verificarMulta(){

        scan = new Scanner(System.in);
        formatadorNumerico = new DecimalFormat("0.##");

        System.out.println("--- RADAR ---");
        System.out.println("--- LIMITE 80 KM/H ---");
        System.out.print("Velocidade do veículo no radar: ");
        velocidadeCondutor = scan.nextDouble();

        if(velocidadeCondutor <= LIMITE_VELOCIDADE){
            System.out.println("Dentro do limite permitido na via");
        } else {
            velocidadeAcimaLimite = velocidadeCondutor - LIMITE_VELOCIDADE;
            valorMulta = velocidadeAcimaLimite * VALOR_MULTA_POR_KM;
            System.out.println("Você estava a " + velocidadeAcimaLimite + "km/h acima do limite de velocidade");
            System.out.println("Você foi multado em R$" + formatadorNumerico.format(valorMulta));
        }
    }
}
