package plantilla;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

public class Matrices_Vectores extends javax.swing.JFrame {

    DefaultTableModel modeloA = new DefaultTableModel();
    DefaultTableModel modeloB = new DefaultTableModel();
    DefaultTableModel modeloC = new DefaultTableModel();
    Operaciones_ordenar_vec ordenar = new Operaciones_ordenar_vec();
    Operaciones_buscar_vec buscar = new Operaciones_buscar_vec();
    operaciones_iden_tri oper = new operaciones_iden_tri();
    operaciones_inv ope = new operaciones_inv();
    Operaciones_basicas op = new Operaciones_basicas();
    operaciones_diag o = new operaciones_diag();
    GaussJordan jfr = new GaussJordan();

    public Matrices_Vectores() {
        initComponents();
        SpinnerNumberModel minfA = new SpinnerNumberModel();
        SpinnerNumberModel minfB = new SpinnerNumberModel();
        SpinnerNumberModel mincA = new SpinnerNumberModel();
        SpinnerNumberModel mincB = new SpinnerNumberModel();
        //min.setMaximum(10);
        minfA.setMinimum(0);
        minfB.setMinimum(0);
        mincA.setMinimum(0);
        mincB.setMinimum(0);
        spn_columnasA.setModel(mincA);
        spn_columnasB.setModel(mincB);
        spn_filasA.setModel(minfA);
        spn_filasB.setModel(minfB);

        if (rdb_matrices.isSelected()) {
            cbx_ordenarA.setEnabled(false);
            cbx_ordenarB.setEnabled(false);
            btn_ordenarA.setEnabled(false);
            btn_ordenarB.setEnabled(false);
            cbx_buscarA.setEnabled(false);
            cbx_buscarB.setEnabled(false);
            btn_buscarA.setEnabled(false);
            btn_buscarB.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg_modo = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spn_filasB = new javax.swing.JSpinner();
        spn_columnasB = new javax.swing.JSpinner();
        lbl_B = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spn_filasA = new javax.swing.JSpinner();
        spn_columnasA = new javax.swing.JSpinner();
        lbl_A = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_MatResp = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_MatA = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_MatB = new javax.swing.JTable();
        btn_suma = new javax.swing.JButton();
        btn_producto = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_escalarA = new javax.swing.JButton();
        btn_inversaA = new javax.swing.JButton();
        btn_transpuestaA = new javax.swing.JButton();
        txt_escalarA = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        cbx_ordenarA = new javax.swing.JComboBox();
        btn_ordenarA = new javax.swing.JButton();
        cbx_ordenarB = new javax.swing.JComboBox();
        btn_ordenarB = new javax.swing.JButton();
        btn_escalarB = new javax.swing.JButton();
        btn_inversaB = new javax.swing.JButton();
        btn_transpuestaB = new javax.swing.JButton();
        txt_escalarB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_triangSupA = new javax.swing.JButton();
        btn_triangInfA = new javax.swing.JButton();
        btn_triangSupB = new javax.swing.JButton();
        btn_triangInfB = new javax.swing.JButton();
        btn_idempotenteA = new javax.swing.JButton();
        btn_idempotenteB = new javax.swing.JButton();
        rdb_matrices = new javax.swing.JRadioButton();
        rdb_vectores = new javax.swing.JRadioButton();
        btn_RespA = new javax.swing.JButton();
        btn_RespB = new javax.swing.JButton();
        btn_diagonalA = new javax.swing.JButton();
        btn_diagonalB = new javax.swing.JButton();
        btn_clearA = new javax.swing.JButton();
        btn_clearB = new javax.swing.JButton();
        btn_cerosA = new javax.swing.JButton();
        btn_identA = new javax.swing.JButton();
        btn_cerosB = new javax.swing.JButton();
        btn_identB = new javax.swing.JButton();
        btn_randomA = new javax.swing.JButton();
        btn_randomB = new javax.swing.JButton();
        btn_switch = new javax.swing.JButton();
        cbx_buscarA = new javax.swing.JComboBox();
        btn_buscarA = new javax.swing.JButton();
        cbx_buscarB = new javax.swing.JComboBox();
        btn_buscarB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("# Filas");

        jLabel11.setText("# Columnas");

        spn_filasB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_filasBStateChanged(evt);
            }
        });

        spn_columnasB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_columnasBStateChanged(evt);
            }
        });

        lbl_B.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        lbl_B.setText("Matriz B");
        lbl_B.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn_filasB, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(spn_columnasB))
                .addGap(19, 19, 19))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_B)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spn_filasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(spn_columnasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jLabel1.setText("# Filas");

        jLabel2.setText("# Columnas");

        spn_filasA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_filasAStateChanged(evt);
            }
        });
        spn_filasA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spn_filasAKeyTyped(evt);
            }
        });

        spn_columnasA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_columnasAStateChanged(evt);
            }
        });

        lbl_A.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        lbl_A.setText("Matriz A");
        lbl_A.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn_filasA, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(spn_columnasA))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_A)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spn_filasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spn_columnasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbl_MatResp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_MatResp);

        tbl_MatA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_MatA);

        tbl_MatB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbl_MatB);

        btn_suma.setText("A + B");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_producto.setText("A * B");
        btn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productoActionPerformed(evt);
            }
        });

        btn_resta.setText("A - B");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RESPUESTA");

        btn_escalarA.setText("Producto escalar de A por:");
        btn_escalarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escalarAActionPerformed(evt);
            }
        });

        btn_inversaA.setText("Matriz Inversa de A");
        btn_inversaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inversaAActionPerformed(evt);
            }
        });

        btn_transpuestaA.setText("Matriz Transpuesta de A");
        btn_transpuestaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transpuestaAActionPerformed(evt);
            }
        });

        txt_escalarA.setToolTipText("Ingrese el Escalar a multiplicar");
        txt_escalarA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_escalarAKeyTyped(evt);
            }
        });

        btn_guardar.setText("Guardar .txt");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        cbx_ordenarA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Métodos de Ordenamiento-", "BubbleSort", "SelectionSort", "InsertionSort", "ShellSort", "MergeSort", "QuickSort" }));
        cbx_ordenarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ordenarAActionPerformed(evt);
            }
        });

        btn_ordenarA.setText("Ordenar A");
        btn_ordenarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarAActionPerformed(evt);
            }
        });

        cbx_ordenarB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Métodos de Ordenamiento-", "BubbleSort", "SelectionSort", "InsertionSort", "ShellSort", "MergeSort", "QuickSort" }));

        btn_ordenarB.setText("Ordenar B");
        btn_ordenarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarBActionPerformed(evt);
            }
        });

        btn_escalarB.setText("Producto escalar de B por:");
        btn_escalarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escalarBActionPerformed(evt);
            }
        });

        btn_inversaB.setText("Matriz Inversa de B");
        btn_inversaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inversaBActionPerformed(evt);
            }
        });

        btn_transpuestaB.setText("Matriz Traspuesta de B");
        btn_transpuestaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transpuestaBActionPerformed(evt);
            }
        });

        txt_escalarB.setToolTipText("Ingrese el Escalar a multiplicar");
        txt_escalarB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_escalarBKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("OPERACIONES CON MATRICES");

        btn_triangSupA.setText("Matriz Triangular Superior de A");
        btn_triangSupA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_triangSupAActionPerformed(evt);
            }
        });

        btn_triangInfA.setText("Matriz Triangular Inferior de A");
        btn_triangInfA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_triangInfAActionPerformed(evt);
            }
        });

        btn_triangSupB.setText("Matriz Triangular Superior de B");
        btn_triangSupB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_triangSupBActionPerformed(evt);
            }
        });

        btn_triangInfB.setText("Matriz Triangular Inferior de B");
        btn_triangInfB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_triangInfBActionPerformed(evt);
            }
        });

        btn_idempotenteA.setText("A es Idempotente?");
        btn_idempotenteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idempotenteAActionPerformed(evt);
            }
        });

        btn_idempotenteB.setText("B es Idempotente?");
        btn_idempotenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idempotenteBActionPerformed(evt);
            }
        });

        btg_modo.add(rdb_matrices);
        rdb_matrices.setSelected(true);
        rdb_matrices.setText("MATRICES");
        rdb_matrices.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdb_matricesStateChanged(evt);
            }
        });

        btg_modo.add(rdb_vectores);
        rdb_vectores.setText("VECTORES");
        rdb_vectores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdb_vectoresStateChanged(evt);
            }
        });

        btn_RespA.setText("Respuesta en A");
        btn_RespA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RespAActionPerformed(evt);
            }
        });

        btn_RespB.setText("Respuesta en B");
        btn_RespB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RespBActionPerformed(evt);
            }
        });

        btn_diagonalA.setText("Matriz Diagonal o Identidad de A");
        btn_diagonalA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_diagonalAMouseClicked(evt);
            }
        });
        btn_diagonalA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diagonalAActionPerformed(evt);
            }
        });

        btn_diagonalB.setText("Matriz Diagonal o Identidad de B");
        btn_diagonalB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_diagonalBMouseClicked(evt);
            }
        });
        btn_diagonalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diagonalBActionPerformed(evt);
            }
        });

        btn_clearA.setText("Limpiar A");
        btn_clearA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearAActionPerformed(evt);
            }
        });

        btn_clearB.setText("Limpiar B");
        btn_clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearBActionPerformed(evt);
            }
        });

        btn_cerosA.setText("Ceros A");
        btn_cerosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerosAActionPerformed(evt);
            }
        });

        btn_identA.setText("Identidad A");
        btn_identA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_identAActionPerformed(evt);
            }
        });

        btn_cerosB.setText("Ceros B");
        btn_cerosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerosBActionPerformed(evt);
            }
        });

        btn_identB.setText("Identidad B");
        btn_identB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_identBActionPerformed(evt);
            }
        });

        btn_randomA.setText("Random A");
        btn_randomA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_randomAActionPerformed(evt);
            }
        });

        btn_randomB.setText("Random B");
        btn_randomB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_randomBActionPerformed(evt);
            }
        });

        btn_switch.setText("<- - ->");
        btn_switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_switchActionPerformed(evt);
            }
        });

        cbx_buscarA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Métodos de Búsqueda-", "Búsqueda Secuencial", "Búsqueda Binaria", "Búsqueda de Hash" }));
        cbx_buscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_buscarAActionPerformed(evt);
            }
        });

        btn_buscarA.setText("Buscar A");
        btn_buscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarAActionPerformed(evt);
            }
        });

        cbx_buscarB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Métodos de Búsqueda-", "Búsqueda Secuencial Interna", "Búsqueda Binaria Interna", "Búsqueda de Hash", "Búsqueda Secuencial Externa", "Búsqueda Binaria Externa" }));

        btn_buscarB.setText("Buscar B");
        btn_buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_inversaA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_escalarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_escalarA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_triangInfA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_RespA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_diagonalA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_idempotenteA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbx_buscarA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbx_ordenarA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_ordenarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_buscarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btn_transpuestaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_triangSupA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdb_matrices)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdb_vectores))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_randomA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_clearA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_cerosA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_identA)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_resta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_suma, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(btn_switch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_clearB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_cerosB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_identB))
                                    .addComponent(btn_randomB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_escalarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_escalarB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_inversaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_transpuestaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbx_buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbx_ordenarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_ordenarB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btn_buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_triangSupB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_triangInfB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_diagonalB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_idempotenteB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_RespB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_matrices)
                    .addComponent(rdb_vectores))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_clearB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cerosB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_identB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_suma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_resta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_switch)
                            .addComponent(btn_randomA)
                            .addComponent(btn_randomB)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_clearA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cerosA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_identA))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_escalarB)
                            .addComponent(txt_escalarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_inversaB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_transpuestaB)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbx_ordenarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ordenarB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbx_buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_buscarB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_escalarA)
                            .addComponent(txt_escalarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_inversaA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_transpuestaA)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_ordenarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ordenarA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_buscarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_triangSupA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_triangInfB)
                    .addComponent(btn_triangInfA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_diagonalB)
                    .addComponent(btn_diagonalA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_idempotenteB)
                    .addComponent(btn_idempotenteA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_RespB)
                    .addComponent(btn_guardar)
                    .addComponent(btn_RespA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int Bfila;
    private void spn_filasBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_filasBStateChanged

        int Bfila = (int) spn_filasB.getValue();
        if (Bfila >= 0) {
            modeloB.setRowCount(Bfila);
            tbl_MatB.setModel(modeloB);
        } else {
            JOptionPane.showMessageDialog(null, "El tamaño de la fila debe ser mayor a cero '0'");
        }
    }//GEN-LAST:event_spn_filasBStateChanged

    int Bcolumna;
    private void spn_columnasBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_columnasBStateChanged
        int Bcolumna = (int) spn_columnasB.getValue();
        if (Bcolumna >= 0) {
            modeloB.setColumnCount(Bcolumna);
            tbl_MatB.setModel(modeloB);
        } else {
            JOptionPane.showMessageDialog(null, "El tamaño de la columna debe ser mayor a cero '0'");
        }
    }//GEN-LAST:event_spn_columnasBStateChanged

    int Afila;
    private void spn_filasAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_filasAStateChanged

        Afila = (int) spn_filasA.getValue();
        if (Afila >= 0) {
            modeloA.setRowCount(Afila);
            tbl_MatA.setModel(modeloA);
        } else {
            JOptionPane.showMessageDialog(null, "El tamaño de la fila debe ser mayor a cero '0'");
        }
    }//GEN-LAST:event_spn_filasAStateChanged

    int Acolumna;
    private void spn_columnasAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_columnasAStateChanged
        
