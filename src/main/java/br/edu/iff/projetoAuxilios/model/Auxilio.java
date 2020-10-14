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
public class Auxilio implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Double valor;
    private String situacao;
    
    private TipoAuxilio auxilio;
    
    private List<Pagamentos> pagamentos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public TipoAuxilio getAuxilio() {
        return auxilio;
    }

    public void setAuxilio(TipoAuxilio auxilio) {
        this.auxilio = auxilio;
    }

    public List<Pagamentos> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamentos> pagamentos) {
        this.pagamentos = pagamentos;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.valor);
        hash = 67 * hash + Objects.hashCode(this.situacao);
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
        final Auxilio other = (Auxilio) obj;
        if (!Objects.equals(this.situacao, other.situacao)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return true;
    }
    
    
}
