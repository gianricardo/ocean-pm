/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 *
 * @author gui
 */
public class Membro_equipe implements Serializable {
    
    private String nome;
    private String cargo;
    private float valor_hora_trabalho;
    private String email;

    public  String getNome() {
        return nome;
    }

    public  void setNome(String aNome) {
        nome = aNome;
    }

    public  String getCargo() {
        return cargo;
    }

    public  void setCargo(String aCargo) {
        cargo = aCargo;
    }

    public  float getValor_hora_trabalho() {
        return valor_hora_trabalho;
    }

    public  void setValor_hora_trabalho(float aValor_hora_trabalho) {
        valor_hora_trabalho = aValor_hora_trabalho;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
