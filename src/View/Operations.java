/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author su-print
 */
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import Model.Operation;
import DAO.OperationDAO;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
public class Operations extends javax.swing.JFrame {

    /**
     * Creates new form Operationss
     */
    public Operations() {
        initComponents();
        populateO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        otable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clID = new javax.swing.JTextField();
        clN = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        clSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sID = new javax.swing.JTextField();
        Sname = new javax.swing.JTextField();
        bkSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bkName = new javax.swing.JTextField();
        auth = new javax.swing.JTextField();
        isd = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        rdt = new com.toedter.calendar.JDateChooser();
        CheckIn = new javax.swing.JButton();
        CheckOt = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        otable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Author", "Return Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(otable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("cilent search"));

        jLabel1.setText("Client Id");

        jLabel2.setText("Client name");

        pass.setBorder(javax.swing.BorderFactory.createTitledBorder("Photo"));

        clSearch.setText("Search");
        clSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clID)
                    .addComponent(clN, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(clSearch)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(clID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(clSearch)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Search"));

        jLabel4.setText("Book Id");

        jLabel5.setText("Book Name");

        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });

        bkSearch.setText("Search");
        bkSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(115, 115, 115)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sname, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(sID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(bkSearch)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(bkSearch)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Info"));

        jLabel6.setText("Book Name");

        jLabel7.setText("Author");

        jLabel8.setText("Issue Date");

        auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authActionPerformed(evt);
            }
        });

        jLabel3.setText("Return Date");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bkName, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(auth))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isd, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(rdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(auth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(rdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        CheckIn.setText("Check In");
        CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInActionPerformed(evt);
            }
        });

        CheckOt.setText("Check out");
        CheckOt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOtActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(CheckIn)
                                .addGap(140, 140, 140)
                                .addComponent(CheckOt)
                                .addGap(136, 136, 136)
                                .addComponent(exit)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CheckIn)
                                    .addComponent(CheckOt)
                                    .addComponent(exit))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

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

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void authActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authActionPerformed

    private void clSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clSearchActionPerformed
        // TODO add your handling code here:
        int f=0;
        String clname = clN.getText();
        String cld= clID.getText();
        Transaction tr = null;
       Session session = NewHibernateUtil.getSessionFactory().openSession();
       tr= session.beginTransaction();
       if(clID.getText().isEmpty())
       {
       SQLQuery query = session.createSQLQuery("select FirstName from Client");
       List rs = query.list();
       for(Object cl : rs)
       {
         String cname = cl.toString();
           if(cname.equals(clname))
         {
             JOptionPane.showMessageDialog(null, "Client Found");
               f=1;
               SQLQuery queid = session.createSQLQuery("select RegNo from Client where FirstName=?");
               queid.setParameter(0, clname);
               List rg = queid.list();
                for(Object crg : rg)
       {
                       clID.setText(crg.toString());
       }
               break;
         }
       }
       if(f!=1)
       {
         JOptionPane.showMessageDialog(null, "client not Found");  
       }
       }
       else{
       SQLQuery query = session.createSQLQuery("select RegNo from Client");
       List rs = query.list();
       for(Object cl : rs)
       {
         String cname = cl.toString();
           if(cname.equals(cld))
         {
             JOptionPane.showMessageDialog(null, "Client Found");
               f=1;
                SQLQuery quen = session.createSQLQuery("select FirstName from Client where RegNo=?");
               quen.setParameter(0, cld);
               List rn = quen.list();
                for(Object crn : rn)
       {
                       clN.setText(crn.toString());
       }
               break;
         }
       }
       if(f!=1)
       {
         JOptionPane.showMessageDialog(null, "client not Found");  
       }
           
       }
       session.close();
       String path;
       Transaction n = null;
       Session s = NewHibernateUtil.getSessionFactory().openSession();
       n= s.beginTransaction();
       SQLQuery p = s.createSQLQuery("select photo from Client where RegNo=?");
       p.setParameter(0, cld);
       List pc = p.list();
       for(Object i: pc)
       {
          path=i.toString();
          ImageIcon img = new ImageIcon(path);
            Image image = img.getImage().getScaledInstance(pass.getWidth(),pass.getHeight(),Image.SCALE_DEFAULT);
            pass.setIcon(new ImageIcon(image)); 
       }
    }//GEN-LAST:event_clSearchActionPerformed

    private void bkSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkSearchActionPerformed
        // TODO add your handling code here:
                int c=0;
                String id=sID.getText();
              
                String nm = Sname.getText();
                 Transaction t= null;
                 Session bn = NewHibernateUtil.getSessionFactory().openSession();
                 t= bn.beginTransaction();
                if(Sname.getText().isEmpty())
                {
                 SQLQuery bq = bn.createSQLQuery("select id from Books");
                 List bks = bq.list();
                 for(Object boo: bks)
                 {
                   String sbid = boo.toString();
                  if(sbid.equals(id))
                   {
                       c=1;
                       JOptionPane.showMessageDialog(null, "Book Found");
                       SQLQuery bkn = bn.createSQLQuery("select Title from Books where id=?");
                       bkn.setParameter(0,Integer.parseInt(sID.getText()) );
                       List al = bkn.list();
                       for(Object sb: al)
                       {
                           bkName.setText(sb.toString()); 
                       }
                       
                      SQLQuery bka = bn.createSQLQuery("select Author from Books where id=?");
                       bka.setParameter(0, Integer.parseInt(sID.getText()));
                       List ala = bka.list();
                       for(Object bkaut: ala)
                       {
                            auth.setText(bkaut.toString());
                       }
                       
                       SQLQuery bkdt = bn.createSQLQuery("select PublicationDate from Books where id=?");
                       bkdt.setParameter(0, Integer.parseInt(sID.getText()));
                       List alay = bkdt.list();
                       for(Object bkaut: alay)
                       {
                            isd.setDate((Date) bkaut);
                       }
                      
                       break;
                       
                   }
                    
                 }
                 if(c!=1)
                    {
                       JOptionPane.showMessageDialog(null, "Book not Found");  
                    }
                 
                }
                if(sID.getText().isEmpty()){
                SQLQuery bookname = bn.createSQLQuery("select Title from Books");
                List bksn = bookname.list();
                 for(Object bo: bksn)
                 {
                   String sbnm = bo.toString();
                   if(sbnm.equals(nm))
                   {
                       c=1;
                       JOptionPane.showMessageDialog(null, "Book Found");
                        bkName.setText(nm);
                       SQLQuery bookID = bn.createSQLQuery("select id from Books where Title=?");
                       bookID.setParameter(0, nm);
                       List alID = bookID.list();
                       for(Object sb: alID)
                       {
                           sID.setText(sb.toString()); 
                       }
                      
                       SQLQuery bookAuth = bn.createSQLQuery("select Author from Books where Title=?");
                       bookAuth.setParameter(0, nm);
                       List alIAuth = bookAuth.list();
                       for(Object sba: alIAuth)
                       {
                           auth.setText(sba.toString()); 
                       }    
                       
                       SQLQuery bookDate = bn.createSQLQuery("select PublicationDate from Books where Title=?");
                       bookDate.setParameter(0, nm);
                       List aladate = bookDate.list();
                       for(Object bkau: aladate)
                       {
                            isd.setDate((Date) bkau);
                       }
                      bn.close();
                       break;
                       
                   }
                    
                 }
                 if(c!=1)
                    {
                       JOptionPane.showMessageDialog(null, "Book not Found");  
                    }
                    
                
                 
                }
                bn.close();
    }//GEN-LAST:event_bkSearchActionPerformed

    private void CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInActionPerformed
        // TODO add your handling code here:
        Operation oc = new Operation();
        oc.setClientId(Integer.parseInt(clID.getText()));
        oc.setAuthor(auth.getText());
        oc.setBookName(bkName.getText());
        oc.setStatus("Check in");
        oc.setReturnDate(rdt.getDate());
        OperationDAO DAO = new OperationDAO();
        DAO.saveOp(oc);
        JOptionPane.showMessageDialog(this,"Checked in");
         DefaultTableModel md = (DefaultTableModel) otable.getModel();
        md.setRowCount(0);
        populateO();
    }//GEN-LAST:event_CheckInActionPerformed

    private void CheckOtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOtActionPerformed
        // TODO add your handling code here:
        Operation oc = new Operation();
        oc.setClientId(Integer.parseInt(clID.getText()));
        oc.setAuthor(auth.getText());
        oc.setBookName(bkName.getText());
        oc.setStatus("Check out");
        oc.setReturnDate(rdt.getDate());
        OperationDAO DAO = new OperationDAO();
        DAO.saveOp(oc);
        JOptionPane.showMessageDialog(this,"Checked out");
         DefaultTableModel md = (DefaultTableModel) otable.getModel();
        md.setRowCount(0);
        populateO();
    }//GEN-LAST:event_CheckOtActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        Operations ne = new Operations();
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public void populateO()
    {
        
        Transaction tr = null;
       Session session = NewHibernateUtil.getSessionFactory().openSession();
       tr= session.beginTransaction();
       Criteria cr = session.createCriteria(Operation.class);
       List bcts = cr.list();
       tr.commit();
       DefaultTableModel md = (DefaultTableModel) otable.getModel();
      Object[] row =new Object [4];
    for(Iterator i=bcts.iterator();i.hasNext();)
    {
        Operation nbc= (Operation) i.next();
        
        row[0]=nbc.getBookName();
         row[1]=nbc.getAuthor();
        row[2]=nbc.getReturnDate();
        row[2]=nbc.getStatus();
        md.addRow(row);
                }
    }
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
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckIn;
    private javax.swing.JButton CheckOt;
    private javax.swing.JTextField Sname;
    private javax.swing.JTextField auth;
    private javax.swing.JTextField bkName;
    private javax.swing.JButton bkSearch;
    private javax.swing.JTextField clID;
    private javax.swing.JTextField clN;
    private javax.swing.JButton clSearch;
    private javax.swing.JButton exit;
    private com.toedter.calendar.JDateChooser isd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable otable;
    private javax.swing.JLabel pass;
    private com.toedter.calendar.JDateChooser rdt;
    private javax.swing.JTextField sID;
    // End of variables declaration//GEN-END:variables
}
