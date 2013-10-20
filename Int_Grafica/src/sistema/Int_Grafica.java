/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.*;
import org.jfree.chart.*;
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
                
        //RMI
        registry = LocateRegistry.getRegistry(HOST, PORT);
        ComunicacaoRMI remoteApi = (ComunicacaoRMI) registry.lookup(ComunicacaoRMI.class.getSimpleName());
        //remoteApi objeto para carregar os dados via RMI;
        
        
        Projeto proj = new Projeto();
        proj = remoteApi.retornaProjeto("tcc2");
        System.out.println(proj.getDescricao());
        System.out.println(proj.getNome());
        
        /*JFreeChart free = new JFreeChart(null);
        StandardChartTheme tema = new StandardChartTheme("novo");
        tema.apply(free);
        */
    }
}
