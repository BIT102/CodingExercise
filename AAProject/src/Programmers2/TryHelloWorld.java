package Programmers2;

class TryHelloWorld {
	public int getMinSum(int[] A, int[] B) {
		int answer = 0;

		for(int i = 0; i<A.length;i++){
			answer+=A[i]*B[B.length-i-1];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}
}