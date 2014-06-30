/**
 * Frame to create or edit a process
 */
package IHM.frameObject;

import java.awt.Toolkit;
import java.sql.Date;
import java.util.*;
import javax.swing.*;
import myObject.*;

/**
 *
 * @author Mary
 */
public class FrameProcessOrCpability extends javax.swing.JFrame {

    private myObject.Process process;
    private Capability capability;
    private String type;
    
    /**
     * Creates new form FrameProcess when user create a new process
     */
    public FrameProcessOrCpability(){
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public FrameProcessOrCpability(String type) {
        this.type = type;
        if(type.equals("Quartier")){
            process = new myObject.Process();
            this.setTitle("Nouveau quartier");
        }
        else if(type.equals("Ilot")){
            capability = new Capability();
            this.setTitle("Nouveau ilot");   
        }
        initComponents();
        if(type.equals("Ilot")){
            jLabelSupportSegment.setText("Support du quartier");
            jLabelSoutient.setText("Application soutient");
            jButtonAddCapability.setText("Ajouter une apllication");
            jButtonRemoveCapability.setText("Supprimer une application");
        }
        setIcon();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jButtonAddCapability.setEnabled(false);
        jButtonRemoveCapability.setEnabled(false);
    }
    
    /**
     * Creates new form FrameProcess when user update a existing process
     * @param process process to update
     */
    public FrameProcessOrCpability(myObject.Process process){
        type = "Quartier";
        this.process = process;
        initComponents();
        this.setTitle("Modifier quartier");
        loadValue();
        this.setResizable(false);
    }
        
    public FrameProcessOrCpability(Capability capability){
        type = "Ilot";
        this.capability = capability;
        initComponents();
        this.setTitle("Modifier ilot");
        loadValue();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capability1 = new myObject.Capability();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jLabelValId = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelResponsible = new javax.swing.JLabel();
        jComboBoxResponsible = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxResponsibleDeputy = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelSupportSegment = new javax.swing.JLabel();
        jComboBoxSupportSegment = new javax.swing.JComboBox();
        jLabelSoutient = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCapability = new javax.swing.JList();
        jButtonAddCapability = new javax.swing.JButton();
        jButtonRemoveCapability = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelValidFrom = new javax.swing.JLabel();
        jCalendarComboBoxValidFrom = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel3 = new javax.swing.JLabel();
        jCalendarComboBoxValidUnitl = new de.wannawork.jcalendar.JCalendarComboBox();
        jButtonCreate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelName.setText("Nom");

        jLabelId.setText("ID");

        jLabelValId.setText("ValId");

        jLabelDescription.setText("Description");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelValId))
                    .addComponent(jLabelName)
                    .addComponent(jLabelId)
                    .addComponent(jLabelDescription)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelValId)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("General Information", jPanel1);

        jLabelResponsible.setText("Responsable");

        jComboBoxResponsible.setModel(new javax.swing.DefaultComboBoxModel(data.IHM.DataIHM.loadResponsible()));

        jLabel1.setText("Responsable suppléant");

        jComboBoxResponsibleDeputy.setModel(new javax.swing.DefaultComboBoxModel(data.IHM.DataIHM.loadResponsible()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelResponsible)
                    .addComponent(jComboBoxResponsible, 0, 200, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxResponsibleDeputy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResponsible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxResponsible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxResponsibleDeputy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Organisation", jPanel2);

        jLabelSupportSegment.setText("Supporte la zone");

        if(type.equals("Quartier")){
            jComboBoxSupportSegment.setModel(new javax.swing.DefaultComboBoxModel(data.IHM.DataIHM.getListAllSegment()));
        }
        else if(type.equals("Ilot")){
            jComboBoxSupportSegment.setModel(new javax.swing.DefaultComboBoxModel(data.IHM.DataIHM.getListAllProcess()));
        }
        jComboBoxSupportSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSupportSegmentActionPerformed(evt);
            }
        });

        jLabelSoutient.setText("Ilots soutient");

        if(type.equals("Quartier")){
            jListCapability.setModel(new javax.swing.DefaultListModel() {
                Capability[] tabCapability = process.getListCapability().toArray(new Capability[process.getListCapability().size()]);
                public int getSize() { return tabCapability.length; }
                public Object getElementAt(int i) { return tabCapability[i]; }
            });
        }else if(type.equals("Ilot")){
            capability.setListApplication(data.IHM.DataIHM.getListApplication(capability.getId()));
            jListCapability.setModel(new javax.swing.DefaultListModel() {
                Application[] tabApplication = capability.getListApplication().toArray(new Application[capability.getListApplication().size()]);
                public int getSize() { return tabApplication.length; }
                public Object getElementAt(int i) { return tabApplication[i]; }
            });
        }
        jScrollPane2.setViewportView(jListCapability);

        jButtonAddCapability.setText("Ajouter ilot");
        jButtonAddCapability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCapabilityActionPerformed(evt);
            }
        });

        jButtonRemoveCapability.setText("Supprimer ilot");
        jButtonRemoveCapability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveCapabilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSupportSegment)
                    .addComponent(jComboBoxSupportSegment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoutient)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButtonAddCapability)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemoveCapability))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSupportSegment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSupportSegment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSoutient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddCapability)
                    .addComponent(jButtonRemoveCapability))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Architecture", jPanel3);

        jLabelValidFrom.setText("Date de début");

        jLabel3.setText("Date de fin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelValidFrom)
                    .addComponent(jCalendarComboBoxValidFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jCalendarComboBoxValidUnitl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelValidFrom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalendarComboBoxValidFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalendarComboBoxValidUnitl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lifecycle", jPanel4);

        jButtonCreate.setText("Valider");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Annuler");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButtonCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancel)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonCancel))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSupportSegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSupportSegmentActionPerformed
        // TODO add your handling code here:
        //A supprimer
    }//GEN-LAST:event_jComboBoxSupportSegmentActionPerformed

    /**
     * Create or update a process
     * @param evt 
     */
    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        if(type.equals("Quartier")){
            if(process.getName() == null){
                process = new myObject.Process(jTextFieldName.getText(), jTextAreaDescription.getText(),
                        new Date (jCalendarComboBoxValidFrom.getDate().getTime()), new Date (jCalendarComboBoxValidUnitl.getDate().getTime()),
                        (Segment) jComboBoxSupportSegment.getSelectedItem(), (Responsible) jComboBoxResponsible.getSelectedItem(), 
                        (Responsible) jComboBoxResponsibleDeputy.getSelectedItem(), new ArrayList<Capability>());
                process.createObject();
                JOptionPane.showMessageDialog(null,"Quartier " + process.getName() + " créer");
                this.dispose();


            }else{
               process.setName(jTextFieldName.getText());
               process.setDescription(jTextAreaDescription.getText());
               process.setValidFrom(new Date (jCalendarComboBoxValidFrom.getDate().getTime()));
               process.setValideUntil(new Date (jCalendarComboBoxValidUnitl.getDate().getTime()));
               process.setSegment((Segment) jComboBoxSupportSegment.getSelectedItem());
               process.setResponsible((Responsible) jComboBoxResponsible.getSelectedItem());
               process.setResponsibleDeputy((Responsible) jComboBoxResponsibleDeputy.getSelectedItem());
               process.updateObject();
               JOptionPane.showMessageDialog(null,"Quartier " + process.getName() + " modifier");
               this.dispose();
            }
        }else if(type.equals("Ilot")){
            if(capability.getName() == null){
                capability = new Capability((myObject.Process) jComboBoxSupportSegment.getSelectedItem(),jTextFieldName.getText(), jTextAreaDescription.getText(),
                        new Date (jCalendarComboBoxValidFrom.getDate().getTime()), new Date (jCalendarComboBoxValidUnitl.getDate().getTime()),
                        (Responsible) jComboBoxResponsible.getSelectedItem(), 
                        (Responsible) jComboBoxResponsibleDeputy.getSelectedItem(), new ArrayList<Application>());
                capability.createObject();
                JOptionPane.showMessageDialog(null,"Ilot " + capability.getName() + " créer");
                this.dispose();
            }else{
               capability.setName(jTextFieldName.getText());
               capability.setDescription(jTextAreaDescription.getText());
               capability.setValidFrom(new Date (jCalendarComboBoxValidFrom.getDate().getTime()));
               capability.setValideUntil(new Date (jCalendarComboBoxValidUnitl.getDate().getTime()));
               capability.setProcess((myObject.Process) jComboBoxSupportSegment.getSelectedItem());
               capability.setResponsible((Responsible) jComboBoxResponsible.getSelectedItem());
               capability.setResponsibleDeputy((Responsible) jComboBoxResponsibleDeputy.getSelectedItem());
               capability.updateObject();
               JOptionPane.showMessageDialog(null,"Ilot " + capability.getName() + " modifier");
               this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    /**
     * To add a capability, call a new frame
     * @param evt 
     */
    private void jButtonAddCapabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCapabilityActionPerformed
        // TODO add your handling code here:
        if(type.equals("Quartier")){
            if(process.getName() != null){
                FrameAssoToObject win = new FrameAssoToObject(process);
                win.setVisible(true);
                win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }else{
                JOptionPane.showMessageDialog(null,"Merci de d'abord valider la création de votre quartier");
            }
        }else if(type.equals("Ilot")){
            
        }
    }//GEN-LAST:event_jButtonAddCapabilityActionPerformed

    /**
     * Windows reload her-self the list of capability in the Jlist
     * @param evt 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(type.equals("Quartier")){
            process.setListCapability(data.IHM.DataIHM.getCapability(process.getId()));
            jListCapability.setModel(new javax.swing.DefaultListModel() {
                Capability[] tabCapability = process.getListCapability().toArray(new Capability[process.getListCapability().size()]);
                public int getSize() { return tabCapability.length; }
                public Object getElementAt(int i) { return tabCapability[i]; }
            });
        }else if(type.equals("Ilot")){
            capability.setListApplication(data.IHM.DataIHM.getListApplication(capability.getId()));
            jListCapability.setModel(new javax.swing.DefaultListModel() {
                Application[] tabApplication = capability.getListApplication().toArray(new Application[capability.getListApplication().size()]);
                public int getSize() { return tabApplication.length; }
                public Object getElementAt(int i) { return tabApplication[i]; }
            });
        }
        
    }//GEN-LAST:event_formWindowActivated

    /**
     * To remove a capability, call a new frame
     * @param evt 
     */
    private void jButtonRemoveCapabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveCapabilityActionPerformed
        // TODO add your handling code here:
        if(process != null){
            if(jListCapability.getSelectedValue() == null)
            {
                JOptionPane.showMessageDialog(null,"Choisiez d'abord un ilot à enelver");
            }else{
                int dialogResult = JOptionPane.showConfirmDialog (null, "Voulez vous vraiment dissocier " + jListCapability.getSelectedValue() + 
                                                                   " à votre quariter " + process.getName() + " ?");
                if(dialogResult == JOptionPane.YES_OPTION){
                   Capability capability = (Capability) jListCapability.getSelectedValue();
                   data.database.CrudDatabase.updateAssoCapabilityToProcess(capability);
                   JOptionPane.showMessageDialog(null, "Association supprimée");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Merci de d'abord valider la création de votre quartier");
        }
    }//GEN-LAST:event_jButtonRemoveCapabilityActionPerformed

    /**
     * Close the frame
     * @param evt 
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * load the value of the process
     */
    private void loadValue() {
        if(type.equals("Quartier")){
            jTextFieldName.setText(process.getName());
            jLabelValId.setText(Integer.toString(process.getId()));
            jTextAreaDescription.setText(process.getDescription());
            jComboBoxResponsible.setSelectedItem(process.getResponsible());
            jComboBoxResponsibleDeputy.setSelectedItem(process.getResponsibleDeputy());
            jComboBoxSupportSegment.setSelectedItem(process.getSegment());
            jCalendarComboBoxValidFrom.setDate(process.getValidFrom());
            jCalendarComboBoxValidUnitl.setDate(process.getValideUntil());
        }else if(type.equals("Ilot")){
            jTextFieldName.setText(capability.getName());
            jLabelValId.setText(Integer.toString(capability.getId()));
            jTextAreaDescription.setText(capability.getDescription());
            jComboBoxResponsible.setSelectedItem(capability.getResponsible());
            jComboBoxResponsibleDeputy.setSelectedItem(capability.getResponsibleDeputy());
            jComboBoxSupportSegment.setSelectedItem(capability.getProcess());
            jCalendarComboBoxValidFrom.setDate(capability.getValidFrom());
            jCalendarComboBoxValidUnitl.setDate(capability.getValideUntil());      
            jLabelSupportSegment.setText("Support du quartier");
            jLabelSoutient.setText("Application soutient");
            jButtonAddCapability.setText("Ajouter une apllication");
            jButtonRemoveCapability.setText("Supprimer une application");
        }
        
    }
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
            java.util.logging.Logger.getLogger(FrameProcessOrCpability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProcessOrCpability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProcessOrCpability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProcessOrCpability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProcessOrCpability().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private myObject.Capability capability1;
    private javax.swing.JButton jButtonAddCapability;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonRemoveCapability;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBoxValidFrom;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBoxValidUnitl;
    private javax.swing.JComboBox jComboBoxResponsible;
    private javax.swing.JComboBox jComboBoxResponsibleDeputy;
    private javax.swing.JComboBox jComboBoxSupportSegment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelResponsible;
    private javax.swing.JLabel jLabelSoutient;
    private javax.swing.JLabel jLabelSupportSegment;
    private javax.swing.JLabel jLabelValId;
    private javax.swing.JLabel jLabelValidFrom;
    private javax.swing.JList jListCapability;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

  private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("usi.png")));
    }
}