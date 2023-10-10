import java.util.Scanner;
public class aula2 {
    public static void main(String[] args) {
        double numPecas;
        double valorRaio, areaTotal;

        Scanner scan = new Scanner(System.in);

        System.out.println(" Digite o número de peças : ");
        numPecas = scan.nextDouble();

        System.out.println(" Digite o raio das peças : ");
        valorRaio = scan.nextDouble();

        areaTotal = numPecas * Math.PI * Math.pow(valorRaio, 2);

        System.out.println("---------------------------------------");
        System.out.println("  Número peças \t : " + numPecas);
        System.out.println("  Raio   \t\t : " + valorRaio);
        System.out.println("  Área \t\t\t : " + areaTotal);
        System.out.format("  Área \t\t\t : %.2f", areaTotal);
        System.out.println("");
        System.out.println("---------------------------------------");
        scan.close();
    }
}
