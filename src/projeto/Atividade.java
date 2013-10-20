/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Date;

/**
 *
 * @author gui
 */
public class Atividade implements Serializable{
    private String nome;
    private Date data_inicio;
    private Date data_fim;
    private Membro_equipe responsavel;
    private Array colaboradores;
    private String status;
    private String descricao;

    public  String getNome() {
        return nome;
    }

    public void setNome(String aNome) {
        nome = aNome;
    }

    public  Date getData_inicio() {
        return data_inicio;
    }

    public  void setData_inicio(Date aData_inicio) {
        data_inicio = aData_inicio;
    }

    public  Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date aData_fim) {
        data_fim = aData_fim;
    }

    public Membro_equipe getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Membro_equipe aResponsavel) {
        responsavel = aResponsavel;
    }

    public  Array getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(Array aColaboradores) {
        colaboradores = aColaboradores;
    }

    public  String getStatus() {
        return status;
    }

    public void setStatus(String aStatus) {
        status = aStatus;
    }

    public  String getDescricao() {
        return descricao;
    }

    public void setDescricao(String aDescricao) {
        descricao = aDescricao;
    }
    
}
