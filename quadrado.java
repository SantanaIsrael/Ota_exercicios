public class Quadrado extends Quadrilatero implements ObjetoIOT {
    protected float altura;

    public Quadrado(float altura, float x, float y){
        super(x, y);
        this.altura = altura;
    }

    public Quadrado(float altura){
        this(altura, 0, 0);
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }

    @Override
    public float CalcularArea() {
        System.out.println("CalcularArea quadrado.");
        return altura * altura;
    }

    @Override
    public float CalcularPerimetro() {
        System.out.println("Calculando perimetro do quadrado");
        return altura*4;
    }

    @Override
    public void aumentarTamanho(float porcento) {
        altura =+ (altura*porcento)/100;
    }

    @Override
    public void diminuirTamanho(float porcento) {
        altura =- (altura*porcento)/100;
    }

    
}
