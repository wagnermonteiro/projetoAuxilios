/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.projetoAuxilios.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Wagner
 */
public class Pagamentos implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Calendar dataPagamento;
    private PagamentoStatusEnum status;
    
    private Auxilio auxilio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
    public Calendar getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public PagamentoStatusEnum getStatus() {
        return status;
    }

    public void setStatus(PagamentoStatusEnum status) {
        this.status = status;
    }

    public Auxilio getAuxilio() {
        return auxilio;
    }

    public void setAuxilio(Auxilio auxilio) {
        this.auxilio = auxilio;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.dataPagamento);
        hash = 79 * hash + Objects.hashCode(this.status);
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
        final Pagamentos other = (Pagamentos) obj;
        if (!Objects.equals(this.dataPagamento, other.dataPagamento)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        return true;
    }
    
    
    
}
