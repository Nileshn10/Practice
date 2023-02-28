package first;

public class Fibo18 extends Demo2 {
	public static void main(String[] args) {
		
		Demo2 obj=new Demo2();
	    obj.add();
	    
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(b);
			
			
		}
	}

}
