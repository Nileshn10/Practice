package first;

public class ReversString {
	public static void main(String[] args) {
		String a="Nilesh";
		String b=" ";
		for(int i=a.length()-1; i>=0;i--) {
			b+=a.charAt(i);
			
		}
		System.out.println(b);
	}

}
