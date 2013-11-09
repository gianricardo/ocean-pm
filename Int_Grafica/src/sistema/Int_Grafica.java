/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.awt.Event;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.data.xy.IntervalXYDataset;
import projeto.Projeto;


/**
 *
 * @author gui
 */
public class Int_Grafica {
    
    private static final String HOST = "localhost";
    private static final int PORT = 65000;
    private static Registry registry;
    private static String nome_projeto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         /*       
        //RMI
        registry = LocateRegistry.getRegistry(HOST, PORT);
        ComunicacaoRMI remoteApi = (ComunicacaoRMI) registry.lookup(ComunicacaoRMI.class.getSimpleName());
        //remoteApi objeto para carregar os dados via RMI;
        
        //entra nome do projeto
        nome_projeto = JOptionPane.showInputDialog(null,"Entre com o nome do Projeto que deseja conectar","Configurando o Sistema",
                JOptionPane.QUESTION_MESSAGE);
        
        //carrega dados do projeto
        Projeto proj = new Projeto();
        //nome atual do projeto "tcc2"
        proj = remoteApi.retornaProjeto(nome_projeto);
        System.out.println(proj.getDescricao());
        System.out.println(proj.getNome());
        System.out.println(proj.getAtividades().get(0).getResponsavel().getNome()); 
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VariosGraficos vg = null;
                try {
                    vg = new VariosGraficos();
                } catch (RemoteException ex) {
                    Logger.getLogger(Int_Grafica.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NotBoundException ex) {
                    Logger.getLogger(Int_Grafica.class.getName()).log(Level.SEVERE, null, ex);
                }
                vg.setVisible(true);
                vg.setTitle("Gerenciamento de Projeto");
               
            }
        });
        
        
    }
}
