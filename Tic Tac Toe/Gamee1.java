import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gamee1 extends JFrame implements ActionListener,KeyListener
{
	public static int counter=0;
	public static int counter1=0;
	public static int comp=0;
	public static int counterall=0;
	private JPanel panel;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,Reset,Exit;
	private JLabel glabel1,glabel2,glabel3;
	public String [][]arr={{"-","-","-"},{"-","-","-"},{"-","-","-"}};
	public String t1="";
	public String t2="";
	
	public Gamee1()
	{}
	
	public Gamee1(String q)
	{
		super("Tic-Tac-Toe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,500);
		
		t1=q;
		if(t1=="X")
			t2="O";
		else if(t1=="O")
			t2="X";
		
		panel = new JPanel();
		panel.setLayout(null);
		
		String s = "Play User: "+t1;
		glabel1 = new JLabel();
		glabel1.setText(s);
		glabel1.setBounds(400,30,500,100);
		glabel1.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		glabel1.setOpaque(true);
		panel.add(glabel1);
		
		glabel2 = new JLabel();
		glabel2.setBounds(400,100,500,100);
		glabel2.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,40));
		glabel2.setOpaque(true);
		panel.add(glabel2);
		
		button1 = new JButton("1");
		button1.setBounds(10,10,80,50);
		Font newButtonFont1=new Font(button1.getFont().getName(),button1.getFont().getStyle(),30);  
		button1.setFont(newButtonFont1); 
		button1.addActionListener(this);
		button1.addKeyListener(this);
		panel.add(button1);
		
		button2 = new JButton("2");
		button2.setBounds(100,10,80,50);
		Font newButtonFont2=new Font(button2.getFont().getName(),button2.getFont().getStyle(),30);  
		button2.setFont(newButtonFont2); 
		button2.addActionListener(this);
		button2.addKeyListener(this);
		panel.add(button2);
		
		button3 = new JButton("3");
		button3.setBounds(190,10,80,50);
		Font newButtonFont3=new Font(button3.getFont().getName(),button3.getFont().getStyle(),30);  
		button3.setFont(newButtonFont3); 
		button3.addActionListener(this);
		button3.addKeyListener(this);
		panel.add(button3);
		
		button4 = new JButton("4");
		button4.setBounds(10,70,80,50);
		Font newButtonFont4=new Font(button4.getFont().getName(),button4.getFont().getStyle(),30);  
		button4.setFont(newButtonFont4); 
		button4.addActionListener(this);
		button4.addKeyListener(this);
		panel.add(button4);
		
		button5 = new JButton("5");
		button5.setBounds(100,70,80,50);
		Font newButtonFont5=new Font(button5.getFont().getName(),button5.getFont().getStyle(),30);  
		button5.setFont(newButtonFont5); 
		button5.addActionListener(this);
		button5.addKeyListener(this);
		panel.add(button5);
		
		button6 = new JButton("6");
		button6.setBounds(190,70,80,50);
		Font newButtonFont6=new Font(button6.getFont().getName(),button6.getFont().getStyle(),30);  
		button6.setFont(newButtonFont6); 
		button6.addActionListener(this);
		button6.addKeyListener(this);
		panel.add(button6);
		
		button7 = new JButton("7");
		button7.setBounds(10,130,80,50);
		Font newButtonFont7=new Font(button7.getFont().getName(),button7.getFont().getStyle(),30);  
		button7.setFont(newButtonFont7); 
		button7.addActionListener(this);
		button7.addKeyListener(this);
		panel.add(button7);
		
		button8 = new JButton("8");
		button8.setBounds(100,130,80,50);
		Font newButtonFont8=new Font(button8.getFont().getName(),button8.getFont().getStyle(),30);  
		button8.setFont(newButtonFont8); 
		button8.addActionListener(this);
		button8.addKeyListener(this);
		panel.add(button8);
		
		button9 = new JButton("9");
		button9.setBounds(190,130,80,50);
		Font newButtonFont9=new Font(button9.getFont().getName(),button9.getFont().getStyle(),30);  
		button9.setFont(newButtonFont9); 
		button9.addActionListener(this);
		button9.addKeyListener(this);
		panel.add(button9);
		
		Reset = new JButton("Reset");
		Reset.setBounds(200,230,80,50);
		Font newButtonFontres=new Font(Reset.getFont().getName(),Reset.getFont().getStyle(),15);  
		Reset.setFont(newButtonFontres); 
		Reset.addActionListener(this);
		Reset.addKeyListener(this);
		panel.add(Reset);
		
		Exit = new JButton("Quit");
		Exit.setBounds(300,230,80,50);
		Font newButtonFonte=new Font(Exit.getFont().getName(),Exit.getFont().getStyle(),15);  
		Exit.setFont(newButtonFonte); 
		Exit.addActionListener(this);
		Exit.addKeyListener(this);
		panel.add(Exit);
		
		
		this.add(panel);
	}
	
	
	public void update_status(int h)
	{
		
		if(h==0)
		{
			int counterx=counter;
			if(counterx==0)
				counterx++;
			else if(counterx==1)
				counterx--;
			
			String w ="";
			String tt="";
			if(counterx==0)
			{
				w="Play User: "+t1;
				counter--;
			}
			else if(counterx==1)
			{
				w="Play Computer: "+t2;
				counter++;
			}
			glabel1.setText(w);
			glabel2.setText(tt);
		}
		else if(h==1)
		{
			String w="Wrong Button Entered.";
			glabel2.setText(w);
		}
	}
	public void win_check()
	{
		
			if(arr[0][0]==t1 && arr[1][1]==t1 && arr[2][2]==t1)
			{
				String m="";
				String tt="";
				m="User Player Winner "+t1;
				counter1=1;
				glabel1.setText(m);
				glabel2.setText(tt);
			}
			else if(arr[0][2]==t1 && arr[1][1]==t1 && arr[2][0]==t1)
			{
				String m="";
				m="User Player Winner "+t1;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][0]==t1 && arr[0][1]==t1 && arr[0][2]==t1)
			{
				String m="";
				m="User Player Winner "+t1;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[1][0]==t1 && arr[1][1]==t1 && arr[1][2]==t1)
			{
				String m="";
				m="User Player Winner "+t1;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[2][0]==t1 && arr[2][1]==t1 && arr[2][2]==t1)
			{
				String m="";
				m="User Player Winner "+t1;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][0]==t1 && arr[1][0]==t1 && arr[2][0]==t1)
			{
				String m="";
				m="User Player Winner "+t1;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][1]==t1 && arr[1][1]==t1 && arr[2][1]==t1)
			{
				String m="";
				m="User Player Winner "+t1;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][2]==t1 && arr[1][2]==t1 && arr[2][2]==t1)
			{
				String m="";
				m="User Player Winner "+t1;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
		

			else if(arr[0][0]==t2 && arr[1][1]==t2 && arr[2][2]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][2]==t2 && arr[1][1]==t2 && arr[2][0]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][0]==t2 && arr[0][1]==t2 && arr[0][2]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[1][0]==t2 && arr[1][1]==t2 && arr[1][2]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[2][0]==t2 && arr[2][1]==t2 && arr[2][2]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][0]==t2 && arr[1][0]==t2 && arr[2][0]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][1]==t2 && arr[1][1]==t2 && arr[2][1]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(arr[0][2]==t2 && arr[1][2]==t2 && arr[2][2]==t2)
			{
				String m="";
				m="Computer Win "+t2;
				counter1=1;
				String tt="";
				glabel2.setText(tt);
				glabel1.setText(m);
			}
			else if(counterall==9)
			{
				String m="";
				String tt="";
				m="DRAW Match";
				counter1=1;
				glabel2.setText(tt);
				glabel1.setText(m);
			}
		
	}
	public boolean check(int a)
	{
		if(counter==0)
		{
			String x=t1;
			if(a==1 && arr[0][0]=="-")
			{
				counterall++;
				arr[0][0]=x;
				button1.setText(x);
				update_status(0);
				return true;
			}
			else if(a==2 && arr[0][1]=="-")
			{
				counterall++;
				arr[0][1]=x;
				button2.setText(x);
				update_status(0);
				return true;
			}
			else if(a==3 && arr[0][2]=="-")
			{
				counterall++;
				arr[0][2]=x;
				button3.setText(x);
				update_status(0);
				return true;
			}
			else if(a==4 && arr[1][0]=="-")
			{
				counterall++;
				arr[1][0]=x;
				button4.setText(x);
				update_status(0);
				return true;
			}
			else if(a==5 && arr[1][1]=="-")
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			else if(a==6 && arr[1][2]=="-")
			{
				counterall++;
				arr[1][2]=x;
				button6.setText(x);
				update_status(0);
				return true;
			}
			else if(a==7 && arr[2][0]=="-")
			{
				counterall++;
				arr[2][0]=x;
				button7.setText(x);
				update_status(0);
				return true;
			}
			else if(a==8 && arr[2][1]=="-")
			{
				counterall++;
				arr[2][1]=x;
				button8.setText(x);
				update_status(0);
				return true;
			}
			else if(a==9 && arr[2][2]=="-")
			{
				counterall++;
				arr[2][2]=x;
				button9.setText(x);
				update_status(0);
				return true;
			}
			else
			{
				update_status(1);
				return false;
			}
		}
		else if(counter==1)
		{
			String x = t2;
			if(arr[0][0]==t2 && arr[1][1]==t2 && arr[2][2]=="-")
			{
				counterall++;
				arr[2][2]=x;
				button9.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]==t2 && arr[1][1]=="-" && arr[2][2]==t2)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]=="-" && arr[1][1]==t2 && arr[2][2]==t2)
			{
				counterall++;
				arr[0][0]=x;
				button1.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][2]==t2 && arr[1][1]==t2 && arr[2][0]=="-")
			{
				counterall++;
				arr[2][0]=x;
				button7.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][2]==t2 && arr[1][1]=="-" && arr[2][0]==t2)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][2]=="-" && arr[1][1]==t2 && arr[2][0]==t2)
			{
				counterall++;
				arr[0][2]=x;
				button3.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]==t2 && arr[0][1]==t2 && arr[0][2]=="-")
			{
				counterall++;
				arr[0][2]=x;
				button3.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]==t2 && arr[0][1]=="-" && arr[0][2]==t2)
			{
				
				counterall++;
				arr[0][1]=x;
				button2.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]=="-" && arr[0][1]==t2 && arr[0][2]==t2)
			{
				counterall++;
				arr[0][0]=x;
				button1.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[1][0]==t2 && arr[1][1]==t2 && arr[1][2]=="-")
			{
				counterall++;
				arr[1][2]=x;
				button6.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[1][0]==t2 && arr[1][1]=="-" && arr[1][2]==t2)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[1][0]=="-" && arr[1][1]==t2 && arr[1][2]==t2)
			{
				counterall++;
				arr[1][0]=x;
				button4.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[2][0]==t2 && arr[2][1]==t2 && arr[2][2]=="-")
			{
				counterall++;
				arr[2][2]=x;
				button9.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[2][0]==t2 && arr[2][1]=="-" && arr[2][2]==t2)
			{
				counterall++;
				arr[2][1]=x;
				button8.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[2][0]=="-" && arr[2][1]==t2 && arr[2][2]==t2)
			{
				counterall++;
				arr[2][0]=x;
				button7.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]==t2 && arr[1][0]==t2 && arr[2][0]=="-")
			{
				counterall++;
				arr[2][0]=x;
				button7.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]==t2 && arr[1][0]=="-" && arr[2][0]==t2)
			{
				counterall++;
				arr[1][0]=x;
				button4.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]=="-" && arr[1][0]==t2 && arr[2][0]==t2)
			{
				counterall++;
				arr[0][0]=x;
				button1.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][1]==t2 && arr[1][1]==t2 && arr[2][1]=="-")
			{
				counterall++;
				arr[2][1]=x;
				button8.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][1]==t2 && arr[1][1]=="-" && arr[2][1]==t2)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][1]=="-" && arr[1][1]==t2 && arr[2][1]==t2)
			{
				counterall++;
				arr[0][1]=x;
				button2.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][2]==t2 && arr[1][2]==t2 && arr[2][2]=="-")
			{
				counterall++;
				arr[2][2]=x;
				button9.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][2]==t2 && arr[1][2]=="-" && arr[2][2]==t2)
			{
				counterall++;
				arr[1][2]=x;
				button6.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][2]=="-" && arr[1][2]==t2 && arr[2][2]==t2)
			{
				counterall++;
				arr[0][2]=x;
				button3.setText(x);
				update_status(0);
				return true;
			}
			///user joy
			else if(arr[0][0]==t1 && arr[1][1]==t1 && arr[2][2]=="-")
			{
				counterall++;
				arr[2][2]=x;
				button9.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]==t1 && arr[1][1]=="-" && arr[2][2]==t1)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]=="-" && arr[1][1]==t1 && arr[2][2]==t1)
			{
				counterall++;
				arr[0][0]=x;
				button1.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][2]==t1 && arr[1][1]==t1 && arr[2][0]=="-")
			{
				counterall++;
				arr[2][0]=x;
				button7.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][2]==t1 && arr[1][1]=="-" && arr[2][0]==t1)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][2]=="-" && arr[1][1]==t1 && arr[2][0]==t1)
			{
				counterall++;
				arr[0][2]=x;
				button3.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]==t1 && arr[0][1]==t1 && arr[0][2]=="-")
			{
				counterall++;
				arr[0][2]=x;
				button3.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]==t1 && arr[0][1]=="-" && arr[0][2]==t1)
			{
				counterall++;
				arr[0][1]=x;
				button2.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[0][0]=="-" && arr[0][1]==t1 && arr[0][2]==t1)
			{
				counterall++;
				arr[0][0]=x;
				button1.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[1][0]==t1 && arr[1][1]==t1 && arr[1][2]=="-")
			{
				counterall++;
				arr[1][2]=x;
				button6.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[1][0]==t1 && arr[1][1]=="-" && arr[1][2]==t1)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			
			else if(arr[1][0]=="-" && arr[1][1]==t1 && arr[1][2]==t1)
			{
				counterall++;
				arr[1][0]=x;
				button4.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[2][0]==t1 && arr[2][1]==t1 && arr[2][2]=="-")
			{
				counterall++;
				arr[2][2]=x;
				button9.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[2][0]==t1 && arr[2][1]=="-" && arr[2][2]==t1)
			{
				counterall++;
				arr[2][1]=x;
				button8.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[2][0]=="-" && arr[2][1]==t1 && arr[2][2]==t1)
			{
				counterall++;
				arr[2][0]=x;
				button7.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]==t1 && arr[1][0]==t1 && arr[2][0]=="-")
			{
				counterall++;
				arr[2][0]=x;
				button7.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]==t1 && arr[1][0]=="-" && arr[2][0]==t1)
			{
				counterall++;
				arr[1][0]=x;
				button4.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][0]=="-" && arr[1][0]==t1 && arr[2][0]==t1)
			{
				counterall++;
				arr[0][0]=x;
				button1.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][1]==t1 && arr[1][1]==t1 && arr[2][1]=="-")
			{
				counterall++;
				arr[2][1]=x;
				button8.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][1]==t1 && arr[1][1]=="-" && arr[2][1]==t1)
			{
				counterall++;
				arr[1][1]=x;
				button5.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][1]=="-" && arr[1][1]==t1 && arr[2][1]==t1)
			{
				counterall++;
				arr[0][1]=x;
				button2.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][2]==t1 && arr[1][2]==t1 && arr[2][2]=="-")
			{
				counterall++;
				arr[2][2]=x;
				button9.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][2]==t1 && arr[1][2]=="-" && arr[2][2]==t1)
			{
				counterall++;
				arr[1][2]=x;
				button6.setText(x);
				update_status(0);
				return true;
			}
			else if(arr[0][2]=="-" && arr[1][2]==t1 && arr[2][2]==t1)
			{
				counterall++;
				arr[0][2]=x;
				button3.setText(x);
				update_status(0);
				return true;
			}
			///
			else 
			{
				int xx=0;
				int xc=0;
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						xc++;
						if(arr[i][j]=="-")
						{
							xx=1;
							counterall++;
							arr[i][j]=x;
							if(xc==1)
							{button1.setText(x);}
							else if(xc==2)
							{button2.setText(x);}
							else if(xc==3)
							{button3.setText(x);}
							else if(xc==4)
							{button4.setText(x);}
							else if(xc==5)
							{button5.setText(x);}
							else if(xc==6)
							{button6.setText(x);}
							else if(xc==7)
							{button7.setText(x);}
							else if(xc==8)
							{button8.setText(x);}
							else if(xc==9)
							{button9.setText(x);}
							break;
						}
					}
					if(xx==1)
						break;
				}
				if(xx==1)
				{
					update_status(0);
					return true;
				}
				else 
				{
					win_check();
					return false;
				}
			}

		}
		else
		{
			return false;
		}
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button1 && counter1==0)
		{
			if(check(1)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(ae.getSource()==button2 && counter1==0)
		{
			if(check(2)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else 
					win_check();
			}
		}
		else if(ae.getSource()==button3 && counter1==0)
		{
			if(check(3)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else 
					win_check();
			}
		}
		else if(ae.getSource()==button4 && counter1==0)
		{
			if(check(4)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else 
					win_check();
			}
		}
		else if(ae.getSource()==button5 && counter1==0)
		{
			if(check(5)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else 
					win_check();
			}
		}
		else if(ae.getSource()==button6 && counter1==0)
		{
			if(check(6)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
				win_check();
			}
		}
		else if(ae.getSource()==button7 && counter1==0)
		{
			if(check(7)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(ae.getSource()==button8 && counter1==0)
		{
			if(check(8)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else 
					win_check();
			}
		}
		else if(ae.getSource()==button9 && counter1==0)
		{
			if(check(9)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
				
			}
		}
		else if(ae.getSource()==Exit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==Reset)
		{
			arr[0][0]="-";
			arr[0][1]="-";
			arr[0][2]="-";
			arr[1][0]="-";
			arr[1][1]="-";
			arr[1][2]="-";
			arr[2][0]="-";
			arr[2][1]="-";
			arr[2][2]="-";
			counter=0;
			counter1=0;
			counterall=0;
			String s = "Play 1st Player: "+t1;
			glabel1.setText(s);
			glabel2.setText("");
			button1.setText("1");
			button2.setText("2");
			button3.setText("3");
			button4.setText("4");
			button5.setText("5");
			button6.setText("6");
			button7.setText("7");
			button8.setText("8");
			button9.setText("9");
		}
	}
	public void keyPressed(KeyEvent e)
	{
		//System.out.println(e.getKeyChar());
		char into = e.getKeyChar();
		if(into=='1' && counter1==0)
		{
			if(check(1)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='2' && counter1==0)
		{
			if(check(2)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='3' && counter1==0)
		{
			if(check(3)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='4' && counter1==0)
		{
			if(check(4)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='5' && counter1==0)
		{
			if(check(5)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='6' && counter1==0)
		{
			if(check(6)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='7' && counter1==0)
		{
			if(check(7)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='8' && counter1==0)
		{
			if(check(8)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
		else if(into=='9' && counter1==0)
		{
			if(check(9)==true)
			{
				win_check();
				if(counter1==0 && counterall<9)
				{
					if(check(1)==true)
					{
						win_check();
					}
					else 
					{
						win_check();
					}
				}
				else
					win_check();
			}
		}
	}
	public void keyReleased(KeyEvent e)
	{}
	public void keyTyped(KeyEvent e)
	{}
}