/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.projetoAuxilios.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Wagner
 */
public class TipoAuxilio implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nome;
    
    private List<Auxilio> auxilios;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Auxilio> getAuxilios() {
        return auxilios;
    }

    public void setAuxilios(List<Auxilio> auxilios) {
        this.auxilios = auxilios;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoAuxilio other = (TipoAuxilio) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

 
    
    
}
