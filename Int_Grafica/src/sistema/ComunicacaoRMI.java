/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import java.rmi.*;
import projeto.Projeto;

/**
 *
 * @author gui
 */
public interface ComunicacaoRMI extends Remote{
    
    public void imprimirOla(String oqImprimir) throws RemoteException;
    
    public Projeto retornaProjeto(String nome) throws RemoteException;
}
