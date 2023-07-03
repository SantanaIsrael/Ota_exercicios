public class Aluno extends Pessoa{
    protected String matricula;
    protected String senhaAluno;
   
    public Aluno (String nome, String email, String cpf, String matricula, String senhaAluno){
        super(nome, email, cpf);
        this.matricula = matricula;
        this.senhaAluno = senhaAluno;
    }
    
    public Aluno(){
        super();
        matricula = "NULL";
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSenhaAluno() {
        return senhaAluno;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Aluno [matricula=" + matricula + ", senhaAluno=" + senhaAluno + "]";
    }
     
     
}
