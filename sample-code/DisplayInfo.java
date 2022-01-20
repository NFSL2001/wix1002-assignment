import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.text.*;

public class DisplayInfo  extends JFrame implements ActionListener
{
		JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
		JTextField txtField1, txtField2, txtField3, txtField4, txtField5, txtField6,
		txtField7, txtField8, txtField9, txtField10, txtField11, txtField12, txtField13,
		txtField14, txtField15, txtField16, txtField17, txtField18, txtField19;
		JButton butang1, butang2;
		private SaveFile data=new SaveFile();
		
		private String metric, nama, prog, code1, code2, code3, code4, code5, desc1, desc2, desc3, desc4, desc5;
		private String total1, ch1a, ch2a, ch3a, ch4a, ch5a;
				
	public DisplayInfo()
	{
		super(":::Student Info:::");
		Container bekas=getContentPane();
		bekas.setLayout(new BorderLayout());
				
		try
		{	FileInputStream aliranInput=new FileInputStream ("cari.txt");
			InputStreamReader aliran=new InputStreamReader(aliranInput);
			BufferedReader baca=new BufferedReader(aliran);
			StreamTokenizer token=new StreamTokenizer(baca);
					
			token.nextToken();
			metric = token.sval;					token.nextToken();
			nama = token.sval;						token.nextToken();
			prog = 	token.sval;						token.nextToken();
			code1 = token.sval;						token.nextToken();
			code2 = token.sval;						token.nextToken();
			code3 = token.sval;						token.nextToken();
			code4 = token.sval;						token.nextToken();
			code5 = token.sval;						token.nextToken();
			desc1 = token.sval;						token.nextToken();
			desc2 = token.sval;						token.nextToken();
			desc3 = token.sval;						token.nextToken();
			desc4 = token.sval;						token.nextToken();
			desc5 = token.sval;						token.nextToken();
			ch1a = token.sval;						token.nextToken();
			ch2a = token.sval;						token.nextToken();
			ch3a = token.sval;						token.nextToken();
			ch4a = token.sval;						token.nextToken();
			ch5a = token.sval;						token.nextToken();
			total1 = token.sval;					token.nextToken();
							
			aliranInput.close();
		} catch(IOException e) {}
		
												
		JPanel panelAtas=new JPanel();
		panelAtas.setLayout(new FlowLayout());
		
		label1=new JLabel("Student Info");						
		panelAtas.add(label1);
		bekas.add(panelAtas, BorderLayout.NORTH);
		
		JPanel panelTengah=new JPanel();
		panelTengah.setLayout(new BorderLayout());
		
		JPanel panelTengahAtas=new JPanel();
		panelTengahAtas.setLayout(new BorderLayout());
		
		JPanel panelTengahAtasKiri=new JPanel();
		panelTengahAtasKiri.setLayout(new GridLayout(3,1));
						
		label2=new JLabel("Metric Num ");
		label3=new JLabel("Name ");
		label9=new JLabel("Program ");
		
		panelTengahAtasKiri.add(label2);
		panelTengahAtasKiri.add(label3);
		panelTengahAtasKiri.add(label9);
		
		panelTengahAtas.add(panelTengahAtasKiri, BorderLayout.WEST);
				
		JPanel panelTengahAtasTengah=new JPanel();
		panelTengahAtasTengah.setLayout(new GridLayout(3,1));
		
		txtField1=new JTextField(metric, 6);
		txtField1.setEditable(false);
		txtField2=new JTextField(nama, 6);;
		txtField2.setEditable(false);
		txtField19=new JTextField(prog, 6);
		txtField19.setEditable(false);								
		
		panelTengahAtasTengah.add(txtField1);		
		panelTengahAtasTengah.add(txtField2);
		panelTengahAtasTengah.add(txtField19);
		
		panelTengahAtas.add(panelTengahAtasTengah, BorderLayout.CENTER);		
		panelTengah.add(panelTengahAtas, BorderLayout.NORTH);
		
		JPanel panelTengahTengah=new JPanel();
		panelTengahTengah.setLayout(new BorderLayout());
				
		JPanel panelTengahKiri=new JPanel();
		panelTengahKiri.setLayout(new GridLayout(7,1));
		
		label4=new JLabel("Code", SwingConstants.CENTER);
		txtField3=new JTextField(code1, 6);
		txtField4=new JTextField(code2, 6);
		txtField5=new JTextField(code3, 6);
		txtField6=new JTextField(code4, 6);
		txtField7=new JTextField(code5, 6);
		txtField3.setEditable(false);
		txtField4.setEditable(false);
		txtField5.setEditable(false);
		txtField6.setEditable(false);
		txtField7.setEditable(false);
		label5=new JLabel(" ");
		
		panelTengahKiri.add(label4);
		panelTengahKiri.add(txtField3);
		panelTengahKiri.add(txtField4);
		panelTengahKiri.add(txtField5);
		panelTengahKiri.add(txtField6);
		panelTengahKiri.add(txtField7);
		panelTengahKiri.add(label5);
		
		panelTengahTengah.add(panelTengahKiri, BorderLayout.WEST);
				
		JPanel panelTengahCenter=new JPanel();
		panelTengahCenter.setLayout(new GridLayout(7,1));
		
		label6=new JLabel("Description", SwingConstants.CENTER);
		txtField8=new JTextField(desc1, 6);
		txtField9=new JTextField(desc2, 6);
		txtField10=new JTextField(desc3, 6);
		txtField11=new JTextField(desc4, 6);
		txtField12=new JTextField(desc5, 6);
		txtField8.setEditable(false);
		txtField9.setEditable(false);
		txtField10.setEditable(false);
		txtField11.setEditable(false);
		txtField12.setEditable(false);
		label7=new JLabel("Total     ", SwingConstants.RIGHT);
		
		panelTengahCenter.add(label6);
		panelTengahCenter.add(txtField8);				
		panelTengahCenter.add(txtField9);
		panelTengahCenter.add(txtField10);
		panelTengahCenter.add(txtField11);
		panelTengahCenter.add(txtField12);
		panelTengahCenter.add(label7);
		
		panelTengahTengah.add(panelTengahCenter, BorderLayout.CENTER);
				
		JPanel panelTengahRight=new JPanel();
		panelTengahRight.setLayout(new GridLayout(7,1));
								
		label8=new JLabel("Hour", SwingConstants.CENTER);
		txtField13=new JTextField(6);
		txtField14=new JTextField(6);
		txtField15=new JTextField(6);
		txtField16=new JTextField(6);
		txtField17=new JTextField(6);
		txtField18=new JTextField(6);
		txtField13.setText(String.valueOf(ch1a));
		txtField14.setText(String.valueOf(ch2a));
		txtField15.setText(String.valueOf(ch3a));
		txtField16.setText(String.valueOf(ch4a));
		txtField17.setText(String.valueOf(ch5a));
		txtField18.setText(String.valueOf(total1));
		txtField13.setEditable(false);
		txtField14.setEditable(false);
		txtField15.setEditable(false);
		txtField16.setEditable(false);
		txtField17.setEditable(false);
		txtField18.setEditable(false);
						
		panelTengahRight.add(label8);		
		panelTengahRight.add(txtField13);
		panelTengahRight.add(txtField14);
		panelTengahRight.add(txtField15);
		panelTengahRight.add(txtField16);
		panelTengahRight.add(txtField17);				
		panelTengahRight.add(txtField18);
		
		panelTengahTengah.add(panelTengahRight, BorderLayout.EAST);						
		panelTengah.add(panelTengahTengah, BorderLayout.CENTER);
				
		JPanel panelTengahBawah=new JPanel();
		panelTengahBawah.setLayout(new FlowLayout());
		
		butang1=new JButton("Back");
		butang1.addActionListener(this);
		butang2=new JButton("Main Menu");
		butang2.addActionListener(this);
			
		panelTengahBawah.add(butang1);
		panelTengahBawah.add(butang2);		
		
		panelTengah.add(panelTengahBawah, BorderLayout.SOUTH);		
		bekas.add(panelTengah, BorderLayout.CENTER);		
				
		setSize(500,350);
		setLocation(300,250);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == butang1)
		{		
			Searching gerak = new Searching();
			gerak.setVisible(true);
			super.show(false);						
		}
		
		else if (e.getSource() == butang2)
		{		
			CoursesRegistration gerak = new CoursesRegistration();
			gerak.setVisible(true);
			super.show(false);						
		}
	}	
}