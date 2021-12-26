import java.util.Scanner;

public class PossibilidadeTriangulo {

    private double segmento1;
    private double segmento2;
    private double segmento3;
    private double somaSegmentos12;
    private double somaSegmentos23;
    private double somaSegmentos13;
    private Scanner scan;

    public void verificarPossibilidadeTriangulo(){

        scan = new Scanner(System.in);

        System.out.println(" --- VERIFICANDO POSSIBILIDADE DE CONSTRUÇÃO DE UM TRIÂNGULO --- ");
        System.out.print("Insira o tamanho do primeiro segmento de reta:");
        segmento1 = scan.nextDouble();
        System.out.print("Insira o tamanho do segundo segmento de reta:");
        segmento2 = scan.nextDouble();
        System.out.print("Insira o tamanho do terceiro segmento de reta:");
        segmento3 = scan.nextDouble();

        somaSegmentos12 = segmento1 + segmento2;
        somaSegmentos13 = segmento1 + segmento3;
        somaSegmentos23 = segmento2 + segmento3;

        if(somaSegmentos12 > segmento3 && somaSegmentos23 > segmento1 && somaSegmentos13 > segmento2){
            System.out.println("É possível construir um triângulo com essas medidas!");
        } else {
            System.out.println("Não é possível construir um triângulo com essa medidas...");
        }
    }
}
