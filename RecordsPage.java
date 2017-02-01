import java.awt.Color;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;
public class RecordsPage extends BaseClass implements ActionListener
{
	JButton b1,b2,b3,addToShip,previous;
	JTable t;
	JPanel p;
	JTextArea ta;
	String str;
	ImageIcon i1;
	void value(String st)
	{
		str=st;
	}
     void frame()
     {
    	 
    	 setVisible(true);
    	 setSize(995,505);
    	 getContentPane().setBackground(Color.GRAY);
    	 setResizable(true);
    	 setLayout(null);
    	 ta=new JTextArea();
    	 b1=new JButton("Unshipped");b1.setBounds(0,0,200,60);add(b1);
    	 b2=new JButton("Shipped");b2.setBounds(200,0,200,60);add(b2);
    	 b3=new JButton("New Order");b3.setBounds(400,0,200,60);add(b3);
    	 i1 = new ImageIcon("resource\\back-button.png");
  	   previous=new JButton(i1);
 		previous.setBounds(820,100,50,50);
 		add(previous);
 		addToShip=new JButton("Add to Shipped");
 		addToShip.setBounds(780,350,150,50);
 		add(addToShip);
 		addToShip.addActionListener(this);
 		previous.addActionListener(this);

    	 //String[] s1={"Order_id","Retailer_id","Retailer_Name","quantity","Price","DOD"};
    	 /*String[][] s2={{"","","","","",""},{"","","","","",""}, {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""}, 
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""}, 
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},
    			 {"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""}};
    	 t=new JTable(s2,s1);*/ta.setBounds(0,70,700,700);
      	 JScrollPane sp=new JScrollPane(ta);sp.setBounds(0,60,700,400);
    	 sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    	 sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	 add(sp);

    	 b1.addActionListener(this);b2.addActionListener(this);
    	 b3.addActionListener(this);
    	  	 add(ta);
     }
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Unshipped"))
		{/*String[] s1={"Order_id","Retailer_id","Retailer_Name","quantity","Price","DOD"};
	    	 String[][] s2={{"","","","","",""},{"","","","","",""}, {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""}, 
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""}, 
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},
	    			 {"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""}};
	    	 t=new JTable(s2,s1);t.setBounds(0,40,1000,700);*/
	    	 JScrollPane sp=new JScrollPane(t);add(sp);sp.setBounds(0,60,700,400);
	    	 sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    	 sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

			try{
		  rs=stmt.executeQuery("select * from unshipped");
		  ta.setText("Order_id\tRetailer_id\t\tQuantity\tPrice\tDOD\n");
		  while(rs.next())
			{
				ta.append("\n"+rs.getInt("Order_id")+"\t"+rs.getInt("Retailer_id")+"\t\t"+rs.getInt("quantity")+"\t"+rs.getFloat("Price")+"\t"+rs.getString("DOD"));
				
			}
			}catch(Exception a)
			{
				System.out.println(a);
			}
		}
		else if(e.getActionCommand().equals("Shipped"))
		{
			/*String[] s1={"Order_id","Retailer_id","Retailer_Nme","quantity","price"};
	    	 String[][] s2={{"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""},
	    			 {"","","","",""}};
	    	 t=new JTable(s2,s1);t.setBounds(0,40,1000,700);*/
	    	 JScrollPane sp=new JScrollPane(t);add(sp);sp.setBounds(0,60,700,400);
			sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			 sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

			try{
		  rs=stmt.executeQuery("select * from shipped");
		  ta.setText("Order_id\tRetailer_id\t\tQuantity\tPrice\n");
			while(rs.next())
			{
				ta.append("\n"+rs.getInt("Order_id")+"\t"+rs.getInt("Retailer_id")+"\t\t"+rs.getInt("quantity")+"\t"+rs.getFloat("Price"));
				
			}
			}catch(Exception a)
			{}
		}
		else if(e.getActionCommand().equals("New Order"))
		{
			 
			new Form();
			
		}
		else if(e.getSource()==previous)
		{
			setVisible(false);
			new AdminLogin(str).frame();
		}
		else if(e.getSource()==addToShip)
		{
			new AddToShip();
		}
}
}
class AddToShip extends BaseClass implements ActionListener
{
	JButton shipped,cancel;
	JTextField t1;
		AddToShip()
	{
		setSize(500,200);
		setResizable(false);
		setLayout(null);
		JLabel oid=new JLabel("Enter Order Id");
	     shipped=new JButton("Shipped");
		cancel=new JButton("Cancel");
		t1=new JTextField(15);
		oid.setBounds(20,20,200,50);
		t1.setBounds(160,30,100,30);
		shipped.setBounds(190,100,130,30);
		cancel.setBounds(330,100,130,30);
		add(oid);
		add(t1);
		add(shipped);
		add(cancel);
		setVisible(true);
		cancel.addActionListener(this);
		shipped.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e) 
		{
		if(e.getSource()==cancel)
		{
			int n = JOptionPane.showConfirmDialog(this,"Are you sure you want to cancel?","Confirm",
				    JOptionPane.YES_NO_OPTION);
			if(n==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(this,"Shipping Cancelled !");
			setVisible(false);
			}}
		else if(e.getSource()==shipped)
		{
			if(t1.getText().equals(""))
				JOptionPane.showMessageDialog(this,"Please enter the id !");
			else
			{
			try {
		        String s="insert into shipped select Order_id,Retailer_id,quantity,Price from unshipped where Order_id ="+t1.getText()+";";
				System.out.println(s);
		        int i=stmt.executeUpdate(s);
		        String s1="delete from unshipped where Order_id ="+t1.getText()+";";
				System.out.println(s1);
		        int j=stmt.executeUpdate(s1);
		        if(i==1&&j==1)
		        {
		        JOptionPane.showMessageDialog(this,"Successfully Added !");
		        setVisible(false);
		        }
		        else
		        	JOptionPane.showMessageDialog(this,"Please enter a valid id !");
			} catch (Exception arg) {
				
			}
			}
		}
			}
}
class Form extends BaseClass implements ActionListener
{
	JLabel lbl1,lbl3,lbl4,lbl5,lbl6;
	JTextField t1,t3,t4,t5,t6;
	Form()
	{
		
		setVisible(true);
   	 setSize(500,500);
   	 setResizable(true);
   	 setLayout(null);setTitle("Form");JButton b=new JButton("Submit");
   	 b.setBounds(150,350,200,40);
	JPanel p=new JPanel();p.setLayout(null);p.setBounds(0,0,500,500);
	lbl1=new JLabel("Retailer Id");t1=new JTextField(50);
	lbl3=new JLabel("Quantity");lbl4=new JLabel("Price");lbl5=new JLabel("Date of Delivery");
	JLabel dteFormat=new JLabel("(yyyy/mm/dd)");
	dteFormat.setBounds(30,270,200,40);
	add(dteFormat);
	lbl6=new JLabel("Order_id");
	t3=new JTextField(50);t4=new JTextField(50);t5=new JTextField(50);t6=new JTextField(50);
	lbl6.setBounds(30,50,200,40);t6.setBounds(250,50,200,40);
	lbl1.setBounds(30,100,200,40);t1.setBounds(250,100,200,40);
	lbl3.setBounds(30,150,200,40);t3.setBounds(250,150,200,40);
	lbl4.setBounds(30,200,200,40);t4.setBounds(250,200,200,40);
	lbl5.setBounds(30,250,200,40);t5.setBounds(250,250,200,40);
	p.add(lbl6);p.add(t6);
	p.add(lbl3);p.add(lbl4);p.add(t3);p.add(t4);p.add(lbl5);p.add(t5);
	p.add(lbl1);p.add(t1);p.add(b);add(p);
	b.addActionListener(this);
}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Submit"))
		{
			if(t6.getText().equals("")||t1.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"Fill up the full details");
				
			}else
			{
			 try
			 {
		    	   String s="insert into unshipped"+" values("+t6.getText()+","+t1.getText()+","+t3.getText()+","+t4.getText()+",'"+t5.getText()+"');";
					System.out.println(s);
				int i=stmt.executeUpdate(s);
				if(i==1)
				{
				JOptionPane.showMessageDialog(this,"Successfully Placed !");
				setVisible(false);
				}
				else
					JOptionPane.showMessageDialog(this,"Please enter valid details !");	
			}
		    catch(Exception e1)
		    {
		    	JOptionPane.showMessageDialog(this,"Please enter valid details !");	
		    	t1.setText("");
		    	t3.setText("");
		    	t4.setText("");
		    	t5.setText("");
		    	t6.setText("");
			}
		    }
		}
	}
}
