import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Order extends BaseClass implements ActionListener{
JButton place,cancel;
JTextField t1,t2,t3;
JPanel panel;
	Order()
{
	setSize(500,300);
	setResizable(false);
	setLayout(null);
	JLabel vid=new JLabel("Vendor's Id");
	JLabel p_name=new JLabel("Product Name");
	JLabel quan=new JLabel("Quantity");
	place=new JButton("Place Order");
	cancel=new JButton("Cancel");
	t1=new JTextField(15);
	t2=new JTextField(15);
	t3=new JTextField(15);
	vid.setBounds(20,20,100,50);
	t1.setBounds(130,30,100,30);
	p_name.setBounds(20,70,100,50);
	t2.setBounds(130,80,100,30);
	quan.setBounds(20,120,100,50);
	t3.setBounds(130,130,100,30);
	place.setBounds(190,200,130,30);
	cancel.setBounds(330,200,130,30);
	add(vid);
	add(t1);
	add(p_name);
	add(t2);
add(quan);
	add(t3);
	add(place);
	add(cancel);
		setVisible(true);
	place.addActionListener(this);
	cancel.addActionListener(this);
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
		}
		}
	else if(e.getSource()==place)
	{
		JOptionPane.showMessageDialog(this,"Successfully Placed !");
		setVisible(false);
	}
		}
}
