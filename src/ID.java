import java.util.Random;
import java.sql.*;
import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ID.java
 *
 * Created on 9 Nov, 2017, 5:13:27 PM
 */

/**
 *
 * @author HP
 */
public class ID extends javax.swing.JFrame {

    /** Creates new form ID */
    public ID() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 330));
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setForeground(new java.awt.Color(0, 255, 51));
        jButton2.setText("CONVERT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 40, 130, 31);

        a1.setColumns(20);
        a1.setEditable(false);
        a1.setRows(5);
        jScrollPane1.setViewportView(a1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 20, 166, 100);

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 18));
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 40, 100, 31);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 12));
        jTextArea1.setForeground(new java.awt.Color(255, 51, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Largest Airforce in the world\nThree of world's five oldest rivers flow here: New,Susquehanna, the French broad\nAmericans are most likely people to help strangers in the world");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 0, 204))); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 600, 138);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/US_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 540, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

double t=1/64.95d;

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aryan","worldinmyfist","aryanaryan");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM help";
            ResultSet rs = stmt.executeQuery(query);
rs.next();
            float x = rs.getFloat(1);
            double y = (double)t*x;
            a1.append(""+y);
            stmt.close();
            con.close();
            rs.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }



        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cal k = new Cal();
        k.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
