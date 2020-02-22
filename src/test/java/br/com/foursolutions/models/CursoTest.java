package br.com.foursolutions.models;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CursoTest {

    @Test
    public void testadicionarAluno() {

        var curso = getCurso("Analise de sistemas");
        assertTrue(curso.adicionarAluno(getAluno("diego")));

    }

    @Test
    public void testBuscaCursoAdicionadoNoAluno() {
        var curso = getCurso("models");
        var aluno = getAluno("diego");
        aluno.adicionarCurso(curso);
        curso.adicionarAluno(aluno);
        assertTrue(aluno.procuraCurso(curso.getNome()));

    }

    @Test(expected = RuntimeException.class)
    public void testadicionarAlunoNullo() {

        var curso = getCurso("Analise de sistemas");
        assertTrue(curso.adicionarAluno(getAluno(null)));

    }

    private Aluno getAluno(String nome) {
        Aluno aluno = new Aluno(nome);

        return aluno;
    }

    private Curso getCurso(String nomeCurso) {
        Curso curso = new Curso(nomeCurso);

        return curso;
    }
}