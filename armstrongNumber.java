import java.util.*;
public class armstrongNumber {
	public static int count(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		} return count;	
	}
	public static boolean isArmstrong (int x) {
		int nd=count(x);
		int t=x;
		int r,sum=0;
		while(x!=0) {
			r=x%10;
			sum=sum+power(r,nd);
			x=x/10;
		}if(t==sum) {
			return true;
		}else
			return false;	
	}
	public static int power(int r, int nd) {
		int pw=1;
		while(nd>0) {
			pw=pw*r;
			 nd--;
		}
		
		return pw;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
		boolean res=isArmstrong(i);
			if(res) {
				System.out.println(i+" "+"Armstrong number");
			}else
			{ System.out.println(i+" "+"not a armstrong number");
			}}}}
