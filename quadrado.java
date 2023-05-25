public class quadrado extends quadrilatero {
    protected float altura;

    public quadrado(float altura, float x, float y){
        super(x, y);
        this.altura = altura;
    }

    public quadrado(float altura){
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
}
