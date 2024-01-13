import java.util.*;
public class Amicable_number {

	public static void main(String[] args) {
		
		//amicable number

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number 1");
		int num_1 = sc.nextInt();
		System.out.println("Enter number 2");
		int num_2 = sc.nextInt();
		
		int sum1=0;
		int sum2=0;
		
		for(int a=1;a<=num_1/2;a++) {
			if(num_1%a==0) {			//calculating factor
				sum1 = sum1 + a;		//adding the factors
			}
		}
		for(int a=1;a<=num_2/2;a++) {
			if(num_2%a==0) {
				sum2=sum2+a;
			}
		}
		if(num_1==sum2 && num_2==sum1) {		
			System.out.println("amicable numbers");
		}else {
			System.out.println("not amicable numbers");
		}
	}

}
