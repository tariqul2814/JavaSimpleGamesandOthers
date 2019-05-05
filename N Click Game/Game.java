import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Game extends JFrame implements ActionListener
{
	private JPanel panel;
	private JLabel title;
	private JButton Play,Exit;
	public Game()
	{
		super("N-Click Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		title = new JLabel("WELCOME TO N-Click");
		title.setBounds(180,70,500,100);
		title.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		title.setOpaque(true);
		panel.add(title);
		
		Play = new JButton("Play");
		Play.setBounds(250,250,100,40);
		Play.addActionListener(this);
		panel.add(Play);
		
		Exit = new JButton("Exit");
		Exit.setBounds(400,250,100,40);
		Exit.addActionListener(this);
		panel.add(Exit);
		
		this.add(panel);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Play)
		{
			Nclick g = new Nclick();
			g.setVisible(true);
		}
		else if(ae.getSource()==Exit)
		{
			System.exit(0);
		}
	}
}