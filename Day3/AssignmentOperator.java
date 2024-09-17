package Day3;

public class AssignmentOperator {

	public static void main(String[] args) {
		// = += -= *= /= %=
		// basically we are using variable(a,b,c....) multiple times in expression so instead of that we can use the assigment operators a=a+5 is replaced with a+=5
		int a=10;
		a=a+5;// instead of this we can use a+=5
		//a=a-5;//we can write a-=5;
		System.out.println(a);
		
		//example -2
		int b=20;
		b=b*2;
		System.out.println(b);
		
		int c=30;
		c=c%3;
		System.out.println(c);
		
		int d=50;
		d=d/5;
		System.out.println(d);

	}

}
