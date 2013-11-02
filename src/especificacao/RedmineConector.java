/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package especificacao;

import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.bean.Issue;
import com.taskadapter.redmineapi.bean.Project;
import com.taskadapter.redmineapi.bean.Tracker;
import com.taskadapter.redmineapi.bean.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gui
 */
public class RedmineConector {

    private static RedmineManager conector;
    private static Project projeto;
    private static User currentUser;
    private static List<Tracker> atividade;
    private static String host;
    private static String redmineHost; 
    private static String apiAccessKey;
    private RedmineManager.INCLUDE[] include;
    
    
    public RedmineConector() {
        lerLinhaArquivo();
        conector = new RedmineManager(redmineHost,apiAccessKey);
    }
    
    public Documento retornaDocumento(String nome_projeto, String nome_documento) throws RedmineException{
        
       //projeto = conector.getProjectByKey(apiAccessKey).;
           
        
        
       return null; 
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
