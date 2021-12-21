import java.text.DecimalFormat;
import java.util.Scanner;

public class PinturaParede {

    private Scanner scan;
    private DecimalFormat formatador;
    private double altura;
    private double largura;
    private double area;
    private double qtdTinta;

    public void calcularAreaPintura(){

        scan = new Scanner(System.in);
        formatador = new DecimalFormat("0.##");

        System.out.println("--- Calculando area de pintura e quantidade de tinta ---");
        System.out.print("Insira a altura da parede: ");
        altura = scan.nextDouble();
        System.out.print("Insira a largura da parede: ");
        largura = scan.nextDouble();

        area = altura * largura;
        qtdTinta = area / 2;

        System.out.println("A area a ser pintada é de : " + formatador.format(area) + "m²\n" +
                "Você precisará de: " + formatador.format(qtdTinta) + " litros de tinta.");
        System.out.println("*considerando que cada litro de tinta pinta 2m².");

    }

}
