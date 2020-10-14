/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.projetoAuxilios.model;

import java.util.List;

/**
 *
 * @author Wagner
 */
public class Aluno extends Pessoa{
    
    private Long matricula;
    private AlunoSituacaoEnum situacao;
    
    private List<Curso> cursos;
    private List<Auxilio> auxilios;

    public AlunoSituacaoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(AlunoSituacaoEnum situacao) {
        this.situacao = situacao;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Auxilio> getAuxilios() {
        return auxilios;
    }

    public void setAuxilios(List<Auxilio> auxilios) {
        this.auxilios = auxilios;
    }



    
}
