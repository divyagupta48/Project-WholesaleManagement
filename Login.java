import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login extends JFrame implements ActionListener
 {
  JButton aSubmit;
  JPanel aPanel;
   JTextField  aName,aPass;
   JLabel  aLbl,lbl,enter;
   CardLayout cl;
   public void frame()
   {
	   try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("resource\\wholesale.jpg")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setLayout(null);
	   lbl=new JLabel("WELCOME TO DGL MANAGEMENT SYSTEM..!!");
	   lbl.setForeground(Color.ORANGE);
	   lbl.setBounds(300,20,300,100);
	  add(lbl);
   aLbl=new JLabel("ADMINISTRATOR");
   aLbl.setBounds(200,100,200,100);
   aLbl.setForeground(Color.ORANGE);
   add(aLbl);
   aPanel=new JPanel(new FlowLayout());
   aPanel.add(new JLabel("Administrator Username:"));
   aPanel.add(aName = new JTextField(15));
   aPanel.add(new JLabel("Administrator Password:"));
  aPanel.add(aPass = new JPasswordField(15));
  aPanel.add(aSubmit=new JButton("SUBMIT ADMINISTRATOR"));
  aPanel.setBounds(200,180,350,90);
  aPanel.setBackground(Color.WHITE);
   add(aPanel);
  setSize(800,400);
  aSubmit.addActionListener(this);
   setTitle("LOGIN FORM");
   setVisible(true);
   setResizable(false);
   }
  public void actionPerformed(ActionEvent e)
   {
	  if(e.getSource()==aSubmit)
	  {
		  String value1=aName.getText();
		   String value2=aPass.getText();
		   if (value1.equals("user1") && value2.equals("")) 
		   {
		JOptionPane.showMessageDialog(this,"HELLO "+value1+" YOU ARE SUCCESSFULLY LOGGED IN"); 
		setVisible(false);
	      
		   AdminLogin page=new AdminLogin(value1);
		   page.frame();
		   }
		   else{
			   JOptionPane.showMessageDialog(this,"Invalid Username and Password",
					    "Login Error",JOptionPane.ERROR_MESSAGE);
		   }}
	 }
			   
 
 
 public static void main(String arg[])throws Exception
   {
 new Login().frame();
   }
 }
 