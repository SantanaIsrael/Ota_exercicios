public class main {
    public static void main(String[] args) {
        Quadrilatero[] vetor = new Quadrilatero[5];

         vetor[0] = new Quadrado(5.2f); 
         //vetor[1] = new ;
         vetor[1] = new Retangulo(22f,25f);
         //vetor[3] = new ;
         vetor[2] = new Retangulo(2, 6);

         Retangulo newRetangulo = new Retangulo(2.5f, 2.3f);
         newRetangulo.aumentarTamanho(3f);

         for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].CalcularArea());
        }

        System.out.printf("Nova area: " + newRetangulo.CalcularArea());
    }
}