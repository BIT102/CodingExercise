package Programmers;

public class FindKimsangwook {
	
	public String f(String[] seoul) {
		//x? κΉ??λ°©μ ?μΉλ?? ???₯??
		int x=0;
		
		for(int i=0; i<seoul.length; i++) {
			
			//κΉ?μ°ΎκΈ°
			if(seoul[i].equals("Kim")) {
				
				x = i;
	
			}
		}
		
		
		return "κΉ??λ°©μ? "+x+"? ??€";
	}
	
	public static void main(String[] args) {
	FindKimsangwook kim = new FindKimsangwook();
	String[] names = {"Queen", "Tod", "Kim"};
	System.out.println(kim.f(names));
	}

}

