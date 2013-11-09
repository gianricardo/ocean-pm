/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import com.taskadapter.redmineapi.RedmineException;
import java.util.ArrayList;

/**
 *
 * @author gui
 */
public class DadosExternosFacade {
    public  static RedmineConector conector;
    
    public int VerificarDisponibilidade(){
        try{
        
         conector = new RedmineConector();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }    
        return 1;
    }
    
    public Projeto RetornaProjeto(String nome) throws RedmineException{
        Projeto proj = new Projeto();
        proj = conector.RetornaProjeto(nome);
        return proj;
        
    }
    
    public int totalAtividades(String nome) throws RedmineException{
        return conector.totalAtividades(nome);
        
    }
    
    public int[] quatidadeDeAtividadesPorPrioridade(String nome) throws RedmineException{
        return conector.quatidadeDeAtividadesPorPrioridade(nome);
    }
    
    public int[] quantidadeDeAtividadesPorStatus(String nome) throws RedmineException{
        return conector.quantidadeDeAtividadesPorStatus(nome);
    }
    
    
    
}
