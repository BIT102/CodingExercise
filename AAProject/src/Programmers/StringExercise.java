package Programmers;

class StringExercise{
    String getMiddle(String word){

    	int cnt = 0;
    	cnt = word.length();
    	
    	if(cnt%2==1){
    		return Character.toString(word.charAt(cnt/2));
    	}else{
    		return Character.toString(word.charAt(cnt/2-1))+Character.toString(word.charAt(cnt/2));
    	}
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}