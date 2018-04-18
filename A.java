import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("how many names are you entering?");
		String[] x=new String[scan.nextInt()];
		for(int i=0; i<x.length;i++){
		System.out.println("Enter names" +(i+1));
		x[i]=scan.next();
		}
		System.out.println("What name are you looking for?");
		String y=scan.next();
		String b= "no match";
		String a=null;
		for(int j=0; j<x.length; j++){
		if( y.equals(x[j])){
		a="match found";
		
		}
		}
		System.out.println(a);
		}
		


	}


