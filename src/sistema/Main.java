/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.rmi.*;
import java.rmi.registry.Registry;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {
    
    private static final int PORT = 65000;
    private static Registry registry;
    
    public static void main(String[] args) throws Exception  {
              
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
        System.out.println("Registered: "+name+"->"+
        remoteObj.getClass().getName()+"[" + remoteObj + "]");

    }
}

