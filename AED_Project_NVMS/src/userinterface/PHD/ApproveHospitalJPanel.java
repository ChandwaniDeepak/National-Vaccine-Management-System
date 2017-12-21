
package userinterface.PHD;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PHDEnterprise;
import Business.Network.Network;
import Business.WorkQueue.PHDHospitalApproval;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Deepak_Chandwani; Naman_Bhargava; Sneha_Shree
 */


public class ApproveHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApproveHospitalJPanel
     */
    private JPanel userProcessContainer;
    private PHDEnterprise phde;
    private Network network;

    ApproveHospitalJPanel(JPanel userProcessContainer, PHDEnterprise phde, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.phde = phde;
        this.network = network;
        populateHospitalTable();
    }

    private void populateHospitalTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTableHospital.getModel();
        dtm.setRowCount(0);
        for (PHDHospitalApproval hospitalApproval : phde.getHospitalApprovalArrayList()) {
            Object[] row = new Object[4];
            row[0] = hospitalApproval;
            row[1] = hospitalApproval.getHospitalEnterprise();
            row[2] = hospitalApproval.getHospitalStatus();
            row[3] = hospitalApproval.getHospitalEnterprise().isHospitalApproved();
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHospital = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonApproveHospital = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPending = new javax.swing.JLabel();
        lblApproved = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 10, true));

        jTableHospital.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Object", "Hospital Name", "PHD Status", "Hospital Approved"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHospital.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableHospital);
        if (jTableHospital.getColumnModel().getColumnCount() > 0) {
            jTableHospital.getColumnModel().getColumn(0).setMinWidth(0);
            jTableHospital.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTableHospital.getColumnModel().getColumn(0).setMaxWidth(0);
            jTableHospital.getColumnModel().getColumn(1).setPreferredWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHD Hospital Approval");

        jButtonApproveHospital.setBackground(new java.awt.Color(255, 153, 0));
        jButtonApproveHospital.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonApproveHospital.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApproveHospital.setText("Approve Hospital");
        jButtonApproveHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApproveHospitalActionPerformed(evt);
            }
        });

        backjButton1.setBackground(new java.awt.Color(255, 153, 0));
        backjButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Total:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Pending for Approval:");

        lblPending.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblApproved.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Approved: ");

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Total Approvals and Pending requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(backjButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonApproveHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel2)
                                        .addGap(89, 89, 89))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPending, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonApproveHospital))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(lblPending, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void jButtonApproveHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApproveHospitalActionPerformed
        // TODO add your handling code here:
        if (jTableHospital.getSelectedRow() >= 0) {
            PHDHospitalApproval hospitalApproval = (PHDHospitalApproval) jTableHospital.getValueAt(jTableHospital.getSelectedRow(), 0);

            for (Enterprise hospitalEnterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                
                if (hospitalApproval.getHospitalEnterprise().equals(hospitalEnterprise)) {
                    hospitalApproval.getHospitalEnterprise().setHospitalApproved(true);
                    ((HospitalEnterprise) hospitalEnterprise).setHospitalApproved(true);
                    hospitalApproval.setHospitalStatus("Approved");
                    break;
                }
                
            }
              JOptionPane.showMessageDialog(null, "Request Approved successfully.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please select the hospital to approve");
        }
        populateHospitalTable();
    }//GEN-LAST:event_jButtonApproveHospitalActionPerformed

    public void generalAnalytics()
    {
        int pending=0, approved=0, total=0;
        for(PHDHospitalApproval pe : phde.getHospitalApprovalArrayList())
        {
           if(pe.getHospitalStatus().equals("Approved"))
           {
               approved++;
           }
           if(pe.getHospitalStatus().equals("Waiting for PHD Approval"))
           {
               pending++;
           }
        }
        total = approved + pending;
        lblTotal.setText(String.valueOf(total));
        lblApproved.setText(String.valueOf(approved));
        lblPending.setText(String.valueOf(pending));
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(approved, "", "Approved");
        dataset.setValue(pending, "", "pending");
        
        JFreeChart chart = ChartFactory.createBarChart("Approval request from Hospitals", "", "", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        ChartFrame frame = new ChartFrame("Bar Chart for hospital requests",chart);
        frame.setVisible(true);
        frame.setSize(650,350);
        
        
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        generalAnalytics();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonApproveHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHospital;
    private javax.swing.JLabel lblApproved;
    private javax.swing.JLabel lblPending;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}