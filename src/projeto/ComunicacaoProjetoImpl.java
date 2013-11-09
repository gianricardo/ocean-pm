/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import com.taskadapter.redmineapi.RedmineException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static projeto.DadosExternosFacade.conector;


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
    
    @Override
   public float tempoEstimadoProjeto(String nome){
       Projeto proj = new Projeto();
        try {
            proj = conexao.RetornaProjeto(nome);
        } catch (RedmineException ex) {
            Logger.getLogger(ComunicacaoProjetoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return proj.getHoras_pŕevista();
   }
    
    @Override
   public float tempoDecorridoProjeto(String nome){
       Projeto proj = new Projeto();
        try {
            proj = conexao.RetornaProjeto(nome);
        } catch (RedmineException ex) {
            Logger.getLogger(ComunicacaoProjetoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return proj.getHoras_gastas();
       
   }
    
    public int totalAtividades(String nome){
        try {
            return conexao.totalAtividades(nome);
        } catch (RedmineException ex) {
            Logger.getLogger(ComunicacaoProjetoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    @Override
    public int[] quatidadeDeAtividadesPorPrioridade(String nome){
        try {
            return conexao.quatidadeDeAtividadesPorPrioridade(nome);
        } catch (RedmineException ex) {
            Logger.getLogger(ComunicacaoProjetoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    @Override
    public int[] quantidadeDeAtividadesPorStatus(String nome){
        try {
            return conexao.quantidadeDeAtividadesPorStatus(nome);
        } catch (RedmineException ex) {
            Logger.getLogger(ComunicacaoProjetoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
    
}
