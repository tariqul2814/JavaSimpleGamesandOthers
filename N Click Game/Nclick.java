import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Nclick extends JFrame implements ActionListener,MouseListener,Runnable
{
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,PlayAgain,Exit;
	private JLabel label,title;
	private JPanel panel;
	private JTextField userTF;
	
	public static int counter=0;
	public static int counter1=0;
	public static int countall=0;
	public int arr[] = new int[20];
	
	public Nclick()
	{
		super("Click N Score");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,600);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		String n = Integer.toString(counter);
		title = new JLabel("Your Score: "+n);
		title.setBounds(280,70,500,100);
		title.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		title.setOpaque(true);
		panel.add(title);
		
		button1 = new JButton("Button 1");
		button1.setBounds(180,170,100,40);
		button1.setBackground(Color.GREEN);
		button1.addActionListener(this);
		button1.addMouseListener(this);
		panel.add(button1);
		
		button2 = new JButton("Button 2");
		button2.setBounds(180,230,100,40);
		button2.setBackground(Color.GREEN);
		button2.addMouseListener(this);
		button2.addActionListener(this);
		panel.add(button2);
		
		button3 = new JButton("Button 3");
		button3.setBounds(180,290,100,40);
		button3.setBackground(Color.GREEN);
		button3.addActionListener(this);
		button3.addMouseListener(this);
		panel.add(button3);
		
		button4 = new JButton("Button 4");
		button4.setBounds(180,350,100,40);
		button4.setBackground(Color.GREEN);
		button4.addActionListener(this);
		button4.addMouseListener(this);
		panel.add(button4);
		
		button5 = new JButton("Button 5");
		button5.setBounds(180,410,100,40);
		button5.setBackground(Color.GREEN);
		button5.addActionListener(this);
		button5.addMouseListener(this);
		panel.add(button5);
		
		button6 = new JButton("Button 6");
		button6.setBounds(560,170,100,40);
		button6.setBackground(Color.GREEN);
		button6.addActionListener(this);
		button6.addMouseListener(this);
		panel.add(button6);
		
		button7 = new JButton("Button 7");
		button7.setBounds(560,230,100,40);
		button7.setBackground(Color.GREEN);
		button7.addActionListener(this);
		button7.addMouseListener(this);
		panel.add(button7);
		
		button8 = new JButton("Button 8");
		button8.setBounds(560,290,100,40);
		button8.setBackground(Color.GREEN);
		button8.addActionListener(this);
		button8.addMouseListener(this);
		panel.add(button8);
		
		button9 = new JButton("Button 9");
		button9.setBounds(560,350,100,40);
		button9.setBackground(Color.GREEN);
		button9.addActionListener(this);
		button9.addMouseListener(this);
		panel.add(button9);
		
		button10 = new JButton("Button 10");
		button10.setBounds(560,410,100,40);
		button10.setBackground(Color.GREEN);
		button10.addActionListener(this);
		button10.addMouseListener(this);
		panel.add(button10);
		
		Exit = new JButton("Exit");
		Exit.setBounds(380,480,100,40);
		Exit.setBackground(Color.GREEN);
		Exit.addActionListener(this);
		Exit.addMouseListener(this);
		panel.add(Exit);
		
		this.add(panel);
		
	}
	
	public void colorchange()
	{
		if(counter1==1)
		{
			button1.setBounds(180,170,100,40);
			button1.setBackground(Color.GREEN);
		}
		else if(counter1==2)
		{
			button2.setBounds(180,230,100,40);
			button2.setBackground(Color.GREEN);
		}
		else if(counter1==3)
		{
			button3.setBounds(180,290,100,40);
			button3.setBackground(Color.GREEN);
		}
		else if(counter1==4)
		{
			button4.setBounds(180,350,100,40);
			button4.setBackground(Color.GREEN);
		}
		else if(counter1==5)
		{
			button5.setBounds(180,410,100,40);
			button5.setBackground(Color.GREEN);
		}
		else if(counter1==6)
		{
			button6.setBounds(560,170,100,40);
			button6.setBackground(Color.GREEN);
		}
		else if(counter1==7)
		{
			button7.setBounds(560,230,100,40);
			button7.setBackground(Color.GREEN);
		}
		else if(counter1==8)
		{
			button8.setBounds(560,290,100,40);
			button8.setBackground(Color.GREEN);
		}
		else if(counter1==9)
		{
			button9.setBounds(560,350,100,40);
			button9.setBackground(Color.GREEN);
		}
		else if(counter1==10)
		{
			button10.setBounds(560,410,100,40);
			button10.setBackground(Color.GREEN);
		}
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Random dice = new Random();
			counter1= 1 + dice.nextInt(10);
			if(i!=0)
			{
				if(arr[i-1]==counter1)
				{
					i--;
					continue;
				}
				else
				{
					arr[i]=counter1;
				}
				
			}
			else if(i==0)
			{
				arr[i]=counter1;
			}
			if(counter1==1)
			{
				button1.setBounds(180,170,100,40);
				button1.setBackground(Color.CYAN);
			}
			else if(counter1==2)
			{
				button2.setBounds(180,230,100,40);
				button2.setBackground(Color.CYAN);
			}
			else if(counter1==3)
			{
				button3.setBounds(180,290,100,40);
				button3.setBackground(Color.CYAN);
			}
			else if(counter1==4)
			{
				button4.setBounds(180,350,100,40);
				button4.setBackground(Color.CYAN);
			}
			else if(counter1==5)
			{
				button5.setBounds(180,410,100,40);
				button5.setBackground(Color.CYAN);
			}
			else if(counter1==6)
			{
				button6.setBounds(560,170,100,40);
				button6.setBackground(Color.CYAN);
			}
			else if(counter1==7)
			{
				button7.setBounds(560,230,100,40);
				button7.setBackground(Color.CYAN);
			}
			else if(counter1==8)
			{
				button8.setBounds(560,290,100,40);
				button8.setBackground(Color.CYAN);
			}
			else if(counter1==9)
			{
				button9.setBounds(560,350,100,40);
				button9.setBackground(Color.CYAN);
			}
			else if(counter1==10)
			{
				button10.setBounds(560,410,100,40);
				button10.setBackground(Color.CYAN);
			}
			try{
				Thread.sleep(1350);
				colorchange();
			}
			catch(Exception e){}
		}
		countall=1;
		check();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if((ae.getSource()==button1) && counter1==1 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button2) && counter1==2 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button3) && counter1==3 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button4) && counter1==4 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button5) && counter1==5 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button6) && counter1==6 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button7) && counter1==7 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button8) && counter1==8 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button9) && counter1==9 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if((ae.getSource()==button10) && counter1==10 && countall==0)
		{
			counter=counter+10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		else if(ae.getSource()==Exit)
		{
			System.exit(0);
		}
		else if(countall==0) 
		{
			counter=counter-10;
			String s1 = "Your Score: "+Integer.toString(counter);
			title.setText(s1);
		}
		
	}
	public void mouseExited(MouseEvent ae)
	{
		
	}
	public void mouseReleased(MouseEvent ae)
	{
		
	}
	public void mousePressed(MouseEvent ae){}
	public void mouseEntered(MouseEvent ae){}
	public void mouseClicked(MouseEvent ae){
		
	}
	public void check()
	{
		if(counter==100)
		{
			String s1 = "You Win The Game";
			title.setText(s1);
		}
		else
		{
			String s1 = "You Lost the Game";
			title.setText(s1);
		}
	}
	
	
}