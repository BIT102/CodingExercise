package Programmers;

public class StringExercisesangwook {

	public static void main(String[] args) {
		
		StringExercisesangwook s = new StringExercisesangwook();
		System.out.println(s.get("rrwwrrwdddww"));

	}
	
	String get(String word){
		//문자�? 배열?�� ?��?��?��
		char[] mid = new char[word.length()];
		for(int i=0; i<word.length(); i++) {
			mid[i] = word.charAt(i);
		}
		// ???��?���? ?���? (�??��?��)
		if(mid.length%2!=0){
			return mid[mid.length/2]+"";
		} else {
			//짝수?���? ?���? (�??��?��)
			return ""+mid[mid.length/2-1]+mid[mid.length/2];
		}
	}

}


