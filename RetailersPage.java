import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class RetailersPage extends BaseClass implements ActionListener
{
	JButton newOrder,recordRetailer,previous;
	String str;
	ImageIcon i1;
	void value(String st)
	{
		str=st;
	}
public void frame()
{
	getContentPane().setBackground(Color.DARK_GRAY);
	setTitle("Retailer's Page");
	setLayout(null);
    newOrder = new JButton("PLACE NEW ORDER");     
    recordRetailer = new JButton("RECORD OF RETAILERS"); 
    newOrder.setBounds(250,100,150,50);
    recordRetailer.setBounds(450,100,200,50);
    add(newOrder);
    add(recordRetailer);
    i1 = new ImageIcon("resource\\back-button.png");
	    previous=new JButton(i1);
    previous.setBounds(60,200,50,50);
    add(previous);
    previous.addActionListener(this);
        setSize(900,300);
      setVisible(true);  
      setResizable(false);
      newOrder.addActionListener(this);
      recordRetailer.addActionListener(this);
      
}
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==newOrder)
	{
		setVisible(false);
	new RetailerOrder().value(str);
	}
	else if(e.getSource()==previous)
	{
		setVisible(false);
	new AdminLogin(str).frame();
	}
	else if(e.getSource()==recordRetailer)
	{
		setVisible(false);
	RetailerRecord obj=new RetailerRecord();
	obj.value(str);
	obj.frame();
	}
	

}
}
