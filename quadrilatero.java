public abstract class Quadrilatero {
    protected float x, y;

    public Quadrilatero(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public abstract float CalcularArea();

    public abstract float CalcularPerimetro();
}