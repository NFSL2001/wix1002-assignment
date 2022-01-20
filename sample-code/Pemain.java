import java.io.*;

public class Pemain
{
	private String metric, nama, prog, code1, code2, code3, code4, code5, desc1, desc2, desc3, desc4, desc5;
	private int ch2, ch3, ch4, ch5, total;
	private String ch1a, ch2a, ch3a, ch4a, ch5a, total1;
	int ch1;
	
	private Pemain link;
		
	public Pemain(){}
	
	public Pemain(String stu_metric, String stu_name, String stu_prog, String stu_code1,
	String stu_code2, String stu_code3,String stu_code4, String stu_code5, String stu_desc1,
	String stu_desc2, String stu_desc3, String stu_desc4, String stu_desc5, int stu_ch1,
	int stu_ch2, int stu_ch3, int stu_ch4, int stu_ch5, int stu_total, Pemain newNode)	
	{
		metric=stu_metric;
		nama=stu_name;
		prog=stu_prog;
		code1=stu_code1;
		code2=stu_code2;
		code3=stu_code3;
		code4=stu_code4;
		code5=stu_code5;
		desc1=stu_desc1;
		desc2=stu_desc2;
		desc3=stu_desc3;
		desc4=stu_desc4;
		desc5=stu_desc5;		
		ch1=stu_ch1;
		ch2=stu_ch2;
		ch3=stu_ch3;
		ch4=stu_ch4;
		ch5=stu_ch5;
		total=stu_total;
		link = newNode;	
	}
	
	public Pemain(String stu_metric, String stu_name, String stu_prog, String stu_code1,
	String stu_code2, String stu_code3, String stu_code4, String stu_code5, String stu_desc1,
	String stu_desc2, String stu_desc3, String stu_desc4, String stu_desc5, String stu_ch1,
	String stu_ch2, String stu_ch3, String stu_ch4, String stu_ch5, String stu_total, 
	Pemain newNode)
	{	
		metric=stu_metric;
		nama=stu_name;
		prog=stu_prog;
		code1=stu_code1;
		code2=stu_code2;
		code3=stu_code3;
		code4=stu_code4;
		code5=stu_code5;
		desc1=stu_desc1;
		desc2=stu_desc2;
		desc3=stu_desc3;
		desc4=stu_desc4;
		desc5=stu_desc5;
		ch1a=stu_ch1;
		ch2a=stu_ch2;
		ch3a=stu_ch3;
		ch4a=stu_ch4;
		ch5a=stu_ch5;
		total1=stu_total;
		link = newNode;		
	}
	
	public String getmetric()
	{	return metric;		
	}
	public String getnama()
	{	return nama;
	}
	public String getprog()
	{	return prog;
	}
	public String getcode1()
	{	return code1;
	}
	public String getcode2()
	{	return code2;
	}
	public String getcode3()
	{	return code3;		
	}
	public String getcode4()
	{	return code4;		
	}
	public String getcode5()
	{	return code5;		
	}
	public String getdesc1()
	{	return desc1;		
	}
	public String getdesc2()
	{	return desc2;		
	}
	public String getdesc3()
	{	return desc3;		
	}
	public String getdesc4()
	{	return desc4;		
	}
	public String getdesc5()
	{	return desc5;		
	}
	public int getch1()
	{	return ch1;		
	}
	public int getch2()
	{	return ch2;		
	}
	public int getch3()
	{	return ch3;		
	}
	public int getch4()
	{	return ch4;		
	}
	public int getch5()
	{	return ch5;		
	}
	public int gettotal()
	{	return total;		
	}
	public String getch1a()
	{	return ch1a;		
	}
	public String getch2a()
	{	return ch2a;		
	}
	public String getch3a()
	{	return ch3a;		
	}
	public String getch4a()
	{	return ch4a;		
	}
	public String getch5a()
	{	return ch5a;		
	}
	public String gettotal1()
	{	return total1;		
	}		
	public Pemain getLink()
	{	return link;
	}
	public void setLink(Pemain p)
	{	link = p;
	}	
}

