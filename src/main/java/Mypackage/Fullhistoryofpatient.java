/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DURGA
 */
public class Fullhistoryofpatient extends javax.swing.JFrame
{

    /**
     * Creates new form Fullhistoryofpatient
     */
    public Fullhistoryofpatient()
    {
        initComponents();
        CommonClassImage_hms.addLabelBackgroundimage(lblback, "C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\add new patient background.jpg");
        userList();
        showUser();
    }
    
    public ArrayList<User1> userList()
    {
        ArrayList<User1> userList= new ArrayList<>();
        String URL = "jdbc:mysql://localhost:3306/hms";
        String usernameString="root";
        String passString="Zalte@2001";
        
        try
        {
            Connection con=DriverManager.getConnection(URL,usernameString,passString);
            Statement st=con.createStatement();
            String queryString="select addpatientrecord.pid,name,contact,age,gender,bloodgp,address,anymajor,symptons,diagnosis,medicine,ward_required,type__ward from addpatientrecord inner join adddiagnosisinfo on addpatientrecord.pid = adddiagnosisinfo.pid";
            ResultSet stResultSet=st.executeQuery(queryString);
            User1 user1;
            while(stResultSet.next())
            {
                user1=new User1(stResultSet.getInt("pid"),stResultSet.getString("name"),stResultSet.getLong("contact"),stResultSet.getInt("age"),stResultSet.getString("gender"),stResultSet.getString("bloodgp"),stResultSet.getString("address"),stResultSet.getString("anymajor"),stResultSet.getString("symptons"),stResultSet.getString("diagnosis"),stResultSet.getString("medicine"),stResultSet.getString("ward_required"),stResultSet.getString("type__ward"));
                userList.add(user1);
            }
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error"+ e);
        }
        return userList;
    }
    public void showUser()
    {
        ArrayList<User1> list=userList();
        DefaultTableModel model = (DefaultTableModel) Table_info.getModel();
        Object [] row = new Object[13];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getContactno();
            row[3]=list.get(i).getage();
            row[4]=list.get(i).getGender();
            row[5]=list.get(i).getBloodgp();
            row[6]=list.get(i).getAddress();
            row[7]=list.get(i).getAnymajor();
            row[8]=list.get(i).getSymptonsString();
            row[9]=list.get(i).getDiagnosisString();
            row[10]=list.get(i).getMedicineString();
            row[11]=list.get(i).getWardrequiredString();
            row[12]=list.get(i).getWardtype();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_info = new javax.swing.JTable();
        btnclose = new javax.swing.JButton();
        lblback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Patient Id", "Name", "Contact No", "Age", "Gender", "Blood Gp", "Address", "Any Major Disease", "Sympton's", "Diagnosis", "Medicine", "Ward Required", "Ward Type"
            }
        ));
        jScrollPane1.setViewportView(Table_info);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 768, 399));

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon("C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\Close.png")); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 440, 112, 30));
        jPanel1.add(lblback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncloseActionPerformed
    {//GEN-HEADEREND:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Fullhistoryofpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Fullhistoryofpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Fullhistoryofpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Fullhistoryofpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Fullhistoryofpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_info;
    private javax.swing.JButton btnclose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblback;
    // End of variables declaration//GEN-END:variables
}
