/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIProyecto;


import java.io.IOException;
import java.util.Date;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;

/**
 *
 * @author USUARIO
 */
public class Clima_Taxi extends javax.swing.JFrame {

    private boolean minimiza;
    public Clima_Taxi() {
        initComponents();
        conseguirClima();
    }

    private void conseguirClima(){
        boolean isMetric = true;
        String owmApiKey = "d799891c3abc14a23330011c4f39ed63"; /* YOUR OWM API KEY HERE */
        String weatherCity = "Cuenca,EC";
        byte forecastDays = 3;
        OpenWeatherMap.Units units = (isMetric)
            ? OpenWeatherMap.Units.METRIC
            : OpenWeatherMap.Units.IMPERIAL;
        OpenWeatherMap owm = new OpenWeatherMap(units, owmApiKey);
        try {
          DailyForecast forecast = owm.dailyForecastByCityName(weatherCity, forecastDays);
          System.out.println("Clima para: " + forecast.getCityInstance().getCityName());
          int numForecasts = forecast.getForecastCount();
            DailyForecast.Forecast dayForecast = forecast.getForecastInstance(0);
            DailyForecast.Forecast.Temperature temperature = dayForecast.getTemperatureInstance();
            System.out.println("\t" + dayForecast.getDateTime());
            System.out.println("\tTemperatura Minima: " + temperature.getMinimumTemperature() +
                " Temperatura Maxima: " + temperature.getMaximumTemperature() + "\n");
          /*for (int i = 0; i < numForecasts; i++) {
            DailyForecast.Forecast dayForecast = forecast.getForecastInstance(i);
            DailyForecast.Forecast.Temperature temperature = dayForecast.getTemperatureInstance();
            System.out.println("\t" + dayForecast.getDateTime());
            System.out.println("\tTemperatura Minima: " + temperature.getMinimumTemperature() +
                " Temperatura Maxima: " + temperature.getMaximumTemperature() + "\n");
          }*/
          
          String tmn="\tT. Minima: " + temperature.getMinimumTemperature()+" °C";
          String tmx="\tT. Maxima: " + temperature.getMaximumTemperature()+" °C";
          String npais=forecast.getCityInstance().getCountryCode();
          Date fech=dayForecast.getDateTime();
          String f=fech.toString();
          nombre.setText(forecast.getCityInstance().getCityName());
          nombrepais.setText(npais);
          fecha.setText(f);
          tmin.setText(tmn);
          tmax.setText(tmx);
          
          /**/
         
          DailyForecast.Forecast dayForecast1 = forecast.getForecastInstance(1);
          DailyForecast.Forecast.Temperature temperature1 = dayForecast1.getTemperatureInstance();
          String tmn1="\tT. Minima: " + temperature1.getMinimumTemperature()+" °C";
          String tmx1="\tT. Maxima: " + temperature1.getMaximumTemperature()+" °C";
          //String npais1=forecast.getCityInstance().getCountryCode();
          Date fech1=dayForecast1.getDateTime();
          String f1=fech1.toString();
         
          fecha1.setText(f1);
          tmin1.setText(tmn1);
          tmax1.setText(tmx1);
          /**/
          DailyForecast forecast2 = owm.dailyForecastByCityName(weatherCity, forecastDays);
          DailyForecast.Forecast dayForecast2 = forecast2.getForecastInstance(2);
          DailyForecast.Forecast.Temperature temperature2 = dayForecast2.getTemperatureInstance();
          String tmn2="\tT. Minima: " + temperature2.getMinimumTemperature()+" °C";
          String tmx2="\tT. Maxima: " + temperature2.getMaximumTemperature()+" °C";
          
          Date fech2=dayForecast2.getDateTime();
          String f2=fech2.toString();
          
          fecha2.setText(f2);
          tmin2.setText(tmn2);
          tmax2.setText(tmx);
        }
        catch (IOException | JSONException e) {
          e.printStackTrace();
        }
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_weather_admin = new javax.swing.JPanel();
        miniccc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        tmax2 = new javax.swing.JLabel();
        tmax = new javax.swing.JLabel();
        tmin = new javax.swing.JLabel();
        tmax1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        fecha2 = new javax.swing.JLabel();
        tmin1 = new javax.swing.JLabel();
        tmin2 = new javax.swing.JLabel();
        icon_clima_dia_3 = new javax.swing.JLabel();
        icon_clima_dia_2 = new javax.swing.JLabel();
        panel_ciudad = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        nombrepais = new javax.swing.JLabel();
        icon_ciudad = new javax.swing.JLabel();
        bck_weather = new javax.swing.JLabel();
        bck_weather_palette = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_weather_admin.setPreferredSize(new java.awt.Dimension(653, 406));
        pnl_weather_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miniccc.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\IMG COMPARTIDA\\Minimize Window_20px_1.png")); // NOI18N
        miniccc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minicccMouseClicked(evt);
            }
        });
        pnl_weather_admin.add(miniccc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(".::FRDW::.");
        pnl_weather_admin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\IMG COMPARTIDA\\Windy Weather-50.png")); // NOI18N
        pnl_weather_admin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        cerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\Close Window_40px.png")); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        pnl_weather_admin.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        tmax2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tmax2.setForeground(new java.awt.Color(0, 0, 0));
        tmax2.setText("LUNES 22, MAYO 2017 ");
        pnl_weather_admin.add(tmax2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 290, 20));

        tmax.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        tmax.setForeground(new java.awt.Color(255, 255, 255));
        tmax.setText("60° C");
        pnl_weather_admin.add(tmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 440, -1));

        tmin.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        tmin.setForeground(new java.awt.Color(255, 255, 255));
        tmin.setText("60° C");
        pnl_weather_admin.add(tmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 430, -1));

        tmax1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tmax1.setForeground(new java.awt.Color(0, 0, 0));
        tmax1.setText("60°");
        pnl_weather_admin.add(tmax1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 440, 30));

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("MARTES");
        pnl_weather_admin.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 490, 40));

        fecha1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecha1.setForeground(new java.awt.Color(0, 0, 0));
        fecha1.setText("JUEVES");
        pnl_weather_admin.add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 440, 30));

        fecha2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        fecha2.setForeground(new java.awt.Color(0, 0, 0));
        fecha2.setText("MIERCOLES");
        pnl_weather_admin.add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        tmin1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tmin1.setForeground(new java.awt.Color(0, 0, 0));
        tmin1.setText("65°");
        pnl_weather_admin.add(tmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 390, 20));

        tmin2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tmin2.setForeground(new java.awt.Color(0, 0, 0));
        tmin2.setText("75°");
        pnl_weather_admin.add(tmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 475, 320, -1));

        icon_clima_dia_3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\New folder\\Torrential Rain_40px.png")); // NOI18N
        pnl_weather_admin.add(icon_clima_dia_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 30));

        icon_clima_dia_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\New folder\\Sun_40px.png")); // NOI18N
        pnl_weather_admin.add(icon_clima_dia_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        panel_ciudad.setBackground(new java.awt.Color(69, 43, 41));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Cuenca");

        nombrepais.setBackground(new java.awt.Color(255, 255, 255));
        nombrepais.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nombrepais.setForeground(new java.awt.Color(255, 255, 255));
        nombrepais.setText(" Ecuador");

        icon_ciudad.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Proyecto\\APP CLIENTE SERVIDOR\\Respaldos\\GUI MODERN\\Google Maps_40px.png")); // NOI18N

        javax.swing.GroupLayout panel_ciudadLayout = new javax.swing.GroupLayout(panel_ciudad);
        panel_ciudad.setLayout(panel_ciudadLayout);
        panel_ciudadLayout.setHorizontalGroup(
            panel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ciudadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombrepais, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel_ciudadLayout.setVerticalGroup(
            panel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ciudadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ciudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_ciudadLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(icon_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ciudadLayout.createSequentialGroup()
                        .addComponent(nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombrepais)))
                .addContainerGap())
        );

        pnl_weather_admin.add(panel_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 170, 80));

        bck_weather.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\New folder\\bkc_weather.jpg")); // NOI18N
        pnl_weather_admin.add(bck_weather, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 210));

        bck_weather_palette.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\New folder\\bck_weather_palette.jpg")); // NOI18N
        bck_weather_palette.setText("jLabel4");
        pnl_weather_admin.add(bck_weather_palette, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 640, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_weather_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_weather_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        VtnTaxistaSecundaria vtns=new VtnTaxistaSecundaria();
        vtns.setLocationRelativeTo(null);
        vtns.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void minicccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minicccMouseClicked
        this.setExtendedState(ICONIFIED);
        if (!minimiza) {
            minimiza = false;
        } else {
            minimiza = true;
        }
    }//GEN-LAST:event_minicccMouseClicked

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Clima_Taxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clima_Taxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clima_Taxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clima_Taxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clima_Taxi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bck_weather;
    private javax.swing.JLabel bck_weather_palette;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fecha1;
    private javax.swing.JLabel fecha2;
    private javax.swing.JLabel icon_ciudad;
    private javax.swing.JLabel icon_clima_dia_2;
    private javax.swing.JLabel icon_clima_dia_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel miniccc;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombrepais;
    private javax.swing.JPanel panel_ciudad;
    private javax.swing.JPanel pnl_weather_admin;
    private javax.swing.JLabel tmax;
    private javax.swing.JLabel tmax1;
    private javax.swing.JLabel tmax2;
    private javax.swing.JLabel tmin;
    private javax.swing.JLabel tmin1;
    private javax.swing.JLabel tmin2;
    // End of variables declaration//GEN-END:variables
}
