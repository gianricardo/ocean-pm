/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author gui
 */
public interface ComunicacaoProjeto {
    
    public int VerificaDisp();
    public Projeto RetornaProjeto(String nome);
    public Atividade[] RetornaAtividades();
    
    
}
