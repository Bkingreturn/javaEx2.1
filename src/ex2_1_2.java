
public class ex2_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<20;j++) {
				if(j>i&&j<19-i)
					System.out.print(" ");
				else 
					System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
