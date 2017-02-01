
import javax.swing.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDealer extends BaseClass implements ActionListener
{
JButton delete,cancel;
JTextField t1;
JPanel panel;
	DeleteDealer()
{
	setSize(500,200);
	setResizable(false);
	setLayout(null);
	JLabel vid=new JLabel("Enter Dealer's Id");
     delete=new JButton("Delete");
	cancel=new JButton("Cancel");
	t1=new JTextField(15);
	
	vid.setBounds(20,20,200,50);
	t1.setBounds(160,30,100,30);
	delete.setBounds(190,100,130,30);
	cancel.setBounds(330,100,130,30);
	add(vid);
	add(t1);
	add(delete);
	add(cancel);
	setVisible(true);
	cancel.addActionListener(this);
	delete.addActionListener(this);
}
	public void actionPerformed(ActionEvent e) 
	{
	if(e.getSource()==cancel)
	{
		int n = JOptionPane.showConfirmDialog(this,"Are you sure you want to cancel?","Confirm",
			    JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(this,"Deletion Cancelled !");
		setVisible(false);
		}}
	else if(e.getSource()==delete)
	{
		if(t1.getText().equals(""))
			JOptionPane.showMessageDialog(this,"Please enter the id !");
		else
		{
		try {
	        String s="delete from dealer "+"where D_id ="+t1.getText();
			System.out.println(s);
	        int i=stmt.executeUpdate(s);
	        if(i==1)
	        {
	        JOptionPane.showMessageDialog(this,"Successfully Deleted !");
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
