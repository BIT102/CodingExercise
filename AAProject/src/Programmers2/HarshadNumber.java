package Programmers2;

public class HarshadNumber{
	public boolean isHarshad(int num){
		
		int sum = 0;
		int numTest = num;
		
		while(numTest>0){
			sum += numTest%10;
			numTest = numTest/10;
		}
		
		if(num%sum==0) return true;
		
		return false;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}