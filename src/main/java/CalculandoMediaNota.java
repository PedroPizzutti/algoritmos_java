import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculandoMediaNota {

    public void calcularMedia(){

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.##");

        System.out.println("--- Calculando Média ---\n");

        System.out.print("Insira a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.print("Insira a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.print("\nA media entre " + formatador.format(nota1) + " e " + formatador.format(nota2)
                + " é: " + formatador.format(media));


    }

}
