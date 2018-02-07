package Programmers;

public class GetMinMaxStringsangwook {
	public String get(String str) {
		//ìµœë? ìµœì†Œ ë°˜í™˜?•˜ê¸?
		
		//ê³µë°±? œê±?
		String[] num1 = str.split(" ");
		int[] num2 = new int[num1.length];
	
		
		// ?¸?Š¸ë°°ì—´?— ?‹´?Š”?‹¤
		for(int i=0; i<num1.length; i++) {
			num2[i]=Integer.parseInt(num1[i]);
		}
		//max?? min ì´ˆê¸°?™”
		int max=num2[0];
		int min=num2[0];
		//ìµœë?ê°? ë§Œë“¤ê¸?
		for(int i=0; i<num2.length; i++) {
			if(num2[i]>max) max=num2[i];
		}
		//ìµœì†Œê°? ë§Œë“¤ê¸?
		for(int i=0; i<num2.length; i++) {
			if(num2[i]<min) min=num2[i];
		}
		
		String a = min+" "+max;
		return a;
	}		
		
	 

	
	public static void main(String[] args) {
		String str = "1 2 3 -4";
		GetMinMaxStringsangwook mM = new GetMinMaxStringsangwook();
		
		System.out.println("ìµœë? ìµœì†Œ?Š”?" + mM.get(str));
	}
}
