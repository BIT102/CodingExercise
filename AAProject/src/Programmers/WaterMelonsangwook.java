package Programmers;

public class WaterMelonsangwook {
	public String wa(int n) {
		//n=3?΄λ©? ?λ°μ      n=4?΄λ©? ?λ°μλ°?
		
		//κ²°κ³Όλ‘? μΆλ ₯?  λ³??
		String result = "";
		
		//????΄λ©? ?  μ§μ?΄λ©? λ°?
		for(int i=0; i<n; i++) {
			if(i%2!=0){
				result += "λ°?";
			} else { result += "?"; 
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
