import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoursesRegistration  extends JFrame implements ActionListener
{
		JLabel label1, label2, label3, label4, label5, label6, label7, label8;
		JTextField txtField1, txtField2, txtField3, txtField4, txtField5, txtField6,
		txtField7, txtField8, txtField9, txtField10, txtField11, txtField12, txtField13,
		txtField14;
		JComboBox jcb1, jcb2, jcb3, jcb4, jcb5;
		JButton butang1, butang2, butang3, butang4;
		JMenuBar jmb;
		JMenu file;
		JMenuItem main, exit, about;
		private SaveFile data=new SaveFile();		
		
	public CoursesRegistration()
	{
		super(":::Courses Registration:::");
		Container bekas=getContentPane();
		bekas.setLayout(new BorderLayout());
		
		jmb=new JMenuBar();
		setJMenuBar(jmb);
		file=new JMenu("File");
		jmb.add(file);
		main=new JMenuItem("Main");
		about=new JMenuItem("About");
		exit=new JMenuItem("Exit");
		file.add(main);
		file.addSeparator();
		file.add(about);
		file.addSeparator();
		file.add(exit);
		main.addActionListener(this);
		about.addActionListener(this);
		exit.addActionListener(this);
				
		JPanel panelAtas=new JPanel();
		panelAtas.setLayout(new BorderLayout());
		
		JPanel panelAtasKiri=new JPanel();
		panelAtasKiri.setLayout(new BorderLayout());
		
		JPanel panelAtasKiriA=new JPanel();
		panelAtasKiriA.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		label1=new JLabel("Metric Num ");						
		panelAtasKiriA.add(label1);
		
		panelAtasKiri.add(panelAtasKiriA, BorderLayout.NORTH);
		
		JPanel panelAtasKiriB=new JPanel();
		panelAtasKiriB.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		label2=new JLabel("Name ");
		panelAtasKiriB.add(label2);
		
		panelAtasKiri.add(panelAtasKiriB, BorderLayout.CENTER);
		
		JPanel panelAtasKiriC=new JPanel();
		panelAtasKiriC.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		label8=new JLabel("Program ");
		panelAtasKiriC.add(label8);
		
		panelAtasKiri.add(panelAtasKiriC, BorderLayout.SOUTH);				
		panelAtas.add(panelAtasKiri, BorderLayout.WEST);
					
		JPanel panelAtasTengah=new JPanel();
		panelAtasTengah.setLayout(new BorderLayout());
		
		JPanel panelAtasTengahA=new JPanel();
		panelAtasTengahA.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		txtField1=new JTextField(6);		
		panelAtasTengahA.add(txtField1);
			
		panelAtasTengah.add(panelAtasTengahA, BorderLayout.NORTH);
		
		JPanel panelAtasTengahB=new JPanel();
		panelAtasTengahB.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		txtField2=new JTextField(25);
		panelAtasTengahB.add(txtField2);
		
		panelAtasTengah.add(panelAtasTengahB, BorderLayout.CENTER);
		
		JPanel panelAtasTengahC=new JPanel();
		panelAtasTengahC.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		txtField14=new JTextField(10);
		panelAtasTengahC.add(txtField14);
		
		panelAtasTengah.add(panelAtasTengahC, BorderLayout.SOUTH);		
		panelAtas.add(panelAtasTengah, BorderLayout.CENTER);
		bekas.add(panelAtas, BorderLayout.NORTH);		
				
		JPanel panelTengah=new JPanel();
		panelTengah.setLayout(new BorderLayout());
		
		JPanel panelTengahA=new JPanel();
		panelTengahA.setLayout(new GridLayout(7,1));
		
		label3=new JLabel("Course Code ");		
		txtField3=new JTextField(6);
		txtField4=new JTextField(6);
		txtField5=new JTextField(6);
		txtField6=new JTextField(6);
		txtField7=new JTextField(6);
		label4=new JLabel(" ");
		
		panelTengahA.add(label3);		
		panelTengahA.add(txtField3);
		panelTengahA.add(txtField4);
		panelTengahA.add(txtField5);
		panelTengahA.add(txtField6);
		panelTengahA.add(txtField7);
		panelTengahA.add(label4);
				
		panelTengah.add(panelTengahA, BorderLayout.WEST);		
		
		JPanel panelTengahB=new JPanel();
		panelTengahB.setLayout(new GridLayout(7,1));
		
		label5=new JLabel("Description", SwingConstants.CENTER);		
		txtField8=new JTextField(6);
		txtField9=new JTextField(6);
		txtField10=new JTextField(6);
		txtField11=new JTextField(6);
		txtField12=new JTextField(6);
		label6=new JLabel("Total  ", SwingConstants.RIGHT);
		
		panelTengahB.add(label5);		
		panelTengahB.add(txtField8);
		panelTengahB.add(txtField9);
		panelTengahB.add(txtField10);
		panelTengahB.add(txtField11);
		panelTengahB.add(txtField12);
		panelTengahB.add(label6);
				
		panelTengah.add(panelTengahB, BorderLayout.CENTER);

		JPanel panelTengahC=new JPanel();
		panelTengahC.setLayout(new GridLayout(7,1));
		
		label7=new JLabel("Credit Hour ");
		jcb1=new JComboBox();
		jcb1.addItem("0");
		jcb1.addItem("1");
		jcb1.addItem("2");
		jcb1.addItem("3");
		
		jcb2=new JComboBox();
		jcb2.addItem("0");
		jcb2.addItem("1");
		jcb2.addItem("2");
		jcb2.addItem("3");
		
		jcb3=new JComboBox();
		jcb3.addItem("0");
		jcb3.addItem("1");
		jcb3.addItem("2");
		jcb3.addItem("3");
		
		jcb4=new JComboBox();
		jcb4.addItem("0");
		jcb4.addItem("1");
		jcb4.addItem("2");
		jcb4.addItem("3");
		
		jcb5=new JComboBox();
		jcb5.addItem("0");
		jcb5.addItem("1");
		jcb5.addItem("2");
		jcb5.addItem("3");		
		txtField13=new JTextField(6);
		
		panelTengahC.add(label7);
		panelTengahC.add(jcb1);
		panelTengahC.add(jcb2);
		panelTengahC.add(jcb3);
		panelTengahC.add(jcb4);
		panelTengahC.add(jcb5);
		panelTengahC.add(txtField13);
		txtField13.setEditable(false);
			
		panelTengah.add(panelTengahC, BorderLayout.EAST);
				
		JPanel panelTengahBawah=new JPanel();
		panelTengahBawah.setLayout(new FlowLayout());
		
		butang1=new JButton("Save");
		butang1.addActionListener(this);
		butang2=new JButton("Reset");
		butang2.addActionListener(this);
		butang3=new JButton("Search");
		butang3.addActionListener(this);
		butang4=new JButton("Display All Records");
		butang4.addActionListener(this);
			
		panelTengahBawah.add(butang1);
		panelTengahBawah.add(butang2);
		panelTengahBawah.add(butang3);
		panelTengahBawah.add(butang4);
		
		panelTengah.add(panelTengahBawah, BorderLayout.SOUTH);		
		bekas.add(panelTengah, BorderLayout.CENTER);		
				
		setSize(600,400);
		setLocation(200,250);
		setVisible(true);
	}
		public static void main(String [] args)
		{
		CoursesRegistration frame=new CoursesRegistration();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
		public void actionPerformed(ActionEvent e)
		{
	
		String metric, nama, prog, code1, code2, code3, code4, code5, desc1, desc2, 
		desc3, desc4, desc5;	
		int total, ch1, ch2, ch3, ch4, ch5;
			
		if (e.getSource() == butang1)
		{		
			boolean betul = true;
		
			metric=txtField1.getText();
			nama=txtField2.getText();
			prog=txtField14.getText();
			code1=txtField3.getText();
			code2=txtField4.getText();
			code3=txtField5.getText();
			code4=txtField6.getText();
			code5=txtField7.getText();
			desc1=txtField8.getText();
			desc2=txtField9.getText();
			desc3=txtField10.getText();
			desc4=txtField11.getText();
			desc5=txtField12.getText();	
			ch1=jcb1.getSelectedIndex();
			ch2=jcb2.getSelectedIndex();
			ch3=jcb3.getSelectedIndex();
			ch4=jcb4.getSelectedIndex();
			ch5=jcb5.getSelectedIndex();
		
			total=ch1+ch2+ch3+ch4+ch5;
			txtField13.setText(String.valueOf(total));					
			
			if (total<9)
			{
				JOptionPane.showMessageDialog(this, "Your total credit hour is not enough to make a registration", 
				"Error", JOptionPane.ERROR_MESSAGE);
			}
			else if (total>21)
			{
				JOptionPane.showMessageDialog(this, "Your total credit hour is over than premited to make a registration", 
				"Error", JOptionPane.ERROR_MESSAGE);
			}		
		
			else if (total>=9 && total<=21)
			{
				data.sendStudentInfo(metric, nama, prog, code1, code2, code3, code4, code5, desc1,
				desc2, desc3, desc4, desc5, total, ch1, ch2, ch3, ch4, ch5);
				data.saveToFile();		
				JOptionPane.showMessageDialog(this, "The record has been saved successfully", 
				"Notice", JOptionPane.INFORMATION_MESSAGE);
			}
			txtField1.setText("");
			txtField2.setText("");
			txtField14.setText("");
			txtField3.setText("");
			txtField4.setText("");
			txtField5.setText("");
			txtField6.setText("");
			txtField7.setText("");
			txtField8.setText("");
			txtField9.setText("");
			txtField10.setText("");
			txtField11.setText("");
			txtField12.setText("");
			txtField13.setText("");			
			jcb1.setSelectedIndex(0);
			jcb2.setSelectedIndex(0);
			jcb3.setSelectedIndex(0);
			jcb4.setSelectedIndex(0);
			jcb5.setSelectedIndex(0);			
		}
		
		else if (e.getSource() == butang2)
		{
			txtField1.setText("");
			txtField2.setText("");
			txtField14.setText("");
			txtField3.setText("");
			txtField4.setText("");
			txtField5.setText("");
			txtField6.setText("");
			txtField7.setText("");
			txtField8.setText("");
			txtField9.setText("");
			txtField10.setText("");
			txtField11.setText("");
			txtField12.setText("");
			txtField13.setText("");			
			jcb1.setSelectedIndex(0);
			jcb2.setSelectedIndex(0);
			jcb3.setSelectedIndex(0);
			jcb4.setSelectedIndex(0);
			jcb5.setSelectedIndex(0);
		}
		
		else if (e.getSource() == butang3)
		{		
			Searching gerak = new Searching();
			gerak.setVisible(true);
			super.show(false);						
		}
		
		else if (e.getSource() == butang4)
		{		
			DisplayAll gerak = new DisplayAll();
			gerak.setVisible(true);
			super.show(false);						
		}
		else if (e.getSource() == main)
		{
			Welcome gerak = new Welcome();
			gerak.setVisible(true);
			super.show(false);
		}		
		else if (e.getSource() == about)
		{
			About gerak = new About();
			gerak.setVisible(true);
			super.show(false);
		}		
		else if (e.getSource() == exit)
		{
			Exit gerak = new Exit();
			gerak.setVisible(true);
			super.show(false);
		}
	}			
}