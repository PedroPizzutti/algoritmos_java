import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoReducaoVidaFumo {

    private int anosFumando;
    private int cigarrosFumadosDia;
    private int cigarrosFumadosAno;
    private int cigarrosFumadosVida;
    private double tempoVidaPerdidoMin;
    private double tempoVidaPerdidoHoras;
    private double tempoVidaPerdidoDias;
    private final int REDUCAO_TEMPO_VIDA_POR_CIGARRO = 11;
    private Scanner scan;
    private DecimalFormat formatador;

    public void calcularReducaoTempoVidaFumo(){

        scan = new Scanner(System.in);
        formatador = new DecimalFormat("0.##");

        System.out.println("--- Calculando tempo de vida perdido mediante uso de cigarros ---");
        System.out.print("Insira a quantidade de anos fumando: ");
        anosFumando = scan.nextInt();
        System.out.print("Insira a quantidade de cigarros fumados por dia: ");
        cigarrosFumadosDia = scan.nextInt();

        cigarrosFumadosAno = cigarrosFumadosDia * 365;
        cigarrosFumadosVida = cigarrosFumadosAno * anosFumando;

        tempoVidaPerdidoMin = cigarrosFumadosVida * REDUCAO_TEMPO_VIDA_POR_CIGARRO;
        tempoVidaPerdidoHoras = tempoVidaPerdidoMin / 60;
        tempoVidaPerdidoDias = tempoVidaPerdidoHoras / 24;

        System.out.println("Você já perdeu " + formatador.format(tempoVidaPerdidoDias) + " dias de vida" +
                "\nPare de Fumar!");

    }
}
