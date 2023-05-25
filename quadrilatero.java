public class quadrilatero {
    protected float x, y;

    public quadrilatero(float x, float y){
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

    public float CalcularArea(){
        System.out.println("CalcularArea quadrilatero.");
        return 0;
    }
}