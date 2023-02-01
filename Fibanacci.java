import java.util.*;
public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=0,n2=1,n3 = 0;
		int sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=n;i++) 
		{
			//sum=sum+(n3);
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			sum+=n3;
			}
			System.out.println("\n the sum is="+sum);
		}
				

	}


