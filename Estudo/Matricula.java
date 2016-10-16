package model;

public class Matricula{
    private Disciplina disciplina;
    private String nomeAluno;
    
    public Matricula (String nomeAluno, Disciplina disciplina){
       this.nomeAluno = nomeAluno;
       this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
