package Programmers;

import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		
		int size=0; //ret의 배열 길이 저장할 변수 선언
		
		//나누어 떨어지는 수 카운트
		for(int i=0;i<array.length;i++) {
			if(array[i]%divisor==0)
				size++;
		}
		
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		int[] ret = new int[size];
		
		int cnt=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%divisor==0)
				ret[cnt++] = array[i];
		}
		
		return ret;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {1,2,3,4,5,6,7,8,9 };
		System.out.println(Arrays.toString(div.divisible(array, 3)));
	}
}