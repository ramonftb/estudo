package model;

public class Disciplina {
    private int periodo;
    private int ano;
    private String nome;
    
    public Disciplina(String nome, int ano, int periodo){
        this.nome = nome;
        this.ano = ano;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
