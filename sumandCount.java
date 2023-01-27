import java.util.*;
public class sumandCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		char[] ch =str.toCharArray();
		String nstr="";
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				nstr=nstr+"="+count+" ";
				count=0;
			}else {
				count++;
				nstr+=ch[i];
				
			}
		}nstr=nstr+"="+count+" ";
		System.out.println(nstr);

	}

}
