import java.awt.*;
import java.sql.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.*;
public class StockPage extends BaseClass implements ActionListener
{
	JTextArea ta;
	int i,j;
	JScrollPane jsp;
	String str;
	JButton previous;
	ImageIcon i1;
	void value(String st)
	{
		str=st;
	}
public void frame()
{
	ta=new JTextArea();
	getContentPane().setBackground(Color.DARK_GRAY);
	setVisible(true);
	setSize(520,500);
	setTitle("StockPage");
	setLayout(null);
	ta.setEditable(false);
	jsp=new JScrollPane(ta);jsp.setBounds(10,60,480,200);
	 jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	 jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);add(jsp);
	
	 i1 = new ImageIcon("resource\\back-button.png");
	   previous=new JButton(i1);
	previous.setBounds(20,390,50,50);
	add(previous);
	previous.addActionListener(this);

	func();
	
	
}
void func()
{
	try {
		rs=stmt.executeQuery("select * from stock");
		ta.setText("Product Name    \t\tPrice per Item\t         Quantity\n");
		while(rs.next())
		{
			ta.append("\n"+rs.getString("P_name")+"\t\t"+rs.getInt("PricePerItem")+"\t         "+rs.getInt("Quantity"));
			
		}
		} catch (Exception e) {
		e.printStackTrace();
	}
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==previous)
	{
		setVisible(false);
		new AdminLogin(str).frame();
	}

	}
}
