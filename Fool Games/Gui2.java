import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener
{
	private JLabel title1;
	private JPanel panel1;
	private JButton Again,Exit1;
	public Gui2()
	{
		super("JUSTIFY");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		
		title1 = new JLabel("Yes You are Fool");
		title1.setBounds(200,70,500,100);
		title1.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		title1.setOpaque(true);
		panel1.add(title1);
		
		Again = new JButton("Again");
		Again.setBounds(250,200,100, 40);
		Again.addActionListener(this);
		panel1.add(Again);
		
		Exit1 = new JButton("Exit");
		Exit1.setBounds(400,200,100,40);
		Exit1.addActionListener(this);
		panel1.add(Exit1);
		
		this.add(panel1);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Again)
		{
			Gui N = new Gui();
			N.setVisible(true);
		}
		else if(ae.getSource()==Exit1)
		{
			System.exit(0);
		}
	}
}