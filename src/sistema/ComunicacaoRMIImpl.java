/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import javax.rmi.PortableRemoteObject;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.*;
/**
 *
 * @author gui
 */
public class ComunicacaoRMIImpl extends UnicastRemoteObject implements ComunicacaoRMI {
    
    public ComunicacaoRMIImpl() throws RemoteException{ super();}
    
    public void imprimirOla(String oqImprimir) throws RemoteException{
        JOptionPane.showMessageDialog(null,oqImprimir,"Mensagem do Objeto Cliente",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
