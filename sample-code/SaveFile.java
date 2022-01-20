import java.io.*;

public class SaveFile
{
	private Pemain head;
	private int size = 0;
	
	String metric, nama, prog, code1, code2, code3, code4, code5, desc1, desc2, desc3, 
	desc4, desc5, total1, ch1a, ch2a, ch3a, ch4a, ch5a;
	int ch1, ch2, ch3, ch4, ch5, total;
	
	public SaveFile()
	{	head = null;
	}
	
	public boolean isEmpty(Pemain cursor)
	{	if (cursor == null)
			return true;
		else
			return false;
	}
		
	public void sendStudentInfo(String metric, String nama, String prog, String code1, 
	String code2, String code3, String code4, String code5, String desc1, String desc2, 
	String desc3, String desc4, String desc5,  int ch1,  int ch2,  int ch3, int ch4, 
	int ch5, int total)
	 {
	 	 head = new Pemain(metric, nama, prog, code1, code2, code3, code4, code5, desc1, 
		 desc2, desc3, desc4, desc5, ch1, ch2, ch3, ch4, ch5, total, head);
		 size++;	 
	 }
						
	public void readFromFile()
	{	try
		{	FileInputStream aliranInput=new FileInputStream ("data.txt");
			InputStreamReader aliran=new InputStreamReader(aliranInput);
			BufferedReader baca=new BufferedReader(aliran);
			StreamTokenizer token=new StreamTokenizer(baca);
													
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
				ch5a= token.sval;						token.nextToken();
				total1 = token.sval;					token.nextToken();
				
				head = new Pemain(metric, nama, prog, code1, code2, code3, code4, code5, 
				desc1, desc2, desc3, desc4, desc5, ch1a, ch2a, ch3a, ch4a, ch5a, total1 
				,head);
				size++;
			} 			
			aliranInput.close();					
		}catch(IOException e){}
	}	

	public boolean findRecord(String t)
	{	boolean find = false;
		
		if ( !isEmpty(head) )
		{	Pemain current = head;
			String metric;
												
			while (current != null)
			{	metric = current.getmetric();
				if ( metric.equals(t) )
				{	try
					{	FileWriter tulis = new FileWriter("cari.txt");
						PrintWriter out = new PrintWriter(tulis);
						
						out.print("\"" + current.getmetric() + "\" ");		
						out.print("\"" + current.getnama() + "\" ");
						out.print("\"" + current.getprog() + "\" ");
						out.print("\"" + current.getcode1() + "\" ");
						out.print("\"" + current.getcode2() + "\" "); 
						out.print("\"" + current.getcode3() + "\" ");
						out.print("\"" + current.getcode4() + "\" ");
						out.print("\"" + current.getcode5() + "\" ");
						out.print("\"" + current.getdesc1() + "\" ");
						out.print("\"" + current.getdesc2() + "\" ");
						out.print("\"" + current.getdesc3() + "\" ");
						out.print("\"" + current.getdesc4() + "\" ");
						out.print("\"" + current.getdesc5() + "\" ");
						out.print("\"" + current.getch1a() + "\" ");
						out.print("\"" + current.getch2a() + "\" ");
						out.print("\"" + current.getch3a() + "\" ");
						out.print("\"" + current.getch4a() + "\" ");
						out.print("\"" + current.getch5a() + "\" ");
						out.print("\"" + current.gettotal1() + "\" ");
						out.flush();
						tulis.close();
					}catch(IOException e){}		
					find = true;
					break;					
				}	
				current = current.getLink();				
			}			
		}
		return find;
	}
	
	public void saveToFile()
	{	try
		{	FileWriter tulis = new FileWriter("data.txt",true);
			PrintWriter out  = new PrintWriter(tulis);
		
			Pemain current = head;
			while(current != null)
			{	
			
				out.print("\"" + current.getmetric() + "\" ");		
				out.print("\"" + current.getnama() + "\" ");
				out.print("\"" + current.getprog() + "\" ");
				out.print("\"" + current.getcode1() + "\" ");
				out.print("\"" + current.getcode2() + "\" "); 
				out.print("\"" + current.getcode3() + "\" ");
				out.print("\"" + current.getcode4() + "\" ");
				out.print("\"" + current.getcode5() + "\" ");
				out.print("\"" + current.getdesc1() + "\" ");
				out.print("\"" + current.getdesc2() + "\" ");
				out.print("\"" + current.getdesc3() + "\" ");
				out.print("\"" + current.getdesc4() + "\" ");
				out.print("\"" + current.getdesc5() + "\" ");				
				out.print("\"" + current.getch2() + "\" ");
				out.print("\"" + current.getch3() + "\" ");
				out.print("\"" + current.getch4() + "\" ");
				out.print("\"" + current.getch5() + "\" ");
				out.print("\"" + current.gettotal() + "\" ");
				out.print("\"" + current.getch1() + "\" ");
				out.println();
				current = current.getLink();
			}
			out.flush();
			tulis.close();
		}catch(IOException e){}		
	}					
}