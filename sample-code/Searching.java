import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Searching extends JFrame implements ActionListener
{
		JLabel label1, label2;
		JTextField txtField1;		
		JButton butang1, butang2, butang3;
		
	public Searching()
	{
		super(":::Searching:::");
		Container bekas=getContentPane();
		bekas.setLayout(new BorderLayout());				
		
		JPanel panelAtas=new JPanel();
		panelAtas.setLayout(new FlowLayout());	
				
		label1=new JLabel("Search Student Info ");
		panelAtas.add(label1);
		
		bekas.add(panelAtas, BorderLayout.NORTH);
		
		JPanel panelTengah=new JPanel();
		panelTengah.setLayout(new FlowLayout());
		
		label2=new JLabel("Insert Metric Num : ");		
		txtField1=new JTextField(10);
		panelTengah.add(label2);
		panelTengah.add(txtField1);
		bekas.add(panelTengah, BorderLayout.CENTER);
							
		JPanel panelBawah=new JPanel();
		panelBawah.setLayout(new FlowLayout());
		
		butang1=new JButton("Search");
		butang1.addActionListener(this);
		butang2=new JButton("Main Menu");
		butang2.addActionListener(this);
		butang3=new JButton("Reset");
		butang3.addActionListener(this);		
		
		panelBawah.add(butang1);
		panelBawah.add(butang3);
		panelBawah.add(butang2);
		
		bekas.add(panelBawah, BorderLayout.SOUTH);
		
		setSize(500,150);
		setLocation(250,350);
		setVisible(true);
			
	}
	
	public static void main(String [] args)
	{
		Searching frame=new Searching();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() == butang1)
			{				
				String n = txtField1.getText();	
				SaveFile data =new SaveFile();
				data.readFromFile();
				boolean find = data.findRecord(n);
				if(find)
				{	dispose();
					DisplayInfo showInfo = 
					new DisplayInfo();
				}
				else
				{	String output = new String("Metric number ("
					+n+ ") does not exist.");
					JOptionPane.showMessageDialog(null,output);
				}				
			}
							
		else if (e.getSource() == butang2)
		{			
			CoursesRegistration gerak = new CoursesRegistration();
			gerak.setVisible(true);
			super.show(false);						
		}
		else if (e.getSource() == butang3)
		{			
			txtField1.setText("");						
		}
	}	
}

