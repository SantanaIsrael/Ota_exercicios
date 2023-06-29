import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class arquivo {
    public static void main(String[] args) throws IOException 
    {
        String sourceFolder = "C://Users//israe//OneDrive//Documentos//Ciencia da Computação//2023.1//Linguagem de Programacao III//Ota_exercicios";

        File file = new File(sourceFolder + "//arquivo.csv");
       // boolean chack = new File("//output").mkdir();
        //System.out.println("Folder created " + chack);

        try (BufferedWriter writer = new BufferedWriter (new FileWriter(file))) {
            writer.write("sourceFolder" + ", " + "teste");
            writer.newLine();
            writer.write("sourceFolder" + ", " + "teste2");
            System.out.println(sourceFolder + " created");
        } catch (Exception e) {
            System.out.println("Error for created file. \n" + e.getMessage());
        }

    }
}