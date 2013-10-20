/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.bean.Identifiable;
import com.taskadapter.redmineapi.bean.Issue;
import com.taskadapter.redmineapi.bean.IssueRelation;
import com.taskadapter.redmineapi.bean.Project;
import com.taskadapter.redmineapi.bean.Tracker;
import com.taskadapter.redmineapi.bean.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    
    public Projeto RetornaProjeto(String nomeProjeto) throws RedmineException{
        projeto = new Project();
        try {
            projeto = conector.getProjectByKey(nomeProjeto);
        } catch (RedmineException ex) {
            Logger.getLogger(RedmineConector.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Issue> lista_atividades = conector.getIssuesBySummary(nomeProjeto, null);
        
        System.out.println(lista_atividades.iterator().next().getDescription());
        Projeto projeto_retorno = new Projeto();
        projeto_retorno.setDescricao(projeto.getDescription());
        projeto_retorno.setNome(projeto.getName());
        //projeto_retorno.
        
        
        
        
        //System.out.println(novo_issues.getUpdatedOn().toString());
        atividade = projeto.getTrackers();
        Atividade atividade_projeto = new Atividade();
        atividade_projeto.setNome(atividade.listIterator().next().getName());
        //System.out.println(atividade.iterator().next().getName());
        //atividade_projeto.setData_inicio(atividade.listIterator().next().);
        //System.out.println(atividade_projeto.getNome());
        
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
