/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import com.taskadapter.redmineapi.RedmineException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ComunicacaoProjetoImpl implements ComunicacaoProjeto {
    private DadosExternosFacade conexao;
    
    @Override
    public int VerificaDisp() {
        conexao = new DadosExternosFacade();
       return  conexao.VerificarDisponibilidade();
    }

    @Override
    public Projeto RetornaProjeto(String nome) {
        Projeto proj = new Projeto();
        try {
            proj = conexao.RetornaProjeto(nome);
        } catch (RedmineException ex) {
            Logger.getLogger(ComunicacaoProjetoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return proj;
        
    }

   
    
}
