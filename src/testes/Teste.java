/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gui
 */
public class Teste implements Serializable{
    
    private String tipo;
    private Date data_teste;
    private String descricao;
    private String status;
    private int quatidade_erros_econtrados;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData_teste() {
        return data_teste;
    }

    public void setData_teste(Date data_teste) {
        this.data_teste = data_teste;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuatidade_erros_econtrados() {
        return quatidade_erros_econtrados;
    }

    public void setQuatidade_erros_econtrados(int quatidade_erros_econtrados) {
        this.quatidade_erros_econtrados = quatidade_erros_econtrados;
    }
    
    
}
