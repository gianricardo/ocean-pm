/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

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
import projeto.ComunicacaoProjetoImpl;
import projeto.Projeto;
import projeto.RedmineConector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {
    
    private static RedmineManager conector;
    private static Project projeto;
    private static User currentUser;
    private static Tracker atividade;
    private static String host;
    private static String redmineHost; 
    private static String apiAccessKey;
    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        
        
        lerLinhaArquivo();
        conector = new RedmineManager(redmineHost,apiAccessKey);
    
    
    
        projeto = new Project();
        try {
            projeto = conector.getProjectByKey("tcc2");
        } catch (RedmineException ex) {
            Logger.getLogger(RedmineConector.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(projeto.getDescription());
        Projeto projeto_retorno = new Projeto();
        projeto_retorno.setDescricao(projeto.getDescription());
        
        projeto_retorno.setNome(projeto.getName());
        
       
        
        
        
    
            
     
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

