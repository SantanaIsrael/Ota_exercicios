import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class arquivo {
    public static void main(String[] args) {

        String matb;
        matb = "202121137";

        File openArquivo = new File("Alunos.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(openArquivo, false));
                BufferedReader br = new BufferedReader(new FileReader(openArquivo))) {

            ArrayList<Aluno> arm = new ArrayList<>();
            String[] retorno;

            while ((retorno = br.readLine().split(",")) != null) {

                Aluno alunoNew = new Aluno(retorno[0], retorno[1], retorno[2], retorno[3], retorno[4]);

                if (retorno[0].equals(matb)){
                    Aluno uptadeAluno = new Aluno("Estevao", "esvao.cic@uesc.br", "07451934607", 
                    "202121140", "88477144");
                    arm.add(uptadeAluno);
                }else
                    arm.add(alunoNew);
            }

            for(Aluno a: arm){
                bw.write(a.getNomeString() + "," + a.getCpfInt());
                bw.newLine();
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
// ctrl + k + c - comenta um selecionada selecionada
// ctrl + k + u - discomenta um selecionada selecionada

// System.out.println();
// if (openArquivo.exists()) {
// System.out.println("Caminho do arquivo: " + openArquivo.getPath());
// System.out.println("Caminho completo do arquivo: " +
// openArquivo.getAbsolutePath());
// System.out.println("E diretorio?: " + openArquivo.isDirectory());
// System.out.println("Pode ser executado? " + openArquivo.canExecute());
// //System.out.println("Arquivo deleteado: " + openArquivo.delete());
// }