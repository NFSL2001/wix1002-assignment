import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exit extends JFrame implements ActionListener
{
		JLabel label1, label2;
		JButton butang1, butang2;

	public Exit()
	{
		super("::Exit System::");
		Container bekas=getContentPane();
		bekas.setLayout(new BorderLayout());
		
		JPanel panelAtas=new JPanel();
		panelAtas.setLayout(new BorderLayout());
		
		JPanel panelAtasA=new JPanel();
		panelAtasA.setLayout(new FlowLayout());
		
		label1=new JLabel("Do you want to close this system?");
		panelAtasA.add(label1);
		
		panelAtas.add(panelAtasA, BorderLayout.NORTH);				
		
		JPanel panelBawah=new JPanel();
		panelBawah.setLayout(new FlowLayout());
			 	
		butang1=new JButton("YES");
		butang1.addActionListener(this);
		butang2=new JButton("NO");
		butang2.addActionListener(this);
	
		panelBawah.add(butang1);
		panelBawah.add(butang2);
		
		panelAtas.add(panelBawah, BorderLayout.CENTER);
		bekas.add(panelAtas, BorderLayout.CENTER);
		
		setSize(250,110);
		setLocation(400,350);
		setVisible(true);			
	}
	
	public static void main(String [] args)
	{
		Exit frame=new Exit();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{						
		if (e.getSource() == butang1)
		{		
			System.exit(0);					
		}			
		else if (e.getSource() == butang2)
		{					
			CoursesRegistration gerak = new CoursesRegistration();
			gerak.setVisible(true);
			super.show(false);				
		}			
	}
}

