package Programmers;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
        
    	int max = str.charAt(0)-'0';
    	int min = str.charAt(0)-'0';
    	
    	
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)>max) max = str.charAt(i)-'0';
    		if(str.charAt(i)<min && str.charAt(i)!=' ') min = str.charAt(i)-'0';
    	}
    	
    	
    	String result = min + " " + max;
        return result;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}