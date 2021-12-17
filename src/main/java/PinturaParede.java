import java.text.DecimalFormat;
import java.util.Scanner;

public class PinturaParede {

    Scanner scan;
    DecimalFormat formatador;
    double altura;
    double largura;
    double area;
    double qtdTinta;

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
                "Você precisará de: " + formatador.format(qtdTinta) + " litros de tinta");

    }

}
