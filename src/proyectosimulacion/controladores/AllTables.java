package proyectosimulacion.controladores;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import proyectosimulacion.controladores.exportar.*;
import proyectosimulacion.controladores.utilidades.Util;
import proyectosimulacion.animaciones.Ventana;
import proyectosimulacion.modelo.Cliente;

public class AllTables extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="VARIABLES"> 
    //------- VARIABLES GLOBALES --------------------
    public Double[] tiempoDeSalidaFaseONE;
    public Double[] tiempoDeSalidaFaseTWO;
    public Double[] tiempoDeSalidaFaseTHREE;
    public Object[][] tabla1;
    public Object[][] tabla2;
    public Object[][] tabla3;
    public static ArrayList<Cliente> arrayClientesF1 = new ArrayList<Cliente>();
    public static ArrayList<Cliente> arrayClientesF2 = new ArrayList<Cliente>();
    public static ArrayList<Cliente> arrayClientesF3 = new ArrayList<Cliente>();
    public static ArrayList<Cliente> arrayClientesF4 = new ArrayList<Cliente>();
    //
    public static ArrayList<Cliente> arrayClientesF1Exportar = new ArrayList<Cliente>();
    public static ArrayList<Cliente> arrayClientesF2Exportar = new ArrayList<Cliente>();
    public static ArrayList<Cliente> arrayClientesF3Exportar = new ArrayList<Cliente>();
    public static ArrayList<Cliente> arrayClientesF4Exportar = new ArrayList<Cliente>();
    //Numero de servidores  de cada Fase para enviar a otra clase
    public static int servidor_FaseONE; // numero de servidores
    public static int servidor_FaseTWO;
    public static int servidor_FaseTHREE;
    public static int servidor_FaseFOUR;
    // Horas de Apertura y de Cierre
    public static String horaInicio;
    public static String horaCierre;
    
    //-------- VARIABLES LOCALES ------------------
    private double capacidad;//  Capacidad de la FASE1
    private int capacidadMaxima = 1000;
    public static double clientes;//   numero de clientes
    private double aleatorio1;
    private double tasaLlegada;//12/hora aprox. Tambien hay un array con un nombre similar
    private double momentoLlegada = 0;
    private double tiempoInicio = 0;
    private double tiempoEspera;
    private double aleatorio2;
    private double tiempoSalida;//  

    DefaultTableModel modeloF1;
    DefaultTableModel modeloF2;
    DefaultTableModel modeloF3;
    DefaultTableModel modeloF4;
    public static DefaultTableModel modeloAExportar;

    public static clsExportarExcel obj;
    clsExportarPdf objPdf;
    // </editor-fold> 

    public AllTables() {
        initComponents();
        inicializarTablas();
        inicializarSpinners();
        deshabilitarBotones();       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTasaLlegada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNroClientes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DateFormat formato2 = new SimpleDateFormat("HH:mm"); // Creamos un formato de fecha
        Date fecha2 = null;
        try {
            fecha2 = formato2.parse("16:45"); // Creamos un date con la entrada en el formato especificado
            // horaFormateada=formato.format(fecha);
        } catch (ParseException ex) {
            System.out.println("Ex: "+ex);
        }
        SpinnerDateModel sm2 = new SpinnerDateModel(fecha2, null, null,  Calendar.HOUR_OF_DAY);
        spinHoraCierre = new javax.swing.JSpinner(sm2);
        DateFormat formato = new SimpleDateFormat("HH:mm"); // Creamos un formato de fecha
        Date fecha = null;
        try {
            fecha = formato.parse("08:00"); // Creamos un date con la entrada en el formato especificado
            // horaFormateada=formato.format(fecha);
        } catch (ParseException ex) {
            System.out.println("Ex: "+ex);
        }
        SpinnerDateModel sm = new SpinnerDateModel(fecha, null, null,  Calendar.HOUR_OF_DAY);
        spinHoraInicio = new javax.swing.JSpinner(sm);
        panelInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFase3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFase1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFase4 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFase2 = new javax.swing.JTable();
        btnExportarExcel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNumClientesF1 = new javax.swing.JLabel();
        lblNumClientesF2 = new javax.swing.JLabel();
        lblNumClientesF3 = new javax.swing.JLabel();
        lblNumClientesF4 = new javax.swing.JLabel();
        Animacion = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblExportar = new javax.swing.JTable();
        lblAbandonan = new javax.swing.JLabel();
        lblReprueban = new javax.swing.JLabel();
        lblDuplicado = new javax.swing.JLabel();
        btnExportarPdf = new javax.swing.JButton();
        btnResumen = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spinServidorF1 = new javax.swing.JSpinner();
        spinServidorF2 = new javax.swing.JSpinner();
        spinServidorF3 = new javax.swing.JSpinner();
        spinServidorF4 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosimulacion/gui/button_generar.png"))); // NOI18N
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel2.setText("Tasa Llegada");

        jLabel3.setText("Nro Clientes");

        jLabel1.setText("Hora Inicio");

        jLabel12.setText("Hora Cierre");

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(spinHoraCierre, "HH:mm");
        spinHoraCierre.setEditor(de2);

        JSpinner.DateEditor de = new JSpinner.DateEditor(spinHoraInicio, "HH:mm");
        spinHoraInicio.setEditor(de);

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTasaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTasaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(spinHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblFase3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblFase3);

        tblFase1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblFase1);

        tblFase4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblFase4);

        tblFase2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblFase2);

        btnExportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosimulacion/gui/button_exportar-excel.png"))); // NOI18N
        btnExportarExcel.setBorder(null);
        btnExportarExcel.setBorderPainted(false);
        btnExportarExcel.setContentAreaFilled(false);
        btnExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExcelActionPerformed(evt);
            }
        });

        jLabel4.setText("FASE ONE:");

        jLabel5.setText("FASE TWO:");

        jLabel6.setText("FASE THREE:");

        jLabel7.setText("FASE FOUR:");

        lblNumClientesF1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblNumClientesF1.setText("--");

        lblNumClientesF2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblNumClientesF2.setText("--");

        lblNumClientesF3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblNumClientesF3.setText("--");

        lblNumClientesF4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblNumClientesF4.setText("--");

        Animacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosimulacion/gui/button_animacion.png"))); // NOI18N
        Animacion.setBorder(null);
        Animacion.setBorderPainted(false);
        Animacion.setContentAreaFilled(false);
        Animacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimacionActionPerformed(evt);
            }
        });

        tblExportar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblExportar);

        lblAbandonan.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblAbandonan.setText("--");

        lblReprueban.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblReprueban.setText("--");

        lblDuplicado.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblDuplicado.setText("--");

        btnExportarPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosimulacion/gui/button_exportar-pdf.png"))); // NOI18N
        btnExportarPdf.setBorder(null);
        btnExportarPdf.setBorderPainted(false);
        btnExportarPdf.setContentAreaFilled(false);
        btnExportarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarPdfActionPerformed(evt);
            }
        });

        btnResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosimulacion/gui/button_ver-resumen (1).png"))); // NOI18N
        btnResumen.setBorder(null);
        btnResumen.setBorderPainted(false);
        btnResumen.setContentAreaFilled(false);
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                        .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblReprueban, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNumClientesF3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDuplicado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNumClientesF2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAbandonan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumClientesF1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNumClientesF4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3))
                        .addContainerGap(8, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Animacion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumClientesF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAbandonan))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumClientesF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDuplicado))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumClientesF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblReprueban))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumClientesF4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportarPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportarExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Animacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setText("SERVIDORES");

        jLabel9.setText("SERVIDORES");

        jLabel10.setText("SERVIDORES");

        jLabel11.setText("SERVIDORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinServidorF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinServidorF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinServidorF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinServidorF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(spinServidorF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9))
                            .addComponent(spinServidorF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel10))
                            .addComponent(spinServidorF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11))
                            .addComponent(spinServidorF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        Random aleatorio = new Random(System.currentTimeMillis());
        int iF1 = 0;//auxiliar para ayudar a guardar en el array bidimensional 0l
        int iF2 = 0;//auxiliar para ayudar a guardar en el array bidimensional 02
        int iF3 = 0;//auxiliar para ayudar a guardar en el array bidimensional 03     
               
        limpiarTablas();
        inicializarTablas();

        if (validarCampos()) {
            
             habilitarBotones();

            // <editor-fold defaultstate="collapsed" desc="INICIALIZAR ARREGLOS y SERVIDORES"> 
            //*********************** SERVIDORES ****************************************************
            servidor_FaseONE = (int) spinServidorF1.getValue();
            servidor_FaseTWO = (int) spinServidorF2.getValue();
            servidor_FaseTHREE = (int) spinServidorF3.getValue();
            servidor_FaseFOUR = (int) spinServidorF4.getValue();

            //--------------------  ARREGLOS PARA ALMACENAR CIERTOS TIEMPOS-----------------------------                
            Double[] tiempoLlegada = new Double[capacidadMaxima];
            Double[] tiempoAtencion = new Double[capacidadMaxima];
            tiempoDeSalidaFaseONE = new Double[capacidadMaxima];
            tiempoDeSalidaFaseTWO = new Double[capacidadMaxima];
            tiempoDeSalidaFaseTHREE = new Double[capacidadMaxima];
            tabla1 = new Object[Integer.parseInt(txtNroClientes.getText())][7];
            
            //*********************** HORA DE APERTURA Y CIERRE ************************************
            horaInicio = convertirFechaAString((Date) spinHoraInicio.getValue());
            horaCierre = convertirFechaAString((Date) spinHoraCierre.getValue());
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="for  FASE 1">
            for (int i = 1; i <= clientes; i++) {
                aleatorio1 = aleatorio.nextDouble();
                aleatorio2 = aleatorio.nextDouble();

                tiempoLlegada[i] = (-(Math.log(1 - aleatorio1)) * (1 / tasaLlegada) * 3600);
                tiempoAtencion[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * 3600);//               

                if (i == 1) {
                    momentoLlegada = tiempoLlegada[i];
                    tiempoEspera = 0.0000000000;
                    tiempoInicio = tiempoLlegada[i];
                } else {
                    momentoLlegada = momentoLlegada + tiempoLlegada[i];
                    //tiempoInicio = tiempoInicio + tiempoAtencion[i - 1];
                    tiempoInicio = tiempoInicio + tiempoAtencion[i];
                    if (tiempoInicio < momentoLlegada) {
                        tiempoInicio = momentoLlegada;
                    }
                    tiempoEspera = tiempoInicio - momentoLlegada;

                    if (tiempoEspera < 0) {
                        tiempoEspera = 0;
                    }
                }
                tiempoSalida = tiempoInicio + tiempoAtencion[i];
                tiempoDeSalidaFaseONE[i]= tiempoSalida;// PARA ENVIARLO A LA FASE 2

                //Se guardará en el array y en la tabla los campos del cliente numero i                
                tabla1[iF1][0] = i;
                tabla1[iF1][1] = Util.horaMinutoSegundo1(momentoLlegada);
                tabla1[iF1][2] = Util.horaMinutoSegundo1(tiempoInicio);
                tabla1[iF1][3] = Util.horaMinutoSegundo(tiempoEspera);
                tabla1[iF1][4] = Util.horaMinutoSegundo(tiempoAtencion[i]);
                tabla1[iF1][5] = Util.horaMinutoSegundo1(tiempoSalida);
                tabla1[iF1][6] = "PASA";/////////////////
                iF1++;
                /////////////////////// OBJETO CLIENTE ///////////////////////////////////////////////////////
                Cliente clienteF1 = new Cliente();
                clienteF1.setNumCliente(i + "");
                clienteF1.setMomentoLllegada(Util.horaMinutoSegundo1(momentoLlegada) + "");                
                clienteF1.setTiempoInicio(Util.horaMinutoSegundo1(tiempoInicio) + "");
                clienteF1.setTiempoEspera(Util.horaMinutoSegundo(tiempoEspera) + "");
                clienteF1.setTiempoAtencion(Util.horaMinutoSegundo(tiempoAtencion[i]) + "");
                clienteF1.setTiempoSalida(Util.horaMinutoSegundo1(tiempoSalida) + "");
                clienteF1.setEstado("??");
                arrayClientesF1.add(clienteF1);

            }// ===>>> Fin del forF1

            // Proceso para poner "ABANDONA" en lugar de "PASA" aleatoriamente
            Object[][] _tablaModificadaF1 = Util.ponerAbandona(tabla1);
            Object[] objF001 = new Object[7];
            int aux = 0;
            int auxEx=0;
            for (int i = 0; i < _tablaModificadaF1.length; i++) {
                objF001[0] = _tablaModificadaF1[aux][0];
                objF001[1] = _tablaModificadaF1[aux][1];
                objF001[2] = _tablaModificadaF1[aux][2];
                objF001[3] = _tablaModificadaF1[aux][3];
                objF001[4] = _tablaModificadaF1[aux][4];
                objF001[5] = _tablaModificadaF1[aux][5];
                objF001[6] = _tablaModificadaF1[aux][6];
                aux++;
                modeloF1.addRow(objF001);
                modeloAExportar.addRow(objF001);
                
                 /////////////////////// OBJETO CLIENTE A EXPORTAR ///////////////////////////////////////////////////////
                Cliente clienteF1Exportar = new Cliente();
                clienteF1Exportar.setNumCliente(_tablaModificadaF1[auxEx][0]+ "");
                clienteF1Exportar.setMomentoLllegada(_tablaModificadaF1[auxEx][1] + "");                
                clienteF1Exportar.setTiempoInicio(_tablaModificadaF1[auxEx][2] + "");
                clienteF1Exportar.setTiempoEspera(_tablaModificadaF1[auxEx][3] + "");
                clienteF1Exportar.setTiempoAtencion(_tablaModificadaF1[auxEx][4] + "");
                clienteF1Exportar.setTiempoSalida(_tablaModificadaF1[auxEx][5] + "");
                clienteF1Exportar.setEstado(_tablaModificadaF1[auxEx][6]+"");                
                arrayClientesF1Exportar.add(clienteF1Exportar);
                auxEx++;
               
            }
            // Fin proceso                              

            lblNumClientesF1.setText("Hay " + tabla1.length + " clientes");

            int auxA = 0;
            int auxB = 0;
            int filaX = 0;
            for (int i = 1; i <= _tablaModificadaF1.length; i++) {
                if (_tablaModificadaF1[filaX][6].equals("PASA")) {
                    auxA++;
                } else if (_tablaModificadaF1[filaX][6].equals("ABANDONA")) {
                    auxB++;
                }
                filaX++;
            }
            int abandonan = auxB;           
            lblAbandonan.setText("Abandona "+abandonan);
            System.out.println("********************************************** FIN FASE1 ********************************************************");

            // </editor-fold>  
            
            // <editor-fold defaultstate="collapsed" desc="for  FASE 2">  
            tabla2 = new Object[_tablaModificadaF1.length - abandonan][7];
            modeloAExportar.addRow(rowTitulosExportar());
            Double[] tiempoAtencionF2 = new Double[capacidadMaxima];
            
            int auxF2A = 0;
            int auxF2B = 0;
            int fila = 0;
            for (int i = 1; i <= _tablaModificadaF1.length; i++) {
                if (_tablaModificadaF1[fila][6].equals("PASA")) {
                    auxF2A++;
                    
                    tiempoSalida = tiempoDeSalidaFaseONE[i];//viene de la FASE 1
                    aleatorio2 = aleatorio.nextDouble();
                    tiempoAtencionF2[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * (3600));
                    if (i == 1) {
                        momentoLlegada = tiempoSalida;//viene de la fase 1   
                        tiempoEspera = 0.0000000000;
                        tiempoInicio = tiempoSalida;//viene de la fase 1    
                    } else {
                        momentoLlegada = tiempoSalida;//viene de la fase 1                   
                        //tiempoInicio = tiempoInicio + tiempoAtencionF2[i - 1];//***********BUG******************
                        tiempoInicio = tiempoInicio + tiempoAtencionF2[i];

                        if (tiempoInicio < momentoLlegada) {
                            tiempoInicio = momentoLlegada;
                        }
                        tiempoEspera = tiempoInicio - momentoLlegada;
                        if (tiempoEspera < 0) {
                            tiempoEspera = 0;
                        }
                    }
                    tiempoSalida = tiempoInicio + tiempoAtencionF2[i];                    

                    //Se guardará en el array y en la tabla los campos del cliente numero i                    
                    tabla2[iF2][0] = i;
                    tabla2[iF2][1] =  Util.horaMinutoSegundo1(momentoLlegada);
                    tabla2[iF2][2] =  Util.horaMinutoSegundo1(tiempoInicio);
                    tabla2[iF2][3] =  Util.horaMinutoSegundo(tiempoEspera);
                    tabla2[iF2][4] =  Util.horaMinutoSegundo(tiempoAtencion[i]);                    
                    tabla2[iF2][5] = tiempoSalida;
                    tabla2[iF2][6] =  "PASA";/////////////////
                    iF2++;
                    ///////////////////////OBJETO CLIENTE///////////////////////////////////////////////////
                    Cliente clienteF2 = new Cliente();
                    clienteF2.setNumCliente(i + "");
                    clienteF2.setMomentoLllegada(Util.horaMinutoSegundo1(momentoLlegada) + "");
                    clienteF2.setTiempoInicio(Util.horaMinutoSegundo1(tiempoInicio) + "");
                    clienteF2.setTiempoAtencion(Util.horaMinutoSegundo(tiempoAtencion[i]) + "");
                    clienteF2.setTiempoSalida(Util.horaMinutoSegundo1(tiempoSalida) + "");
                    arrayClientesF2.add(clienteF2);

                }//fin IF
                else if (_tablaModificadaF1[fila][6].equals("ABANDONA")) {
                    auxF2B++;
                }
                fila++;

            }// ==== >>> Fin del forF2  

            // Proceso para poner "DUPLICADO" en lugar de "PASA" aleatoriamente
            Object[][] _tablaModificadaF2 = Util.ponerDuplicado(tabla2);
            Object[] objF002 = new Object[7];
            int aux2 = 0;
            for (int i = 0; i < _tablaModificadaF2.length; i++) {
                objF002[0] = _tablaModificadaF2[aux2][0];
                objF002[1] = _tablaModificadaF2[aux2][1];
                objF002[2] = _tablaModificadaF2[aux2][2];
                objF002[3] = _tablaModificadaF2[aux2][3];
                objF002[4] = _tablaModificadaF2[aux2][4];
                tiempoDeSalidaFaseTWO[i] = (Double) _tablaModificadaF2[aux2][5]; //PARA ENVIARLO A LA FASE 3
                objF002[5] = Util.horaMinutoSegundo1((double) _tablaModificadaF2[aux2][5]);                
                objF002[6] = _tablaModificadaF2[aux2][6];
                aux2++;
                modeloF2.addRow(objF002);
                modeloAExportar.addRow(objF002);
            }
            // Fin proceso

            int auxX = 0;
            int auxY = 0;
            int filaY = 0;
            for (int i = 1; i <= _tablaModificadaF2.length; i++) {
                if (_tablaModificadaF2[filaY][6].equals("PASA")) {
                    auxX++;
                } else if (_tablaModificadaF2[filaY][6].equals("DUPLICADO")) {
                    auxY++;
                }
                filaY++;
            }
           
            int duplicados = auxY;
            lblNumClientesF2.setText("Hay " + tabla2.length + " clientes");
            lblDuplicado.setText("Hay " + duplicados + " duplicados");
            System.out.println("************************************************ FIN FASE2 ****************************************************");
          

            // </editor-fold>  
            
            // <editor-fold defaultstate="collapsed" desc="for  FASE 3">  
            modeloAExportar.addRow(rowTitulosExportar());
            tabla3 = new Object[_tablaModificadaF2.length - duplicados][7];
            Double[] tiempoAtencionF3 = new Double[capacidadMaxima];
            int filaF3 = 0;
            int auxF3A = 0;
            int auxF3B = 0;
            int filaAUX = 0;
            for (int i = 1; i <= _tablaModificadaF2.length; i++) {
                if (_tablaModificadaF2[filaAUX][6].equals("PASA")) {
                    auxF3A++;                    
                    tiempoSalida = tiempoDeSalidaFaseTWO[i-1];//VIENE DE LA FASE 2
                    aleatorio2 = aleatorio.nextDouble();
                    tiempoAtencionF3[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * (3600));
                    if (i == 1) {
                        momentoLlegada = tiempoSalida;//viene de la fase 2                   
                        tiempoEspera = 0.0000000000;
                        tiempoInicio = tiempoSalida;//viene de la fase 2                   
                    } else {
                        momentoLlegada = tiempoSalida;//viene de la fase 2  
                        tiempoInicio = tiempoInicio + tiempoAtencionF3[i];
                        //tiempoInicio = tiempoInicio + tiempoAtencionF3[i - 1];//////////////////
                        if (tiempoInicio < momentoLlegada) {
                            tiempoInicio = momentoLlegada;
                        }
                        tiempoEspera = tiempoInicio - momentoLlegada;
                        if (tiempoEspera < 0) {
                            tiempoEspera = 0;
                        }
                    }
                    tiempoSalida = tiempoInicio + tiempoAtencionF3[i];
                    tiempoDeSalidaFaseTHREE[i] = tiempoSalida; // PARA ENVIARLO A LA FASE 4

                    //Se guardará en el array los campos del cliente numero i                    
                    tabla3[iF3][0] = i;
                    tabla3[iF3][1] = Util.horaMinutoSegundo1(momentoLlegada);
                    tabla3[iF3][2] = Util.horaMinutoSegundo1(tiempoInicio);
                    tabla3[iF3][3] = Util.horaMinutoSegundo(tiempoEspera);
                    tabla3[iF3][4] = Util.horaMinutoSegundo(tiempoAtencionF3[i]);
                    tabla3[iF3][5] = tiempoSalida;
                    tabla3[iF3][6] = "PASA";/////////////////
                    iF3++;
                    ///////////////////////OBJETO CLIENTE///////////////////////////////////////////////////
                    Cliente clienteF3 = new Cliente();
                    clienteF3.setNumCliente(i + "");
                    clienteF3.setMomentoLllegada(Util.horaMinutoSegundo1(momentoLlegada) + "");
                    clienteF3.setTiempoInicio(Util.horaMinutoSegundo1(tiempoInicio) + "");
                    clienteF3.setTiempoAtencion(Util.horaMinutoSegundo(tiempoAtencion[i]) + "");
                    clienteF3.setTiempoSalida(Util.horaMinutoSegundo1(tiempoSalida) + "");
                    arrayClientesF3.add(clienteF3);

                } else if (_tablaModificadaF2[filaAUX][6].equals("DUPLICADO")) {
                    auxF3B++;
                }
                filaAUX++;

            }// ===>>> Fin del forF3 

            // Proceso para poner "REPRUEBAN" en lugar de "PASA" aleatoriamente
            Object[][] _tablaModificadaF3 = Util.ponerReprueban(tabla3);
            Object[] objF003 = new Object[7];
            int aux3 = 0;
            for (int i = 0; i < _tablaModificadaF3.length; i++) {
                objF003[0] = _tablaModificadaF3[aux3][0];
                objF003[1] = _tablaModificadaF3[aux3][1];
                objF003[2] = _tablaModificadaF3[aux3][2];
                objF003[3] = _tablaModificadaF3[aux3][3];
                objF003[4] = _tablaModificadaF3[aux3][4];
                tiempoDeSalidaFaseTHREE[i] = (Double) _tablaModificadaF3[aux3][5];
                objF003[5] = Util.horaMinutoSegundo1((double) _tablaModificadaF3[aux3][5]);                
                objF003[6] = _tablaModificadaF3[aux3][6];
                aux3++;
                modeloF3.addRow(objF003);
                modeloAExportar.addRow(objF003);
            }
            // Fin proceso

            int auxONE = 0;
            int auxTWO = 0;
            int filaREP = 0;
            for (int i = 1; i <= _tablaModificadaF3.length; i++) {
                if (_tablaModificadaF3[filaREP][6].equals("PASA")) {
                    auxONE++;
                } else if (_tablaModificadaF3[filaREP][6].equals("REPROBADO")) {
                    auxTWO++;
                }
                filaREP++;
            }
         
            int reprobados = auxTWO;
            lblNumClientesF3.setText("Hay " + tabla3.length + " clientes");
            lblReprueban.setText("Hay " + reprobados + " reprobados");
            System.out.println("************************************************ FIN FASE3 **********************************************************");

            // </editor-fold>  
           
            // <editor-fold defaultstate="collapsed" desc="for  FASE 4">  
            modeloAExportar.addRow(rowTitulosExportar());
            Double[] tiempoAtencionF4 = new Double[capacidadMaxima];
            int filaF4 = 0;
            int auxF4A = 0;
            int auxF4B = 0;
            int filaEXTRA= 0;
            for (int i = 1; i <= _tablaModificadaF3.length - reprobados; i++) {
                if (_tablaModificadaF3[filaEXTRA][6].equals("PASA")) {
                    auxF4A++;

                    tiempoSalida = tiempoDeSalidaFaseTHREE[i-1];// VIENE DE LA FASE 3
                    filaF4++;
                    aleatorio2 = aleatorio.nextDouble();
                    tiempoAtencionF4[i] = (-(Math.log(1 - aleatorio2)) * (1 / tasaLlegada) * 3600);///////
                    if (i == 1) {
                        momentoLlegada = tiempoSalida;//viene de la fase 3                   
                        tiempoEspera = 0.0000000000;
                        tiempoInicio = tiempoSalida;//viene de la fase 3                  
                    } else {
                        momentoLlegada = tiempoSalida;//viene de la fase 3                 
                        //tiempoInicio = tiempoInicio + tiempoAtencionF4[i - 1];
                        tiempoInicio = tiempoInicio + tiempoAtencionF4[i];

                        if (tiempoInicio < momentoLlegada) {
                            tiempoInicio = momentoLlegada;
                        }
                        tiempoEspera = tiempoInicio - momentoLlegada;
                        if (tiempoEspera < 0) {
                            tiempoEspera = 0;
                        }
                    }
                    tiempoSalida = tiempoInicio + tiempoAtencionF4[i];

                    //Se guardará en el array los campos del cliente numero i
                    Object[] objectF4 = new Object[7];
                    objectF4[0] = i;
                    objectF4[1] = Util.horaMinutoSegundo1(momentoLlegada);
                    objectF4[2] = Util.horaMinutoSegundo1(tiempoInicio);
                    objectF4[3] = Util.horaMinutoSegundo(tiempoEspera);
                    objectF4[4] = Util.horaMinutoSegundo(tiempoAtencionF4[i]);
                    objectF4[5] = Util.horaMinutoSegundo1(tiempoSalida);
                    objectF4[6] = "PASA";

                    modeloF4.addRow(objectF4);
                    modeloAExportar.addRow(objectF4);
                    ///////////////////////OBJETO CLIENTE///////////////////////////////////////////////////
                    Cliente clienteF4 = new Cliente();                    
                    clienteF4.setNumCliente(i + "");
                    clienteF4.setMomentoLllegada(Util.horaMinutoSegundo1(momentoLlegada) + "");
                    clienteF4.setTiempoInicio(Util.horaMinutoSegundo1(tiempoInicio) + "");
                    clienteF4.setTiempoAtencion(Util.horaMinutoSegundo(tiempoAtencion[i]) + "");
                    clienteF4.setTiempoSalida(Util.horaMinutoSegundo1(tiempoSalida) + "");
                    arrayClientesF4.add(clienteF4);

                } else if (_tablaModificadaF3[filaEXTRA][6].equals("REPROBADO")) {
                    auxF4B++;
                }
                filaEXTRA++;

            }// ===>>> Fin del forF4

            lblNumClientesF4.setText("Hay " + (_tablaModificadaF3.length - auxF4B));

            // </editor-fold>  
      
        }//// Fin del if
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExcelActionPerformed
        try {
            obj = new clsExportarExcel();
            obj.exportarExcel(tblExportar);
        } catch (IOException ex) {
            Logger.getLogger(AllTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportarExcelActionPerformed

    private void AnimacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimacionActionPerformed
        Ventana ven = new Ventana();
        ven.setVisible(true);
    }//GEN-LAST:event_AnimacionActionPerformed

    private void btnExportarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarPdfActionPerformed
        try {
            objPdf = new clsExportarPdf();
            objPdf.exportarPdf(tblExportar);
        } catch (IOException ex) {
            Logger.getLogger(AllTables.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnExportarPdfActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
         TablaResumen tablaResumen = new TablaResumen();
         tablaResumen.setVisible(true);
         tablaResumen.setLocationRelativeTo(null);     
        
    }//GEN-LAST:event_btnResumenActionPerformed

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
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllTables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Animacion;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnExportarPdf;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnResumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAbandonan;
    private javax.swing.JLabel lblDuplicado;
    private javax.swing.JLabel lblNumClientesF1;
    private javax.swing.JLabel lblNumClientesF2;
    private javax.swing.JLabel lblNumClientesF3;
    private javax.swing.JLabel lblNumClientesF4;
    private javax.swing.JLabel lblReprueban;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JSpinner spinHoraCierre;
    private javax.swing.JSpinner spinHoraInicio;
    private javax.swing.JSpinner spinServidorF1;
    private javax.swing.JSpinner spinServidorF2;
    private javax.swing.JSpinner spinServidorF3;
    private javax.swing.JSpinner spinServidorF4;
    public static javax.swing.JTable tblExportar;
    private javax.swing.JTable tblFase1;
    private javax.swing.JTable tblFase2;
    private javax.swing.JTable tblFase3;
    private javax.swing.JTable tblFase4;
    private javax.swing.JTextField txtNroClientes;
    private javax.swing.JTextField txtTasaLlegada;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="METODOS VARIOS">     
    private void inicializarTablas() {
        modeloF1 = new DefaultTableModel();
        modeloF2 = new DefaultTableModel();
        modeloF3 = new DefaultTableModel();
        modeloF4 = new DefaultTableModel();
        modeloAExportar = new DefaultTableModel();       

        
        tblFase1.setModel(modeloF1);
        tblFase2.setModel(modeloF2);
        tblFase3.setModel(modeloF3);
        tblFase4.setModel(modeloF4);
        tblExportar.setModel(modeloAExportar);
        
        
        primeraFilaDeCadaTabla(modeloF1);
        primeraFilaDeCadaTabla(modeloF2);
        primeraFilaDeCadaTabla(modeloF3);
        primeraFilaDeCadaTabla(modeloF4);
        primeraFilaDeCadaTabla(modeloAExportar);     
        
        txtTasaLlegada.requestFocus();

        //Ocultamos la tabla a Exportar
        tblExportar.setVisible(false);
        jScrollPane5.setVisible(false);

    }

    private void inicializarSpinners() {
        SpinnerNumberModel modelF1 = new SpinnerNumberModel();
        modelF1.setMaximum(2);
        modelF1.setMinimum(1);
        modelF1.setValue(1);
        spinServidorF1.setModel(modelF1);

        SpinnerNumberModel modelF2 = new SpinnerNumberModel();
        modelF2.setMaximum(2);
        modelF2.setMinimum(1);
        modelF2.setValue(1);
        spinServidorF2.setModel(modelF2);

        SpinnerNumberModel modelF3 = new SpinnerNumberModel();
        modelF3.setMaximum(4);
        modelF3.setMinimum(1);
        modelF3.setValue(1);
        spinServidorF3.setModel(modelF3);

        SpinnerNumberModel modelF4 = new SpinnerNumberModel();
        modelF4.setMaximum(2);
        modelF4.setMinimum(1);
        modelF4.setValue(1);
        spinServidorF4.setModel(modelF4);

    }

    public String convertirFechaAString(Date date) {
        return new SimpleDateFormat("HH:mm").format(date);

    }

    /**
     * Metodo que recibe un modelo y le colaca la primera fila
     *
     * @param model
     */
    private void primeraFilaDeCadaTabla(DefaultTableModel model) {
        model.addColumn("Cliente");//aprox. 12 cada hora         
        model.addColumn("Momento Llegada");//M. de Ll. del cliente que está adelante  + T. de Ll. de éste cliente.
        model.addColumn("T. Inicio de Servicio");//(T. de I. de servicio + T. de Atencion) del cliente que está adelante
        model.addColumn("T. de Espera");
        model.addColumn("T. de Atencion");//Calculado en base al aleatiorio2
        model.addColumn("T. de Salida");//T. de I. de servicio + T. de A. del mismo cliente
        model.addColumn("Estado");//T. de I. de servicio + T. de A. del mismo cliente
    }

    private Object[] rowTitulosExportar() {
        Object[] filaExportar = new Object[7];
        filaExportar[0] = "Cliente";
        filaExportar[1] = "Momento Llegada";
        filaExportar[2] = "T. Inicio de Servicio";
        filaExportar[3] = "T. Espera";
        filaExportar[4] = "T. de Atencion";
        filaExportar[5] = "T. de Salida";
        filaExportar[6] = "ESTADO";

        return filaExportar;
    }
   

    public boolean validarCampos() {
        boolean validar = txtNroClientes.getText().isEmpty()
                || txtTasaLlegada.getText().isEmpty();
        boolean aux = false;

        if (validar) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {
            tasaLlegada = Integer.parseInt(txtTasaLlegada.getText());
            clientes = Integer.parseInt(txtNroClientes.getText());

            if (clientes >= capacidadMaxima) {
                JOptionPane.showMessageDialog(this, "El # de clientes NO debe ser mayor o igual a la Capacidad Maxima del sistema");//
                txtNroClientes.setText("");
            } else {

                //Si llegó hasta aquí es porque todos los controles 
                aux = true;

            }
        }

        return aux;
    }

    private void limpiarTablas() {
        modeloF1.setColumnCount(0);
        modeloF1.setRowCount(0);
        modeloF2.setColumnCount(0);
        modeloF2.setRowCount(0);
        modeloF3.setColumnCount(0);
        modeloF3.setRowCount(0);
        modeloF4.setColumnCount(0);
        modeloF4.setRowCount(0);
        modeloAExportar.setColumnCount(0);
        modeloAExportar.setRowCount(0);
    }

    private void deshabilitarBotones() {
        Animacion.setEnabled(false);
        btnExportarExcel.setEnabled(false);
        btnExportarPdf.setEnabled(false);
        btnResumen.setEnabled(false);
    }

    private void habilitarBotones() {
        Animacion.setEnabled(true);
        btnExportarExcel.setEnabled(true);
        btnExportarPdf.setEnabled(true);
        btnResumen.setEnabled(true);
    }

    // </editor-fold> 

  

   

   
}
