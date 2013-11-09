/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialCap;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.DialTextAnnotation;
import org.jfree.chart.plot.dial.DialValueIndicator;
import org.jfree.chart.plot.dial.StandardDialFrame;
import org.jfree.chart.plot.dial.StandardDialRange;
import org.jfree.chart.plot.dial.StandardDialScale;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.StandardGradientPaintTransformer;
import projeto.Projeto;
import projeto.QuantAtividades;

/**
 *
 * @author gian
 */
public class VariosGraficos extends javax.swing.JFrame {

    /**
     * Creates new form VariosGraficos
     */
        
    
    public VariosGraficos() throws RemoteException, NotBoundException {
        rmi_rules();
        initComponents();
    }

    private void rmi_rules() throws RemoteException, NotBoundException{
        //RMI
        registry = LocateRegistry.getRegistry(HOST, PORT);
        ComunicacaoRMI remoteApi = (ComunicacaoRMI) registry.lookup(ComunicacaoRMI.class.getSimpleName());
        //remoteApi objeto para carregar os dados via RMI;
        
        //entra nome do projeto
        nome_projeto = JOptionPane.showInputDialog(null,"Entre com o nome do Projeto:","Configurando o Sistema",
                JOptionPane.QUESTION_MESSAGE);
        project = remoteApi.retornaProjeto(nome_projeto);
        //System.out.println(remoteApi.totalAtividades(nome_projeto));
        //project = remoteApi.retornaProjeto(nome_projeto);
        lista = remoteApi.quatidadeDeAtividadesPorPrioridade(nome_projeto);
        lista_status = remoteApi.quantidadeDeAtividadesPorStatus(nome_projeto);
        /*
        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
        System.out.println(lista[3]);
        System.out.println(lista[4]);*/
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graficos = new javax.swing.JPanel();
        n_grafico1 = new javax.swing.JPanel();
        n_grafico2 = new javax.swing.JPanel();
        s_grafico3 = new javax.swing.JPanel();
        s_grafico4 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        botaoAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(formListener);

        graficos.setLayout(new java.awt.GridLayout(2, 2));

        n_grafico1.setName(""); // NOI18N
        n_grafico1.setPreferredSize(null);
        graficos.add(n_grafico1);

        n_grafico2.setPreferredSize(null);
        graficos.add(n_grafico2);

        s_grafico3.setPreferredSize(null);
        graficos.add(s_grafico3);

        s_grafico4.setPreferredSize(null);
        graficos.add(s_grafico4);

        getContentPane().add(graficos, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 50));

        botaoAdd.setText("Configurar");
        botaoAdd.addActionListener(formListener);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(formListener);

        jButton2.setText("Info");

