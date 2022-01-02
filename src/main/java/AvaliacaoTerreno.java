import jdk.swing.interop.SwingInterOpUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AvaliacaoTerreno {

    private double comprimento;
    private double largura;
    private double area;
    private final double LIMITE_DIMENSAO_TERRENO_POPULAR = 100.00;
    private final double LIMITE_DIMENSAO_TERRENO_MASTER = 500.00;
    private Scanner scan;
    private DecimalFormat formatadorNumerico;

    public void avaliarTerreno(){

        scan = new Scanner(System.in);
        formatadorNumerico = new DecimalFormat("0.00");

        System.out.println(" --- AVALIADOR DE TIPO DE TERRENO ---");
        System.out.print("Insira o comprimento do terreno: ");
        comprimento = scan.nextDouble();
        System.out.print("Insira a largura do terreno: ");
        largura = scan.nextDouble();

        area = comprimento * largura;

        System.out.println("Área do terreno: " + formatadorNumerico.format(area) + "m²");

        if(area < LIMITE_DIMENSAO_TERRENO_POPULAR){
            System.out.println("Área abaixo de " + LIMITE_DIMENSAO_TERRENO_POPULAR +
            "m²: TERRENO POPULAR");

        } else if(area >= LIMITE_DIMENSAO_TERRENO_POPULAR && area < LIMITE_DIMENSAO_TERRENO_MASTER){
            System.out.println("Área acima de " + LIMITE_DIMENSAO_TERRENO_POPULAR +
                    "m² e abaixo de " + LIMITE_DIMENSAO_TERRENO_MASTER + "m²: TERRENO MASTER");

        } else {
            System.out.println("Área acima de " + LIMITE_DIMENSAO_TERRENO_MASTER + "m²: TERRENO VIP");

        }
    }


}
