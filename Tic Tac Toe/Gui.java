import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener
{
	private JLabel label;
	private JPanel panel;
	private JButton Single,Double;
	
	public Gui()
	{
		super("Tic Tac Toe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 600);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label = new JLabel("TIC TAC TOE");
		label.setBounds(300,30,500,100);
		label.setFont(new Font("Consolas",Font.BOLD,40));
		label.setOpaque(true);
		panel.add(label);
		
		Single = new JButton("Single Player");
		Single.setBounds(200,100,400,100);
		Single.addActionListener(this);
		panel.add(Single);
		
		Double = new JButton("Double Player");
		Double.setBounds(200,280,400,100);
		Double.addActionListener(this);
		panel.add(Double);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Single)
		{
			Gamee l = new Gamee();
			l.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==Double)
		{
			Game l = new Game();
			l.setVisible(true);
			this.setVisible(false);
		}
	}
}