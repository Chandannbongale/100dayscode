import java.util.*;
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the String with nor");
String str= sc.nextLine();
char[] ch=str.toCharArray();
int sum=0;
int count=0;
String nstr="";
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>=48 &&ch[i]<=57) {
		sum=sum+ch[i]-48;
		count++;
	}else
	{
		nstr=nstr+ch[i];
	}
}
	System.out.println("the sum of digits is ="+sum);
	System.out.println("the count of digits is ="+count);
	System.out.println("the string is  "+ nstr);
}
	}


