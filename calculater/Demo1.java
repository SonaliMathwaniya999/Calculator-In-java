import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

class Tictac extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
int a=0;
Tictac()
{
	setLayout(new GridLayout(3,3));
	
	 
	
	b1=new JButton();
	
	b2=new JButton();
	b3=new JButton();
	b4=new JButton();
	b5=new JButton();
	b6=new JButton();
	b7=new JButton();
	b8=new JButton();
	b9=new JButton();
	 
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	add(b8);
	add(b9);
	 
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	 
	
	
}
public void actionPerformed(ActionEvent e)
{
	JButton b=(JButton)e.getSource(); 
	 if(a%2==0)
	 {
		 b.setText("X");
	 }	
	 else
	 {
		 b.setText("O");
		 	 
	 }
	 
	 b.removeActionListener(this);
	a++;
	
	if(
	(b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X")
	||
	(b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X")
	||
	(b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X")
	||
	(b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X")
	||
	(b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X")
	||
	(b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X")
	||
	(b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X")
	||
	(b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X")
	
	)
	{
		JOptionPane.showMessageDialog(new JFrame(),"Player 'ONE' is winner"); 
	}
	else if(
	(b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O")
	||
	(b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O")
	||
	(b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O")
	||
	(b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O")
	||
	(b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O")
	||
	(b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O")
	||
	(b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O")
	||
	(b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O")
	
	)
	{
		JOptionPane.showMessageDialog(new JFrame(),"Player 'TWO' is winner"); 
	}
}



}

class Demo1
{
public static void main(String ar[])
{


Tictac c=new Tictac();
c.setVisible(true);

c.setSize(500,500);

c.setLocation(500,100);

}
}