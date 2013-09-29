/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import projeto.ComunicacaoProjetoImpl;
import projeto.Projeto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {
    
    private static ComunicacaoProjetoImpl comunicacao_projeto;
    private static int VerificaDisp;
    private static Projeto projeto;
    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        comunicacao_projeto = new ComunicacaoProjetoImpl();
        projeto = new Projeto();
        
        VerificaDisp = comunicacao_projeto.VerificaDisp();
        if(VerificaDisp == 1){
            System.out.print("Conexão com o Projeto ok");
        }else{
            System.out.print("Problema na conexão com o Projeto");
        }
        
        projeto = comunicacao_projeto.RetornaProjeto("tcc2");
        System.out.println("Nome projeto:"+projeto.getNome());
        System.out.println("Descricao:"+projeto.getDescricao());
        
        
        
        
    }
}

