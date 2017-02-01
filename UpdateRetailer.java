import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class UpdateRetailer extends BaseClass implements ActionListener
{
JButton update,cancel;
JTextField t1,t2,t3,t4,t5,t6,t7;
	UpdateRetailer()
{
	setSize(500,460);
	setResizable(false);
	setLayout(null);
	JLabel rid=new JLabel("Retailer's Id");
	JLabel r_name=new JLabel("Retailer's Name");
	JLabel contact=new JLabel("Contact number");
	JLabel email=new JLabel("Email Id");
	JLabel address=new JLabel("Address");
	JLabel a_paid=new JLabel("Amount Paid");
	JLabel a_left=new JLabel("Amount Left");
	update=new JButton("Update");
	cancel=new JButton("Cancel");
	t1=new JTextField(15);
	t2=new JTextField(15);
	t3=new JTextField(15);
	t4=new JTextField(15);
	t5=new JTextField(15);
	t6=new JTextField(15);
	t7=new JTextField(15);
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
	a_paid.setBounds(20,270,150,50);
	t6.setBounds(200,280,100,30);
	a_left.setBounds(20,320,150,50);
	t7.setBounds(200,330,100,30);
	update.setBounds(190,370,130,30);
	cancel.setBounds(330,370,130,30);
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
	add(a_paid);
	add(t6);
	add(a_left);
	add(t7);
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
		{JOptionPane.showMessageDialog(this,"Updation of Retailer Cancelled !");
		setVisible(false);}
	}
	else if(e.getSource()==update)
	{
		try {
			String s="update retailer"+" set R_name='"+t2.getText()+"',R_contact='"+t3.getText()+"',R_email='"+t4.getText()+"',R_address='"+t5.getText()+"',R_AmountLeft="+t6.getText()+",R_AmountPaid="+t7.getText()+" where  R_id="+t1.getText()+";";
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

