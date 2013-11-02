/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gui
 */
public class Projeto implements Serializable {
    private String nome;
    private String descricao;
    private float custo_previsto;
    private ArrayList<Atividade> atividades; 
    private Membro_equipe gerente;
    private Membro_equipe[] equipe;
    private String cliente;
    private float custo_atual;
    private Date data_criacao;
    private Date ultima_atualizacao;
    private String pagina_web;

    public Projeto(){
       atividades = new ArrayList<Atividade>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String aNome) {
        nome = aNome;
    }

    public  String getDescricao() {
        return descricao;
    }

    public  void setDescricao(String aDescricao) {
        descricao = aDescricao;
    }

    public float getCusto_previsto() {
        return custo_previsto;
    }

    public  void setCusto_previsto(float aCusto_previsto) {
        custo_previsto = aCusto_previsto;
    }

    public  ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public  void setAtividades(ArrayList<Atividade> aAtividades) {
        atividades = aAtividades;
    }

    public  Membro_equipe getGerente() {
        return gerente;
    }

    public  void setGerente(Membro_equipe aGerente) {
        gerente = aGerente;
    }

    public  Membro_equipe[] getEquipe() {
        return equipe;
    }

    public  void setEquipe(Membro_equipe[] aEquipe) {
        equipe = aEquipe;
    }

    public  String getCliente() {
        return cliente;
    }

    public  void setCliente(String aCliente) {
        cliente = aCliente;
    }

    public  float getCusto_atual() {
        return custo_atual;
    }

    public  void setCusto_atual(float aCusto_atual) {
        custo_atual = aCusto_atual;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Date getUltima_atualizacao() {
        return ultima_atualizacao;
    }

    public void setUltima_atualizacao(Date ultima_atualizacao) {
        this.ultima_atualizacao = ultima_atualizacao;
    }

    public String getPagina_web() {
        return pagina_web;
    }

    public void setPagina_web(String pagina_web) {
        this.pagina_web = pagina_web;
    }
    
}
