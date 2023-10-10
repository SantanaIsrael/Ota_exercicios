import java.util.Scanner;
public class aula3 {
    public static void main(String[] args) {
        /*preciso do raio da esfera, depois verificar a altura, 
        largura e profundidade sao maiores que o raio da esfera*/
        
        float l,h,p, raio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Largura: ");
        l = teclado.nextFloat();
        System.out.println("Altura ");
        h = teclado.nextFloat();
        System.out.println("Profundidade ");
        p = teclado.nextFloat();
        System.out.println("Raio ");
        raio = teclado.nextFloat();

        if(raio < l && raio < h && raio < p) System.out.println("Pode butar");

        teclado.close();
    }
}
