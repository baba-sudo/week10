1-100加
//package test01;
//public class Class05 {
//	public static void main(String[] args){
//		int sum = 0;
//		for (int x = 0; x<=100; x++){
//		sum += x;}
//		 
//			System.out.println("sum="+ sum);	
//	}
//
//}
//package test01;
//public class Class05 {
//	public static void main(String[] args){
//	int sum = 0;
//	int x = 0;
//	do { System.out.println(sum += x);x++;
//		
//	}while ( x <=100 );
//	
//	}
//}

package test01;
import java.util.Scanner;
public class Class04 {
	public static void main(String[] args){
		int score ;
//		char grade;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入：");
		score=input.nextInt();
		switch (score/10) {
		case 10:
		case 9:	
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("E");
			break;
		}
	}

}




//package test01;
//import java.util.Scanner;
//public class Class03 {
//	public static void main(String[] args){
//		int a,b,c;
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入三角形的三边：");
//		a=input.nextInt();
//	    b=input.nextInt();
//	    c=input.nextInt();
//	    double p = (a+b+c)/2.0;
//	    double s;
//	    s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
//	    if (a+b>c || b+c>a || a+c>b || a>0 || b>0 ||c>0){
//	    System.out.print(s);
//	    }
//	    else
//	    	 System.out.print("无法构成三角形");	
//	}
//}
