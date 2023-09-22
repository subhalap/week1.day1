package week1.day1;

public class CovertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = -40;
		
		if (number > 0) {
			
			System.out.println("Number is positive ");
			
		}else {
			
			System.out.println("Number is negative");
		}
		
		int sec_num = -1;
		int convert_to_positive_num = number * sec_num;
		
		System.out.println("Number converted to positive number : " + convert_to_positive_num);

	}

}
