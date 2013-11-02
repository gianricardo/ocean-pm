/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package especificacao;

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

    
    public Documento retornaDocumento(String nome_projeto, String nome_documento) {
        Documento doc = new Documento();
        return doc;
    }

   
    public String ListaDocumentosDisp() {
        return "Nenhum Documento Disponível";
    }
}
