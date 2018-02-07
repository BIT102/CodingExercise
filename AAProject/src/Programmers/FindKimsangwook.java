package Programmers;

public class FindKimsangwook {
	
	public String f(String[] seoul) {
		//x?— ê¹??„œë°©ì˜ ?œ„ì¹˜ë?? ???¥?•˜?
		int x=0;
		
		for(int i=0; i<seoul.length; i++) {
			
			//ê¹?ì°¾ê¸°
			if(seoul[i].equals("Kim")) {
				
				x = i;
	
			}
		}
		
		
		return "ê¹??„œë°©ì? "+x+"?— ?ˆ?‹¤";
	}
	
	public static void main(String[] args) {
	FindKimsangwook kim = new FindKimsangwook();
	String[] names = {"Queen", "Tod", "Kim"};
	System.out.println(kim.f(names));
	}

}

