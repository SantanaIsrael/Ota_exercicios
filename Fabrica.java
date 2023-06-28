import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    public static void main(String[] args) {

        List<Equipamento> lst = new ArrayList<Equipamento>();

        lst.add(3.2);
        
        for(Equipamento e : lst){
            System.out.println();
        }
    }
}
