import javax.swing.*;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class RetailerRecord extends BaseClass implements ActionListener
 {
	JButton addRetailer,delete,update,previous;
	JPanel p1;
	JTextArea jt;
	ImageIcon i1;
	String str;
	void value(String st)
	{
		str=st;
	}
public void frame()
  {
	addRetailer=new JButton("Add Retailer");
	delete=new JButton("Delete Retailer");
	update=new JButton("Update Retailer");
	addRetailer.setBounds(110,300,150,30);
	  i1 = new ImageIcon("resource\\back-button.png");
	    previous=new JButton(i1);
	previous.setBounds(5,290,50,50);
	delete.setBounds(280,300,120,30);
	update.setBounds(420,300,170,30);
	add(addRetailer);
	add(delete);
	add(update);
	add(previous);
 setLayout(null);
  setTitle("Retailers");
  setSize(700,400);
  setVisible(true);
  setResizable(true); 
  addRetailer.addActionListener(this);
  delete.addActionListener(this);
  update.addActionListener(this);
  previous.addActionListener(this);

  /*String data[][]={{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},
			{"","","","","","",""},{"","","","","","",""},
	{"","","","","","",""},{"","","","","","",""},
	{"","","","","","",""},{"","","","","","",""},
	{"","","","","","",""},{"","","","","","",""}};
	String column[]={"Id","Name","Contact","Email Id","Address","Amount Paid","Amount Left"};*/
	/* p1=new JPanel(new BorderLayout(3,3));
	jt=new JTextArea();
	jt.setEditable(false);
	p1.add(jt,BorderLayout.CENTER);
	JScrollPane jsp=new JScrollPane(jt);
	p1.add(jsp,BorderLayout.EAST);
	p1.setBounds(10,20,600,200);func();
	add(p1);*/
    jt=new JTextArea();
 	jt.setEditable(false);
 	func();
 	JScrollPane jsp=new JScrollPane(jt);
 	jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	 jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);jsp.setBounds(10,20,600,200);
	 add(jsp);
	setResizable(false);
   }
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==addRetailer)
new AddRetailer();
if(e.getSource()==delete)
new DeleteRetailer();
if(e.getSource()==update)
new UpdateRetailer();
if(e.getSource()==previous)
{
	setVisible(false);
	RetailersPage obj=new RetailersPage();
	obj.value(str);
	obj.frame();
}

	}
  
void func()
{
	try {
		rs=stmt.executeQuery("select * from retailer");
		jt.setText("Id\tName\tContact\tEmailId\tAddress\tAmountPaid\tAmountLeft\n");
		while(rs.next())
		{
			jt.append("\n"+rs.getInt("R_id")+"\t"+rs.getString("R_name")+"\t"+rs.getString("R_contact")+"\t"+rs.getString("R_email")+"\t"+rs.getString("R_address")+"\t"+rs.getInt("R_AmountLeft")+"\t"+rs.getInt("R_AmountPaid"));
			
		}
		} 
	catch (Exception e) {
		e.printStackTrace();
	}
}
}