        jButton3.setText("Perfil 2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(botaoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(botaoAdd)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 188, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.WindowListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton1) {
                VariosGraficos.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == botaoAdd) {
                VariosGraficos.this.botaoAddActionPerformed(evt);
            }
        }

        public void windowActivated(java.awt.event.WindowEvent evt) {
        }

        public void windowClosed(java.awt.event.WindowEvent evt) {
        }

        public void windowClosing(java.awt.event.WindowEvent evt) {
        }

        public void windowDeactivated(java.awt.event.WindowEvent evt) {
        }

        public void windowDeiconified(java.awt.event.WindowEvent evt) {
        }

        public void windowIconified(java.awt.event.WindowEvent evt) {
        }

        public void windowOpened(java.awt.event.WindowEvent evt) {
            if (evt.getSource() == VariosGraficos.this) {
                VariosGraficos.this.formWindowOpened(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //n_grafico1.add(createPieChart());
        n_grafico1.add(createPieChart());
        //
        //n_grafico2.add(createTimeSeriesChart());
        n_grafico2.add(createDialPlot());
        
        s_grafico3.add(createBarChart1());
        //
        s_grafico4.add(createBarChart2()); 
        
        jLabel1.setText("Projeto:"+project.getNome());
        jLabel2.setText("site: "+"www.redmine.com/"+project.getPagina_web());
        jLabel4.setText("Descrição:"+project.getDescricao());
        jLabel3.setText("Status: Dentro do Planejamento");
       
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

        n_grafico1.add(createTimeSeriesChart());
        this.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddActionPerformed
        // TODO add your handling code here:
        TimeSeries t1 = timedataset.getSeries(0);
        t1.add(new Month(8, 2002), 140.8);
        t1.add(new Month(9, 2002), 150.8);
        t1 = timedataset.getSeries(1);
        t1.add(new Month(8, 2002), 150.8);
        t1.add(new Month(9, 2002), 160.8);
        repaint();
        this.botaoAdd.setEnabled(false);
    }//GEN-LAST:event_botaoAddActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JPanel graficos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel n_grafico1;
    private javax.swing.JPanel n_grafico2;
    private javax.swing.JPanel s_grafico3;
    private javax.swing.JPanel s_grafico4;
    // End of variables declaration//GEN-END:variables
    private Projeto project;
    private TimeSeriesCollection timedataset;
    private static final String HOST = "localhost";
    private static final int PORT = 65000;
    private static Registry registry;
    private static String nome_projeto;
    private static int[] lista;
    private static int[] lista_status;
    
    private  ChartPanel createPieChart() {
         
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Baixa", new Double(lista[0]));
        dataset.setValue("Normal", new Double(lista[1]));
        dataset.setValue("Alta", new Double(lista[2]));
        dataset.setValue("Urgente", new Double(lista[3]));
        dataset.setValue("Imediata", new Double(lista[4]));
        JFreeChart chart = ChartFactory.createPieChart(
            "Atividades/Prioridade",  // chart title
            dataset,            // data
            false,              // no legend
            true,               // tooltips
            false               // no URL generation
        );

        // set a custom background for the chart
        chart.setBackgroundPaint(new GradientPaint(new Point(0, 0), 
                new Color(20, 20, 20), new Point(400, 200), Color.cyan));

        // customise the title position and font
        TextTitle t = chart.getTitle();
        t.setHorizontalAlignment(HorizontalAlignment.CENTER);
        t.setPaint(new Color(240, 240, 240));
        t.setFont(new Font("Arial", Font.BOLD, 16));

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(null);
        plot.setInteriorGap(0.04);
        plot.setOutlineVisible(false);

        // use gradients and white borders for the section colours
        plot.setSectionPaint("Baixa", createGradientPaint(new Color(200, 200, 255), Color.BLUE));
        plot.setSectionPaint("Normal", createGradientPaint(new Color(255, 200, 200), Color.GRAY));
        plot.setSectionPaint("Alta", createGradientPaint(new Color(200, 255, 200), Color.GREEN));
        plot.setSectionPaint("Urgente", createGradientPaint(new Color(200, 255, 200), Color.YELLOW));
        plot.setSectionPaint("Imediata", createGradientPaint(new Color(200, 255, 200), Color.RED));
        plot.setBaseSectionOutlinePaint(Color.WHITE);
        plot.setSectionOutlinesVisible(true);
        plot.setBaseSectionOutlineStroke(new BasicStroke(2.0f));

        // customise the section label appearance
        plot.setLabelFont(new Font("Courier New", Font.BOLD, 14));
        plot.setLabelLinkPaint(Color.WHITE);
        plot.setLabelLinkStroke(new BasicStroke(2.0f));
        plot.setLabelOutlineStroke(null);
        plot.setLabelPaint(Color.WHITE);
        plot.setLabelBackgroundPaint(null);
        
        // add a subtitle giving the data source
        TextTitle source = new TextTitle("Relação Atividades/Prioridade", 
                new Font("Courier New", Font.PLAIN, 12));
        source.setPaint(Color.WHITE);
        source.setPosition(RectangleEdge.BOTTOM);
        source.setHorizontalAlignment(HorizontalAlignment.RIGHT);
        chart.addSubtitle(source);
        
        //
        chart.setPadding(new RectangleInsets(4, 8, 2, 2));
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(400, 350));
        panel.setMouseWheelEnabled(true);
        panel.setVisible(true);
        return panel;

    }
    
    private  RadialGradientPaint createGradientPaint(Color c1, Color c2) {
        Point2D center = new Point2D.Float(0, 0);
        float radius = 200;
        float[] dist = {0.0f, 1.0f};
        return new RadialGradientPaint(center, radius, dist,
                new Color[] {c1, c2});
    }

    private  ChartPanel createTimeSeriesChart() {
//Data
        TimeSeries s1 = new TimeSeries("L&G European Index Trust");
        s1.add(new Month(2, 2001), 181.8);
        s1.add(new Month(3, 2001), 167.3);
        s1.add(new Month(4, 2001), 153.8);
        s1.add(new Month(5, 2001), 167.6);
        s1.add(new Month(6, 2001), 158.8);
        s1.add(new Month(7, 2001), 148.3);
        s1.add(new Month(8, 2001), 153.9);
        s1.add(new Month(9, 2001), 142.7);
        s1.add(new Month(10, 2001), 123.2);
        s1.add(new Month(11, 2001), 131.8);
        s1.add(new Month(12, 2001), 139.6);
        s1.add(new Month(1, 2002), 142.9);
        s1.add(new Month(2, 2002), 138.7);
        s1.add(new Month(3, 2002), 137.3);
        s1.add(new Month(4, 2002), 143.9);
        s1.add(new Month(5, 2002), 139.8);
        s1.add(new Month(6, 2002), 137.0);
        s1.add(new Month(7, 2002), 132.8);

        TimeSeries s2 = new TimeSeries("L&G UK Index Trust");
        s2.add(new Month(2, 2001), 129.6);
        s2.add(new Month(3, 2001), 123.2);
        s2.add(new Month(4, 2001), 117.2);
        s2.add(new Month(5, 2001), 124.1);
        s2.add(new Month(6, 2001), 122.6);
        s2.add(new Month(7, 2001), 119.2);
        s2.add(new Month(8, 2001), 116.5);
        s2.add(new Month(9, 2001), 112.7);
        s2.add(new Month(10, 2001), 101.5);
        s2.add(new Month(11, 2001), 106.1);
        s2.add(new Month(12, 2001), 110.3);
        s2.add(new Month(1, 2002), 111.7);
        s2.add(new Month(2, 2002), 111.0);
        s2.add(new Month(3, 2002), 109.6);
        s2.add(new Month(4, 2002), 113.2);
        s2.add(new Month(5, 2002), 111.6);
        s2.add(new Month(6, 2002), 108.8);
        s2.add(new Month(7, 2002), 101.6);

        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(s1);
        dataset.addSeries(s2);
        timedataset = dataset;

//     
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
            "Legal & General Unit Trust Prices",  // title
            "Date",             // x-axis label
            "Price Per Unit",   // y-axis label
            dataset,            // data
            true,               // create legend?
            true,               // generate tooltips?
            false               // generate URLs?
        );

        chart.setBackgroundPaint(Color.white);

        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);

        XYItemRenderer r = plot.getRenderer();
        if (r instanceof XYLineAndShapeRenderer) {
            XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) r;
            renderer.setBaseShapesVisible(true);
            renderer.setBaseShapesFilled(true);
            renderer.setDrawSeriesLineAsPath(true);
        }

        DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));

        ChartPanel panel2 = new ChartPanel(chart);
        panel2.setPreferredSize(new Dimension(300, 250));
        panel2.setMouseWheelEnabled(true);
        panel2.setFillZoomRectangle(true);
        panel2.setVisible(true);
        return panel2;

    }

    private  ChartPanel createBarChart1() {

        // row keys...
        String series1 = "Nova";
        String series2 = "Em Andamento";
        String series3 = "Resolvida";
        String series4 = "Feedback";
        String series5 = "Fechada";
        String series6 = "Rejeitada";

        // column keys...
        String category1 = "";
        //String category2 = "Category 2";
        //String category3 = "Category 3";
        //String category4 = "Category 4";
        //String category5 = "Category 5";

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(lista_status[0], series1, category1);
        //dataset.addValue(4.0, series1, category2);
        //dataset.addValue(3.0, series1, category3);
        //dataset.addValue(5.0, series1, category4);
        //dataset.addValue(5.0, series1, category5);

        dataset.addValue(lista_status[1], series2, category1);
        //dataset.addValue(7.0, series2, category2);
        //dataset.addValue(6.0, series2, category3);
        //dataset.addValue(8.0, series2, category4);
        //dataset.addValue(4.0, series2, category5);

        dataset.addValue(lista_status[2], series3, category1);
        //dataset.addValue(3.0, series3, category2);
        //dataset.addValue(2.0, series3, category3);
        //dataset.addValue(3.0, series3, category4);
        //dataset.addValue(6.0, series3, category5);    */
        dataset.addValue(lista_status[3], series4, category1);
        dataset.addValue(lista_status[4], series5, category1);
        dataset.addValue(lista_status[5], series6, category1);
            
        // create the chart...
        JFreeChart chart = ChartFactory.createBarChart(
            "Status  das Atividades",       // chart title
            "Status",               // domain axis label
            "Quantidade",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        // set the range axis to display integers only...
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);

        // set up gradient paints for series...
        GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.blue,
                0.0f, 0.0f, new Color(0, 0, 64));
        GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.green,
                0.0f, 0.0f, new Color(0, 64, 0));
        GradientPaint gp2 = new GradientPaint(0.0f, 0.0f, Color.red,
                0.0f, 0.0f, new Color(64, 0, 0));
        
        GradientPaint gp3 = new GradientPaint(0.0f, 0.0f, Color.YELLOW,
                0.0f, 0.0f, new Color(64, 0, 0));
        
        GradientPaint gp4 = new GradientPaint(0.0f, 0.0f, Color.BLACK,
                0.0f, 0.0f, new Color(64, 0, 0));
        
        GradientPaint gp5 = new GradientPaint(0.0f, 0.0f, Color.GRAY,
                0.0f, 0.0f, new Color(64, 0, 0));
        
        
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);
        renderer.setSeriesPaint(3, gp3);
        renderer.setSeriesPaint(4, gp4);
        renderer.setSeriesPaint(5, gp5);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(
                        Math.PI / 6.0));
        // OPTIONAL CUSTOMISATION COMPLETED.

        ChartPanel panel3 = new ChartPanel(chart);
        panel3.setPreferredSize(new Dimension(400, 250));
        panel3.setMouseWheelEnabled(true);
        panel3.setFillZoomRectangle(true);
        panel3.setVisible(true);
        return panel3;

    }

    private  ChartPanel createBarChart2() {

        // row keys...
        String series1 = "First";
        String series2 = "Second";
        String series3 = "Third";

        // column keys...
        String category1 = "Category 1";
        String category2 = "Category 2";
        String category3 = "Category 3";
        String category4 = "Category 4";
        String category5 = "Category 5";

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1.0, series1, category1);
        dataset.addValue(4.0, series1, category2);
        dataset.addValue(3.0, series1, category3);
        dataset.addValue(5.0, series1, category4);
        dataset.addValue(5.0, series1, category5);

        dataset.addValue(5.0, series2, category1);
        dataset.addValue(7.0, series2, category2);
        dataset.addValue(6.0, series2, category3);
        dataset.addValue(8.0, series2, category4);
        dataset.addValue(4.0, series2, category5);

        dataset.addValue(4.0, series3, category1);
        dataset.addValue(3.0, series3, category2);
        dataset.addValue(2.0, series3, category3);
        dataset.addValue(3.0, series3, category4);
        dataset.addValue(6.0, series3, category5);    
            
        // create the chart...
        JFreeChart chart = ChartFactory.createBarChart(
            "Bar Chart Demo 2",       // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.LIGHT_GRAY);

        // get a reference to the plot for further customisation...
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        // set the range axis to display integers only...
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);

        // set up gradient paints for series...
        GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.cyan,
                0.0f, 0.0f, new Color(0, 0, 64));
        GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.orange,
                0.0f, 0.0f, new Color(0, 64, 0));
        GradientPaint gp2 = new GradientPaint(0.0f, 0.0f, Color.magenta,
                0.0f, 0.0f, new Color(64, 0, 0));
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(
                        Math.PI / 6.0));
        // OPTIONAL CUSTOMISATION COMPLETED.

        ChartPanel panel3 = new ChartPanel(chart);
        panel3.setPreferredSize(new Dimension(300, 250));
        panel3.setMouseWheelEnabled(true);
        panel3.setFillZoomRectangle(true);
        panel3.setVisible(true);
        return panel3;

    }
    
    private ChartPanel createDialPlot(){
        DefaultValueDataset dataset1;
                DefaultValueDataset dataset2;
                JSlider slider1;
                JSlider slider2;
                
                //dataset1.setValue(new Integer(slider1.getValue()));
                        //dataset2.setValue(new Integer(slider2.getValue()));
        //altera ponteiros
             
        dataset1 = new DefaultValueDataset(project.getHoras_gastas());
        dataset2 = new DefaultValueDataset(((project.getHoras_gastas())/(project.getHoras_pŕevista()))*100);
                        
                        DialPlot dialplot = new DialPlot();
                        
                        dialplot.setView(0.0D, 0.0D, 1.0D, 1.0D);
                        dialplot.setDataset(0, dataset1);
                        dialplot.setDataset(1, dataset2);
                        
                        StandardDialFrame standarddialframe = new StandardDialFrame();
                        standarddialframe.setBackgroundPaint(Color.lightGray);
                        standarddialframe.setForegroundPaint(Color.darkGray);
                        dialplot.setDialFrame(standarddialframe);
                        
                        GradientPaint gradientpaint = new GradientPaint(new Point(), new Color(255, 255, 255), new Point(), new Color(170, 170, 220));
                        DialBackground dialbackground = new DialBackground(gradientpaint);
                        
                        dialbackground.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.VERTICAL));
                        dialplot.setBackground(dialbackground);
                        
                        DialTextAnnotation dialtextannotation = new DialTextAnnotation("Horas");
                        dialtextannotation.setFont(new Font("Dialog", 1, 14));
                        dialtextannotation.setRadius(0.69999999999999996D);
                        dialplot.addLayer(dialtextannotation);
                        
                        DialValueIndicator dialvalueindicator = new DialValueIndicator(0);
                        dialvalueindicator.setFont(new Font("Dialog", 0, 10));
                        dialvalueindicator.setOutlinePaint(Color.darkGray);
                        dialvalueindicator.setRadius(0.59999999999999998D);
                        dialvalueindicator.setAngle(-103D);
                        dialplot.addLayer(dialvalueindicator);
                        
                        DialValueIndicator dialvalueindicator1 = new DialValueIndicator(1);
                        dialvalueindicator1.setFont(new Font("Dialog", 0, 10));
                        dialvalueindicator1.setOutlinePaint(Color.red);
                        dialvalueindicator1.setRadius(0.59999999999999998D);
                        dialvalueindicator1.setAngle(-77D);
                        dialplot.addLayer(dialvalueindicator1);
                        
                        StandardDialScale standarddialscale = new StandardDialScale(0.0D, 120D, -120D, -300D, 10D, 4);
                        standarddialscale.setTickRadius(0.88D);
                        standarddialscale.setTickLabelOffset(0.14999999999999999D);
                        standarddialscale.setTickLabelFont(new Font("Dialog", 0, 14));
                        dialplot.addScale(0, standarddialscale);
                        
                        StandardDialScale standarddialscale1 = new StandardDialScale(0.0D, 100D, -120D, -300D, 10D, 4);
                        standarddialscale1.setTickRadius(0.5D);
                        standarddialscale1.setTickLabelOffset(0.14999999999999999D);
                        standarddialscale1.setTickLabelFont(new Font("Dialog", 0, 10));
                        standarddialscale1.setMajorTickPaint(Color.red);
                        standarddialscale1.setMinorTickPaint(Color.red);
                        dialplot.addScale(1, standarddialscale1);
                        
                        dialplot.mapDatasetToScale(1, 1);
                        
                        StandardDialRange standarddialrange = new StandardDialRange(90D, 100D, Color.blue);
                        standarddialrange.setScaleIndex(1);
                        standarddialrange.setInnerRadius(0.58999999999999997D);
                        standarddialrange.setOuterRadius(0.58999999999999997D);
                        dialplot.addLayer(standarddialrange);
                        
                        org.jfree.chart.plot.dial.DialPointer.Pin pin = new org.jfree.chart.plot.dial.DialPointer.Pin(1);
                        pin.setRadius(0.55000000000000004D);
                        dialplot.addPointer(pin);
                        
                        org.jfree.chart.plot.dial.DialPointer.Pointer pointer = new org.jfree.chart.plot.dial.DialPointer.Pointer(0);
                        dialplot.addPointer(pointer);
                        
                        DialCap dialcap = new DialCap();
                        dialcap.setRadius(0.10000000000000001D);
                        dialplot.setCap(dialcap);
         
                        
       JFreeChart chart = new JFreeChart(dialplot);
       chart.setTitle("Andamento do Projeto");
                        
        ChartPanel panel3 = new ChartPanel(chart);
        panel3.setPreferredSize(new Dimension(300, 250));
        panel3.setMouseWheelEnabled(true);
        panel3.setFillZoomRectangle(true);
        panel3.setVisible(true);
        return panel3;
        
    }
    
    
}
