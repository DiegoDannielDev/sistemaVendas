package br.com.foursolutions.models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private List<Curso> cursoList = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public boolean adicionarCurso(Curso curso) {
        if (curso.getNome() != null) {
            this.cursoList.add(curso);
//            this.cursoList.get(1).setAlunoList((List<Aluno>) this);
            return true;
        }
        return false;
    }

    public Boolean procuraCurso(String nome) {
        System.out.println("Buscando curso " + nome);
        for (Curso cursoList : cursoList) {
            if (cursoList.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Curso " + nome + " encontrado ");
                return true;
            }
        }
        return false;
    }
}
