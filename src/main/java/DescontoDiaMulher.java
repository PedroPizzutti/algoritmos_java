import java.text.DecimalFormat;
import java.util.Scanner;

public class DescontoDiaMulher {

    private String nomePessoa;
    private double preçoCompra;
    private double valorDesconto;
    private int generoPessoa;
    private final double DESCONTO_MULHER = 0.13;
    private final double DESCONTO_HOMEM = 0.05;
    private DecimalFormat formatadorNumerico;
    private Scanner scan;

    public void calcularDescontoPorGenero(){

        scan = new Scanner(System.in);
        formatadorNumerico = new DecimalFormat("0.##");

        System.out.println("--- DESCONTOS COMEMORAÇÃO DIA DA MULHER ---");
        System.out.println("- Desconto de 13% para mulheres e de 5% para homens -");
        System.out.println("Insira o nome do(a) cliente: ");
        nomePessoa = scan.nextLine();
        System.out.println("Insira o valor da compra: ");
        preçoCompra = scan.nextDouble();
        System.out.println("Selecione o gênero da pessoa: ");
        System.out.println("1 - Mulher  /// 2 - Homem");
        generoPessoa = scan.nextInt();

        switch(generoPessoa){
            case 1:
                valorDesconto = preçoCompra * DESCONTO_MULHER;
                preçoCompra -= valorDesconto;
                break;

            case 2:
                valorDesconto = preçoCompra * DESCONTO_HOMEM;
                preçoCompra -= valorDesconto;
                break;

            default:
                System.out.println("Você não selecionou um gênero válido...");
        }

        System.out.println("Obrigado por comprar conosco " + nomePessoa + ".");
        System.out.println("Valor da compra com desconto: R$" + formatadorNumerico.format(preçoCompra));
    }

}
