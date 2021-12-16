import java.util.Scanner;

public class ConversorMedidas {

    public void converterMedidas(){

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Conversor Medidas ---");
        System.out.print("Insira a medida em metros: ");
        float medidaUsuario = scan.nextFloat();

        float dam = medidaUsuario / 10;
        float hm = medidaUsuario / 100;
        float km = medidaUsuario / 1000;
        float dm = medidaUsuario * 10;
        float cm = medidaUsuario * 100;
        float mm = medidaUsuario * 1000;

        System.out.println("Medida em dam: " + dam);
        System.out.println("Medida em hm: " + hm);
        System.out.println("Medida em km: " + km);
        System.out.println("Medida em dm: " + dm);
        System.out.println("Medida em cm: " + cm);
        System.out.println("Medida em mm: " + mm);

    }

}
