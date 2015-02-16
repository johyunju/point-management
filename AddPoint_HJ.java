import java.util.Scanner;


public class AddPoint_HJ {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userId = 0;
		int paidAmout = 0;
		float paidRate = 0;
		
		while(true){
		Scanner s = new Scanner(System.in);
		System.out.println("USER ID = ");
		userId = s.nextInt();
		
		System.out.println("PAID AMOUNT = ");
		paidAmout = s.nextInt();
		
		System.out.println("RATE = ");
		paidRate = s.nextFloat();
		
		Add(paidAmout,paidRate,userId);
		break;
		}
		
	}
	
	public static int Add(int paidAmount, float rate, int Id){
		
		int addAmount = 0;
		
		addAmount = (int)(paidAmount*rate);
		System.out.println(addAmount);
		
		return addAmount;
	}
	
}
