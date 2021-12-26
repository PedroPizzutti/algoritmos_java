import java.util.Scanner;

public class AnoBissexto {

    private int ano;
    private Scanner scan;

    public void verificarAnoBissexto() {

        scan = new Scanner(System.in);

        System.out.println("--- VERIFICANDO SE O ANO É BISSEXTO ---");
        System.out.print("Insira o ano que deseja analisar: ");
        ano = scan.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("O ano " + ano + " é bissexto.");
                } else {
                    System.out.println("O ano " + ano + " não é bissexto.");
                }
            }
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
