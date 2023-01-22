import java.util.*;
public class Palendrome {
static String revString(String input) {
	String nstr="";
	char[] ch=input.toCharArray();
	for(int a=ch.length-1;a>=0;a--) {
		nstr=nstr+ch[a];
	}
	return nstr;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
String rev=revString(str);
if(rev.equalsIgnoreCase(str))
{
	System.out.println("the given String is Palendrome");
	
}else
{System.out.println("the given String is not a Palendrome");
	}

}
}
