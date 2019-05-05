import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame implements ActionListener,ItemListener
{
	private JLabel Header,label1,label2,label3;
	private JButton Start,Exit;
	private JPanel panel;
	private JComboBox box1;
	public String n1="";
	public String n2="";
	
	public Game()
	{
		super("Tic Tac Toe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 600);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		String n = "TIC TAC TOE";
		Header = new JLabel(n);
		Header.setBounds(300,30,500,100);
		Header.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		Header.setOpaque(true);
		panel.add(Header);
		
		label1 = new JLabel("Choose 1st Player Mark: ");
		label1.setBounds(240,140,300,100);
		label1.setFont(new Font("Consolas",Font.BOLD,20));
		label1.setOpaque(true);
		panel.add(label1);
		
		label2 = new JLabel("");
		label2.setBounds(250,240,600,100);
		label2.setFont(new Font("Consolas",Font.BOLD,20));
		label2.setOpaque(true);
		panel.add(label2);
		
		label3 = new JLabel("Play With Keyboard Or Mouse Or Dual Mode");
		label3.setBounds(210,300,600,100);
		label3.setFont(new Font("Consolas",Font.BOLD,20));
		label3.setOpaque(true);
		panel.add(label3);
		
		String s[] = {"X","O"};
		box1 = new JComboBox(s);
		box1.setBounds(540,175,80,30);
		box1.setSelectedItem(null);
		box1.addItemListener(this);
		//box1.addItem("Hello");
		panel.add(box1);
		
		Start = new JButton("START");
		Start.setBounds(260,400,100,40);
		Start.addActionListener(this);
		panel.add(Start);
		
		Exit = new JButton("EXIT");
		Exit.setBounds(500,400,100,40);
		Exit.addActionListener(this);
		panel.add(Exit);
		
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Exit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==Start)
		{
			Game1 ga = new Game1(n1);
			ga.setVisible(true);
			this.setVisible(false);
		}
	}
	public void itemStateChanged(ItemEvent evt) {
		
		if(evt.getSource()==box1)
		{
			String value = (String) box1.getSelectedItem();
			String value1="";
			if(value.equals("X"))
			{
				n1=value;
				value1="O";
				n2=value1;
			}
			else if(value.equals("O"))
			{
				value1="X";
				n1=value;
				n2=value1;
			}
			String J = "1st Player: "+value+"  &&  2nd Player: "+value1;
			label2.setText(J);
		}
  }
	
}