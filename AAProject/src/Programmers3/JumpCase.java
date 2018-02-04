package Programmers3;

class JumpCase {

	static int permutation(int a, int b){
		if(a<b) return -1;
		if(a==b||a==1||a==0) return 1;
		int sum = 0;
		for(int i=a; i>b;i--){
			sum *= a; 
		}
		return sum;
	}
	
	static int factorial(int num){
		if(num==1||num==0){return 1;}
		
		int result = 1;
		for(int i=num;i>0;i--){
			result*=i;
		}
		
		return result;
	}
	
    public int jumpCase(int num) {
        int answer = 0;

        int two = 0;
        int numTest = num;
        
        while(numTest>0){
        	two++;
        	numTest = numTest/2;
        }
        
        for(int i=0;i<two+1;i++){
        	answer += permutation(num-i, num-2*i)/(factorial(i));
        }
        
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 20;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}