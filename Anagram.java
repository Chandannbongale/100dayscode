import java.util.*;
public class Anagram {
	public static String removeSpace(String input)
	{
		String nstr="";
		char[] ch=input.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				nstr=nstr+ch[i];
			}
		}
		return nstr;
	}
	static String lowerCase(String s1)
	{
		char[] ch=s1.toCharArray();
		String nstr=" ";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65||ch[i]<=90)
			{
				nstr= nstr+ch[i];
				
			}else
			{
				nstr=nstr+ch[i];
			}
		}return nstr;
	}
	static String Sort(String s1) {
		char [] ch=s1.toCharArray();
		String nstr="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}String nstr1=new String(ch);
		return nstr;
	}
	static boolean compare(String s1,  String s2)
	{
		if(s1.length()!=s2.length())
		return false;
		else {
			String st1=lowerCase(s1);
			String st2=lowerCase(s2);
			s1=Sort(s1);
			s2=Sort(s2);
			char[]ch1=s1.toCharArray();
			char[]ch2=s2.toCharArray();
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
			}return true;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		System.out.println("enter the String 1");
		String str1=sc1.nextLine();
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the string 2");
		String str2=sc2.nextLine();
		String s1= removeSpace(str1);
		String s2=removeSpace(str2);
		boolean b= compare(s1, s2);
				{
			if(b) {
				System.out.println("String is Anagram");
				
			}else
			{System.out.println("String is not Anagram ");
				}

	}

}
}