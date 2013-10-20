/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package requisitos;

import java.io.Serializable;

/**
 *
 * @author gui
 */
public class Requisito implements Serializable{
    private int numero;
    private String descricao;
    private String tipo;
    private double versao;
    private int codigo_doc;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    public int getCodigo_doc() {
        return codigo_doc;
    }

    public void setCodigo_doc(int codigo_doc) {
        this.codigo_doc = codigo_doc;
    }
    
}
