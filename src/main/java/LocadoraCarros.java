import java.text.DecimalFormat;
import java.util.Scanner;

public class LocadoraCarros {

    private double preçoTotal;
    private double preçoKm;
    private double preçoDiaria;
    private int kmRodados;
    private int diasLocados;
    private final double PRECO_KM = 0.20;
    private final double PRECO_DIARIA = 90.00;
    private Scanner scan;
    private DecimalFormat formatador;


    public void calcularValorLocacao(){

        scan = new Scanner(System.in);
        formatador = new DecimalFormat("0.##");

        System.out.println("--- Calculando Preço Locação Carros ---");
        System.out.print("Insira a quantidade de dias que o carro foi locado: ");
        diasLocados = scan.nextInt();
        System.out.print("Insira a quantidade de quilômetros rodados: ");
        kmRodados = scan.nextInt();

        preçoDiaria = diasLocados * PRECO_DIARIA;
        preçoKm = kmRodados * PRECO_KM;

        preçoTotal = preçoDiaria + preçoKm;

        System.out.println("O preço das diárias é de: R$" + formatador.format(preçoDiaria) +
                "\nO preço dos Kms rodados é de: R$" + formatador.format(preçoKm) +
                "\nO preço total da locação é de: R$" + formatador.format(preçoTotal) +
                "\n\n*Preço da diária = R$" + PRECO_DIARIA + " e km rodado = R$" + PRECO_KM);
    }

}
