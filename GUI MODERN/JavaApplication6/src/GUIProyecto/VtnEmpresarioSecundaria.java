/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIProyecto;

import GUI.MapasPrincipalAdministrador;
import GUI.MapasPrincipalEmpresario;
import GUI.MapasPrincipalTaxi;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.util.TimerTask;
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
public class VtnEmpresarioSecundaria extends javax.swing.JFrame {

    private boolean minimiza;
    public VtnEmpresarioSecundaria() {
        initComponents();
//        Home17 mg = new Home17();
  //      mg.setVisible(false);
        RenderChart();
    }
    
    
    //Let's add a chart to top Jpanel
    //We are going to use JfreeCharts
    //Source will be 
    //Ofcourse before doing anything else you need to download JfreeCharts Lib and import into your project
    public CategoryDataset createDataset() {
        final double[][] data = new double[][]{
            {1.0, 4.0, 3.0, 5.0, 5.0, 7.0, 7.0, 8.0},
            {5.0, 7.0, 6.0, 8.0, 4.0, 4.0, 2.0, 1.0},
            {4.0, 3.0, 2.0, 3.0, 6.0, 3.0, 4.0, 3.0}
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

        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);
        series1.add(3.5, 2.8);
        series1.add(4.2, 6.0);

        series2.add(2.0, 1.0);
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

        JFreeChart chart = ChartFactory.createStackedAreaChart("", "", "", ds);
        chart.setBackgroundPaint(new Color(255,255,255));
        chart.setBorderVisible(false);
        chart.setBorderPaint(new Color(255,255,255));
        chart.getCategoryPlot().setBackgroundPaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinePaint(new Color(255,255,255));
        chart.getCategoryPlot().setDomainGridlinesVisible(false);
        chart.getCategoryPlot().setOutlinePaint(new Color(255,255,255));

        ChartPanel cp = new ChartPanel(chart);
        cp.setBackground(new Color(255,255,255));

        pnl_estadistica.add(cp, BorderLayout.CENTER);
        pnl_estadistica.validate();

    }

    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        txt_salir_admin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        info_usuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_regresar_admin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_estadistica = new javax.swing.JPanel();
        info_estadistica = new javax.swing.JLabel();
        pnl_weather_admin = new javax.swing.JPanel();
        pnl_clima = new javax.swing.JPanel();
        fecha_principal = new javax.swing.JLabel();
        icon_clima_dia_3 = new javax.swing.JLabel();
        panel_ciudad = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        icon_ciudad = new javax.swing.JLabel();
        bck_weather = new javax.swing.JLabel();
        bck_weather_palette = new javax.swing.JLabel();
        info_weather = new javax.swing.JLabel();
        btn_admin_imandar_boletin1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btn_resumen_estadistico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnl_header.setBackground(new java.awt.Color(0, 18, 50));

        txt_salir_admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_salir_admin.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        txt_salir_admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_salir_admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\GUI MODERN\\Cancel_20px_2.png")); // NOI18N
        txt_salir_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_salir_adminMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Conteo, Monitoreo, Estadistica");

        info_usuario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        info_usuario.setForeground(new java.awt.Color(255, 255, 255));
        info_usuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\IMG EMPRESARIO\\Business_40px.png")); // NOI18N
        info_usuario.setText("Empresario");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(". : : F R D W : : .");

