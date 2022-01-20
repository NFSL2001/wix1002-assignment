import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class DisplayAll extends JFrame implements ActionListener
{		
		private JTextArea txtArea;
		private JScrollPane skrol;
		private JButton butang1;
		String metric, nama, prog, code1, code2, code3, code4, code5, desc1, desc2, 
		desc3, desc4, desc5, ch1a, ch2a, ch3a, ch4a, ch5a, total1;		
		
	public DisplayAll()
	{
		super(":::Listing of Student:::");
		Container bekas=getContentPane();
		bekas.setLayout(new BorderLayout());
				
		JPanel panelAtas=new JPanel();
		panelAtas.setLayout(new BorderLayout());
	
		txtArea=new JTextArea(25,30);
		skrol=new JScrollPane(txtArea);		
		panelAtas.add(skrol);
		txtArea.setEditable(false);
		readFromFile();
		
		bekas.add(panelAtas, BorderLayout.NORTH);		
					
		JPanel panelTengah=new JPanel();
		panelTengah.setLayout(new BorderLayout());
		
		butang1=new JButton("Main Menu");		
		panelTengah.add(butang1);
		butang1.addActionListener(this);		
		bekas.add(panelTengah, BorderLayout.SOUTH);
		
		setSize(500,500);
		setLocation(250,150);
		setVisible(true);	
	}
		
	public static void main(String [] args)
	{
		DisplayAll frame=new DisplayAll();
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
			
	public void readFromFile()
	 {
		try
		{	FileInputStream aliranInput = new FileInputStream("data.txt");
			InputStreamReader aliran = new InputStreamReader(aliranInput);
			BufferedReader baca = new BufferedReader(aliran);
			StreamTokenizer token = new StreamTokenizer(baca);
			
			txtArea.append("List of Students");
			txtArea.append("\n============================================"+ "\n");
						
			token.nextToken();			
			while(token.ttype!=StreamTokenizer.TT_EOF)
			{	
				metric = token.sval;					token.nextToken();
				nama = token.sval;						token.nextToken();
				prog = token.sval;						token.nextToken();
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
									
				txtArea.append("\nMetric :  "+metric);
				txtArea.append("\nNama :  "+nama);
				txtArea.append("\nProgram : "+prog);
				txtArea.append("\nSubject 1 :  "+code1+ "   " +desc1+ "   " +ch1a);
				txtArea.append("\nSubject 2 :  "+code2+ "   " +desc2+ "   " +ch2a);
				txtArea.append("\nSubject 3 :  "+code3+ "   " +desc3+ "   " +ch3a);
				txtArea.append("\nSubject 4 :  "+code4+ "   " +desc4+ "   " +ch4a);
				txtArea.append("\nSubject 5 :  "+code5+ "   " +desc5+ "   " +ch5a);
				txtArea.append("\nTotal credit hour : "+total1+"\n");
				txtArea.append("\n============================================"+ "\n");
			}	
						
			aliranInput.close();		
	 	}
		catch (IOException e)
		{
			System.out.print("ralat");
		}
	 }	
}
