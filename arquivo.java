import java.nio.file.*;
public class arquivo {

    public static void main(String[] args) {
        Path arquivo = Paths.get("C:/Users/israe/OneDrive/Documentos/Ciencia da Computa/2023.1/Linguagem de Programacao III/Ota_exercicios");
        Path direct = Paths.get("C:/Users/israe/OneDrive/Documentos/Ciencia da Computa/2023.1/Linguagem de Programacao III/Ota_exercicios/Ota_exercicios");

        if (Files.isDirectory(direct)) {
            System.out.println("e sim dir");
        } else {
            System.out.println("Nao e direc");
        }

        if (Files.exists(arquivo)) {
            System.out.println("e arqui");
        } else {
            System.out.println("Nao achei");
        }
    }
}