import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Inbx.java
 *
 * Created on 16 Nov, 2017, 1:40:36 PM
 */

/**
 *
 * @author HP
 */
public class Inbx extends javax.swing.JFrame {

    /** Creates new form Inbx */
    public Inbx() {
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
        jButton3 = new javax.swing.JButton();
        n1 = new javax.swing.JPanel();
        a1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        q1 = new javax.swing.JCheckBox();
        n2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        a2 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton2.setText("SEEN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        n1.setBackground(new java.awt.Color(255, 255, 204));

        a1.setBackground(new java.awt.Color(255, 255, 204));
        a1.setEditable(false);
        a1.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setText("Sender");

        jLabel2.setText("Welcome");

        f1.setEditable(false);
        f1.setForeground(new java.awt.Color(0, 0, 255));

        q1.setBackground(new java.awt.Color(204, 255, 255));
        q1.setText("Advanced Search");
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout n1Layout = new javax.swing.GroupLayout(n1);
        n1.setLayout(n1Layout);
        n1Layout.setHorizontalGroup(
            n1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(n1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(n1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(n1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(q1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, n1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        n1Layout.setVerticalGroup(
            n1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, n1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(n1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(n1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        n2.setBackground(new java.awt.Color(51, 153, 255));

        jButton4.setText("SHOW ALL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        a2.setColumns(20);
        a2.setFont(new java.awt.Font("Tahoma", 1, 18));
        a2.setRows(5);
        jScrollPane1.setViewportView(a2);

        javax.swing.GroupLayout n2Layout = new javax.swing.GroupLayout(n2);
        n2.setLayout(n2Layout);
        n2Layout.setHorizontalGroup(
            n2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(n2Layout.createSequentialGroup()
                .addGroup(n2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(n2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                    .addGroup(n2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        n2Layout.setVerticalGroup(
            n2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(n2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setText("REPLY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(jButton5)
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String p = a1.getText();
if(p.trim().equals("")){
try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aryan","worldinmyfist","aryanaryan");
    Statement stmt = con.createStatement();
    String query = "DELETE FROM msg WHERE receiver LIKE '"+f1.getText()+"';";
    stmt.executeUpdate(query);

stmt.close();
con.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}
}

else{
try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aryan","worldinmyfist","aryanaryan");
    Statement stmt = con.createStatement();
    String query = "DELETE FROM msg WHERE receiver LIKE '"+f1.getText()+"' AND sender LIKE '"+p+"';";
    stmt.executeUpdate(query);

stmt.close();
con.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Apps o = new Apps();
o.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(a1.isEditable()==true){
String g = a1.getText();
String t = "";

try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aryan","worldinmyfist","aryanaryan");
    Statement stmt = con.createStatement();
    String query = "SELECT imsg FROM msg WHERE sender LIKE '"+g+"' AND receiver LIKE '"+f1.getText()+"';";
    ResultSet rs = stmt.executeQuery(query);

while(rs.next()){
String h = rs.getString(1);
a2.append(" "+h);
}
stmt.close();
con.close();
rs.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}
String f = a2.getText().trim();
if(f.equals("")){
    a2.setText("No Messages");
}
}
else{
try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aryan","worldinmyfist","aryanaryan");
    Statement stmt = con.createStatement();
    String query = "SELECT imsg,sender FROM msg WHERE receiver LIKE '"+f1.getText()+"';";
    ResultSet rs = stmt.executeQuery(query);

while(rs.next()){
String h = rs.getString(1);
a2.append("\n"+h+"\n");
String g = rs.getString(2);
a2.append("By "+g+"\n");
}

stmt.close();
con.close();
rs.close();
}


catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}
String f = a2.getText().trim();
if(f.equals("")){
    a2.setText("No Messages");
}
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aryan","worldinmyfist","aryanaryan");
    Statement stmt = con.createStatement();
    String query = "SELECT * FROM colln";
    ResultSet rs = stmt.executeQuery(query);

while(rs.next()){
String j = rs.getString(1);
f1.setText(""+j);
}

stmt.close();
con.close();
rs.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
if(q1.isSelected()==true){
a1.setEditable(true);
this.a1.setBackground(Color.white);
}
if(q1.isSelected()==false){
a1.setEditable(false);
//this.a1.setBackground(Color.gray);
}// TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Cmp v = new Cmp();
v.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inbx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextArea a2;
    private javax.swing.JTextField f1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel n1;
    private javax.swing.JPanel n2;
    private javax.swing.JCheckBox q1;
    // End of variables declaration//GEN-END:variables

}
