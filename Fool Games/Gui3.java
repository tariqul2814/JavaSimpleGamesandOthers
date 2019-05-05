import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui3 extends JFrame implements ActionListener
{
	private JLabel title2;
	private JPanel panel2;
	private JButton Again2,Exit2;
	public Gui3()
	{
		super("JUSTIFY");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		
		title2 = new JLabel("Yes You are Not Fool");
		title2.setBounds(200,70,500,100);
		title2.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		title2.setOpaque(true);
		panel2.add(title2);
		
		Again2 = new JButton("Again");
		Again2.setBounds(280,200,100, 40);
		Again2.addActionListener(this);
		panel2.add(Again2);
		
		Exit2 = new JButton("Exit");
		Exit2.setBounds(430,200,100,40);
		Exit2.addActionListener(this);
		panel2.add(Exit2);
		
		this.add(panel2);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Again2)
		{
			Gui N = new Gui();
			N.setVisible(true);
		}
		else if(ae.getSource()==Exit2)
		{
			System.exit(0);
		}
	}
}