package Programmers;

public class StringExercisesangwook {

	public static void main(String[] args) {
		
		StringExercisesangwook s = new StringExercisesangwook();
		System.out.println(s.get("rrwwrrwdddww"));

	}
	
	String get(String word){
		//λ¬Έμλ₯? λ°°μ΄? ?΄??€
		char[] mid = new char[word.length()];
		for(int i=0; i<word.length(); i++) {
			mid[i] = word.charAt(i);
		}
		// ????΄λ©? ?κ°? (κ°??΄?°)
		if(mid.length%2!=0){
			return mid[mid.length/2]+"";
		} else {
			//μ§μ?΄λ©? ?κ°? (κ°??΄?°)
			return ""+mid[mid.length/2-1]+mid[mid.length/2];
		}
	}

}


