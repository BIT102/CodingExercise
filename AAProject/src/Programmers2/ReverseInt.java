package Programmers2;

import java.util.Arrays;

public class ReverseInt {
	public int reverseInt(int n){
		
		int nTest = n;
		int cnt = 0;
		while(n>0){
			n = n/10;
			cnt++;
		}
		
		int[] intArr = new int[cnt];
		
		for(int i=0;i<cnt;i++){
			intArr[i] = nTest%10;
			nTest = nTest/10;
		}

		Arrays.sort(intArr);
		int result = 0;
		for(int i=0; i<intArr.length; i++){
			result += intArr[i]*(int)Math.pow(10, i);
		}
		
		return result;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}