/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rest2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * 
 */

import com.taskadapter.redmineapi.RedmineException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.bean.Issue;
import com.taskadapter.redmineapi.bean.Project;
import java.util.logging.Level;
import java.util.logging.Logger;
public class REST2 {

    /**
     * @param args the command line arguments
     */
    private static String redmineHost = "http://localhost:3000";
    private static String apiAccessKey = "8915ad0a1a82c58197ee716293f8c3617924aee3";
    private static String projectKey = "taskconnector-test";
    private static Integer queryId = null; // any
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            RedmineManager mgr = new RedmineManager(redmineHost, apiAccessKey);
            Project projeto = new Project();
            projeto = mgr.getProjectByKey("tcc2");
            String descricao = projeto.getDescription();
            System.out.println(descricao);
            descricao = projeto.getHomepage();
            System.out.println(descricao);
            //RedmineManager mgr = new RedmineManager(redmineHost, "admin", "admin");
            /*try {
                tryGetIssues(mgr);
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        } catch (RedmineException ex) {
            Logger.getLogger(REST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void tryGetIssues(RedmineManager mgr) throws Exception {
        List<Issue> issues = mgr.getIssues(projectKey, queryId);
        for (Issue issue : issues) {
            System.out.println(issue.toString());
        }
    }
}

