import org.w3c.dom.css.ElementCSSInlineStyle;

public class ex2_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Fib["+i+"]="+Fib(i));
		}
	}
	public static int Fib(int n) {
		if(n==1||n==2) 
			return 1;
		else 
			return Fib(n-1)+Fib(n-2);
	}
}
