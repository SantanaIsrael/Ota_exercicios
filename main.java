public class main {
    public static void main(String[] args) {
        quadrilatero[] vetor = new quadrilatero[5];

         vetor[0] = new quadrado(5.2f); 
         vetor[1] = new quadrilatero(2f, 5f);
         vetor[2] = new retangulo(22f,25f);
         vetor[3] = new quadrilatero(33f, 5.3f);
         vetor[4] = new retangulo(2, 6);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].CalcularArea());
        }
    }
}