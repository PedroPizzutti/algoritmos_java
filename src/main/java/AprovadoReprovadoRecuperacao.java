import jdk.swing.interop.SwingInterOpUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AprovadoReprovadoRecuperacao {

    private double nota1;
    private double nota2;
    private double media;
    private final double NOTA_CORTE_REPROVACAO = 5.0;
    private final double NOTA_CORTE_RECUPERACAO = 7.0;
    private Scanner scan;
    private DecimalFormat formatadorNumerico;

    public void verificarAprovacao(){

        scan = new Scanner(System.in);
        formatadorNumerico = new DecimalFormat("0.##");

        System.out.println(" --- VERIFICADOR APROVAÇÃO ALUNO(A) ---");
        System.out.print("Insira a nota 1: ");
        nota1 = scan.nextDouble();
        System.out.print("Insira a nota 2: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Média: " + formatadorNumerico.format(media));

        if(media < NOTA_CORTE_REPROVACAO){
            System.out.println("REPROVADO(A) [Nota abaixo de " + NOTA_CORTE_RECUPERACAO + "].");

        } else if (media < NOTA_CORTE_RECUPERACAO){
            System.out.println("RECUPERAÇÃO " +
                    "[Nota entre " + NOTA_CORTE_REPROVACAO + " e " + (NOTA_CORTE_RECUPERACAO-0.1) + "].");

        } else {
            System.out.println("APROVADO(A) [Nota superior ou igual a " + NOTA_CORTE_RECUPERACAO + "].");

        }
    }
}
