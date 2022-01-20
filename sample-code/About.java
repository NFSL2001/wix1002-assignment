import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener
{
		JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9,
		label10, label11, label12, label13, label14, label15, label16, label17, label18,
		label19, label20, label21, label22, label23, label24;
		JButton butang1;

	public About()
	{
		super(":::About:::");
		Container bekas=getContentPane();
		bekas.setLayout(new BorderLayout());
		
		JPanel panelAtas=new JPanel();
		panelAtas.setLayout(new FlowLayout());
		
		label1=new JLabel("SYSTEM DEVELOPER");
		label1.setFont(new Font("Arial",Font.BOLD,16));
		label1.setForeground(Color.black);
		panelAtas.add(label1);
		
		bekas.add(panelAtas, BorderLayout.NORTH);
		
		JPanel panelTengah=new JPanel();
		panelTengah.setLayout(new BorderLayout());
		
		JPanel panelTengahKiri=new JPanel();
		panelTengahKiri.setLayout(new GridLayout(11,1));	
				
		label2=new JLabel("  Name   :");			label3=new JLabel("  Metric  :");
		/*label4=new JLabel(" ");			label5=new JLabel("  Name   :");
		label6=new JLabel("  Metric  :");			label7=new JLabel(" ");
		label8=new JLabel("  Name   :");			label9=new JLabel("  Metric  :");
		label10=new JLabel(" ");		label11=new JLabel("  Name   :");
		label12=new JLabel("  Metric  :");*/
		
		panelTengahKiri.add(label2);		panelTengahKiri.add(label3);
		/*panelTengahKiri.add(label4);		panelTengahKiri.add(label5);
		panelTengahKiri.add(label6);		panelTengahKiri.add(label7);
		panelTengahKiri.add(label8);		panelTengahKiri.add(label9);
		panelTengahKiri.add(label10);		panelTengahKiri.add(label11);
		panelTengahKiri.add(label12);	*/	
		
		panelTengah.add(panelTengahKiri, BorderLayout.WEST);
		
		JPanel panelTengahTengah=new JPanel();
		panelTengahTengah.setLayout(new GridLayout(11,1));	
				
		label13=new JLabel("          Naruto Kun ");			
		label14=new JLabel("          99999 ");
		/*label15=new JLabel(" ");			
		label16=new JLabel("          aaaa ");
		label17=new JLabel("          12345 ");			
		label18=new JLabel(" ");
		label19=new JLabel("          bbb ");			
		label20=new JLabel("          11111 ");
		label21=new JLabel(" ");			
		label22=new JLabel("          ccc ");
		label23=new JLabel("          22222 ");*/
		
		panelTengahTengah.add(label13);		panelTengahTengah.add(label14);
		/*panelTengahTengah.add(label15);		panelTengahTengah.add(label16);
		panelTengahTengah.add(label17);		panelTengahTengah.add(label18);
		panelTengahTengah.add(label19);		panelTengahTengah.add(label20);
		panelTengahTengah.add(label21);		panelTengahTengah.add(label22);
		panelTengahTengah.add(label23);	*/	
	
		panelTengah.add(panelTengahTengah, BorderLayout.CENTER);
		bekas.add(panelTengah, BorderLayout.CENTER);
		
		JPanel panelBawah=new JPanel();
		panelBawah.setLayout(new FlowLayout());
				
		butang1=new JButton("Back");
		butang1.addActionListener(this);
	
		panelBawah.add(butang1);
		
		bekas.add(panelBawah, BorderLayout.SOUTH);
		
		setSize(200,230);
		setLocation(400,300);
		setVisible(true);			
	}
	
	public static void main(String [] args)
	{
		About frame=new About();
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
	}
}

