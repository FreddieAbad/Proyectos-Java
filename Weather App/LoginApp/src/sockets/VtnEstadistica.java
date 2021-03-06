/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;


import java.awt.BorderLayout;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author proxc
 */
public class VtnEstadistica extends javax.swing.JFrame implements Runnable {

    private boolean minimiza;
    public VtnEstadistica() {
        initComponents();
         Thread miHilo=new Thread(this);
		
        miHilo.start();
        
        
        RenderChart();
        RenderChart1();
        RenderChart2();
        RenderChart3();
    }
    
    
    //Let's add a chart to top Jpanel
    //We are going to use JfreeCharts
    //Source will be 
    //Ofcourse before doing anything else you need to download JfreeCharts Lib and import into your project
    public CategoryDataset createDataset() {
        final double[][] data = new double[][]{
            {1.0, 4.0, 3.0, 5.0, 5.0, 7.0, 7.0, 8.0},
            {8.0, 7.0, 6.0, 8.0, 4.0, 3.0, 4.0, 1.0},
            {4.0, 3.0, 2.0, 3.0, 6.0, 3.0, 24.0, 13.0}
        };

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "", "", data
        );
        return dataset;
    }
    public CategoryDataset createDatasetAA() {
        final double[][] data = new double[][]{
            {1.0, 4.0, 3.0, 5.0, 5.0, 17.0, 7.0, 8.0},
            {8.0, 7.0, 16.0, 8.0, 4.0, 13.0, 4.0, 1.0},
            {4.0, 13.0, 2.0, 3.0, 16.0, 3.0, 24.0, 13.0}
        };

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "", "", data
        );
        return dataset;
    }
    public CategoryDataset createDatasetA() {
        final double[][] data = new double[][]{
            {1.0, 4.0, 3.0, 5.0, 25.0, 17.0, 7.0, 8.0},
            {8.0, 17.0, .01, 18.0, 4.0, 13.0, 4.0, 1.0},
            {14.0, 23.0, 2.0, 3.0, 16.0, 3.0, 24.0, 13.0}
        };

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "", "", data
        );
        return dataset;
    }
    
    public CategoryDataset createDatasetAAA() {
        final double[][] data = new double[][]{
            {1.0, 4.0, 3.0, 5.0, 15.0, 7.0, 7.0, 18.0},
            {8.0, 7.0, 16.0, 8.0, 4.0, 13.0, 4.0, 1.0},
            {4.0, 23.0, 2.0, 13.0, 16.0, 3.0, 24.0, 3.0}
        };

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "", "", data
        );
        return dataset;
    }

    private XYDataset createDataset2() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Object 1");
        XYSeries series2 = new XYSeries("Object 2");
        XYSeries series3 = new XYSeries("Object 3");

        series1.add(1.0, 3.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);
        series1.add(3.5, 2.8);
        series1.add(4.2, 6.0);

        series2.add(2.0, 2.0);
        series2.add(2.5, 2.4);
        series2.add(3.2, 1.2);
        series2.add(3.9, 2.8);
        series2.add(4.6, 3.0);

        series3.add(1.2, 4.0);
        series3.add(2.5, 4.4);
        series3.add(3.8, 4.2);
        series3.add(4.3, 3.8);
        series3.add(4.5, 4.0);

        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);

        return dataset;
    }

    void RenderChart() {
        CategoryDataset ds = createDataset();

        JFreeChart chart = ChartFactory.createStackedAreaChart("CALLE 1", "", "", ds);
        chart.setBackgroundPaint(new Color(255,255,255));
        chart.setBorderVisible(false);
        chart.setBorderPaint(new Color(255,255,255));
        chart.getCategoryPlot().setBackgroundPaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinePaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinesVisible(false);
        chart.getCategoryPlot().setOutlinePaint(new Color(255,255,255));

        ChartPanel cp = new ChartPanel(chart);
        cp.setBackground(new Color(255,255,255));

        pnl_chart.add(cp, BorderLayout.CENTER);
        pnl_chart.validate();

    }
    void RenderChart1() {
        CategoryDataset ds = createDatasetAA();

        JFreeChart chart = ChartFactory.createStackedAreaChart("CALLE 2", "", "", ds);
        chart.setBackgroundPaint(new Color(255,255,255));
        chart.setBorderVisible(false);
        chart.setBorderPaint(new Color(255,255,255));
        chart.getCategoryPlot().setBackgroundPaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinePaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinesVisible(false);
        chart.getCategoryPlot().setOutlinePaint(new Color(255,255,255));

        ChartPanel cp = new ChartPanel(chart);
        cp.setBackground(new Color(255,255,255));

        pnl_chart1.add(cp, BorderLayout.CENTER);
        pnl_chart1.validate();

    }
    void RenderChart2() {
        CategoryDataset ds = createDatasetA();

        JFreeChart chart = ChartFactory.createStackedAreaChart("CALLE 3", "", "", ds);
        chart.setBackgroundPaint(new Color(255,255,255));
        chart.setBorderVisible(false);
        chart.setBorderPaint(new Color(255,255,255));
        chart.getCategoryPlot().setBackgroundPaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinePaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinesVisible(false);
        chart.getCategoryPlot().setOutlinePaint(new Color(255,255,255));

        ChartPanel cp = new ChartPanel(chart);
        cp.setBackground(new Color(255,255,255));

        pnl_chart2.add(cp, BorderLayout.CENTER);
        pnl_chart2.validate();

    }
    void RenderChart3() {
        CategoryDataset ds = createDatasetAAA();

        JFreeChart chart = ChartFactory.createStackedAreaChart("CALLE 4", "", "", ds);
        chart.setBackgroundPaint(new Color(255,255,255));
        chart.setBorderVisible(false);
        chart.setBorderPaint(new Color(255,255,255));
        chart.getCategoryPlot().setBackgroundPaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinePaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinesVisible(false);
        chart.getCategoryPlot().setOutlinePaint(new Color(255,255,255));

        ChartPanel cp = new ChartPanel(chart);
        cp.setBackground(new Color(255,255,255));

        pnl_chart3.add(cp, BorderLayout.CENTER);
        pnl_chart3.validate();

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        txt_salir_admin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        minia = new javax.swing.JLabel();
        pnl_chart = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnl_chart1 = new javax.swing.JPanel();
        pnl_chart2 = new javax.swing.JPanel();
        pnl_chart3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_header.setBackground(new java.awt.Color(85, 85, 255));

        txt_salir_admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_salir_admin.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        txt_salir_admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_salir_admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\GUI MODERN\\Cancel_20px_2.png")); // NOI18N
        txt_salir_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_salir_adminMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Conteo, Monitoreo, Estadistica");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Resumen Estadistico");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(". : : F R D W : : .");

        minia.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\IMG COMPARTIDA\\Minimize Window_20px_1.png")); // NOI18N
        minia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(txt_salir_admin)
                .addContainerGap())
            .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_headerLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel8)
                    .addContainerGap(630, Short.MAX_VALUE)))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_salir_admin)
                            .addComponent(minia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(25, 25, 25)))
        );

        pnl_chart.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chart.setLayout(new javax.swing.BoxLayout(pnl_chart, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Resumen Actual del Conteo de Carros");

        pnl_chart1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chart1.setLayout(new javax.swing.BoxLayout(pnl_chart1, javax.swing.BoxLayout.LINE_AXIS));

        pnl_chart2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chart2.setLayout(new javax.swing.BoxLayout(pnl_chart2, javax.swing.BoxLayout.LINE_AXIS));

        pnl_chart3.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chart3.setLayout(new javax.swing.BoxLayout(pnl_chart3, javax.swing.BoxLayout.LINE_AXIS));

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addContainerGap(537, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnl_chart, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_chart1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pnl_chart2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_chart3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnl_chart, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_chart1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_chart2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_chart3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_salir_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salir_adminMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_txt_salir_adminMouseClicked

    private void miniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniaMouseClicked
        this.setExtendedState(ICONIFIED);
        if (!minimiza) {
            minimiza = false;
        } else {
            minimiza = true;
        }
    }//GEN-LAST:event_miniaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                
               try {
                // System.out.println("fgsdfg");
                ServerSocket miservidor=new ServerSocket(9998);
                while(true){
                    Socket misocket =miservidor.accept();

                    DataInputStream flujoEntrada=new DataInputStream(misocket.getInputStream());

                    String mensajeTexto=flujoEntrada.readUTF();

                    //pongo en area texto
                    areaTexto.append("\n "+mensajeTexto);

                    misocket.close();
                    new VtnEstadistica().setVisible(true);
                }
            } catch (IOException ex) {
                Logger.getLogger(VtnEstadistica.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minia;
    private javax.swing.JPanel pnl_chart;
    private javax.swing.JPanel pnl_chart1;
    private javax.swing.JPanel pnl_chart2;
    private javax.swing.JPanel pnl_chart3;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JLabel txt_salir_admin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
