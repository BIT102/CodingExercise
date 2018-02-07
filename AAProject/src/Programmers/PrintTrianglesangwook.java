package Programmers;

public class PrintTrianglesangwook {

	public static void main(String[] args) {
		
		PrintTrianglesangwook t = new PrintTrianglesangwook();
		System.out.println(t.tri(3));
	}

	public String tri(int num) {
		//num 만큼 별찍�?
		String st = "";
				
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				st+="*";
			}
			st+="\n";
		}
		
		
		return st;
	}
}
