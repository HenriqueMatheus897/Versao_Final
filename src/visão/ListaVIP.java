/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author henrique matheus
 */
public class ListaVIP extends javax.swing.JFrame {

    /**
     * Creates new form ListaVIP
     */
    public ListaVIP() {
        initComponents();
        
        jButton1.setBackground(new java.awt.Color(0,0,0,0));
        jButton2.setBackground(new java.awt.Color(0,0,0,0));
        jButton3.setBackground(new java.awt.Color(0,0,0,0));
        jButton4.setBackground(new java.awt.Color(0,0,0,0));
        jTextField1.setBackground(new java.awt.Color(0,0,0,0));
        jToggleButton1.setBackground(new java.awt.Color(0,0,0,0));
        jTable1.setBackground(new java.awt.Color(0,0,0,0));
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 180, 800, 450);

        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 60, 700, 50);

        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(1080, 40, 90, 80);

        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 170, 90, 80);

        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 260, 90, 80);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 690, 10, 10);

        jButton3.setBorder(null);
        getContentPane().add(jButton3);
        jButton3.setBounds(140, 360, 90, 80);

        jButton4.setBorder(null);
        getContentPane().add(jButton4);
        jButton4.setBounds(140, 460, 90, 80);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(30, 10, 100, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(30, 40, 100, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(30, 70, 100, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(30, 100, 100, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(30, 130, 100, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(30, 160, 100, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(140, 10, 100, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(140, 40, 100, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(140, 70, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 4, 1300, 700);

        setSize(new java.awt.Dimension(1316, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            
      

        
      
      
      
      
      
      
      
      
        
        String filePath = ("C://Arquivos do programa/vip.txt");
        File file = new File(filePath);
        //tabela 1
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model00 = (DefaultTableModel)jTable2.getModel();
            //model00.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();

            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
                model00.addRow(dataRow);
            }
            
        } catch (Exception ex) {
           Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex); 
        }
        // tabela 2

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            
            

            
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
                model.addRow(dataRow);


            }
            
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
       

    }//GEN-LAST:event_formWindowOpened

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      jTable2.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   JFCadrastro Tela = new JFCadrastro();
                   Tela.setVisible(rootPaneCheckingEnabled);
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
  if (evt.getClickCount() == 2 ) {      
        


//Pelfil DO CLIENTE    
        PerfilDoCliente frm2 = new PerfilDoCliente();
        /*
 try {
			//abre o arquivo
			FileReader fr = new FileReader("Texto.txt");
			BufferedReader br = new BufferedReader(fr);
			String temp;
			//A cada interação, é uma linha do arquivo e atribui-a a temp
			while ((temp = br.readLine()) != null)
			{
				//Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split("/");
				int i=0;
				for(String each : a)
				{
					/*if(i==0){
						nome=each;							
						System.out.println(nome);
					}*/
						/*if(i==1){
							Nome=each;
                                                        
							System.out.println(Nome);
                                                       // frm2.txT_Nome.setText(Nome);
						} /*
						if(i==2){
							valor=each;
							i=-1;
							System.out.println(valor);
                                                        
						}*/
						/*i++;
					}						
				}
		}
		catch (FileNotFoundException el)
		{
			System.out.println("Arquivo não Encontrado!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}*/
        
        
        
        
        
         TableModel model1 = jTable1.getModel(); 
     // TableModel model3 = jTextField8.getModel();
      int indexs[] = jTable2.getSelectedRows();
        
      
      
      frm2.txT_NomeUSUARIO.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()); //Nome
      frm2.txT_EnderecoUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),1).toString()); //Endereço
      frm2.txT_NumeroUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),2).toString()); //Numero
      frm2.txT_BairroUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),3).toString()); //Bairro
      frm2.txT_dataUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),4).toString()); //Data
      frm2.txT_AniversarioUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),5).toString()); //Aniversario
      frm2.txT_EmailUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),6).toString()); //Email
      frm2.txT_whatsUSUARIO1.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),7).toString()); //WhatsApp
      frm2.txT_CelularUSUARIO2.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),8).toString()); //Celular
      
        
      jTextField2.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()); //controle Nome
      jTextField3.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),1).toString()); //controle Email
      jTextField4.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),2).toString()); //controle Numero
      jTextField5.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),3).toString()); //controle Bairro
      jTextField6.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),4).toString()); // controle data de aniversario
      jTextField7.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),5).toString()); // controle Wats
      jTextField8.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),6).toString()); // CONTROLE Celular
      jTextField9.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),7).toString()); //controle Obiservaçoes
      jTextField10.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),8).toString()); // controle rua
     
      
      
      
      
      Object[] row = new Object[2];
     
     // PerfilDoCliente frm2 = new PerfilDoCliente();
      //DefaultTableModel mode13 = (DefaultTableModel)frm2.jtTabelaNome.getModel();
      //DefaultTableModel model4 = (DefaultTableModel)frm2.jtTabelaData.getModel();
      //DefaultTableModel model5 = (DefaultTableModel)frm2.jtTabelaEndereço.getModel();
     // DefaultTableModel model6 = (DefaultTableModel)frm2.jtTabelaNumero.getModel();
     // DefaultTableModel model7 = (DefaultTableModel)frm2.jtTabelaBairro.getModel();
     // DefaultTableModel model8 = (DefaultTableModel)frm2.jtTabelaAniversario.getModel();
    //  DefaultTableModel model9 = (DefaultTableModel)frm2.jtTabelaEmail.getModel();
      //DefaultTableModel model10 = (DefaultTableModel)frm2.jtTabelaWhatsApp.getModel();
     // DefaultTableModel model11 = (DefaultTableModel)frm2.jtTabelaCelular.getModel();
      //DefaultTableModel model12 = (DefaultTableModel)frm2.jtTabelaObiservaçoes.getModel();
      
     // for(int i = 0; i < indexs.length; i++)
     // {
       //row[0] = model1.getValueAt(indexs[i], 1); // Nome
      // mode13.addRow(row);
       
       
       
      // row[0] = model1.getValueAt(indexs[i], 2); // Data 
     //  model4.addRow(row);

       //row[0] = model1.getValueAt(indexs[i], 5); // Endereço
      // model5.addRow(row);
       
      // row[0] = model1.getValueAt(indexs[i], 6); //Numero
       //model7.addRow(row);
       
       //ow[0] = model1.getValueAt(indexs[i], 7); //Bairro
      // model6.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 8); //Aniversario 
      // model8.addRow(row);
       
      // row[0] = model1.getValueAt(indexs[i], 9);//Emaill
       //model9.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 10);//WhatsApp
       //model10.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 11); //Celular
       //model11.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 12); // Obiservaçoes
      // model12.addRow(row);
       
     // }
      
      frm2.setVisible(true); 
  }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         if(jTable2.getSelectedRow() != -1){
        
        System.out.print("Linha selecionada: "+jTable2.getSelectedColumn());
            
        DefaultTableModel dmz = (DefaultTableModel)jTable2.getModel();
        dmz.removeRow(jTable2.getSelectedRow());
 
         File file = new File("C:\\Arquivos do programa/vip.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            

                    
            String nome = jTextField2.getText(); // nome 
            String email = jTextField3.getText(); // email
            String numero = jTextField4.getText(); //  numero 
            String bairro = jTextField5.getText(); // bairro
            String aniversario = jTextField6.getText(); // aniversario 
            String wats = jTextField7.getText(); //wats 
            String celular = jTextField8.getText(); // celular 
            String obiservacoes =jTextField9.getText(); // obiservaçoes 
            String rua = jTextField10.getText(); // rua

            
            
                  
            if(linha.equals(nome+";"+email+";"+numero+";"+bairro+";"+aniversario+";"+wats+";"+celular+";"+obiservacoes+";"+rua) == false){
                salvar.add(linha);
               // JOptionPane.showMessageDialog(null, nome+";"+email+";"+numero+";"+bairro+";"+aniversario+";"+wats+";"+celular+";"+obiservacoes+";"+rua);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        } 
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          while (jTable2.getModel().getRowCount() > 0) {
    ((DefaultTableModel) jTable2.getModel()).removeRow(0);
    }
        
        
         String filePath = ("C:\\Arquivos do programa/vip.txt");
    File fie = new File(filePath);

    try {
        BufferedReader br = new BufferedReader(new FileReader(fie));
        String firstLine = br.readLine().trim();
        String[] columnsName = firstLine.split(",");
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        //model.setColumnIdentifiers(columnsName);
        
        Object[] tableLines = br.lines().toArray();
        
        for(int i = 0; 1 < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }

        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(ListaVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaVIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
