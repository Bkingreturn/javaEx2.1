
public class ex2_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CART_ARRAY_LEN=54;
		int []carts=new int[CART_ARRAY_LEN];
		for(int i=0;i<CART_ARRAY_LEN;i++) {
			carts[i]=i+1;
		}
		for(int i=0;i<CART_ARRAY_LEN;i++) {
			int rdmNum1=(int)(Math.random()*54);
			int rdmNum2=(int)(Math.random()*54);
			int temp=carts[rdmNum1];
			carts[rdmNum1]=carts[rdmNum2];
			carts[rdmNum2]=temp;
		}
		for(int i=0;i<CART_ARRAY_LEN;i++) {
			System.out.println(carts[i]);
		}
	}

}
