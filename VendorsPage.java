import javax.swing.*;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class DealersPage extends BaseClass implements ActionListener
 {
	JButton addDealer,delete,update,previous;
	JPanel p1;
	JTextArea jt;
	String str;
	ImageIcon i1;
	void value(String st)
	{
		str=st;
	}
public void frame()
  {
	addDealer=new JButton("Add Dealer");
	delete=new JButton("Delete Dealer");
	update=new JButton("Update Dealer");
	addDealer.setBounds(200,300,100,30);
	delete.setBounds(310,300,120,30);
	update.setBounds(440,300,120,30);
	 i1 = new ImageIcon("resource\\back-button.png");
	   previous=new JButton(i1);
	previous.setBounds(20,300,50,50);
add(addDealer);
	add(delete);
	add(update);
	add(previous);
 setLayout(null);
  setTitle("Dealers");
  setSize(700,400);
  setVisible(true);
  setResizable(true); 
  previous.addActionListener(this);
addDealer.addActionListener(this);
  delete.addActionListener(this);
  update.addActionListener(this);
  /*String data[][]={{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},
			{"","","","",""},{"","","","",""},
	{"","","","",""},{"","","","",""},
	{"","","","",""},{"","","","",""},
	{"","","","",""},{"","","","",""}};
	String column[]={"Id","Name","Contact","Email_Id","Address"};*/
    //p1=new JPanel(new BorderLayout(3,3));
 	jt=new JTextArea();
 	jt.setEditable(false);
 	//p1.add(jt,BorderLayout.CENTER);
 	JScrollPane jsp=new JScrollPane(jt);
 	//p1.add(jsp,BorderLayout.EAST);
 	
 	jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	 jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);jsp.setBounds(10,20,600,200);
	 add(jsp);
	 func();
 	
 	setResizable(false);
   }
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==addDealer)
new AddDealer();
if(e.getSource()==delete)
new DeleteDealer();
if(e.getSource()==update)
new UpdateDealer();
if(e.getSource()==previous)
{
	setVisible(false);
	new AdminLogin(str).frame();
}

}
void func()
{
	try {
		rs=stmt.executeQuery("select * from dealer");
		jt.setText("Id\tName\tContact\tEmailId\tAddress\n");
		while(rs.next())
		{
			jt.append("\n"+rs.getInt("D_id")+"\t"+rs.getString("D_name")+"\t"+rs.getString("D_contact")+"\t"+rs.getString("D_email")+"\t"+rs.getString("D_address"));
			
		}
		}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}

 

