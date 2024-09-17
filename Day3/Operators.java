package Day3;

public class Operators {

	public static void main(String[] args) {
		// Arthimetic operators
		
		int a=10, b=20;
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is"+(a*b));
		
		//Relational / comparison operators < >= <= != ==
		//return boolean value  - true/false 
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		a=30;
		System.out.println(a>b);
		System.out.println(a<b);
		
		//3 logical operators we can use only boolean data types and only returns true or false 
		// and works only 
		/*& OPERATOR WILL WILL BE TRUE IF BOTH ARE TRUE 
		x       y         x&&y    x||y      !x      !y
		True    True      True      T          F       F
		T       F         F         T
		F       T         F         T         T
		F       F         F         F                  T */
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		
		boolean b1=10>20;
		System.out.println(b1); //false
		boolean b2=20>10;
		System.out.println(b2);// true
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1 );
		
		// Increment and decrement operator 
		
	
	}

}
