package Programmers;

public class WaterMelonsangwook {
	public String wa(int n) {
		//n=3?���? ?��박수      n=4?���? ?��박수�?
		
		//결과�? 출력?�� �??��
		String result = "";
		
		//???��?���? ?��  짝수?���? �?
		for(int i=0; i<n; i++) {
			if(i%2!=0){
				result += "�?";
			} else { result += "?��"; 
			}
		}
		return result;
	}
	
	public static void main(String[] args) {

		WaterMelonsangwook w = new WaterMelonsangwook();
		System.out.println("n=3 : "+w.wa(3));
		System.out.println("n=4 : "+w.wa(4));
		
	}

}
