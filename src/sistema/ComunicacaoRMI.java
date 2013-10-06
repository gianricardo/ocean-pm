/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import java.rmi.*;

/**
 *
 * @author gui
 */
public interface ComunicacaoRMI extends Remote{
    
    void imprimirOla(String oqImprimir) throws RemoteException;
}
