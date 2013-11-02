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
import com.taskadapter.redmineapi.bean.Role;
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
    
    public Projeto RetornaProjeto(String nomeProjeto) throws RedmineException{
        projeto = new Project();
        try {
            //busca projeto
            projeto = conector.getProjectByKey(nomeProjeto);
        } catch (RedmineException ex) {
            Logger.getLogger(RedmineConector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       //carrega dados do tipo Project para o tipo Projeto
        Projeto projeto_retorno = new Projeto();
        projeto_retorno.setDescricao(projeto.getDescription());
        projeto_retorno.setNome(projeto.getName());
        projeto_retorno.setPagina_web(projeto.getHomepage());
        projeto_retorno.setData_criacao(projeto.getCreatedOn());
        projeto_retorno.setUltima_atualizacao(projeto.getUpdatedOn());
        
        //carrega dados das atividades
        List<Issue> lista_atividades = conector.getIssuesBySummary(nomeProjeto, null);
        Issue item = new Issue();
        ArrayList<Atividade> aux_lista = new ArrayList<Atividade>();
        Atividade aux_atividade = new Atividade();
        Membro_equipe member = new Membro_equipe();
        
        for(int x=0; x < lista_atividades.size(); x++){
            
            item = lista_atividades.get(x);
            if(item.getCategory() == null){
                aux_atividade.setCategoria("Não disponível");
            }else{
                aux_atividade.setCategoria(item.getCategory().getName());
            }
            
            member.setNome(item.getAuthor().getFullName());
            member.setEmail(item.getAuthor().getMail());
            aux_atividade.setCriador(member);
            aux_atividade.setData_inicio(item.getStartDate());
            aux_atividade.setData_fim(item.getDueDate());
            aux_atividade.setDescricao(item.getDescription());
            aux_atividade.setHoras_prevista(item.getEstimatedHours());
            if(item.getSpentHours() == null){
                aux_atividade.setHoras_utilizadas(0);
            }else{
                aux_atividade.setHoras_utilizadas(item.getSpentHours());
            }
            
            aux_atividade.setStatus(item.getStatusName());
            aux_atividade.setNome(item.getSubject());
            member.setNome(item.getAssignee().getFullName());
            member.setEmail(item.getAssignee().getMail());
            aux_atividade.setResponsavel(member);
            
            aux_lista.add(aux_atividade);
            
            
           
        }
        
        projeto_retorno.setAtividades(aux_lista);
        //System.out.println(lista_atividades.iterator().next().getDescription());
        //System.out.println(novo_issues.getUpdatedOn().toString());
        //atividade = projeto.getTrackers();
        //Atividade atividade_projeto = new Atividade();
        //atividade_projeto.setNome(atividade.listIterator().next().getName());
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
