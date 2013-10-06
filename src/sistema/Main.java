/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import projeto.ComunicacaoProjetoImpl;
import projeto.Projeto;
import java.rmi.*;
import java.rmi.registry.Registry;

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
    private static final int PORT = 65000;
    private static Registry registry;
    
    public static void main(String[] args) throws Exception  {
        /*comunicacao_projeto = new ComunicacaoProjetoImpl();
        projeto = new Projeto();
        
        VerificaDisp = comunicacao_projeto.VerificaDisp();
        if(VerificaDisp == 1){
            System.out.println("Conexão com o Projeto ok");
        }else{
            System.out.println("Problema na conexão com o Projeto");
        }
        
        projeto = comunicacao_projeto.RetornaProjeto("tcc2");
        System.out.println("Nome projeto:"+projeto.getNome());
        System.out.println("Descricao:"+projeto.getDescricao());*/
        
        //PARTE RMI
         
        startRegistry();
        registerObject(ComunicacaoRMI.class.getSimpleName(), new ComunicacaoRMIImpl());
        Thread.sleep(5 * 60 * 1000);
    
        
        
    }
    
    public static void startRegistry() throws RemoteException {

        // create in server registry
        registry = java.rmi.registry.LocateRegistry.createRegistry(PORT);

    }
    
    public static void registerObject(String name, Remote remoteObj)

    throws RemoteException, AlreadyBoundException {

        registry.bind(name, remoteObj);
        System.out.println("Registered: " + name + " -> " +
        remoteObj.getClass().getName() + "[" + remoteObj + "]");

    }
}

