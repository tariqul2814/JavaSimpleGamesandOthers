import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Gui extends JFrame implements MouseListener,ActionListener
{
	private JLabel title,title1;
	private JButton Yes,No,Exit;
	private JPanel panel;
	public Gui()
	{
		super("FOOL GAME");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		title = new JLabel("WELCOME TO FOOL GAME");
		title.setBounds(150,70,500,100);
		title.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		title.setOpaque(true);
		panel.add(title);
		
		title1 = new JLabel("ARE YOU FOOL ?(PROVE IT) YES OR NO");
		title1.setBounds(180,130,500,100);
		title1.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,20));
		title1.setOpaque(true);
		panel.add(title1);
		
		Yes = new JButton("YES");
		Yes.setBounds(250,250,100,40);
		Yes.addMouseListener(this);
		Yes.addActionListener(this);
		panel.add(Yes);
		
		No = new JButton("No");
		No.setBounds(400,250,100,40);
		No.addMouseListener(this);
		No.addActionListener(this);
		panel.add(No);
		
		Exit = new JButton("Exit");
		Exit.setBounds(325,325,100,40);
		//Exit.addMouseListener(this);
		//Exit.addActionListener(this);
		//panel.add(Exit);
		
		this.add(panel);
	}
	
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(Yes))
		{
			
		}
		else if(me.getSource().equals(No))
		{
			Random dice = new Random();
			int number,number2;
			number = dice.nextInt(700);
			number2 = dice.nextInt(400);
			//while(number2==250 || number2==249 || number2==248 || number2==247 || number2==246 || number2==245 || number2==244 || number2==243 || number2==242 || number2==241)
			//{
			//		number2 = dice.nextInt(400);
			//}
			//while(number==400 || number==401 || number==402 || number==403 || number==404 || number==405 || number==406 || number==407 || number==408 || number==409 || number==410)
			//{
			//	number = dice.nextInt(700);
			//}
			No.setBounds(number,number2,100,40);
			//No.addMouseListener(this);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(Yes))
		{
			
		}
		else if(me.getSource().equals(No))
		{
			
		}
	}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Yes)
		{
			Gui2 N = new Gui2();
			N.setVisible(true);
		}
		else if(ae.getSource()==No)
		{
			Gui3 N = new Gui3();
			N.setVisible(true);
		}
	}
	
}