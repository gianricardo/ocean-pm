/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package versoes;

import java.io.Serializable;
import java.util.Date;
import requisitos.Requisito;

/**
 *
 * @author gui
 */
public class Versoes implements Serializable{
    
    private Date data_upload;
    private double versao;
    private int bugs;
    private double tempo_desenvolvimento;
    private String descricao;
    private Requisito[] requisitos;

    public Date getData_upload() {
        return data_upload;
    }

    public void setData_upload(Date data_upload) {
        this.data_upload = data_upload;
    }

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    public int getBugs() {
        return bugs;
    }

    public void setBugs(int bugs) {
        this.bugs = bugs;
    }

    public double getTempo_desenvolvimento() {
        return tempo_desenvolvimento;
    }

    public void setTempo_desenvolvimento(double tempo_desenvolvimento) {
        this.tempo_desenvolvimento = tempo_desenvolvimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Requisito[] getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(Requisito[] requisitos) {
        this.requisitos = requisitos;
    }
    
}
