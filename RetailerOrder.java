import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class RetailerOrder extends BaseClass implements ActionListener{
JButton place,cancel;
JTextField t1,t2,t3,t4,t5;
JPanel panel;
String str;
	RetailerOrder()
{
	setSize(550,350);
	setResizable(false);
	setLayout(null);
	JLabel rid=new JLabel("Retailer's Id");
	JLabel p_name=new JLabel("Product Name");
	JLabel quan=new JLabel("Quantity");
	JLabel amount_paid=new JLabel("Amount Paid(in rupees)");
	JLabel amount_left=new JLabel("Amount Left(in rupees)");
	place=new JButton("Place Order");
	cancel=new JButton("Cancel");
	t1=new JTextField(15);
	t2=new JTextField(15);
	t3=new JTextField(15);
	t4=new JTextField(15);
	t5=new JTextField(15);
	rid.setBounds(20,20,150,50);
	t1.setBounds(230,30,100,30);
	p_name.setBounds(20,70,150,50);
	t2.setBounds(230,80,100,30);
	quan.setBounds(20,120,150,50);
	t3.setBounds(230,130,100,30);
	amount_paid.setBounds(20,170,150,50);
	t4.setBounds(230,180,100,30);
	amount_left.setBounds(20,220,150,50);
	t5.setBounds(230,230,100,30);
	place.setBounds(190,270,130,30);
	cancel.setBounds(330,270,130,30);
	add(rid);
	add(t1);
	add(p_name);
	add(t2);
add(quan);
	add(t3);
	add(amount_paid);
	add(t4);
	add(amount_left);
	add(t5);
	add(place);
	add(cancel);
		setVisible(true);
	place.addActionListener(this);
	cancel.addActionListener(this);
}
	void value(String st)
	{
		str=st;
	}
	public void actionPerformed(ActionEvent e) 
	{
	if(e.getSource()==cancel)
	{
		int n = JOptionPane.showConfirmDialog(this,"Are you sure you want to cancel?","Confirm",
			    JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(this,"Order Cancelled !");
		setVisible(false);
		RetailersPage obj=new RetailersPage();
		obj.value(str);
		obj.frame();
		}
		
		}
	else if(e.getSource()==place)
	{
		JOptionPane.showMessageDialog(this,"Successfully Placed !");
		setVisible(false);
		RetailersPage obj=new RetailersPage();
		obj.value(str);
		obj.frame();
	}
		}
}

