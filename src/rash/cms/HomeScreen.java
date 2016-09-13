/*
 * Copyright (C) 2016 Mohamed Rashad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package rash.cms;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class HomeScreen extends javax.swing.JFrame {

    int row = 0, x = 0;
    int input;
    Dimension dim;
    DefaultTableModel model, model1;

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        deleteEntry = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAll = new javax.swing.JTable();
        truncate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addRecord = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        notes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        history = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        searchQuery = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        patient = new javax.swing.JRadioButton();
        tele = new javax.swing.JRadioButton();
        service = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        id = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        deleteEntry.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        deleteEntry.setText("Delete Entry");
        deleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntryActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        update.setText("Refresh");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new java.awt.BorderLayout());

        tableAll.setBackground(new java.awt.Color(210, 255, 0));
        tableAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableAll.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tableAll.setForeground(new java.awt.Color(7, 7, 7));
        tableAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Notes", "Patient History", "Last Service", "Mobile No.", "Age", "Name", "Patient No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAll.setColumnSelectionAllowed(true);
        tableAll.setFillsViewportHeight(true);
        tableAll.setGridColor(new java.awt.Color(1, 1, 1));
        tableAll.setInheritsPopupMenu(true);
        tableAll.setOpaque(false);
        tableAll.setRowHeight(36);
        tableAll.setRowMargin(3);
        tableAll.setRowSelectionAllowed(false);
        tableAll.setSelectionBackground(new java.awt.Color(17, 229, 246));
        tableAll.setUpdateSelectionOnSort(false);
        jScrollPane3.setViewportView(tableAll);
        tableAll.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAll.getAccessibleContext().setAccessibleName("");

        jPanel5.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        truncate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        truncate.setText("Delete All");
        truncate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truncateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(truncate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEntry)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEntry)
                    .addComponent(update)
                    .addComponent(truncate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("Patient DB", jPanel2);

        jPanel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Mobile NO.");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Age");

        addRecord.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addRecord.setText("Add Patient");
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });

        clearAll.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clearAll.setText("Reset All");
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        number.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        age.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        age.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText(" Last Service");

        notes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        notes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Patient History");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Notes");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Test ", "-------------------", "Test", "Test", "Test", "Test", "---- Test -----", "Test", "Test", " Test ", "Test ", "Test", "Test", "Test", "Test", "Test", " Test", "Test  ", "Test ", "Test ", "------  Test ---------", "Test", "Test ", "---------------------", "Test ", "---------------------", "Test " }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        history.setColumns(20);
        history.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        history.setRows(5);
        jScrollPane5.setViewportView(history);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 199, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addRecord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearAll))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(notes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addRecord)
                            .addComponent(clearAll))
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Add New Patient", jPanel1);

        searchQuery.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        search.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        patient.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        patient.setText("Search by Patient Name");
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });

        tele.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tele.setText("Search by Mobile No.");
        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });

        service.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        service.setText("Search by last service");
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });

        jPanel4.setLayout(new java.awt.BorderLayout());

        tableSearch.setBackground(new java.awt.Color(193, 253, 18));
        tableSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        tableSearch.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tableSearch.setForeground(new java.awt.Color(1, 1, 1));
        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
                      new String [] {
                "Notes", "Patient History", "Last Service", "Mobile No.", "Age", "Name", "Patient No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSearch.setColumnSelectionAllowed(true);
        tableSearch.setRowHeight(36);
        tableSearch.setSelectionBackground(new java.awt.Color(21, 218, 247));
        jScrollPane2.setViewportView(tableSearch);
        tableSearch.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        id.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        id.setText("Search By ID");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(patient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tele)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(service)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(searchQuery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchQuery)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient)
                    .addComponent(tele)
                    .addComponent(service)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search a patient", jPanel3);

        jMenu1.setText("About");

        jMenuItem1.setText("About Developer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("About Rash CMS");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JOptionPane.showOptionDialog(null, "", "About Developer", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        JOptionPane.showOptionDialog(null, "Rash-CMS is a user-friendly, simple cliniq management system for small to medium-sized clinics\n\nFeatures :\n===================\n\n- MySQL Database\n- Display all clients\n- Arabic language\n- Edit entries\n- Remove/Add entries\n- Search by service,number,name\n- Compatible with Linux/Unix/Windows\n\nRash-CMS is an open-source project, signed under General GNU Public License V3.0", "About App", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed
        // TODO add your handling code here:
        history.setText("");
        name.setText("");
        number.setText("");
        age.setText("");
        notes.setText("");
    }//GEN-LAST:event_clearAllActionPerformed

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed

        if ("".equals(age.getText())
                || "".equals(number.getText())
                || "".equals(name.getText())
                || "".equals(history.getText())) {

            JOptionPane.showOptionDialog(null, "Error", "Incomplete Data", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        } else {

            DatabaseManager.insertToDataBase(name.getText(),
                    age.getText(),
                    number.getText(),
                    jComboBox1.getSelectedItem().toString(),
                    history.getText(),
                    notes.getText());

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            displayDataAtAllTable();
        }
    }//GEN-LAST:event_addRecordActionPerformed

    private void truncateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truncateActionPerformed

        input = JOptionPane.showOptionDialog(null, " Truncate DB ? ", "Truncate DB", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if (input == JOptionPane.OK_OPTION) {

            DatabaseManager.truncateTable();

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            displayDataAtAllTable();

        }

    }//GEN-LAST:event_truncateActionPerformed

    private void deleteEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEntryActionPerformed

        input = JOptionPane.showOptionDialog(null, " Delete Selected Entry? ", "Delete Entry", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if (input == JOptionPane.OK_OPTION) {

            model.getValueAt(row, 2);
            String x = String.valueOf(model.getValueAt(row, 6));

            System.err.println(x);
            DatabaseManager.deleteFromDatabase(x);

            model.removeRow(row);
            tableAll.setModel(model);

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            displayDataAtAllTable();

        }

    }//GEN-LAST:event_deleteEntryActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
        service.setSelected(false);
        tele.setSelected(false);
        id.setSelected(false);

    }//GEN-LAST:event_patientActionPerformed

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
        patient.setSelected(false);
        service.setSelected(false);
        id.setSelected(false);

    }//GEN-LAST:event_teleActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        // TODO add your handling code here:
        patient.setSelected(false);
        tele.setSelected(false);
        id.setSelected(false);
    }//GEN-LAST:event_serviceActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        int i = 0;

        while (model1.getRowCount() > 0) {
            model1.removeRow(0);
        }

        if (patient.isSelected()) {

            displaySearch("name", searchQuery.getText());

        } else if (service.isSelected()) {

            displaySearch("service", searchQuery.getText());

        } else if (tele.isSelected()) {

            displaySearch("number", searchQuery.getText());

        } else if (id.isSelected()) {

            displaySearch("id", searchQuery.getText());

        }

    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        displayDataAtAllTable();


    }//GEN-LAST:event_updateActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        service.setSelected(false);
        tele.setSelected(false);
        patient.setSelected(false);
    }//GEN-LAST:event_idActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        x++;

        if (x % 2 == 0) {

            System.err.println("Duplicate");

        } else if (x % 2 > 0) {

            if (history.getText().isEmpty()) {

                jComboBox1.getSelectedItem().toString();

                history.append(jComboBox1.getSelectedItem().toString() + "   --  " + getCurrentTimeStamp());

            } else {

                jComboBox1.getSelectedItem().toString();

                history.append("\n\n\n\n" + jComboBox1.getSelectedItem().toString() + "   --  " + getCurrentTimeStamp());

            }

        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    public void setGraphics() {

        dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

        model = (DefaultTableModel) tableAll.getModel();
        model1 = (DefaultTableModel) tableSearch.getModel();

        tableSearch.setColumnSelectionAllowed(false);
        tableSearch.setRowSelectionAllowed(true);

        tableAll.setColumnSelectionAllowed(false);
        tableAll.setRowSelectionAllowed(true);

    }

    public void displayDataAtAllTable() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        this.history.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        for (int i = 0; i < tableAll.getColumnCount(); i++) {
            tableAll.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
        }

        for (int i = 0; i < tableAll.getColumnCount(); i++) {
            tableSearch.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
        }

        model = (DefaultTableModel) tableAll.getModel();

        model1 = (DefaultTableModel) tableSearch.getModel();

        while (model1.getRowCount() > 0) {
            model1.removeRow(0);
        }

        Vector< Vector<String>> dataFromDatabase = DatabaseManager.selectFromDatabase();

        int i = 0;

        for (Vector<String> v : dataFromDatabase) {

            model.insertRow(i, v);
            i++;
        }

        tableAll.setModel(model);

///////////////////////////////////////////////////////////////////////////////
        tableAll.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent me) {

                JTable table = (JTable) me.getSource();

                Point p = me.getPoint();

                row = table.rowAtPoint(p);

                if (me.getClickCount() == 2 && !me.isConsumed()) {

                    model.getValueAt(row, 2);
                    //TODO ADD Profile
                    PatientDataDisplay pdd = new PatientDataDisplay(String.valueOf(model.getValueAt(row, 5)),
                            String.valueOf(model.getValueAt(row, 4)),
                            String.valueOf(model.getValueAt(row, 3)),
                            String.valueOf(model.getValueAt(row, 2)),
                            String.valueOf(model.getValueAt(row, 1)),
                            String.valueOf(model.getValueAt(row, 0)),
                            Integer.parseInt(String.valueOf(model.getValueAt(row, 6))));

                    pdd.setTitle("Client Profile");
                    pdd.setResizable(false);
                    pdd.setVisible(true);
                    pdd.setGraphics();
                    pdd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    me.consume();
                }
            }

        });

    }

    public void displaySearch(String arg, String str) {

        Vector< Vector<String>> dataFromDatabase = DatabaseManager.searchDatabase(arg, str);

        model1 = (DefaultTableModel) tableSearch.getModel();

        int i = 0;

        for (Vector<String> v : dataFromDatabase) {

            model1.insertRow(i, v);
            i++;
        }

        tableSearch.setModel(model1);

///////////////////////////////////////////////////////////////////////////////
        tableSearch.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent me) {

                JTable table = (JTable) me.getSource();

                Point p = me.getPoint();

                row = table.rowAtPoint(p);

                if (me.getClickCount() == 2 && !me.isConsumed()) {

                    //TODO ADD Profile


                    PatientDataDisplay pdd = new PatientDataDisplay(String.valueOf(model1.getValueAt(row, 5)),
                            String.valueOf(model1.getValueAt(row, 4)),
                            String.valueOf(model1.getValueAt(row, 3)),
                            String.valueOf(model1.getValueAt(row, 2)),
                            String.valueOf(model1.getValueAt(row, 1)),
                            String.valueOf(model1.getValueAt(row, 0)),
                            Integer.parseInt(String.valueOf(model1.getValueAt(row, 6))));

                    pdd.setTitle("Client Profile");
                    pdd.setResizable(false);
                    pdd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    pdd.setGraphics();
                    pdd.setVisible(true);

                    me.consume();

                }
            }

        });

    }

    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecord;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton deleteEntry;
    private javax.swing.JTextArea history;
    private javax.swing.JRadioButton id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField notes;
    private javax.swing.JTextField number;
    private javax.swing.JRadioButton patient;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchQuery;
    private javax.swing.JRadioButton service;
    private javax.swing.JTable tableAll;
    private javax.swing.JTable tableSearch;
    private javax.swing.JRadioButton tele;
    private javax.swing.JButton truncate;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
