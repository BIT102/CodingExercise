package Programmers;

public class FindKimsangwook {
	
	public String f(String[] seoul) {
		//x?�� �??��방의 ?��치�?? ???��?��?��
		int x=0;
		
		for(int i=0; i<seoul.length; i++) {
			
			//�?찾기
			if(seoul[i].equals("Kim")) {
				
				x = i;
	
			}
		}
		
		
		return "�??��방�? "+x+"?�� ?��?��";
	}
	
	public static void main(String[] args) {
	FindKimsangwook kim = new FindKimsangwook();
	String[] names = {"Queen", "Tod", "Kim"};
	System.out.println(kim.f(names));
	}

}

