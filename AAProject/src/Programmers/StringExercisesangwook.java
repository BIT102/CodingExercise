package Programmers;

public class StringExercisesangwook {

	public static void main(String[] args) {
		
		StringExercisesangwook s = new StringExercisesangwook();
		System.out.println(s.get("rrwwrrwdddww"));

	}
	
	String get(String word){
		//ë¬¸ìë¥? ë°°ì—´?— ?‹´?Š”?‹¤
		char[] mid = new char[word.length()];
		for(int i=0; i<word.length(); i++) {
			mid[i] = word.charAt(i);
		}
		// ???ˆ˜?´ë©? ?•œê°? (ê°??š´?°)
		if(mid.length%2!=0){
			return mid[mid.length/2]+"";
		} else {
			//ì§ìˆ˜?´ë©? ?‘ê°? (ê°??š´?°)
			return ""+mid[mid.length/2-1]+mid[mid.length/2];
		}
	}

}


