import java.util.Scanner;

/*
 * Exemplo:
 *      - Faça um programa que leia variáveis de vários 
 *        tipos e as imprima em tela.
 *
 * Exercício:
 *      - Por que há problemas na leitura de char, compare com o C
 *      - Explique qual o papel da variável do tipo Scanner
 *
 * Discussões e aprenda mais:
 *      - Pesquise nos materiais de apoio o que é um Tipo Primitivo no Java
 */
public class aula1 {
    
    public static void main (String args[])
    {
        int     idSensor = 10;
        float   valorSensor;
        char    statusBomba;
        String  grandezaSensor;

        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Digite o Id do Sensor : ");
        idSensor = scan.nextInt();
        
        System.out.println(" Digite o valor do sensor : ");
        valorSensor = scan.nextFloat();
        
        System.out.println(" Digite a grandeza do sensor : ");
        grandezaSensor = scan.next();
        
        System.out.println(" Digite o status da bomba : ");
        statusBomba = scan.next().charAt(0);
        
        System.out.println("---------------------------------------");
        System.out.println("  ID \t\t\t : " + idSensor);
        System.out.println("  Valor   \t\t : " + valorSensor);
        System.out.println("  Grandeza \t\t : " + grandezaSensor);
        System.out.println("  Status \t\t : " + statusBomba);
        System.out.println("---------------------------------------");
        scan.close();
    }
}