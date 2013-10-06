/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

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
    
    public Projeto RetornaProjeto(String nome){
        Projeto proj = new Projeto();
        proj = conector.RetornaProjeto(nome);
        return proj;
        
    }
    
}
