public class Retangulo extends Quadrilatero implements ObjetoIOT{
    protected float altura, largura;

    public Retangulo (float altura, float largura, float x, float y){
        super(x, y);
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(float altura, float largura){
        super(0, 0);
        this.altura = altura;
        this.largura = largura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }

    public void setLargura (float largura){
        this.largura = largura;
    }

    public float getLargura (){
        return largura;
    }

    @Override
    public float CalcularArea() {
        System.out.println("CalcularArea retangulo.");
        return largura * altura;
    }

    @Override
    public float CalcularPerimetro() {
        System.out.println("Calculando perimetro do retangulo");
        return 2*(altura+largura);
    }

    @Override
    public void aumentarTamanho(float porcento) {
        altura +=  (altura*porcento)/100;
        largura +=  (largura*porcento)/100;
    }

    @Override
    public void diminuirTamanho(float porcento) {
        altura =- (altura*porcento)/100;
        largura =-  (largura*porcento)/100;
    }
    
}
