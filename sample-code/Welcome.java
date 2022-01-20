import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Welcome extends JFrame implements ActionListener
{
		JLabel label1, label2;
		JButton butang1, butang2;

	public Welcome()
	{
		super(":::Welcome:::");
		Container bekas=getContentPane();
		bekas.setLayout(new BorderLayout());
		
		JPanel panelAtas=new JPanel();
		panelAtas.setLayout(new FlowLayout());
		
		//Icon logo=new ImageIcon("logo.jpg");
		//label1=new JLabel("", logo,SwingConstants.CENTER);
		//panelAtas.add(label1);
		
		bekas.add(panelAtas, BorderLayout.NORTH);		
	
		JPanel panelTengah=new JPanel();
		panelTengah.setLayout(new BorderLayout());
		
		JPanel panelTengahA=new JPanel();
		panelTengahA.setLayout(new GridLayout(1,1));
	
		label2=new JLabel("Click 'Enter' to Make Your Courses Registration", SwingConstants.CENTER);
		label2.setFont(new Font("Arial",Font.ITALIC,15));
		label2.setForeground(Color.blue);
		panelTengahA.add(label2);
		
		panelTengah.add(panelTengahA, BorderLayout.CENTER);
		
		JPanel panelBawah=new JPanel();
		panelBawah.setLayout(new FlowLayout());
			 	
		butang1=new JButton("ENTER");
		butang1.addActionListener(this);
		butang2=new JButton("EXIT");
		butang2.addActionListener(this);
	
		panelBawah.add(butang1);
		panelBawah.add(butang2);
		
		panelTengah.add(panelBawah, BorderLayout.SOUTH);
		bekas.add(panelTengah, BorderLayout.CENTER);
		
		setSize(400,300);
		setLocation(300,250);
		setVisible(true);			
	}
	
	public static void main(String [] args)
	{
		Welcome frame=new Welcome();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{		
				
		if (e.getSource() == butang1)
		{		
			CoursesRegistration gerak = new CoursesRegistration();
			gerak.setVisible(true);
			super.show(false);					
		}	
		
		else if (e.getSource() == butang2)
		{					
			Exit2 gerak = new Exit2();
			gerak.setVisible(true);
			super.show(false);			
		}			
	}
}