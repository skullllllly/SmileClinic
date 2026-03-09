package gui;

import DBMS.JDBC;  //الربط مع باكج ربط قواعد البيانات 

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;




public class mainframe extends javax.swing.JFrame {

    private Object JOptionPan;

    //creat object to connect with data base
    
    
    //الاتصال بالبانل الثاني
    public mainframe() {
       
        initComponents();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tf_age = new javax.swing.JTextField();
        tf_phone = new javax.swing.JTextField();
        javax.swing.JLabel gender = new javax.swing.JLabel();
        male_rid = new javax.swing.JRadioButton();
        female_rid = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        tf_con = new javax.swing.JTextField();
        javax.swing.JButton btn_add = new javax.swing.JButton();
        javax.swing.JButton btn_clear = new javax.swing.JButton();
        javax.swing.JButton btn_add1 = new javax.swing.JButton();
        javax.swing.JButton btn_delete = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        javax.swing.JButton btn_search = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        javax.swing.JButton btn_pat1 = new javax.swing.JButton();
        javax.swing.JButton btn_bill1 = new javax.swing.JButton();
        javax.swing.JButton btn_ser1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 214, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dental-report.png"))); // NOI18N
        jLabel1.setText("Patients");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 0, 14), new java.awt.Color(57, 102, 207))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("NAME:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("AGE:");

        tf_name.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("PHONE NUMBER:");

        tf_age.setForeground(new java.awt.Color(51, 51, 51));

        tf_phone.setForeground(new java.awt.Color(51, 51, 51));

        gender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 153));
        gender.setText("GENDER:");

        buttonGroup1.add(male_rid);
        male_rid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        male_rid.setForeground(new java.awt.Color(0, 153, 255));
        male_rid.setText("male");
        male_rid.setBorder(null);
        male_rid.setContentAreaFilled(false);

        buttonGroup1.add(female_rid);
        female_rid.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        female_rid.setForeground(new java.awt.Color(0, 153, 255));
        female_rid.setText("female");
        female_rid.setBorder(null);
        female_rid.setContentAreaFilled(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("CONDITION:");

        tf_con.setForeground(new java.awt.Color(51, 51, 51));
        tf_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_conActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setForeground(new java.awt.Color(0, 102, 204));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-١.png"))); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear.setForeground(new java.awt.Color(0, 102, 204));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading-arrow.png"))); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_add1.setBackground(new java.awt.Color(255, 255, 255));
        btn_add1.setForeground(new java.awt.Color(0, 102, 204));
        btn_add1.setText("UPDATE");
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_clear)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(male_rid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(female_rid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_con, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_age, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_phone, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6)
                            .addComponent(btn_add))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_add, btn_clear});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(male_rid)
                .addGap(5, 5, 5)
                .addComponent(female_rid)
                .addGap(11, 11, 11)
                .addComponent(btn_add)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_delete.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 102, 204));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bin.png"))); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        Table1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "age", "gender", "phone num", "condition", "date", "time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);

        btn_search.setBackground(new java.awt.Color(255, 255, 255));
        btn_search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(0, 102, 204));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feedback-search-١.png"))); // NOI18N
        btn_search.setText("search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        tf_search.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("search by id:");

        jLabel11.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Smile Clinic ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        jPanel8.setBackground(new java.awt.Color(133, 163, 255));

        btn_pat1.setBackground(new java.awt.Color(171, 193, 255));
        btn_pat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dental-report.png"))); // NOI18N
        btn_pat1.setBorderPainted(false);
        btn_pat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pat1ActionPerformed(evt);
            }
        });

        btn_bill1.setBackground(new java.awt.Color(171, 193, 255));
        btn_bill1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tooth-٢.png"))); // NOI18N
        btn_bill1.setBorderPainted(false);
        btn_bill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bill1ActionPerformed(evt);
            }
        });

        btn_ser1.setBackground(new java.awt.Color(171, 193, 255));
        btn_ser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tooth.png"))); // NOI18N
        btn_ser1.setBorderPainted(false);
        btn_ser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btn_pat1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_bill1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ser1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ser1)
                    .addComponent(btn_bill1)
                    .addComponent(btn_pat1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(58, 58, 58))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_delete)
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_search)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel1)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_search)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(btn_delete)))
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String id;
        int notFound=0;
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       String user="root";
       String password="";
       String url="jdbc:mysql://127.0.0.1:3306/smile_clinc";
       Connection con= DriverManager.getConnection(url, user, password);
       Statement st=con.createStatement();
       
       id= tf_search.getText();
       
        if("".equals(id))
       {
           JOptionPane.showMessageDialog(new JFrame(),"id is require","Dialog", JOptionPane.ERROR_MESSAGE);
       }
        
        else 
        {
         String sql="SELECT * FROM patients WHERE id_patient="+id;
         ResultSet rs=st.executeQuery(sql);
         while(rs.next())
         {     
           notFound=1;
         String sql2="DELETE FROM patients WHERE id_patient="+id;
         st.executeUpdate(sql2);
           con.close();
           loadData();
         } 
         if(notFound==0)
         {
              JOptionPane.showMessageDialog(new JFrame(),"id not found","Dialog", JOptionPane.ERROR_MESSAGE);
         }
        }
        
       }
       catch (SQLException e) {
    e.printStackTrace();
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String id;
        int notFound=0;
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       String user="root";
       String password="";
       String url="jdbc:mysql://127.0.0.1:3306/smile_clinc";
       Connection con= DriverManager.getConnection(url, user, password);
       Statement st=con.createStatement();
       
       id= tf_search.getText();
       
        if("".equals(id))
       {
           JOptionPane.showMessageDialog(new JFrame(),"id is require","Dialog", JOptionPane.ERROR_MESSAGE);
       }
        
        else 
        {
         String sql="SELECT * FROM patients WHERE id_patient="+id;
         ResultSet rs=st.executeQuery(sql);
         while(rs.next())
         {  
            
           tf_name.setText(rs.getString("name_patient"));
           tf_age.setText(rs.getString("age"));
           tf_con.setText(rs.getString("condition_t"));
           tf_phone.setText(rs.getString("phone"));
           
           notFound=1;
           con.close();
    

         } 
         if(notFound==0)
         {
              JOptionPane.showMessageDialog(new JFrame(),"id not found","Dialog", JOptionPane.ERROR_MESSAGE);
         }
        }
        
       }
       catch (SQLException e) {
    e.printStackTrace();
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void tf_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_conActionPerformed

    private void btn_bill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bill1ActionPerformed

        bill ob=new bill();
        ob.setVisible(true);
    }//GEN-LAST:event_btn_bill1ActionPerformed

    private void btn_ser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ser1ActionPerformed
       serviece ob2=new serviece();
       ob2.setVisible(true);
    }//GEN-LAST:event_btn_ser1ActionPerformed
    
    public  void loadData() throws ClassNotFoundException, SQLException
    {
    try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       String user="root";
       String password="";
       String url="jdbc:mysql://127.0.0.1:3306/smile_clinc";
       Connection con= DriverManager.getConnection(url, user, password);
       Statement st=con.createStatement();
       DefaultTableModel model=new  DefaultTableModel(new String[]{"id","name","gender","age","phone num","condition","date","time"},0);
       
       Table1.setModel(model);
       String sql="SELECT * FROM patients";
       ResultSet rs=st.executeQuery(sql);
       String i,n,a,g,p,c,d,t;
       while(rs.next())
       {
         i=rs.getString("id_patient");
         n=rs.getString("name_patient");
         g=rs.getString("gender");
         a=rs.getString("age");
         p=rs.getString("phone");
         c=rs.getString("condition_t");
         d=rs.getString("date");
         t=rs.getString("time");
         model.addRow(new Object[]{i,n,g,a,p,c,d,t});
       }
    }//!!!!!!!!!!!!1
        catch(Exception e)
        {
            System.out.println("erorr)"+e.getMessage()); 
        }
    }
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String name;
        String age;
        String phone;
        String condition_t;
        String gender;
        String query;
        //connect to database
        try
        { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String password="";
        String url="jdbc:mysql://127.0.0.1:3306/smile_clinc";
        Connection con= DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
       if("".equals(tf_name.getText()))
       {
           JOptionPane.showMessageDialog(new JFrame(),"name is require","Dialog", JOptionPane.ERROR_MESSAGE);
        }
     
     
         else  if("".equals(tf_age.getText()))
       {
           JOptionPane.showMessageDialog(new JFrame(),"age is require","Dialog", JOptionPane.ERROR_MESSAGE);
        }
         else  if("".equals(tf_con.getText()))
       {
           JOptionPane.showMessageDialog(new JFrame(),"con is require","Dialog", JOptionPane.ERROR_MESSAGE);
        }
         else{
             
         name=tf_name.getText();
         age=tf_age.getText();
         phone=tf_phone.getText();
         condition_t=tf_con.getText();
         gender=male_rid.isSelected()?"male":"female";
        // query="INSERT INTO patients (name_patient,gender,age,phone,condition) VALUES ('"+name+"','"+gender+"',"+age+",'"+phone+"','"+condition+"')";
         // 1. تعريف جملة الـ SQL مع استخدام علامات الاستفهام كـ Placeholders
           query = "INSERT INTO patients (name_patient, gender, age, phone, condition_t) VALUES (?, ?, ?, ?, ?)";

try (PreparedStatement pstmt = con.prepareStatement(query)) {
    // 2. تعبئة البيانات بترتيب علامات الاستفهام
    pstmt.setString(1, name);
    pstmt.setString(2, gender);
    pstmt.setString(3, age);      // افترضنا أن السن رقم (int)
    pstmt.setString(4, phone);
    pstmt.setString(5, condition_t);

    // 3. تنفيذ التحديث
    pstmt.executeUpdate();
    
    JOptionPane.showMessageDialog(new JFrame(),"done  successfully","Dialog", JOptionPane.DEFAULT_OPTION);
       
    con.close();
    loadData();
} catch (SQLException e) {
    e.printStackTrace();
}
         }
     
     
     
         
        }
        catch(Exception e)
        {
            System.out.println("erorr)"+e.getMessage()); 
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
         String id;
         String n,a,c,p;
        int notFound=0;
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       String user="root";
       String password="";
       String url="jdbc:mysql://127.0.0.1:3306/smile_clinc";
       Connection con= DriverManager.getConnection(url, user, password);
       Statement st=con.createStatement();
       
       id= tf_search.getText();
       
        if("".equals(id))
       {
           JOptionPane.showMessageDialog(new JFrame(),"id is require","Dialog", JOptionPane.ERROR_MESSAGE);
       }
        
        else 
        {
         String sql="SELECT * FROM patients WHERE id_patient="+id;
         ResultSet rs=st.executeQuery(sql);
         while(rs.next())
         {     
           notFound=1;
            n=tf_name.getText();
            a=tf_age.getText();
            c=tf_con.getText();
            p=tf_phone.getText();
            
         String sql2="UPDATE  patients SET name_patient='"+n+"',age='"+a+"',condition_t='"+c+ "',phone='"+p+"' WHERE id_patient="+id;
         st.executeUpdate(sql2);
           con.close();
           loadData();
         } 
         if(notFound==0)
         {
              JOptionPane.showMessageDialog(new JFrame(),"id not found","Dialog", JOptionPane.ERROR_MESSAGE);
         }
        }
        
       }
       catch (SQLException e) {
    e.printStackTrace();
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        tf_name.setText("");
        tf_age.setText("");
        tf_con.setText("");
        tf_phone.setText("");
        tf_search.setText("");
        
           
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_pat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pat1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                mainframe x=new mainframe();
                try {
                    x.loadData();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
                x.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female_rid;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton male_rid;
    private javax.swing.JTextField tf_age;
    private javax.swing.JTextField tf_con;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
