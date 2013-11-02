/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
    private Membro_equipe criador;
    private ArrayList<Membro_equipe> colaboradores;
    private String status;
    private String descricao;
    private String categoria;
    private String prioridade;
    private float horas_prevista;
    private float horas_utilizadas;
    
    
    public Atividade(){
       colaboradores = new ArrayList<Membro_equipe>(); 
    }
    
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

    public  ArrayList<Membro_equipe> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Membro_equipe> aColaboradores) {
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

    public Membro_equipe getCriador() {
        return criador;
    }

    public void setCriador(Membro_equipe criador) {
        this.criador = criador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public float getHoras_prevista() {
        return horas_prevista;
    }

    public void setHoras_prevista(float horas_prevista) {
        this.horas_prevista = horas_prevista;
    }

    public float getHoras_utilizadas() {
        return horas_utilizadas;
    }

    public void setHoras_utilizadas(float horas_utilizadas) {
        this.horas_utilizadas = horas_utilizadas;
    }
    
}
