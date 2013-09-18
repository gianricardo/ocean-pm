/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author gui
 */
public class Projeto {
    private String nome;
    private String descricao;
    private float custo_previsto;
    private Atividade[] atividades; 
    private Membro_equipe gerente;
    private Membro_equipe[] equipe;
    private String cliente;
    private float custo_atual;

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

    public  Atividade[] getAtividades() {
        return atividades;
    }

    public  void setAtividades(Atividade[] aAtividades) {
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
    
}
