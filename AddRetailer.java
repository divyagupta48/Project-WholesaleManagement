import javax.swing.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class AddRetailer extends BaseClass implements ActionListener
{
JButton add,cancel;
JTextField t1,t2,t3,t4,t5;
	AddRetailer()
{
	setSize(500,400);
	setResizable(true);
	setLayout(null);
	JLabel rid=new JLabel("Retailer's Id");
	JLabel r_name=new JLabel("Retailer's Name");
	JLabel contact=new JLabel("Contact number");
	JLabel email=new JLabel("Email Id");
	JLabel address=new JLabel("Address");
	add=new JButton("Add");
	cancel=new JButton("Cancel");
	t1=new JTextField(15);
	t2=new JTextField(15);
	t3=new JTextField(15);
	t4=new JTextField(15);
	t5=new JTextField(15);
	rid.setBounds(20,20,150,50);
	t1.setBounds(200,30,100,30);
	r_name.setBounds(20,70,150,50);
	t2.setBounds(200,80,100,30);
	contact.setBounds(20,120,150,50);
	t3.setBounds(200,130,100,30);
	email.setBounds(20,170,150,50);
	t4.setBounds(200,180,100,30);
	address.setBounds(20,220,150,50);
	t5.setBounds(200,230,100,30);
	add.setBounds(190,300,130,30);
	cancel.setBounds(330,300,130,30);
	add(rid);
	add(t1);
	add(r_name);
	add(t2);
add(contact);
	add(t3);
	add(email);
	add(t4);
	add(address);
	add(t5);
	add(add);
	add(cancel);
		setVisible(true);
	cancel.addActionListener(this);
	add.addActionListener(this);
}
public void actionPerformed(ActionEvent e) 
{
if(e.getSource()==cancel)
{
	int n = JOptionPane.showConfirmDialog(this,"Are you sure you want to cancel?","Confirm",
		    JOptionPane.YES_NO_OPTION);
	if(n==JOptionPane.YES_OPTION)
	{JOptionPane.showMessageDialog(this,"Addition of new Retailer Cancelled !");
	setVisible(false);}
}
else if(e.getSource()==add)
{
	if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Fill up the full details..!");
		
	}
else
{
	try {
        String s="insert into retailer"+" values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"',0,0)";
		System.out.println(s);
       int i=stmt.executeUpdate(s);
       if(i==1)
       {
JOptionPane.showMessageDialog(this,"Successfully Added !");
setVisible(false);
       }
       else
    	   JOptionPane.showMessageDialog(this,"Please enter valid details !");
	} catch (Exception arg)
	{
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		 JOptionPane.showMessageDialog(this,"Please enter valid details !"); 	
	}
}
	
}
	}
}


