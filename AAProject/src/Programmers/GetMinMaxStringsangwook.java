package Programmers;

public class GetMinMaxStringsangwook {
	public String get(String str) {
		//최�? 최소 반환?���?
		
		//공백?���?
		String[] num1 = str.split(" ");
		int[] num2 = new int[num1.length];
	
		
		// ?��?��배열?�� ?��?��?��
		for(int i=0; i<num1.length; i++) {
			num2[i]=Integer.parseInt(num1[i]);
		}
		//max?? min 초기?��
		int max=num2[0];
		int min=num2[0];
		//최�?�? 만들�?
		for(int i=0; i<num2.length; i++) {
			if(num2[i]>max) max=num2[i];
		}
		//최소�? 만들�?
		for(int i=0; i<num2.length; i++) {
			if(num2[i]<min) min=num2[i];
		}
		
		String a = min+" "+max;
		return a;
	}		
		
	 

	
	public static void main(String[] args) {
		String str = "1 2 3 -4";
		GetMinMaxStringsangwook mM = new GetMinMaxStringsangwook();
		
		System.out.println("최�? 최소?��?" + mM.get(str));
	}
}
