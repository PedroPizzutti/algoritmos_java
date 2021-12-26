import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class AlistamentoMilitar {

    private int idadeUsuario;
    private final int IDADE_ALISTAMENTO = 18;
    private int anosDoAlismento;
    private Scanner scan;

    public void verificarIdadeAlistamento(){

        scan = new Scanner(System.in);

        System.out.println("--- SITUAÇÃO ALISTAMENTO EM RELAÇÃO À IDADE ---");
        System.out.println("Insira a sua idade: ");
        idadeUsuario = scan.nextInt();

        if(idadeUsuario < IDADE_ALISTAMENTO){
            anosDoAlismento = IDADE_ALISTAMENTO - idadeUsuario;
            System.out.println("Faltam " + anosDoAlismento + " anos para você se alistar.");
        } else if(idadeUsuario > IDADE_ALISTAMENTO){
            anosDoAlismento = idadeUsuario - IDADE_ALISTAMENTO;
            System.out.println("Você se alistou a " + anosDoAlismento + " anos.");
        } else {
            System.out.println("Você deve se alistar esse ano!");
        }
    }
}