        txt_regresar_admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_regresar_admin.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        txt_regresar_admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_regresar_admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\GUI MODERN\\IMG TAXI\\Return_20px.png")); // NOI18N
        txt_regresar_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_regresar_adminMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\IMG COMPARTIDA\\Minimize Window_20px_1.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_regresar_admin)
                        .addGap(20, 20, 20)
                        .addComponent(txt_salir_admin)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                        .addComponent(info_usuario)
                        .addGap(201, 201, 201))))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(info_usuario))
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txt_salir_admin)
                    .addComponent(txt_regresar_admin))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_estadistica.setBackground(new java.awt.Color(255, 255, 255));
        pnl_estadistica.setLayout(new javax.swing.BoxLayout(pnl_estadistica, javax.swing.BoxLayout.LINE_AXIS));

        info_estadistica.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        info_estadistica.setForeground(new java.awt.Color(51, 51, 51));
        info_estadistica.setText("Resumen Actual del Conteo de Carros");

        pnl_weather_admin.setPreferredSize(new java.awt.Dimension(653, 406));
        pnl_weather_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_clima.setBackground(new java.awt.Color(0, 18, 50));
        pnl_clima.setForeground(new java.awt.Color(130, 130, 130));
        pnl_clima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_climaMouseClicked(evt);
            }
        });

        fecha_principal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecha_principal.setForeground(new java.awt.Color(255, 255, 255));
        fecha_principal.setText("Verificar Estado Metereologico");

        javax.swing.GroupLayout pnl_climaLayout = new javax.swing.GroupLayout(pnl_clima);
        pnl_clima.setLayout(pnl_climaLayout);
        pnl_climaLayout.setHorizontalGroup(
            pnl_climaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_climaLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(fecha_principal)
                .addGap(73, 73, 73))
        );
        pnl_climaLayout.setVerticalGroup(
            pnl_climaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_climaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(fecha_principal)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnl_weather_admin.add(pnl_clima, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 400, 70));

        icon_clima_dia_3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\IMG COMPARTIDA\\Windy Weather-50.png")); // NOI18N
        pnl_weather_admin.add(icon_clima_dia_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 50));

        panel_ciudad.setBackground(new java.awt.Color(69, 43, 41));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cuenca. Ecuador");

        javax.swing.GroupLayout panel_ciudadLayout = new javax.swing.GroupLayout(panel_ciudad);
        panel_ciudad.setLayout(panel_ciudadLayout);
        panel_ciudadLayout.setHorizontalGroup(
            panel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ciudadLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel_ciudadLayout.setVerticalGroup(
            panel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ciudadLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        pnl_weather_admin.add(panel_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 150, 30));

        icon_ciudad.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\New folder\\Marker_70px.png")); // NOI18N
        pnl_weather_admin.add(icon_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 70, 60));

        bck_weather.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\New folder\\bkc_weather.jpg")); // NOI18N
        pnl_weather_admin.add(bck_weather, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 162));

        bck_weather_palette.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\New folder\\bck_weather_palette.jpg")); // NOI18N
        bck_weather_palette.setText("jLabel4");
        pnl_weather_admin.add(bck_weather_palette, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 640, 122));

        info_weather.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        info_weather.setForeground(new java.awt.Color(0, 0, 0));
        info_weather.setText("Estado Metereologico");

        btn_admin_imandar_boletin1.setBackground(new java.awt.Color(32, 47, 90));
        btn_admin_imandar_boletin1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btn_admin_imandar_boletin1.setForeground(new java.awt.Color(0, 0, 0));
        btn_admin_imandar_boletin1.setText("Revisar Mapas");
        btn_admin_imandar_boletin1.setBorder(null);
        btn_admin_imandar_boletin1.setBorderPainted(false);
        btn_admin_imandar_boletin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_imandar_boletin1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("AVISOS");

        btn_resumen_estadistico.setBackground(new java.awt.Color(32, 47, 90));
        btn_resumen_estadistico.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btn_resumen_estadistico.setForeground(new java.awt.Color(0, 0, 0));
        btn_resumen_estadistico.setText("Resumen Estadistico");
        btn_resumen_estadistico.setBorder(null);
        btn_resumen_estadistico.setBorderPainted(false);
        btn_resumen_estadistico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resumen_estadisticoMouseClicked(evt);
            }
        });
        btn_resumen_estadistico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resumen_estadisticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_weather_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_admin_imandar_boletin1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info_weather)
                            .addComponent(info_estadistica)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pnl_estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btn_resumen_estadistico, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(info_estadistica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pnl_estadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_resumen_estadistico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addComponent(info_weather)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_weather_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(btn_admin_imandar_boletin1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_salir_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salir_adminMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txt_salir_adminMouseClicked

    private void btn_admin_imandar_boletin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_imandar_boletin1ActionPerformed
        
   
        
        MapasPrincipalEmpresario mpE=new MapasPrincipalEmpresario();
        this.dispose();
        mpE.setLocationRelativeTo(null);
        mpE.setExtendedState(MAXIMIZED_BOTH);
        mpE.setVisible(true);
    }//GEN-LAST:event_btn_admin_imandar_boletin1ActionPerformed

    private void pnl_climaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_climaMouseClicked
        dispose();
        VtnVerificarGif vPG=new VtnVerificarGif();
        vPG.setLocationRelativeTo(null);
        vPG.show();
        
        ///timer
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Clima_Empresario vtnIT= new Clima_Empresario();
                vtnIT.setLocationRelativeTo(null);
                vtnIT.show();
                vPG.dispose();
            }
        },400*5);
    }//GEN-LAST:event_pnl_climaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(ICONIFIED);
        if (!minimiza) {
            minimiza = false;
        } else {
            minimiza = true;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_resumen_estadisticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resumen_estadisticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resumen_estadisticoActionPerformed

    private void btn_resumen_estadisticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resumen_estadisticoMouseClicked
        //dispose();
        VtnVerificarGif vPG=new VtnVerificarGif();
        vPG.setLocationRelativeTo(null);
        vPG.show();
        
        ///timer
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                VtnEstadistica vE= new VtnEstadistica();
                vE.setLocationRelativeTo(null);
                vE.show();
                vPG.dispose();
          
            }
        },400*5);
    }//GEN-LAST:event_btn_resumen_estadisticoMouseClicked

    private void txt_regresar_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_regresar_adminMouseClicked
        VtnEmpresario1 vtE = new VtnEmpresario1();
        vtE.setLocationRelativeTo(null);
        vtE.setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_regresar_adminMouseClicked

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
            java.util.logging.Logger.getLogger(VtnEmpresarioSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnEmpresarioSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnEmpresarioSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnEmpresarioSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnEmpresarioSecundaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bck_weather;
    private javax.swing.JLabel bck_weather_palette;
    private javax.swing.JButton btn_admin_imandar_boletin1;
    private javax.swing.JButton btn_resumen_estadistico;
    private javax.swing.JLabel fecha_principal;
    private javax.swing.JLabel icon_ciudad;
    private javax.swing.JLabel icon_clima_dia_3;
    private javax.swing.JLabel info_estadistica;
    private javax.swing.JLabel info_usuario;
    private javax.swing.JLabel info_weather;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panel_ciudad;
    private javax.swing.JPanel pnl_clima;
    private javax.swing.JPanel pnl_estadistica;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_weather_admin;
    private javax.swing.JLabel txt_regresar_admin;
    private javax.swing.JLabel txt_salir_admin;
    // End of variables declaration//GEN-END:variables
}
