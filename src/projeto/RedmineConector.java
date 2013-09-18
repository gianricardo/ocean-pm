/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.bean.Project;
import com.taskadapter.redmineapi.bean.Tracker;
import com.taskadapter.redmineapi.bean.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gui
 */
public class RedmineConector {

    private RedmineManager conector;
    private Project projeto;
    private User currentUser;
    private Tracker atividade;
    private String host;
    private static String redmineHost; 
    private static String apiAccessKey;
    
    
    public RedmineConector() {
        lerLinhaArquivo();
        conector = new RedmineManager(redmineHost,apiAccessKey);
    }
    
    public Projeto RetornaProjeto(String nomeProjeto){
        projeto = new Project();
        try {
            projeto = conector.getProjectByKey(nomeProjeto);
        } catch (RedmineException ex) {
            Logger.getLogger(RedmineConector.class.getName()).log(Level.SEVERE, null, ex);
        }
        Projeto projeto_retorno = new Projeto();
        projeto_retorno.setDescricao(projeto.getDescription());
        projeto_retorno.setNome(projeto.getName());
        
        atividade = new Tracker();
        
        
        return projeto_retorno;
    }
            
     
    
    
    private static void lerLinhaArquivo(){
        try {
            FileReader arq = new FileReader("config.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            redmineHost = lerArq.readLine();
            apiAccessKey = lerArq.readLine();
            arq.close();
        }catch (IOException e) {
            System.out.println("Erro na leitura do arquivo: "+e.getMessage());
        }
     }
            
    
   
    
    
 
    
}
