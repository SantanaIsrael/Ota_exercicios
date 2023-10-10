public class main {
    private String nome;
    private int idade;
    private double agencia;

    public static void main(String[] args) {
        main c1, c2, c3;
        c1 = new main("fabiana", 10);
        c2 = new main("jose", 20);

        c1 = c2;
        c3 = c1;

        c2.setAgencia(30);

        System.out.println(c2);
        System.out.println(c1);
        System.out.println(c3);
    }

    public void executar(){
        System.out.println("hello world");
    }

    public main (String nome, int idade, int agencia){
        this.nome = nome;
        this.idade = idade;
        this.agencia = agencia;
    }

    public main (String nome, int idade){
        this(nome, idade, 0);
    }

    public void setAgencia(double setAgencia){
        agencia = setAgencia;
    }

    public String toString(){
        return nome + "\n" + idade + "\n" + agencia;
    }
}
