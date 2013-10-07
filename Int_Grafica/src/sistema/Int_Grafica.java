/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.*;
import projeto.Projeto;

/**
 *
 * @author gui
 */
public class Int_Grafica {
    
    private static final String HOST = "localhost";
    private static final int PORT = 65000;
    private static Registry registry;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        /*ComunicacaoRMI objetoRemoto;
        String dados;
        
        try{
            objetoRemoto = (ComunicacaoRMI) Naming.lookup("//localhost/ObjetoServidor");
            dados = JOptionPane.showInputDialog(null,"Entre com:","Entrada de Dados",JOptionPane.QUESTION_MESSAGE);
            objetoRemoto.imprimirOla(dados);
        }
        catch(RemoteException re){
            JOptionPane.showMessageDialog(null,"Erro Remoto: "+re.toString(),"Erro Remoto",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro Local: "+e.toString(),"Erro Local",JOptionPane.WARNING_MESSAGE);
        }*/
        
        //RMI
        registry = LocateRegistry.getRegistry(HOST, PORT);
        ComunicacaoRMI remoteApi = (ComunicacaoRMI) registry.lookup(ComunicacaoRMI.class.getSimpleName());
        remoteApi.imprimirOla(HOST);
        Projeto proj = new Projeto();
        proj = remoteApi.retornaProjeto("tcc2");
    }
}
