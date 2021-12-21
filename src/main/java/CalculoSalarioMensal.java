import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalarioMensal {

    private double salarioMensal;
    private int diasTrabalhados;
    private int horasTrabalhadasMes;
    private final double VALOR_HORA_TRABALHADA = 25.00;
    private final int HORAS_TRABALHADAS_DIA = 8;
    private Scanner scan;
    private DecimalFormat formatador;

    public void calcularSalarioMensal(){

        scan = new Scanner(System.in);
        formatador = new DecimalFormat("0.##");

        System.out.println("--- Calculando Salário Funcionário(a) ---");
        System.out.print("Insira a quantidade de dias trabalhos no mês: ");
        diasTrabalhados = scan.nextInt();

        horasTrabalhadasMes = diasTrabalhados * HORAS_TRABALHADAS_DIA;
        salarioMensal = horasTrabalhadasMes * VALOR_HORA_TRABALHADA;

        System.out.println("O salário do(a) funcionário(a) este mês é de: R$" + salarioMensal);
        System.out.println("\n*Horas diárias = " + HORAS_TRABALHADAS_DIA +  " e valor da hora = R$" + VALOR_HORA_TRABALHADA);


    }

}
