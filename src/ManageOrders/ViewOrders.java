/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewOrders.java
 *
 * Created on Jul 10, 2016, 7:09:06 PM
 */
package ManageOrders;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import sreekrishnacaters.Dashboard;

/**
 *
 * @author kakes
 */
public class ViewOrders extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrders
     */
    public ViewOrders() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        place = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();
        phone2 = new javax.swing.JTextField();
        phone3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        rice = new javax.swing.JLabel();
        injicurry = new javax.swing.JLabel();
        lemonPickle = new javax.swing.JLabel();
        mangoPickle = new javax.swing.JLabel();
        pachadi = new javax.swing.JLabel();
        oolan = new javax.swing.JLabel();
        kichadi = new javax.swing.JLabel();
        thoran = new javax.swing.JLabel();
        kaalan = new javax.swing.JLabel();
        kootucurry = new javax.swing.JLabel();
        kattiparipp = new javax.swing.JLabel();
        saambar = new javax.swing.JLabel();
        rasam = new javax.swing.JLabel();
        sambaaram = new javax.swing.JLabel();
        masaalacurry = new javax.swing.JLabel();
        aviyal = new javax.swing.JLabel();
        pappadam = new javax.swing.JLabel();
        njalipoovan = new javax.swing.JLabel();
        kaayavaruthath = new javax.swing.JLabel();
        sarkkarapuratti = new javax.swing.JLabel();
        paalada = new javax.swing.JLabel();
        suchigothamb = new javax.swing.JLabel();
        paripp = new javax.swing.JLabel();
        water = new javax.swing.JLabel();
        paperRoll = new javax.swing.JLabel();
        paperGlass = new javax.swing.JLabel();
        ellunda = new javax.swing.JLabel();
        parippVada = new javax.swing.JLabel();
        vilambu = new javax.swing.JLabel();
        vazhayila = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "NAME", "COUNT", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        jLabel1.setText("Place");

        jLabel2.setText("Phone1");

        jLabel3.setText("Phone2");

        jLabel4.setText("Phone3");

        jLabel5.setText("Address");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("            Food Details");

        rice.setText("Place");

        injicurry.setText("Place");

        lemonPickle.setText("Place");

        mangoPickle.setText("Place");

        pachadi.setText("Place");

        oolan.setText("Place");

        kichadi.setText("Place");

        thoran.setText("Place");

        kaalan.setText("Place");

        kootucurry.setText("Place");

        kattiparipp.setText("Place");

        saambar.setText("Place");

        rasam.setText("Place");

        sambaaram.setText("Place");

        masaalacurry.setText("Place");

        aviyal.setText("Place");

        pappadam.setText("Place");

        njalipoovan.setText("Place");

        kaayavaruthath.setText("Place");

        sarkkarapuratti.setText("Place");

        paalada.setText("Place");

        suchigothamb.setText("Place");

        paripp.setText("Place");

        water.setText("Place");

        paperRoll.setText("Place");

        paperGlass.setText("Place");

        ellunda.setText("Place");

        parippVada.setText("Place");

        vilambu.setText("Place");

        vazhayila.setText("Place");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(phone2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(place, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pachadi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oolan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kichadi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(thoran, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rice, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lemonPickle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(injicurry, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mangoPickle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sambaaram, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(kattiparipp, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                                .addComponent(kootucurry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(masaalacurry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(78, 78, 78))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(saambar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rasam, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(aviyal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kaalan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pappadam, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(njalipoovan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paripp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kaayavaruthath, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sarkkarapuratti, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paalada, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suchigothamb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(paperRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(paperGlass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vazhayila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ellunda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(parippVada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vilambu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(water, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(phone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(phone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rice)
                            .addComponent(kaalan)
                            .addComponent(pappadam)
                            .addComponent(vazhayila))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(injicurry)
                            .addComponent(aviyal)
                            .addComponent(njalipoovan)
                            .addComponent(paperRoll))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lemonPickle)
                            .addComponent(masaalacurry)
                            .addComponent(kaayavaruthath)
                            .addComponent(paperGlass))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mangoPickle)
                            .addComponent(kootucurry)
                            .addComponent(sarkkarapuratti)
                            .addComponent(ellunda))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pachadi)
                            .addComponent(kattiparipp)
                            .addComponent(paalada)
                            .addComponent(parippVada))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oolan)
                            .addComponent(saambar)
                            .addComponent(suchigothamb)
                            .addComponent(vilambu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kichadi)
                            .addComponent(rasam)
                            .addComponent(paripp)
                            .addComponent(water))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thoran)
                            .addComponent(sambaaram))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadAllOrdersAndDisplayInTable() {
        Dbcon dbcon = new Dbcon();
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        try {

            ResultSet rs = dbcon.select("select * from tbl_user order by user_id desc");
            while (rs.next()) {
                dt.addRow(new String[]{getFormatedDate(rs.getString(4),"MMMM dd YYYY"), rs.getString(2), rs.getString(5), rs.getString(1)});
            }
            jTable1.setModel(dt);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearAll() {
        place.setText("");
        phone1.setText("");
        phone2.setText("");
        phone3.setText("");
        address.setText("");
        rice.setText("");
        injicurry.setText("");
        lemonPickle.setText("");
        mangoPickle.setText("");
        pachadi.setText("");
        oolan.setText("");
        kichadi.setText("");
        thoran.setText("");
        kaalan.setText("");
        aviyal.setText("");
        masaalacurry.setText("");
        kootucurry.setText("");
        kattiparipp.setText("");
        saambar.setText("");
        rasam.setText("");
        sambaaram.setText("");
        pappadam.setText("");
        njalipoovan.setText("");
        kaayavaruthath.setText("");
        sarkkarapuratti.setText("");
        paalada.setText("");
        suchigothamb.setText("");
        paripp.setText("");
        water.setText("");
        vazhayila.setText("");
        paperRoll.setText("");
        paperGlass.setText("");
        ellunda.setText("");
        parippVada.setText("");
        vilambu.setText("");

    }
     private String getFormatedDate(String dateString, String format) {
        long dateMilli = Long.parseLong(dateString);

        Date date = new Date(dateMilli);
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        String formatted = formatter.format(date);

        System.out.println("formatted " + formatted);
        return formatted;
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        clearAll();
        loadAllOrdersAndDisplayInTable();

    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        clearAll();
        Dbcon dbcon = new Dbcon();
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        //JOptionPane.showMessageDialog(rootPane,id);

        ResultSet rs = dbcon.select("select * from tbl_user where user_id='" + id + "'");
        String place1, phon1, phon2, phon3, address1;
        try {
            if (rs.next()) {
                place1 = rs.getString(3);
                place.setText(place1);
                phon1 = rs.getString(8);
                phone1.setText(phon1);
                phon2 = rs.getString(9);
                phone2.setText(phon2);
                phon3 = rs.getString(10);
                phone3.setText(phon3);
                address1 = rs.getString(7);
                address.setText(address1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet r = dbcon.select("select * from tbl_food where order_id='" + id + "'");
        String ri, inji, lemon, mango, pachdi, olan, kichdi, toran, kalan, avial, masalacurry, kotucurry, kattiparip, sambar, rasm, sambaram, papadam;
        String njalipovan, kayavaruthath, sarkarapuratti, palada, suchi, parip, watr, vazha, roll, glass, unda, vada, pathrangal;
        try {
            if (r.next()) {
                ri = r.getString(3);
                rice.setText(ri);
                inji = r.getString(4);
                //System.out.println(inji);
                if (inji.equals("true")) {
                    injicurry.setText("inji curry");
                }
                lemon = r.getString(5);
                if (lemon.equals("true")) {
                    lemonPickle.setText("lemon pickle");
                }
                mango = r.getString(6);
                if (mango.equals("true")) {
                    mangoPickle.setText("mango pickle");
                }
                pachdi = r.getString(7);
                if (pachdi.equals("true")) {
                    pachadi.setText("pachadi");
                }
                olan = r.getString(8);
                if (olan.equals("true")) {
                    oolan.setText("oolan");
                }
                kichdi = r.getString(9);
                if (kichdi.equals("true")) {
                    kichadi.setText("kichadi");
                }
                toran = r.getString(10);
                if (toran.equals("true")) {
                    thoran.setText("thoran");
                }
                kalan = r.getString(11);
                if (kalan.equals("true")) {
                    kaalan.setText("kaalan");
                }
                avial = r.getString(12);
                if (avial.equals("true")) {
                    aviyal.setText("oolan");
                }
                masalacurry = r.getString(13);
                if (masalacurry.equals("true")) {
                    masaalacurry.setText("masaala curry");
                }
                kotucurry = r.getString(14);
                if (kotucurry.equals("true")) {
                    kootucurry.setText("kootu curry");
                }
                kattiparip = r.getString(15);
                if (kattiparip.equals("true")) {
                    kattiparipp.setText("kaalan");
                }
                sambar = r.getString(16);
                if (sambar.equals("true")) {
                    saambar.setText("saambar");
                }
                rasm = r.getString(17);
                if (rasm.equals("true")) {
                    rasam.setText("rasam");
                }
                sambaram = r.getString(18);
                if (sambaram.equals("true")) {
                    sambaaram.setText("sambaaram");
                }
                papadam = r.getString(19);
                if (papadam.equals("true")) {
                    pappadam.setText("pappadam");
                }
                njalipovan = r.getString(20);
                if (njalipovan.equals("true")) {
                    njalipoovan.setText("njalipoovan pazham");
                }
                kayavaruthath = r.getString(21);
                if (kayavaruthath.equals("true")) {
                    kaayavaruthath.setText("kaayavaruthath");
                }
                sarkarapuratti = r.getString(22);
                if (sarkarapuratti.equals("true")) {
                    sarkkarapuratti.setText("sarkkarapuratti");
                }
                palada = r.getString(23);
                if (palada.equals("true")) {
                    paalada.setText("paalada");
                }
                suchi = r.getString(24);
                if (suchi.equals("true")) {
                    suchigothamb.setText("suchigothambu payasam");
                }
                parip = r.getString(25);
                if (parip.equals("true")) {
                    paripp.setText(" paripp payasam");
                }
                watr = r.getString(26);
                if (watr.equals("true")) {
                    water.setText("water");
                }
                vazha = r.getString(27);
                if (vazha.equals("true")) {
                    vazhayila.setText("vazhayila");
                }
                roll = r.getString(28);
                if (roll.equals("true")) {
                    paperRoll.setText("paper roll");
                }
                glass = r.getString(29);
                if (glass.equals("true")) {
                    paperGlass.setText("paper glass");
                }
                unda = r.getString(30);
                if (unda.equals("true")) {
                    ellunda.setText(" ellunda");
                }
                vada = r.getString(31);
                if (vada.equals("true")) {
                    parippVada.setText("paripp vada");
                }
                pathrangal = r.getString(32);
                if (pathrangal.equals("true")) {
                    vilambu.setText("vilambu pathrangal");
                }
            }

        } catch (SQLException ex) {

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dashboard dashboard=new Dashboard();
        dashboard.setVisible(true);
                
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewOrders().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel aviyal;
    private javax.swing.JLabel ellunda;
    private javax.swing.JLabel injicurry;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kaalan;
    private javax.swing.JLabel kaayavaruthath;
    private javax.swing.JLabel kattiparipp;
    private javax.swing.JLabel kichadi;
    private javax.swing.JLabel kootucurry;
    private javax.swing.JLabel lemonPickle;
    private javax.swing.JLabel mangoPickle;
    private javax.swing.JLabel masaalacurry;
    private javax.swing.JLabel njalipoovan;
    private javax.swing.JLabel oolan;
    private javax.swing.JLabel paalada;
    private javax.swing.JLabel pachadi;
    private javax.swing.JLabel paperGlass;
    private javax.swing.JLabel paperRoll;
    private javax.swing.JLabel pappadam;
    private javax.swing.JLabel paripp;
    private javax.swing.JLabel parippVada;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField phone2;
    private javax.swing.JTextField phone3;
    private javax.swing.JTextField place;
    private javax.swing.JLabel rasam;
    private javax.swing.JLabel rice;
    private javax.swing.JLabel saambar;
    private javax.swing.JLabel sambaaram;
    private javax.swing.JLabel sarkkarapuratti;
    private javax.swing.JLabel suchigothamb;
    private javax.swing.JLabel thoran;
    private javax.swing.JLabel vazhayila;
    private javax.swing.JLabel vilambu;
    private javax.swing.JLabel water;
    // End of variables declaration//GEN-END:variables
}
