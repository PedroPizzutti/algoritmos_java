import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoSalarioAnoEmpresa {

    private final double AUMENTO_MENOS_3_ANOS_EMPRESA = 1.03;
    private final double AUMENTO_3_A_10_ANOS_EMPRESA = 1.125;
    private final double AUMENTO_MAIS_10_ANOS_EMPRESA = 1.2;
    private String nome;
    private double salarioAtual;
    private double salarioReajustado;
    private int anosNaEmpresa;
    private Scanner scan;
    private DecimalFormat formatadorNumerico;


    public void calcularNovoSalarioFunc(){

        scan = new Scanner(System.in);
        formatadorNumerico = new DecimalFormat("#####.00");

        System.out.println("--- CALCULAR NOVO SALÁRIO FUNCIONÁRIO (TEMPO DE EMPRESA) ---");
        System.out.print("Insira o nome do/a funcionário/a: ");
        nome = scan.nextLine();
        System.out.print("Insira o salário: ");
        salarioAtual = scan.nextDouble();
        System.out.print("Insira quantos anos na empresa: ");
        anosNaEmpresa = scan.nextInt();

        if(anosNaEmpresa < 3){

            salarioReajustado = salarioAtual * AUMENTO_MENOS_3_ANOS_EMPRESA;

        } else if (anosNaEmpresa >= 3 && anosNaEmpresa < 10){

            salarioReajustado = salarioAtual * AUMENTO_3_A_10_ANOS_EMPRESA;

        } else {

            salarioReajustado = salarioAtual * AUMENTO_MAIS_10_ANOS_EMPRESA;

        }

        System.out.println("Funcionário(a):" + nome);
        System.out.println("Salário Atual: R$" + salarioAtual);
        System.out.println("Salário Reajustado: R$" + formatadorNumerico.format(salarioReajustado));

    }

}
