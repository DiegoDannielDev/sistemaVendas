package br.com.foursolutions.models;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private List<Aluno> alunoList = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (aluno.getNome() != null) {
            this.alunoList.add(aluno);
            System.out.println("aluno adicionado com sucesso");
            return true;
        }
        throw new RuntimeException("O Nome esta null");
    }
}
