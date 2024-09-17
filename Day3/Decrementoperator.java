package Day3;

public class Decrementoperator {

	public static void main(String[] args) {
		//case 1
		int a=10;
		a=a-1;
		System.out.println(a);
		
		//case 2 --pre decrement
		int b=50;
		int res=--b;
		System.out.println(res);
		
		//case 3 --post decrement
		int c=50;
		int rec=c--;
		System.out.println(rec);

	}

}
