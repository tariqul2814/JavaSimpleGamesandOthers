import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
	private JLabel label,label1,label2,label3;
	private JTextField field1,field2,field3;
	private JPanel panel;
	private JButton add1,subtract,division,multi,memadd,memsub,memrec,memcler,exit,clear;
	public static float memo=0;
	public static long a,b,sum;
	public static double x,y,sum1;
	public Calculator()
	{
		super("CALCULATOR");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label = new JLabel("Calculator");
		label.setBounds(300,10,200,100);
		label.setFont(new Font("Consolas",Font.BOLD,20));
		label.setOpaque(true);
		panel.add(label);
		
		label1 = new JLabel("1st Number: ");
		label1.setBounds(80,80,150,150);
		label1.setFont(new Font("Consolas",Font.BOLD,15));
		label1.setOpaque(true);
		panel.add(label1);
		
		field1 = new JTextField();
		field1.setBounds(200,135,120,40);
		panel.add(field1);
		
		label2 = new JLabel("2nd Number: ");
		label2.setBounds(80,170,150,150);
		label2.setFont(new Font("Consolas",Font.BOLD,15));
		label2.setOpaque(true);
		panel.add(label2);
		
		field2 = new JTextField();
		field2.setBounds(200,225,120,40);
		panel.add(field2);
		
		add1 = new JButton("+");
		add1.setBounds(380,135,80,50);
		add1.addActionListener(this);
		panel.add(add1);
		
		subtract = new JButton("-");
		subtract.setBounds(470,135,80,50);
		subtract.addActionListener(this);
		panel.add(subtract);
		
		division = new JButton("/");
		division.setBounds(560,135,80,50);
		division.addActionListener(this);
		panel.add(division);
		
		multi = new JButton("*");
		multi.setBounds(650,135,80,50);
		multi.addActionListener(this);
		panel.add(multi);
		
		memadd = new JButton("M+");
		memadd.setBounds(380,200,80,50);
		memadd.addActionListener(this);
		panel.add(memadd);
		
		memsub = new JButton("M-");
		memsub.setBounds(470,200,80,50);
		memsub.addActionListener(this);
		panel.add(memsub);
		this.add(panel);
		
		memrec = new JButton("MR");
		memrec.setBounds(560,200,80,50);
		memrec.addActionListener(this);
		panel.add(memrec);
		
		memcler = new JButton("MC");
		memcler.setBounds(650,200,80,50);
		memcler.addActionListener(this);
		panel.add(memcler);
		
		exit = new JButton("EXIT");
		exit.setBounds(560,310,80,50);
		exit.addActionListener(this);
		panel.add(exit);
		
		clear = new JButton("CLEAR");
		clear.setBounds(470,310,80,50);
		clear.addActionListener(this);
		panel.add(clear);
		
		label3 = new JLabel("Show: ");
		label3.setBounds(130,250,150,150);
		label3.setFont(new Font("Consolas",Font.BOLD,15));
		label3.setOpaque(true);
		panel.add(label3);
		
		field3 = new JTextField();
		field3.setBounds(200,310,120,40);
		panel.add(field3);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==exit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==add1)
		{
			x=y=sum1=0;
			String end1= new String(field1.getText());
			String end2= new String(field2.getText());
			if(end1.isEmpty())
			{
				end1 = String.valueOf(0);
			}
			if(end2.isEmpty())
			{
				end2 = String.valueOf(0);
			}
			x=Float.valueOf(end1);
			y=Float.valueOf(end2);
			sum1=x+y;
			String end3 = String.valueOf(sum1);
			field3.setText(end3);
			field1.setText("");
			field2.setText("");
		}
		else if(ae.getSource()==subtract)
		{
			x=y=sum1=0;
			String end1= new String(field1.getText());
			String end2= new String(field2.getText());
			if(end1.isEmpty())
			{
				end1 = String.valueOf(0);
			}
			if(end2.isEmpty())
			{
				end2 = String.valueOf(0);
			}
			x=Float.valueOf(end1);
			y=Float.valueOf(end2);
			sum1=x-y;
			String end3 = String.valueOf(sum1);
			field3.setText(end3);
			field1.setText("");
			field2.setText("");
		}
		else if(ae.getSource()==division)
		{
			x=y=sum1=0;
			String end1= new String(field1.getText());
			String end2= new String(field2.getText());
			if(end1.isEmpty())
			{
				end1 = String.valueOf(0);
			}
			if(end2.isEmpty())
			{
				end2 = String.valueOf(0);
			}
			x=Float.valueOf(end1);
			y=Float.valueOf(end2);
			sum1=x/y;
			String end3 = String.valueOf(sum1);
			field3.setText(end3);
			field1.setText("");
			field2.setText("");
		}
		else if(ae.getSource()==multi)
		{
			x=y=sum1=1;
			String end1= new String(field1.getText());
			String end2= new String(field2.getText());
			if(end1.isEmpty())
			{
				end1 = String.valueOf(0);
			}
			if(end2.isEmpty())
			{
				end2 = String.valueOf(0);
			}
			x=Float.valueOf(end1);
			y=Float.valueOf(end2);
			sum1=x*y;
			String end3 = String.valueOf(sum1);
			field3.setText(end3);
			field1.setText("");
			field2.setText("");
		}
		
		else if(ae.getSource()==memadd)
		{
			String end1 = new String(field3.getText());
			if(!end1.isEmpty())
			{
				float q = Float.valueOf(end1);
				q+=memo;
				memo=q;
			}
		}
		else if(ae.getSource()==memsub)
		{
			String end1 = new String(field3.getText());
			if(!end1.isEmpty())
			{
				float q = Float.valueOf(end1);
				memo=memo-q;
			}
		}
		else if(ae.getSource()==memrec)
		{
			field1.setText("");
			field2.setText("");
			String end1 = String.valueOf(memo);
			field3.setText(end1);
		}
		else if(ae.getSource()==memcler)
		{
			field1.setText("");
			field2.setText("");
			field3.setText("");
			memo=0;
		}
		else if(ae.getSource()==clear)
		{
			field1.setText("");
			field2.setText("");
			field3.setText("");
		}
		
	}
}