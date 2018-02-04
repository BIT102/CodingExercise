package Programmers2;

import java.util.Arrays;

class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][B[0].length];
		
		//유효성검사
		if(A[0].length!=B.length) return null;
		
		for(int i=0;i<A.length;i++)
			for(int j=0;j<B[0].length;j++)
				for(int k=0;k<A[0].length;k++)
					answer[i][j] += A[i][k]*B[k][j];
		
		return answer;
	}

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 ,1,1}, { 2, 3,2,1 } };
		int[][] b = { { 3, 4 }, { 5, 6 },{2,4},{2,6} };
      // 아래는 테스트로 출력해 보기 위한 코드입니다.
      System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));
      System.out.println(Arrays.deepToString(c.productMatrix(a, b))); // 다차원 배열 toString 출력법
	}
}
