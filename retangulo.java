public class retangulo extends quadrilatero{
    protected float altura, largura;

    public retangulo (float altura, float largura, float x, float y){
        super(x, y);
        this.altura = altura;
        this.largura = largura;
    }

    public retangulo(float altura, float largura){
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
}
