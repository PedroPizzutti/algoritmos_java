import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoSalario {

    private double salarioAtual;
    private double salarioNovo;
    private double aumentoSalarial;
    private final double PERCENTUAL_AUMENTO = 0.15;
    private Scanner scan;
    private DecimalFormat formatador;


    public void calcularAumentoSalarial(){

        scan = new Scanner(System.in);
        formatador = new DecimalFormat("0.##");

        System.out.println("--- Calculando Novos Salários ---");
        System.out.print("Insira o salário atual do(a) funcionário(a): R$");
        salarioAtual = scan.nextDouble();

        aumentoSalarial = salarioAtual * PERCENTUAL_AUMENTO;
        salarioNovo = salarioAtual + aumentoSalarial;

        System.out.println("O aumento de 15% é de: R$" + formatador.format(aumentoSalarial) +
                "\nO novo salário do funcionário é de: R$" + formatador.format(salarioNovo));
    }

}
