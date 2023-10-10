import ContaCorrente.Conta;
public class aula4 {
    public static void main(String[] args) {
        Conta c1 = new Conta(3017, 251321, 350, "Israel");
        
        System.out.println(c1);
        c1.depositar(50);
        System.out.println(c1);
        c1.sacar(3);
        System.out.println(c1);
    }
}