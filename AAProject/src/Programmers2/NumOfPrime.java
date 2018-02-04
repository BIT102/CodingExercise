package Programmers2;

class NumOfPrime {
int numberOfPrime(int n) {
		int result = 0;
		// 함수를 완성하세요.
		
		for(int i = 2;i<=n;i++){
			Boolean check = true;
			for(int j=2;j<=i;j++){
				if(i%j==0&&i!=j){
					check = false;
					break;
				}
			}
			if(check == true) result++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println( prime.numberOfPrime(10) );
	}

}