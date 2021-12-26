import java.util.Scanner;

public class IdadeVoto {

    private int idadeUsuario;
    private final int IDADE_MINIMA_VOTO_FACULTATIVO = 16;
    private final int IDADE_MINIMA_VOTO_OBRIGATORIO = 18;
    private final int IDADE_MAXIMA_VOTO_OBRIGATORIO = 70;
    private Scanner scan;

    public void verificarPossibilidadeVoto(){

        scan = new Scanner(System.in);

        System.out.println("--- PODE/DEVE VOTAR? ---");
        System.out.println("Insira a idade da pessoa: ");
        idadeUsuario = scan.nextInt();

        if(idadeUsuario < IDADE_MINIMA_VOTO_FACULTATIVO){

            System.out.println("Você ainda não pode votar!");
            System.out.println("Idade mínima para votar: " + IDADE_MINIMA_VOTO_FACULTATIVO + " anos.");

        } else if(idadeUsuario >= IDADE_MINIMA_VOTO_FACULTATIVO && idadeUsuario < IDADE_MINIMA_VOTO_OBRIGATORIO){

            System.out.println("Você pode votar e o voto é facultativo.");
            System.out.println("Idade mínima para votar: " + IDADE_MINIMA_VOTO_FACULTATIVO + " anos.");
            System.out.println("Idade em que o voto passa a ser obrigatório: " + IDADE_MINIMA_VOTO_OBRIGATORIO + " anos;");

        } else if(idadeUsuario >= IDADE_MINIMA_VOTO_OBRIGATORIO && idadeUsuario <= IDADE_MAXIMA_VOTO_OBRIGATORIO){

            System.out.println("Você deve votar!");
            System.out.println("Voto obrigatório para aqueles entre " + IDADE_MINIMA_VOTO_OBRIGATORIO +
                    " e " + IDADE_MAXIMA_VOTO_OBRIGATORIO + " anos.");

        } else {

            System.out.println("Você pode votar e o voto é facultativo.");
            System.out.println("Voto obrigatório até " + IDADE_MAXIMA_VOTO_OBRIGATORIO + " anos.");

        }
    }
}
