/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import javax.rmi.PortableRemoteObject;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.*;
import projeto.ComunicacaoProjetoImpl;
import projeto.Projeto;
/**
 *
 * @author gui
 */
public class ComunicacaoRMIImpl extends UnicastRemoteObject implements ComunicacaoRMI {
    
    private static ComunicacaoProjetoImpl comunicacao_projeto;
    private static int VerificaDisp;
    private static Projeto projeto;
    
    public ComunicacaoRMIImpl() throws RemoteException{ super();}
    
    public void imprimirOla(String oqImprimir) throws RemoteException{
        JOptionPane.showMessageDialog(null,oqImprimir,"Mensagem do Objeto Cliente",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Projeto retornaProjeto(String nome) throws RemoteException{
        comunicacao_projeto = new ComunicacaoProjetoImpl();
        projeto = new Projeto();
        
        VerificaDisp = comunicacao_projeto.VerificaDisp();
        if(VerificaDisp == 1){
            System.out.println("Conexão com o Projeto ok");
        }else{
            System.out.println("Problema na conexão com o Projeto");
        }
        
        projeto = comunicacao_projeto.RetornaProjeto(nome);
        return projeto;
    }
    
}
