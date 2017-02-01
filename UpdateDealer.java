import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class UpdateDealer extends BaseClass implements ActionListener
{
JButton update,cancel;
JTextField t1,t2,t3,t4,t5;
	UpdateDealer()
{
	setSize(500,400);
	setResizable(false);
	setLayout(null);
	JLabel id=new JLabel("Id");
	JLabel name=new JLabel("Name");
	JLabel contact=new JLabel("Contact");
	JLabel email=new JLabel("Email_Id");
	JLabel address=new JLabel("Address");
	update=new JButton("Update");
	cancel=new JButton("Cancel");
	t1=new JTextField(15);
	t2=new JTextField(15);
	t3=new JTextField(15);
	t4=new JTextField(15);
	t5=new JTextField(15);
	id.setBounds(20,20,150,50);
	t1.setBounds(200,30,100,30);
	name.setBounds(20,70,150,50);
	t2.setBounds(200,80,100,30);
	contact.setBounds(20,120,150,50);
	t3.setBounds(200,130,100,30);
	email.setBounds(20,170,150,50);
	t4.setBounds(200,180,100,30);
	address.setBounds(20,220,150,50);
	t5.setBounds(200,230,100,30);
	update.setBounds(190,300,130,30);
	cancel.setBounds(330,300,130,30);
	add(id);
	add(t1);
	add(name);
	add(t2);
add(contact);
	add(t3);
	add(email);
	add(t4);
	add(address);
	add(t5);
	add(update);
	add(cancel);
		setVisible(true);
	cancel.addActionListener(this);
	update.addActionListener(this);
}
	public void actionPerformed(ActionEvent e) 
	{
	if(e.getSource()==cancel)
	{
		int n = JOptionPane.showConfirmDialog(this,"Are you sure you want to cancel?","Confirm",
			    JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION)
		{JOptionPane.showMessageDialog(this,"Updation Cancelled !");
		setVisible(false);}
	}
	else if(e.getSource()==update)
	{
		try {
	        String s="update dealer"+" set D_name='"+t2.getText()+"',D_contact='"+t3.getText()+"',D_email='"+t4.getText()+"',D_address='"+t5.getText()+"' where D_id="+t1.getText()+";";
			System.out.println(s);
	        int i=stmt.executeUpdate(s);
	        if(i==1)
	        {
	JOptionPane.showMessageDialog(this,"Successfully Updated !");
	setVisible(false);
	        }
	        else
	        	JOptionPane.showMessageDialog(this,"Please enter valid details !");	
		} 
		catch (Exception arg)
		{
			 JOptionPane.showMessageDialog(this,"Please enter valid details !"); 	
		}
		
	}
		}
}