//	tbl_MatA.setTableHeader(new EditableTableHeader(tbl_MatA.getColorModel()));
//        Vector v=new Vector();
        int cont=0;
        
        Acolumna = (int) spn_columnasA.getValue();
        if (Acolumna >= 0) {
            cont++;
//            v.add(cont);
            modeloA.setColumnCount(Acolumna);
            tbl_MatA.setModel(modeloA);
        } else {
            JOptionPane.showMessageDialog(null, "El tamaño de la columna debe ser mayor a cero '0'");
        }
        
    }//GEN-LAST:event_spn_columnasAStateChanged

    private void rdb_matricesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdb_matricesStateChanged
        if (rdb_matrices.isSelected()) {
            cbx_ordenarA.setEnabled(false);
            cbx_ordenarB.setEnabled(false);
            cbx_buscarA.setEnabled(false);
            cbx_buscarB.setEnabled(false);
            btn_buscarA.setEnabled(false);
            btn_buscarB.setEnabled(false);
            btn_ordenarA.setEnabled(false);
            btn_ordenarB.setEnabled(false);
            spn_filasA.setValue(0);
            spn_columnasA.setValue(0);
            spn_filasB.setValue(0);
            spn_columnasB.setValue(0);
            spn_filasA.setEnabled(true);
            lbl_A.setText("MATRIZ A");
            spn_filasB.setEnabled(true);
            lbl_B.setText("MATRIZ B");
            btn_escalarA.setEnabled(true);
            btn_escalarB.setEnabled(true);
            btn_idempotenteA.setEnabled(true);
            btn_idempotenteB.setEnabled(true);
            btn_inversaA.setEnabled(true);
            btn_inversaB.setEnabled(true);
            btn_transpuestaA.setEnabled(true);
            btn_transpuestaB.setEnabled(true);
            btn_triangInfA.setEnabled(true);
            btn_triangInfB.setEnabled(true);
            btn_triangSupA.setEnabled(true);
            btn_triangSupB.setEnabled(true);
            btn_diagonalA.setEnabled(true);
            btn_diagonalB.setEnabled(true);
            btn_suma.setEnabled(true);
            btn_resta.setEnabled(true);
            btn_producto.setEnabled(true);
            txt_escalarA.setEnabled(true);
            txt_escalarB.setEnabled(true);
            btn_identA.setEnabled(true);
            btn_identB.setEnabled(true);
        }
    }//GEN-LAST:event_rdb_matricesStateChanged

    private void rdb_vectoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdb_vectoresStateChanged
        if (rdb_vectores.isSelected()) {
            cbx_ordenarA.setEnabled(true);
            cbx_ordenarB.setEnabled(true);
            cbx_buscarA.setEnabled(true);
            cbx_buscarB.setEnabled(true);
            btn_buscarA.setEnabled(true);
            btn_buscarB.setEnabled(true);
            btn_ordenarA.setEnabled(true);
            btn_ordenarB.setEnabled(true);
            spn_filasA.setValue(1);
            spn_columnasA.setValue(0);
            spn_filasA.setEnabled(false);
            lbl_A.setText("VECTOR A");
            spn_filasB.setValue(1);
            spn_columnasB.setValue(0);
            spn_filasB.setEnabled(false);
            lbl_B.setText("VECTOR B");
            btn_escalarA.setEnabled(false);
            btn_escalarB.setEnabled(false);
            btn_idempotenteA.setEnabled(false);
            btn_idempotenteB.setEnabled(false);
            btn_inversaA.setEnabled(false);
            btn_inversaB.setEnabled(false);
            btn_transpuestaA.setEnabled(false);
            btn_transpuestaB.setEnabled(false);
            btn_triangInfA.setEnabled(false);
            btn_triangInfB.setEnabled(false);
            btn_triangSupA.setEnabled(false);
            btn_triangSupB.setEnabled(false);
            btn_diagonalA.setEnabled(false);
            btn_diagonalB.setEnabled(false);
            btn_suma.setEnabled(false);
            btn_resta.setEnabled(false);
            btn_producto.setEnabled(false);
            txt_escalarA.setEnabled(false);
            txt_escalarB.setEnabled(false);
            btn_identA.setEnabled(false);
            btn_identB.setEnabled(false);
        }
    }//GEN-LAST:event_rdb_vectoresStateChanged

    private void spn_filasAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spn_filasAKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_spn_filasAKeyTyped

    private void btn_ordenarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarAActionPerformed
        int metodo = cbx_ordenarA.getSelectedIndex();
        int tamano = modeloA.getColumnCount();
        int i = 0, j = 0, k = 0, aux = 0, cont = 0;
        int[] vector = new int[tamano];
        modeloC.setRowCount(1);
        modeloC.setColumnCount(tamano);
        tbl_MatResp.setModel(modeloC);
        if (tamano == 0) {
            JOptionPane.showMessageDialog(null, "Genere su vector");
        } else {
            try {
                for (int v = 0; v < tamano; v++) {
                    if (modeloA.getValueAt(0, v) == null) {
                        cont++;
                        break;
                    } else {
                        vector[v] = Integer.parseInt(modeloA.getValueAt(0, v).toString());
                    }
                }
                if (cont == 0) {
                    switch (metodo) {
                        case 1:
                            ordenar.BubbleSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 2:
                            ordenar.SelectionSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 3:
                            ordenar.InsertionSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 4:
                            ordenar.ShellSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 5:
                            ordenar.mergeSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 6:
                            ordenar.quickSort(vector, 0, tamano - 1);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(rootPane, "Seleccione un método de ordenamiento");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_ordenarAActionPerformed

    private void cbx_ordenarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ordenarAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_ordenarAActionPerformed

    private void btn_RespAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RespAActionPerformed
        int filas = modeloC.getRowCount();
        int columnas = modeloC.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            modeloA.setRowCount(filas);
            modeloA.setColumnCount(columnas);
            spn_filasA.setValue(filas);
            spn_columnasA.setValue(columnas);
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    modeloA.setValueAt(modeloC.getValueAt(i, j), i, j);
                }
            }
        }
    }//GEN-LAST:event_btn_RespAActionPerformed

    private void btn_RespBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RespBActionPerformed
        int filas = modeloC.getRowCount();
        int columnas = modeloC.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            spn_filasB.setValue(filas);
            spn_columnasB.setValue(columnas);
            modeloB.setRowCount(filas);
            modeloB.setColumnCount(columnas);
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    modeloB.setValueAt(modeloC.getValueAt(i, j), i, j);
                }
            }
        }
    }//GEN-LAST:event_btn_RespBActionPerformed

    private void txt_escalarAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_escalarAKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_escalarAKeyTyped

    private void txt_escalarBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_escalarBKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_escalarBKeyTyped

    private void btn_ordenarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarBActionPerformed
        int metodo = cbx_ordenarB.getSelectedIndex();
        int tamano = modeloB.getColumnCount();
        int i = 0, j = 0, k = 0, aux = 0, cont = 0;
        int vector[] = new int[tamano];
        modeloC.setRowCount(1);
        modeloC.setColumnCount(tamano);
        tbl_MatResp.setModel(modeloC);
        if (tamano == 0) {
            JOptionPane.showMessageDialog(null, "Genere su vector");
        } else {
            try {
                for (int v = 0; v < tamano; v++) {
                    if (modeloB.getValueAt(0, v) == null) {
                        cont++;
                        break;
                    } else {
                        vector[v] = Integer.parseInt(modeloB.getValueAt(0, v).toString());
                    }
                }
                if (cont == 0) {
                    switch (metodo) {
                        case 1:
                            ordenar.BubbleSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 2:
                            ordenar.SelectionSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 3:
                            ordenar.InsertionSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 4:
                            ordenar.ShellSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 5:
                            ordenar.mergeSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        case 6:
                            ordenar.quickSort(vector, 0, tamano - 1);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(rootPane, "Seleccione un método de ordenamiento");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_btn_ordenarBActionPerformed

    private void btn_triangInfAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_triangInfAActionPerformed
        Afila = modeloB.getRowCount();
        Acolumna = modeloB.getColumnCount();
        int matriza[][];
        int cont = 0;
        matriza = new int[Afila][Acolumna];
        if (Afila == 0 || Acolumna == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if (Afila == Acolumna) {
                int filas = modeloA.getRowCount();
                int columnas = modeloA.getColumnCount();
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matriza.length; i++) {
                        for (int j = 0; j < matriza.length; j++) {
                            if (modeloA.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(tbl_MatA.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        oper.matriztriangularinferior(matriza);

                        for (int i = 0; i < matriza.length; i++) {
                            for (int j = 0; j < matriza.length; j++) {
                                tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        }
    }//GEN-LAST:event_btn_triangInfAActionPerformed

    private void btn_triangSupAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_triangSupAActionPerformed
        Afila = modeloB.getRowCount();
        Acolumna = modeloB.getColumnCount();
        int matriza[][];
        matriza = new int[Afila][Acolumna];
        int cont = 0;
        if (Afila == 0 || Acolumna == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if (Afila == Acolumna) {
                int filas = modeloA.getRowCount();
                int columnas = modeloA.getColumnCount();
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matriza.length; i++) {
                        for (int j = 0; j < matriza.length; j++) {
                            if (modeloA.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(tbl_MatA.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        oper.matriztriangularsuperior(matriza);

                        for (int i = 0; i < matriza.length; i++) {
                            for (int j = 0; j < matriza.length; j++) {
                                tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        }
    }//GEN-LAST:event_btn_triangSupAActionPerformed

    private void btn_triangInfBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_triangInfBActionPerformed
        Bfila = modeloB.getRowCount();
        Bcolumna = modeloB.getColumnCount();
        int matrizb[][];
        matrizb = new int[Bfila][Bcolumna];
        int cont = 0;
        if (Bfila == 0 || Bcolumna == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if (Bfila == Bcolumna) {
                int filas = modeloB.getRowCount();
                int columnas = modeloB.getColumnCount();
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matrizb.length; i++) {
                        for (int j = 0; j < matrizb.length; j++) {
                            if (modeloB.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matrizb[i][j] = Integer.parseInt(tbl_MatB.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        oper.matriztriangularinferior(matrizb);

                        for (int i = 0; i < matrizb.length; i++) {
                            for (int j = 0; j < matrizb.length; j++) {
                                tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }
                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        }
    }//GEN-LAST:event_btn_triangInfBActionPerformed

    private void btn_triangSupBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_triangSupBActionPerformed
        Bfila = modeloB.getRowCount();
        Bcolumna = modeloB.getColumnCount();
        int matrizb[][];
        matrizb = new int[Bfila][Bcolumna];
        int cont = 0;
        if (Bfila == 0 || Bcolumna == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if (Bfila == Bcolumna) {
                int filas = modeloB.getRowCount();
                int columnas = modeloB.getColumnCount();
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matrizb.length; i++) {
                        for (int j = 0; j < matrizb.length; j++) {
                            if (modeloB.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matrizb[i][j] = Integer.parseInt(tbl_MatB.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        oper.matriztriangularsuperior(matrizb);

                        for (int i = 0; i < matrizb.length; i++) {
                            for (int j = 0; j < matrizb.length; j++) {
                                tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }
                } catch (Exception e) {
                    System.err.println("error" + e);
                }

            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        }
    }//GEN-LAST:event_btn_triangSupBActionPerformed

    private void btn_idempotenteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idempotenteAActionPerformed
        Afila = modeloB.getRowCount();
        Acolumna = modeloB.getColumnCount();
        int matriza[][];
        matriza = new int[Afila][Acolumna];
        int cont = 0;
        if (Afila != 0 && Acolumna != 0) {
            if (Afila == Acolumna) {
                int filas = modeloA.getRowCount();
                int columnas = modeloA.getColumnCount();
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matriza.length; i++) {
                        for (int j = 0; j < matriza.length; j++) {
                            if (modeloA.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(tbl_MatA.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        oper.idempotente(matriza, Acolumna);

                        for (int i = 0; i < matriza.length; i++) {
                            for (int j = 0; j < matriza.length; j++) {
                                tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }
                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        }
    }//GEN-LAST:event_btn_idempotenteAActionPerformed

    private void btn_idempotenteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idempotenteBActionPerformed
        Bfila = modeloB.getRowCount();
        Bcolumna = modeloB.getColumnCount();
        int matrizb[][];
        matrizb = new int[Bfila][Bcolumna];
        int cont = 0;
        if (Bfila != 0 && Bcolumna != 0) {
            if (Bfila == Bcolumna) {
                int filas = modeloB.getRowCount();
                int columnas = modeloB.getColumnCount();
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matrizb.length; i++) {
                        for (int j = 0; j < matrizb.length; j++) {
                            if (modeloB.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matrizb[i][j] = Integer.parseInt(tbl_MatB.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        oper.idempotente(matrizb, Bcolumna);

                        for (int i = 0; i < matrizb.length; i++) {
                            for (int j = 0; j < matrizb.length; j++) {
                                tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        }
    }//GEN-LAST:event_btn_idempotenteBActionPerformed

    private void btn_cerosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerosAActionPerformed
        int filas = modeloA.getRowCount();
        int columnas = modeloA.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            try {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (modeloA.getValueAt(i, j) == null) {
                            modeloA.setValueAt("0", i, j);
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_cerosAActionPerformed

    private void btn_clearAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearAActionPerformed
        modeloA.setRowCount(0);
        modeloA.setRowCount(0);
        spn_columnasA.setValue(0);
        spn_filasA.setValue(0);
    }//GEN-LAST:event_btn_clearAActionPerformed

    private void btn_clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearBActionPerformed
        modeloB.setRowCount(0);
        modeloB.setRowCount(0);
        spn_columnasB.setValue(0);
        spn_filasB.setValue(0);
    }//GEN-LAST:event_btn_clearBActionPerformed

    private void btn_cerosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerosBActionPerformed
        int filas = modeloB.getRowCount();
        int columnas = modeloB.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            try {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (modeloB.getValueAt(i, j) == null) {
                            modeloB.setValueAt("0", i, j);
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_cerosBActionPerformed

    private void btn_identAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_identAActionPerformed
        int filas = modeloA.getRowCount();
        int columnas = modeloA.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            try {
                if (filas == columnas) {
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (i == j) {
                                modeloA.setValueAt("1", i, j);
                            } else {
                                modeloA.setValueAt("0", i, j);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_identAActionPerformed

    private void btn_identBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_identBActionPerformed
        int filas = modeloB.getRowCount();
        int columnas = modeloB.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            try {
                if (filas == columnas) {
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (i == j) {
                                modeloB.setValueAt("1", i, j);
                            } else {
                                modeloB.setValueAt("0", i, j);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_identBActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (modeloC.getColumnCount() != 0 || modeloC.getColumnCount() != 0) {
            try {

                String sucursalesCSVFile = "datosTabla.txt";
                BufferedWriter bfw = new BufferedWriter(new FileWriter(sucursalesCSVFile));
                bfw.write("Matriz Respuesta");
                bfw.newLine();
                for (int i = 0; i < tbl_MatResp.getRowCount(); i++) //realiza un barrido por filas.
                {
                    for (int j = 0; j < tbl_MatResp.getColumnCount(); j++) //realiza un barrido por columnas.
                    {
                        bfw.write((tbl_MatResp.getValueAt(i, j)) + "");
                        if (j < tbl_MatResp.getColumnCount() - 1) { //agrega separador "," si no es el ultimo elemento de la fila.
                            bfw.write("\t");
                        }
                    }
                    bfw.newLine(); //inserta nueva linea.
                }

                bfw.close(); //cierra archivo!
                JOptionPane.showMessageDialog(null, "El archivo fue salvado correctamente!");
            } catch (IOException e) {
                System.out.println("ERROR: Ocurrio un problema al salvar el archivo!" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO existe resultado");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_transpuestaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transpuestaAActionPerformed
        int filas = modeloA.getRowCount();
        int columnas = modeloA.getColumnCount();
        int[][] matriz;
        int cont = 0;
        matriz = new int[filas][columnas];
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            try {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (modeloA.getValueAt(i, j) == null) {
                            cont++;
                            break;
                        } else {
                            matriz[i][j] = Integer.parseInt(modeloA.getValueAt(i, j).toString());
                        }
                    }
                }
                if (cont == 0) {
                    modeloC.setRowCount(columnas);
                    modeloC.setColumnCount(filas);
                    tbl_MatResp.setModel(modeloC);
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            modeloC.setValueAt(matriz[i][j], j, i);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_transpuestaAActionPerformed

    private void btn_transpuestaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transpuestaBActionPerformed
        int filas = modeloB.getRowCount();
        int columnas = modeloB.getColumnCount();
        int[][] matriz;
        int cont = 0;
        matriz = new int[filas][columnas];
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            try {
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (modeloB.getValueAt(i, j) == null) {
                            cont++;
                            break;
                        } else {
                            matriz[i][j] = Integer.parseInt(modeloB.getValueAt(i, j).toString());
                        }
                    }
                }
                if (cont == 0) {
                    modeloC.setRowCount(columnas);
                    modeloC.setColumnCount(filas);
                    tbl_MatResp.setModel(modeloC);
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            modeloC.setValueAt(matriz[i][j], j, i);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_transpuestaBActionPerformed

    private void btn_inversaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inversaAActionPerformed
        int matriza[][];
        int filas = modeloA.getRowCount();
        int columnas = modeloA.getColumnCount();
        int cont = 0;
        matriza = new int[filas][columnas];
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if (filas == columnas) {
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matriza.length; i++) {
                        for (int j = 0; j < matriza.length; j++) {
                            if (modeloA.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(modeloA.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        ope.inversa(matriza);

                        for (int i = 0; i < matriza.length; i++) {
                            for (int j = 0; j < matriza.length; j++) {
                                modeloC.setValueAt(String.format("%.3f", ope.matrizc[i][j]), i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        }
    }//GEN-LAST:event_btn_inversaAActionPerformed

    private void btn_inversaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inversaBActionPerformed
        int matriza[][];
        int filas = modeloB.getRowCount();
        int columnas = modeloB.getColumnCount();
        int cont = 0;
        matriza = new int[filas][columnas];
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if (filas == columnas) {
                modeloC.setRowCount(filas);
                modeloC.setColumnCount(columnas);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < matriza.length; i++) {
                        for (int j = 0; j < matriza.length; j++) {
                            if (modeloB.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(modeloB.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        ope.inversa(matriza);

                        for (int i = 0; i < matriza.length; i++) {
                            for (int j = 0; j < matriza.length; j++) {
                                modeloC.setValueAt(String.format("%.3f", ope.matrizc[i][j]), i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada (#Filas = #Columnas)");
            }
        }
    }//GEN-LAST:event_btn_inversaBActionPerformed

    public static int getRandomDoubleBetweenRange(int min, int max) {
        int x = (int) (Math.random() * ((max - (min)) + 1)) + (min);
        return x;
    }

    private void btn_randomAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_randomAActionPerformed
        Random rnd = new Random();
        int filas = modeloA.getRowCount();
        int columnas = modeloA.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    modeloA.setValueAt(getRandomDoubleBetweenRange(-20, 20), i, j);
                }
            }
        }
    }//GEN-LAST:event_btn_randomAActionPerformed

    private void btn_randomBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_randomBActionPerformed
        Random rnd = new Random();
        int filas = modeloB.getRowCount();
        int columnas = modeloB.getColumnCount();
        if (filas == 0 || columnas == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    modeloB.setValueAt(getRandomDoubleBetweenRange(-20, 20), i, j);
                }
            }
        }
    }//GEN-LAST:event_btn_randomBActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        Afila = modeloA.getRowCount();
        Bfila = modeloB.getRowCount();
        Acolumna = modeloA.getColumnCount();
        Bcolumna = modeloB.getColumnCount();
        int matriza[][];
        matriza = new int[Afila][Acolumna];
        int matrizb[][];
        matrizb = new int[Bfila][Bcolumna];
        int cont = 0;
        if (Afila == 0 || Acolumna == 0 || Bfila == 0 || Bcolumna == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if ((Afila == Bfila) && (Bcolumna == Bcolumna)) {
                modeloC.setRowCount(Afila);
                modeloC.setColumnCount(Acolumna);
                tbl_MatResp.setModel(modeloC);

                try {
                    for (int i = 0; i < Afila; i++) {
                        for (int j = 0; j < Acolumna; j++) {
                            if (modeloA.getValueAt(i, j) == null || modeloB.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(tbl_MatA.getValueAt(i, j).toString());
                                matrizb[i][j] = Integer.parseInt(tbl_MatB.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        op.suma(matriza, matrizb, Afila, Acolumna);

                        for (int i = 0; i < Afila; i++) {
                            for (int j = 0; j < Acolumna; j++) {
                                tbl_MatResp.setValueAt(op.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las matrices deben ser de dimensiones iguales");
            }
        }
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        Afila = modeloA.getRowCount();
        Bfila = modeloB.getRowCount();
        Acolumna = modeloA.getColumnCount();
        Bcolumna = modeloB.getColumnCount();
        int matriza[][];
        matriza = new int[Afila][Acolumna];
        int matrizb[][];
        matrizb = new int[Bfila][Bcolumna];
        int cont = 0;
        if (Afila == 0 || Acolumna == 0 || Bfila == 0 || Bcolumna == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if ((Afila == Bfila) && (Bcolumna == Bcolumna)) {
                modeloC.setRowCount(Afila);
                modeloC.setColumnCount(Acolumna);
                tbl_MatResp.setModel(modeloC);

                try {
                    for (int i = 0; i < Afila; i++) {
                        for (int j = 0; j < Acolumna; j++) {
                            if (modeloA.getValueAt(i, j) == null || modeloB.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(tbl_MatA.getValueAt(i, j).toString());
                                matrizb[i][j] = Integer.parseInt(tbl_MatB.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        op.resta(matriza, matrizb, Afila, Acolumna);

                        for (int i = 0; i < Afila; i++) {
                            for (int j = 0; j < Acolumna; j++) {
                                tbl_MatResp.setValueAt(op.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las matrices deben ser de dimensiones iguales");
            }
        }
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productoActionPerformed
        Acolumna = modeloA.getColumnCount();
        Afila = modeloA.getRowCount();
        Bcolumna = modeloB.getColumnCount();
        Bfila = modeloB.getRowCount();
        int matriza[][];
        matriza = new int[Afila][Acolumna];
        int matrizb[][];
        matrizb = new int[Bfila][Bcolumna];
        int cont = 0;
        if (Afila == 0 || Acolumna == 0 || Bfila == 0 || Bcolumna == 0) {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        } else {
            if (Acolumna != Bfila) {
                JOptionPane.showMessageDialog(null, "#Columnas de A != #Filas de B");
            } else {
                modeloC.setColumnCount(Bcolumna);
                modeloC.setRowCount(Afila);
                tbl_MatResp.setModel(modeloC);
                try {
                    for (int i = 0; i < Afila; i++) {
                        for (int j = 0; j < Acolumna; j++) {
                            if (modeloA.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matriza[i][j] = Integer.parseInt(modeloA.getValueAt(i, j).toString());
                            }
                        }
                    }
                    for (int i = 0; i < Bfila; i++) {
                        for (int j = 0; j < Bcolumna; j++) {
                            if (modeloB.getValueAt(i, j) == null) {
                                cont++;
                                break;
                            } else {
                                matrizb[i][j] = Integer.parseInt(modeloB.getValueAt(i, j).toString());
                            }
                        }
                    }
                    if (cont == 0) {
                        op.multiplicacion(matriza, matrizb, Afila, Bcolumna, Bfila);
                        for (int i = 0; i < Afila; i++) {
                            for (int j = 0; j < Bcolumna; j++) {
                                modeloC.setValueAt(op.matrizresult[i][j], i, j);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                    }
                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            }
        }
    }//GEN-LAST:event_btn_productoActionPerformed

    private void btn_escalarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escalarAActionPerformed
        Acolumna = modeloA.getColumnCount();
        Afila = modeloA.getRowCount();
        int matriza[][];
        matriza = new int[Afila][Acolumna];
        int escalar = Integer.parseInt(txt_escalarA.getText().toString());
        int cont = 0;
        if (Afila != 0 && Acolumna != 0) {
            try {
                modeloC.setRowCount(Afila);
                modeloC.setColumnCount(Acolumna);
                tbl_MatResp.setModel(modeloC);
                for (int i = 0; i < Afila; i++) {
                    for (int j = 0; j < Acolumna; j++) {
                        if (modeloA.getValueAt(i, j) == null || txt_escalarA == null) {
                            cont++;
                            break;
                        } else {
                            matriza[i][j] = Integer.parseInt(modeloA.getValueAt(i, j).toString());
                        }
                    }
                }
                if (cont == 0) {
                    op.productoescalar(matriza, escalar, Afila, Acolumna);
                    for (int i = 0; i < Afila; i++) {
                        for (int j = 0; j < Acolumna; j++) {
                            modeloC.setValueAt(op.matrizresult[i][j], i, j);

                        }
                    }
                    txt_escalarA.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        }
    }//GEN-LAST:event_btn_escalarAActionPerformed

    private void btn_escalarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escalarBActionPerformed
        Bcolumna = modeloB.getColumnCount();
        Bfila = modeloB.getRowCount();
        int[][] matrizb;
        matrizb = new int[Bfila][Bcolumna];
        int escalar = Integer.parseInt(txt_escalarB.getText());
        int cont = 0;
        if (Bfila != 0 && Bcolumna != 0) {
            try {
                modeloC.setRowCount(Bfila);
                modeloC.setColumnCount(Bcolumna);
                tbl_MatResp.setModel(modeloC);
                for (int i = 0; i < Bfila; i++) {
                    for (int j = 0; j < Bcolumna; j++) {
                        if (modeloB.getValueAt(i, j) == null || txt_escalarB.getText().equals("") == true) {
                            cont++;
                            break;
                        } else {
                            matrizb[i][j] = Integer.parseInt(modeloB.getValueAt(i, j).toString());
                        }
                    }

                }
                if (cont == 0) {
                    op.productoescalar(matrizb, escalar, Bfila, Bcolumna);
                    for (int i = 0; i < Bfila; i++) {
                        for (int j = 0; j < Bcolumna; j++) {
                            modeloC.setValueAt(op.matrizresult[i][j], i, j);

                        }
                    }
                    txt_escalarB.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        }
    }//GEN-LAST:event_btn_escalarBActionPerformed

    private void btn_switchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_switchActionPerformed
        Acolumna = modeloA.getColumnCount();
        Afila = modeloA.getRowCount();
        Bcolumna = modeloB.getColumnCount();
        Bfila = modeloB.getRowCount();
        int matriza[][];
        matriza = new int[Afila][Acolumna];
        int matrizb[][];
        matrizb = new int[Bfila][Bcolumna];
        try {
            for (int i = 0; i < Afila; i++) {
                for (int j = 0; j < Acolumna; j++) {
                    matriza[i][j] = Integer.parseInt(modeloA.getValueAt(i, j).toString());
                }
            }
            for (int i = 0; i < Bfila; i++) {
                for (int j = 0; j < Bcolumna; j++) {
                    matrizb[i][j] = Integer.parseInt(modeloB.getValueAt(i, j).toString());
                }
            }
            modeloA.setRowCount(Bfila);
            modeloA.setColumnCount(Bcolumna);
            modeloB.setRowCount(Afila);
            modeloB.setColumnCount(Acolumna);
            for (int i = 0; i < Afila; i++) {
                for (int j = 0; j < Acolumna; j++) {
                    modeloB.setValueAt(matriza[i][j], i, j);
                }
            }
            for (int i = 0; i < Bfila; i++) {
                for (int j = 0; j < Bcolumna; j++) {
                    modeloA.setValueAt(matrizb[i][j], i, j);
                }
            }
            spn_filasB.setValue(modeloB.getRowCount());
            spn_columnasB.setValue(modeloB.getColumnCount());
            spn_filasA.setValue(modeloA.getRowCount());
            spn_columnasA.setValue(modeloA.getColumnCount());
        } catch (Exception e) {
            System.err.println("error" + e);
            JOptionPane.showMessageDialog(null, "Imposible Intercambiar");
        }
    }//GEN-LAST:event_btn_switchActionPerformed

    public double[] cargarMatriz(double m[][], double r[]) {

        // recuerde que el metodo de Gauss Jordan trabaja con la idea de convertir la matriz aumentada en la matriz identidad
        for (int i = 0; i <= r.length - 1; i++) {
            double d, c = 0;
            d = m[i][i];// seleccionamos el pivote
            GaussJordan.tar_resol.append(Double.toString(d / 2) + "*fila" + (i + 1) + "\n");// muesra en el area de texto el pivote seleccionado
            for (int s = 0; s <= r.length - 1; s++) {// pasamos a convertir en 1 al pivote seleionado
                m[i][s] = ((m[i][s]) / d);
            }
            r[i] = ((r[i]) / d);

            // paso a mostrar las opraciones realizadas en la matriz aumentada
            for (int j = 0; j < r.length; j++) {

                for (int k = 0; k < r.length; k++) {
                    GaussJordan.tar_resol.append(Double.toString(m[j][k]) + "\t");
                }
                GaussJordan.tar_resol.append("|\t" + Double.toString(r[j]) + "\n");
            }
            GaussJordan.tar_resol.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada

            for (int x = 0; x <= r.length - 1; x++) {
                if (i != x) {
                    c = m[x][i];
                    GaussJordan.tar_resol.append("-" + Double.toString(c) + " * fila" + (i + 1) + "+ fila" + (x + 1) + "\n");// mustra en pantalla las opraciones que se realizaran por fila
                    for (int y = 0; y <= r.length - 1; y++) {// se hace cero a todos los elemntos de la colunma que no sean el pivote
                        m[x][y] = m[x][y] - c * m[i][y];

                    }
                    r[x] = r[x] - c * r[i];

                    // paso a mostrar las opraciones realizadas en la matriz aumentada
                    for (int j = 0; j < r.length; j++) {

                        for (int k = 0; k < r.length; k++) {
                            GaussJordan.tar_resol.append(Double.toString(m[j][k]) + "\t");
                        }
                        GaussJordan.tar_resol.append("|\t" + Double.toString(r[j]) + "\n");
                    }
                    GaussJordan.tar_resol.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada

                }// fin if (i != x)
            }// fin for (int x = 0; x <= r.length - 1; x++)

        }//fin bucle i
        return r;// retorna la solucion l sistema

    }

    private void btn_diagonalAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diagonalAActionPerformed
        try {
            GaussJordan.tar_resol.setText("");
            int n = modeloA.getRowCount();// alamacena el nuemro de ingonitas ingresado por teclado

            double m[][] = new double[n][n];// almacena los coeficientes de la matriz aumentada 
            double r[] = new double[n];// almacena al valor de la solucion de cada ecuacion ejemplo si 2x+4x2=3 entonces debera ingresar el los cuadors  2   4   3   en donde , m[0][1]=2,m[0][2]=4  y   r[0]=3

            for (int i = 0; i < n; i++) {// pasamos a alamcenar en un arreglo los datos ingresados en el JTable
                for (int j = 0; j < n; j++) {//
                    m[i][j] = Double.parseDouble(String.valueOf(tbl_MatA.getValueAt(i, j)));
                }
                r[i] = Double.parseDouble(String.valueOf(tbl_MatA.getValueAt(i, n)));
            }

            double solucion[] = new double[n];// almacena la soluciones del sistema
            r = this.cargarMatriz(m, r);// llamada al metodo a calcula la solucion del sistema de eciones 

            //pasamos a mostrar las soluciones del sistema en el area de texto
            for (int i = 0; i < n; i++) {
                GaussJordan.tar_resol.append("x" + (i + 1) + " = " + r[i] + "\n");
            }
            if (Afila != 0 || Acolumna != 0) {
                jfr.setVisible(true);
            }
        }//fin try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE VALIDACIÓN \n"
                    + "#Filas != #Columnas + 1\n"
                    + "Verifique que el ingreso de tados sea correcto");
        }
    }//GEN-LAST:event_btn_diagonalAActionPerformed

    private void btn_diagonalAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diagonalAMouseClicked
        String matriza[][];
        int valoresa[][];
        matriza = new String[Afila][Acolumna];
        valoresa = new int[matriza.length][matriza.length];

        if (Afila != 0 && Acolumna != 0) {
            try {
                for (int i = 0; i < matriza.length; i++) {
                    for (int j = 0; j < matriza.length; j++) {
                        matriza[i][j] = (String) tbl_MatA.getValueAt(i, j);
                        valoresa[i][j] = Integer.parseInt(matriza[i][j]);
                    }
                }
                o.matidentidad(valoresa);

                for (int i = 0; i < matriza.length; i++) {
                    for (int j = 0; j < matriza.length; j++) {
                        tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                    }
                }

            } catch (Exception e) {
                System.err.println("error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        }
    }//GEN-LAST:event_btn_diagonalAMouseClicked

    private void btn_diagonalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diagonalBActionPerformed
        try {
            GaussJordan.tar_resol.setText("");
            int n = modeloB.getRowCount();// alamacena el nuemro de ingonitas ingresado por teclado

            double m[][] = new double[n][n];// almacena los coeficientes de la matriz aumentada 
            double r[] = new double[n];// almacena al valor de la solucion de cada ecuacion ejemplo si 2x+4x2=3 entonces debera ingresar el los cuadors  2   4   3   en donde , m[0][1]=2,m[0][2]=4  y   r[0]=3

            for (int i = 0; i < n; i++) {// pasamos a alamcenar en un arreglo los datos ingresados en el JTable
                for (int j = 0; j < n; j++) {//
                    m[i][j] = Double.parseDouble(String.valueOf(tbl_MatB.getValueAt(i, j)));
                }
                r[i] = Double.parseDouble(String.valueOf(tbl_MatB.getValueAt(i, n)));
            }
            r = this.cargarMatriz(m, r);// llamada al metodo a calcula la solucion del sistema de eciones
            //pasamos a mostrar las soluciones del sistema en el area de texto
            for (int i = 0; i < n; i++) {
                GaussJordan.tar_resol.append("x" + (i + 1) + " = " + r[i] + "\n");
            }
            if (Bfila != 0 || Bcolumna != 0) {
                jfr.setVisible(true);
            }
        }//fin try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE VALIDACIÓN \n"
                    + "#Filas != #Columnas + 1\n"
                    + "Verifique que el ingreso de tados sea correcto");
        }

    }//GEN-LAST:event_btn_diagonalBActionPerformed

    private void btn_diagonalBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diagonalBMouseClicked
        String matrizb[][];
        int valoresb[][];
        matrizb = new String[Bfila][Bcolumna];
        valoresb = new int[matrizb.length][matrizb.length];
        if (Bfila != 0 && Bcolumna != 0) {
            try {
                for (int i = 0; i < matrizb.length; i++) {
                    for (int j = 0; j < matrizb.length; j++) {
                        matrizb[i][j] = (String) tbl_MatB.getValueAt(i, j);
                        valoresb[i][j] = Integer.parseInt(matrizb[i][j]);
                    }
                }
                o.matidentidad(valoresb);

                for (int i = 0; i < matrizb.length; i++) {
                    for (int j = 0; j < matrizb.length; j++) {
                        tbl_MatResp.setValueAt(oper.matrizresult[i][j], i, j);
                    }
                }

            } catch (Exception e) {
                System.err.println("error" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genere su matriz");
        }
    }//GEN-LAST:event_btn_diagonalBMouseClicked


    
    private void cbx_buscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_buscarAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_buscarAActionPerformed

    private void btn_buscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarAActionPerformed
        Font negrilla = new Font("Helvetica", Font.BOLD, 18);
        int metodo = cbx_buscarA.getSelectedIndex();
        int tamano = modeloA.getColumnCount();
        int i = 0, j = 0, k = 0, aux = 0, cont = 0, dato, id;
        int[] vector = new int[tamano];
        modeloC.setRowCount(1);
        modeloC.setColumnCount(tamano);
        tbl_MatResp.setModel(modeloC);
        if (tamano == 0) {
            JOptionPane.showMessageDialog(null, "Genere su vector");
        } else {
            try {
                for (int v = 0; v < tamano; v++) {
                    if (modeloA.getValueAt(0, v) == null) {
                        cont++;
                        break;
                    } else {
                        vector[v] = Integer.parseInt(modeloA.getValueAt(0, v).toString());
                    }
                }
                if (cont == 0) {
                    switch (metodo) {
                        case 2:
                            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar"));
                            ordenar.BubbleSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            id = buscar.busquedaBinaria(vector, dato);
                            if (id != -1) {
                                if (String.valueOf(tbl_MatA.getValueAt(0, id)).equals(dato)) {
                                    setBackground(Color.red);
                                    tbl_MatA.setFont(negrilla);
                                }
                                JOptionPane.showMessageDialog(null, "Se ha encontrado el numero " + dato + " en la posición " + id);
                            } else {
                                JOptionPane.showMessageDialog(null, dato + " No encontrado");
                            }
                            break;
                        case 1:
                            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar"));
                            ordenar.BubbleSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            id = buscar.busquedaSecuencial(vector, dato);
                            if (id != -1) {
                                if (String.valueOf(tbl_MatA.getValueAt(0, id)).equals(dato)) {
                                    setBackground(Color.red);
                                    tbl_MatA.setFont(negrilla);
                                }
                                JOptionPane.showMessageDialog(null, "Se ha encontrado el numero " + dato + " en la posición " + id);
                            } else {
                                JOptionPane.showMessageDialog(null, dato + " No encontrado");
                            }
                            
                            break;
                        case 3:
                            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar"));
                            ordenar.InsertionSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            id = buscar.busquedaHash(vector, dato);
                            if (id != -1) {
                                if (String.valueOf(tbl_MatA.getValueAt(0, id)).equals(dato)) {
                                    setBackground(Color.red);
                                    tbl_MatA.setFont(negrilla);
                                }
                                JOptionPane.showMessageDialog(null, "Se ha encontrado el numero " + dato + " en la posición " + id);
                            } else {
                                JOptionPane.showMessageDialog(null, dato + " No encontrado");
                            }
                            break;
                        
                        default:
                            JOptionPane.showMessageDialog(getRootPane(), "Seleccione un método de busqueda");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_buscarAActionPerformed

    private void btn_buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarBActionPerformed
        Font negrilla = new Font("Helvetica", Font.BOLD, 18);
        int metodo = cbx_buscarB.getSelectedIndex();
        int tamano = modeloB.getColumnCount();
        int  cont = 0, dato, id;
        int[] vector = new int[tamano];
        modeloC.setRowCount(1);
        modeloC.setColumnCount(tamano);
        tbl_MatResp.setModel(modeloC);
        if (tamano == 0) {
            JOptionPane.showMessageDialog(null, "Genere su vector");
        } else {
            try {
                for (int v = 0; v < tamano; v++) {
                    if (modeloB.getValueAt(0, v) == null) {
                        cont++;
                        break;
                    } else {
                        vector[v] = Integer.parseInt(modeloB.getValueAt(0, v).toString());
                    }
                }
                if (cont == 0) {
                    switch (metodo) {
                        case 2:
                            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar"));
                            ordenar.BubbleSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            id = buscar.busquedaBinaria(vector, dato);
                            if (id != -1) {
                                if (String.valueOf(tbl_MatB.getValueAt(0, id)).equals(dato)) {
                                    setBackground(Color.red);
                                    tbl_MatB.setFont(negrilla);
                                }
                                JOptionPane.showMessageDialog(null, "Se ha encontrado el numero " + dato + " en la posición " + id);
                            } else {
                                JOptionPane.showMessageDialog(null, dato + " No encontrado");
                            }
                            break;
                        case 1:
                            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar"));
                            ordenar.BubbleSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            id = buscar.busquedaSecuencial(vector, dato);
                            if (id != -1) {
                                if (String.valueOf(tbl_MatB.getValueAt(0, id)).equals(dato)) {
                                    setBackground(Color.red);
                                    tbl_MatB.setFont(negrilla);
                                }
                                JOptionPane.showMessageDialog(null, "Se ha encontrado el numero " + dato + " en la posición " + id);
                            } else {
                                JOptionPane.showMessageDialog(null, dato + " No encontrado");
                            }
                            
                            break;
                        case 3:
                            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar"));
                            ordenar.InsertionSort(vector, tamano);
                            for (int v = 0; v < tamano; v++) {
                                modeloC.setValueAt(vector[v], 0, v);
                            }
                            id = buscar.busquedaHash(vector, dato);
                            if (id != -1) {
                                if (String.valueOf(tbl_MatB.getValueAt(0, id)).equals(dato)) {
                                    setBackground(Color.red);
                                    tbl_MatB.setFont(negrilla);
                                }
                                JOptionPane.showMessageDialog(null, "Se ha encontrado el numero " + dato + " en la posición " + id);
                            } else {
                                JOptionPane.showMessageDialog(null, dato + " No encontrado");
                            }
                            break;
                        
                        default:
                            JOptionPane.showMessageDialog(getRootPane(), "Seleccione un método de busqueda");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese bien sus datos");
                }
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
    }//GEN-LAST:event_btn_buscarBActionPerformed

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
            java.util.logging.Logger.getLogger(Matrices_Vectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matrices_Vectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matrices_Vectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matrices_Vectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrices_Vectores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg_modo;
    private javax.swing.JButton btn_RespA;
    private javax.swing.JButton btn_RespB;
    private javax.swing.JButton btn_buscarA;
    private javax.swing.JButton btn_buscarB;
    private javax.swing.JButton btn_cerosA;
    private javax.swing.JButton btn_cerosB;
    private javax.swing.JButton btn_clearA;
    private javax.swing.JButton btn_clearB;
    private javax.swing.JButton btn_diagonalA;
    private javax.swing.JButton btn_diagonalB;
    private javax.swing.JButton btn_escalarA;
    private javax.swing.JButton btn_escalarB;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_idempotenteA;
    private javax.swing.JButton btn_idempotenteB;
    private javax.swing.JButton btn_identA;
    private javax.swing.JButton btn_identB;
    private javax.swing.JButton btn_inversaA;
    private javax.swing.JButton btn_inversaB;
    private javax.swing.JButton btn_ordenarA;
    private javax.swing.JButton btn_ordenarB;
    private javax.swing.JButton btn_producto;
    private javax.swing.JButton btn_randomA;
    private javax.swing.JButton btn_randomB;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_switch;
    private javax.swing.JButton btn_transpuestaA;
    private javax.swing.JButton btn_transpuestaB;
    private javax.swing.JButton btn_triangInfA;
    private javax.swing.JButton btn_triangInfB;
    private javax.swing.JButton btn_triangSupA;
    private javax.swing.JButton btn_triangSupB;
    private javax.swing.JComboBox cbx_buscarA;
    private javax.swing.JComboBox cbx_buscarB;
    private javax.swing.JComboBox cbx_ordenarA;
    private javax.swing.JComboBox cbx_ordenarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_A;
    private javax.swing.JLabel lbl_B;
    private javax.swing.JRadioButton rdb_matrices;
    private javax.swing.JRadioButton rdb_vectores;
    private javax.swing.JSpinner spn_columnasA;
    private javax.swing.JSpinner spn_columnasB;
    private javax.swing.JSpinner spn_filasA;
    private javax.swing.JSpinner spn_filasB;
    private javax.swing.JTable tbl_MatA;
    private javax.swing.JTable tbl_MatB;
    private javax.swing.JTable tbl_MatResp;
    private javax.swing.JTextField txt_escalarA;
    private javax.swing.JTextField txt_escalarB;
    // End of variables declaration//GEN-END:variables
}
