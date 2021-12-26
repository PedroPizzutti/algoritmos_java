import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoPreçoCorrida {

    private double distanciaKm;
    private double preçoCorrida;
    private final double PREÇO_PORKM_ATE_200KM = 0.50;
    private final double PREÇO_PORKM_MAIS_200KM = 0.45;
    private Scanner scan;
    private DecimalFormat formatadorNumerico;

    public void calcularPreçoCorrida(){

        scan = new Scanner(System.in);
        formatadorNumerico = new DecimalFormat("0.##");

        System.out.println("--- CALCULANDO PREÇO DA CORRIDA ---");
        System.out.println("- Até 200km R$0.50 por Km, de 200km em diante R$0.45 por Km -");
        distanciaKm = scan.nextDouble();

        if(distanciaKm < 200){
            preçoCorrida = distanciaKm * PREÇO_PORKM_ATE_200KM;
        } else {
            preçoCorrida = distanciaKm * PREÇO_PORKM_MAIS_200KM;
        }

        System.out.println("Obrigado por viajar conosco, sua corrida fica R$" + formatadorNumerico.format(preçoCorrida));
    }

}
