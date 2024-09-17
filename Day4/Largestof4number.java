package Day4;

public class Largestof4number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10,b=20,c=30;
    if(a>b && a>c)
    {
    	System.out.println("a is largest number"+a);
    }
    else if(b>c && b>a)
    {
    	System.out.println("b is largest number"+b);
    }
    else
    {
    	System.out.println("c is largest number"+c);
    }
	}

}
///System.out.println("c is largest number"); ------Difference between 2 statement is +c it means concatination 
///System.out.println("c is largest number"+c);