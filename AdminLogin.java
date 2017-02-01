import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.*;
 public class AdminLogin extends BaseClass implements ActionListener{
  
    JPanel labelPanel,iconPanel;
    JButton recordButton,stockButton,dealerButton,retailerButton,b1,b2,b3,b4,logOut;
    ImageIcon i1,i2,i3,i4,i5;
    String s;
    AdminLogin(String value)
    {
    	s=value;
    }
    public void frame()
{
	 try {
setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("resource\\admin.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
	setLayout(null);
    JLabel lbl=new JLabel("WELCOME USER : "+s);
    lbl.setForeground(Color.ORANGE);
    lbl.setBounds(500,0,300,150);
    add(lbl);
    labelPanel=new JPanel(new GridLayout(1,4)); 
	labelPanel.add(recordButton = new JButton("Records"));        
      labelPanel.add(stockButton= new JButton("Stock Management"));
     labelPanel.add(dealerButton = new JButton("Dealers"));
     labelPanel.add(retailerButton = new JButton("Retailers"));
     labelPanel.setBounds(50,150,1000,50);
     add(labelPanel);  
     iconPanel=new JPanel(new GridLayout(1,4));
      i1 = new ImageIcon("resource\\record.jpg");
     b1=new JButton(i1);
    iconPanel.add(b1); 
    i2 = new ImageIcon("resource\\stock.png");
    b2=new JButton(i2);
   iconPanel.add(b2);
   i3= new ImageIcon("resource\\vendors.png");
   b3=new JButton(i3);
  iconPanel.add(b3); 
  i4= new ImageIcon("resource\\retailer.jpg");
  b4=new JButton(i4);
 iconPanel.add(b4);
  iconPanel.setBounds(50,200,1000,220);
      add(iconPanel);
        setSize(1100,550);
      setVisible(true);  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(true);
      i5= new ImageIcon("resource\\button_logout.png");
      logOut=new JButton(i5);
      logOut.setBounds(950,30,80,30);
      add(logOut);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      recordButton.addActionListener(this);
      stockButton.addActionListener(this);
      dealerButton.addActionListener(this);
      retailerButton.addActionListener(this);
      logOut.addActionListener(this);
   }
    public void onCall()
    {
    	setVisible(true);
    }
public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==recordButton||e.getSource()==b1)
	{
		setVisible(false);
		RecordsPage obj=new RecordsPage();
		obj.value(s);
		obj.frame();
	}
	else if(e.getSource()==stockButton||e.getSource()==b2)
	{
		setVisible(false);
	StockPage obj=new StockPage();
		obj.value(s);
		obj.frame();
			}
	else if(e.getSource()==dealerButton||e.getSource()==b3)
	{
		setVisible(false);
		DealersPage obj=new DealersPage();
		obj.value(s);
		obj.frame();
	}
	else if(e.getSource()==retailerButton||e.getSource()==b4)
	{
		setVisible(false);
			RetailersPage obj=new RetailersPage();
			obj.value(s);
			obj.frame();
	}
	else if(e.getSource()==logOut)
	{
		try {
			con.close();
		} catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(this,"Connection to the database closed & You are successfully logged out !");
		setVisible(false);
	}
}
}
