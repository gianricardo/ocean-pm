/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author gui
 */
public class Membro_equipe {
    
    private static String nome;
    private static String cargo;
    private static float valor_hora_trabalho;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String aNome) {
        nome = aNome;
    }

    public static String getCargo() {
        return cargo;
    }

    public static void setCargo(String aCargo) {
        cargo = aCargo;
    }

    public static float getValor_hora_trabalho() {
        return valor_hora_trabalho;
    }

    public static void setValor_hora_trabalho(float aValor_hora_trabalho) {
        valor_hora_trabalho = aValor_hora_trabalho;
    }
    
}
