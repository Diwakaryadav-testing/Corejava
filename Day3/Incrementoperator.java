package Day3;

public class Incrementoperator {

	public static void main(String[] args) {
		// ++ increment operator Case 1
		int a=100;
		int b=200;
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
//case 2 and the Below method is called  Post  Increment  incrementation will happen then assiginig will happen then incrementation will happen.
		int c=10;
		int res=c++; // here we are assigning the c value to res that means 10 assiging to res so value will be 10 only 
		System.out.println(res); // so only assigining is happend so res will be 10
		System.out.println(c);
		
	//case 3 - Pre Increment in pre first incrementation will happen then assiginig will happen 
		int d=20;
		res=++d;
		System.out.println(res);
		System.out.println(d);
	}

}
