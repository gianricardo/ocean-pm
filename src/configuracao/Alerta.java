/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracao;

/**
 *
 * @author gui
 */
public class Alerta {
    
    private String nome;
    private String descricao;
    private String tipo;
    private Acoes acao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Acoes getAcao() {
        return acao;
    }

    public void setAcao(Acoes acao) {
        this.acao = acao;
    }
    
    
}
