/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Fitnesi;
import BLL.Zhveshtore;
import DAL.FitnesiException;
import DAL.FitnesiRepository;
import DAL.ZhveshtoreRepository;
import GUI.Model.FitnesiComboBoxModel;
import GUI.Model.ZhveshtoreTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author qendrimrexhepi
 */
public class ZhveshtoreForm extends javax.swing.JInternalFrame {

    ZhveshtoreRepository zhr = new ZhveshtoreRepository();
    FitnesiRepository ffr = new FitnesiRepository();
    ZhveshtoreTableModel zhtm = new ZhveshtoreTableModel();
    FitnesiComboBoxModel fcmb = new FitnesiComboBoxModel();
    /**
     * Creates new form ZhveshtoreForm
     */
    public ZhveshtoreForm() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        loadComboBox();
    }
    
    public void loadTable(){
        try{
            List<Zhveshtore> lista = zhr.findALL();
            zhtm.addList(lista);
            table.setModel(zhtm);
            zhtm.fireTableDataChanged();
        }catch(FitnesiException ex){
            Logger.getLogger(FitnesiForm.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Zhveshtore zh = zhtm.getZhveshtore(selectedIndex);
                    zhidTextField.setText(zh.getZhid().toString());
                    fcmb.setSelectedItem(zh.getFid());
                    fitnesiCMB.repaint();
                    numriTextField.setText(zh.getNumri().toString());
                    gjiniaTextField.setText(zh.getGjinia().toString());
                }
            }
        });
    }
    
    public void loadComboBox(){
        try{
            List<Fitnesi> lista = ffr.findALL();
            fcmb.add(lista);
            fitnesiCMB.setModel(fcmb);
            fitnesiCMB.repaint();
        }catch(FitnesiException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        zhveshtoreLabel = new javax.swing.JLabel();
        zhidLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numriLabel = new javax.swing.JLabel();
        gjiniaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        zhidTextField = new javax.swing.JTextField();
        numriTextField = new javax.swing.JTextField();
        gjiniaTextField = new javax.swing.JTextField();
        fitnesiCMB = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));

        zhveshtoreLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        zhveshtoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        zhveshtoreLabel.setText("ZHVESHTORE");

        zhidLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        zhidLabel.setForeground(new java.awt.Color(255, 255, 255));
        zhidLabel.setText("ZHID:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FID:");

        numriLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        numriLabel.setForeground(new java.awt.Color(255, 255, 255));
        numriLabel.setText("Numri:");

        gjiniaLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        gjiniaLabel.setForeground(new java.awt.Color(255, 255, 255));
        gjiniaLabel.setText("Gjinia:");

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        zhidTextField.setEnabled(false);

        fitnesiCMB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zhidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numriLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zhidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(gjiniaLabel)
                                .addGap(0, 0, 0)
                                .addComponent(gjiniaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fitnesiCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(zhveshtoreLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(zhveshtoreLabel)
                .addGap(52, 52, 52)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zhidLabel)
                    .addComponent(zhidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fitnesiCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numriLabel)
                    .addComponent(gjiniaLabel)
                    .addComponent(gjiniaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        saveButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        saveButton.setText("Ruaj");
        saveButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        deleteButton.setText("Fshjie");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cancelButton.setText("Anulo");
        cancelButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:try{
        try{
            int row = table.getSelectedRow();
            if(row == -1){
                Zhveshtore zh = new Zhveshtore();
                //p.setId(Integer.parseInt(idField.getText()));
                zh.setFid((Fitnesi)fcmb.getSelectedItem());
                zh.setNumri(Integer.parseInt(numriTextField.getText()));
                zh.setGjinia(gjiniaTextField.getText().charAt(0));
                zhr.create(zh);
            }else{
                Zhveshtore zh = zhtm.getZhveshtore(row);
                //Id nuk e lejojm me ndryshu vetem emertimin ose fielda tjere qe mundeni me pas
                zh.setFid((Fitnesi)fcmb.getSelectedItem());
                zh.setNumri(Integer.parseInt(numriTextField.getText()));
                zh.setGjinia(gjiniaTextField.getText().charAt(0));
                zhr.edit(zh);
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            loadTable();
        }catch(FitnesiException ex){
            JOptionPane.showMessageDialog(this, "E dhena ekziston!");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                Zhveshtore zh = zhtm.getZhveshtore(row);
                try{
                    zhr.delete(zh);
                }catch(FitnesiException ex){
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }
                clear();
                loadTable();
            }else{
                clear();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_cancelButtonActionPerformed

    public void clear(){
        table.clearSelection();
        zhidTextField.setText("");
        numriTextField.setText("");
        gjiniaTextField.setText("");
        //pcmb.setSelectedItem(null);
        fitnesiCMB.setSelectedIndex(-1);
        fitnesiCMB.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox fitnesiCMB;
    private javax.swing.JLabel gjiniaLabel;
    private javax.swing.JTextField gjiniaTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel numriLabel;
    private javax.swing.JTextField numriTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable table;
    private javax.swing.JLabel zhidLabel;
    private javax.swing.JTextField zhidTextField;
    private javax.swing.JLabel zhveshtoreLabel;
    // End of variables declaration//GEN-END:variables
}
