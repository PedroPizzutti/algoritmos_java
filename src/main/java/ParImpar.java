import java.util.Scanner;

public class ParImpar {

    private int numeroUsuario;
    private Scanner scan;

    public void verificarParImpar(){

        scan = new Scanner(System.in);

        System.out.println(" --- VERIFICA PAR OU ÍMPAR ---");
        System.out.print("Insira um número inteiro: ");
        numeroUsuario = scan.nextInt();

        if(numeroUsuario % 2 == 0){
            System.out.println("O número inserido é par!");
        } else {
            System.out.println("O número inserido é ímpar!");
        }
    }
}
