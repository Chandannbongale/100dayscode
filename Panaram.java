import java.util.*;
public class Panaram {
static String removeSpace(String s) {
	char[] ch=s.toCharArray();
	String nstr="";
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=' ') {
			nstr=nstr+ch[i];
		}
			
		}
return nstr;	
}
static int check(String st) {
	int n=26;
	if(st.length()<n) {
		return -1;
	}
	for(char i='A';i<='Z';i++) {
		if((st.length()<0)&&(st.indexOf((char)i+32))<0) {
			return -1;
		}
	}

return 1;
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String str= sc.nextLine();
	String st=removeSpace(str);
	int res=check(str);{
	if(res==-1) {
		System.out.println("The given String is not a pangram");
		
	}else {
		System.out.println("The given String is  panagram");
		
	}
}
}
}
