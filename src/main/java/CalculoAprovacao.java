import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoAprovacao {

    private String nomeAluno;
    private double nota1;
    private double nota2;
    private double media;
    private final int NOTA_MINIMA_APROVACAO = 7;
    private Scanner scan;
    private DecimalFormat formatadorNumerico;

    public void calcularAprovacao(){

        scan = new Scanner(System.in);
        formatadorNumerico = new DecimalFormat("0.##");

        System.out.println(" --- VERIFICANDO APROVAÇÃO ---");
        System.out.println("Insira o nome do(a) aluno(a):");
        nomeAluno = scan.nextLine();
        System.out.println("Insira a nota da primeira prova: ");
        nota1 = scan.nextDouble();
        System.out.println("Insira a nota da segunda prova: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= NOTA_MINIMA_APROVACAO){
            System.out.println("Aluno(a) " + nomeAluno + " aprovado(a) com a média " +
                    formatadorNumerico.format(media) + ".");
        } else {
            System.out.println("Aluno(a) " + nomeAluno + " reprovado(a) com a média " +
                    formatadorNumerico.format(media) + ".");
        }
    }

}
