package first;

//0,1, 1,2,3,5,8,13,21,34,

public class Fibonaci_Series {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<10;i++) {
		c=a+b;
		
		a=b;
		b=c;
		System.out.println(c);
		}
	}

}
