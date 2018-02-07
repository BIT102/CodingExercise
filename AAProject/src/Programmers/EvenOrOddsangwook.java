package Programmers;

public class EvenOrOddsangwook {

	String ev(int num) {
		String result = "";
		
		//짝수
		if(num%2==0){
			result = "Even";
		} else {
			//???��
			result = "Odd";
		}
		
		return result;
	}
	public static void main(String[] args) {

		String str = "1 2 3 4";
		EvenOrOddsangwook even = new EvenOrOddsangwook();
		
		System.out.println("결과 : " + even.ev(3));
		System.out.println("결과 : " + even.ev(2));
	}

}
