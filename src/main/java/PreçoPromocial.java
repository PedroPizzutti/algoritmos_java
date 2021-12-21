import java.text.DecimalFormat;
import java.util.Scanner;

public class PreçoPromocial {

    private double preçoProduto;
    private double preçoPromocional;
    private double desconto;
    private final double PERCENTUAL_DESCONTO = 0.05;

    public void calcularPreçoPromocional(){

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.##");

        System.out.println("--- CÁLCULO PREÇOS PROMOCIONAIS ---");
        System.out.print("Insira o preço do produto sem desconto: ");
        preçoProduto = scan.nextDouble();

        desconto = preçoProduto * PERCENTUAL_DESCONTO;

        preçoPromocional = preçoProduto - desconto;

        System.out.println("O desconto de 5% equivale a: R$" + formatador.format(desconto)
                + "\nO preço promocional é: R$" + formatador.format(preçoPromocional));
    }



}
