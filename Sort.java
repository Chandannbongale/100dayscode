import java.util.*;
public class Sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j]) {
					char temp =ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
				
			} 
		String s= new String(ch);
		System.out.println(ch);
		}

	}

}
