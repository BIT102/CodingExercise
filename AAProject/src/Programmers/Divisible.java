package Programmers;

import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		
		int size=0; //ret�� �迭 ���� ������ ���� ����
		
		//������ �������� �� ī��Ʈ
		for(int i=0;i<array.length;i++) {
			if(array[i]%divisor==0)
				size++;
		}
		
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		int[] ret = new int[size];
		
		int cnt=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%divisor==0)
				ret[cnt++] = array[i];
		}
		
		return ret;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {1,2,3,4,5,6,7,8,9 };
		System.out.println(Arrays.toString(div.divisible(array, 3)));
	}
}