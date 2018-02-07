package Programmers;

public class WaterMelonsangwook {
	public String wa(int n) {
		//n=3?´ë©? ?ˆ˜ë°•ìˆ˜      n=4?´ë©? ?ˆ˜ë°•ìˆ˜ë°?
		
		//ê²°ê³¼ë¡? ì¶œë ¥?•  ë³??ˆ˜
		String result = "";
		
		//???ˆ˜?´ë©? ?ˆ˜  ì§ìˆ˜?´ë©? ë°?
		for(int i=0; i<n; i++) {
			if(i%2!=0){
				result += "ë°?";
			} else { result += "?ˆ˜"; 
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
