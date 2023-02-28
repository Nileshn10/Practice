package first;

public class Demo2 {
	
	public final void add() {
		int g= 100;
		g=200;
		System.out.println("This is final"+g);
		
	}
	public static void main(String[] args) {
		Demo2 ob=new Demo2();
		ob.add();
		
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
