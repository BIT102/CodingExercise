package Programmers3;

import java.util.Arrays;

class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		// �߱� ������ �ּ�ȭ �Ͽ��� ���� �߱� ������ ���ϱ��?
		for(int j=0;j<no;j++){
			int maxIndex = 0;
			int max = 0;
			for(int i = 0;i<works.length;i++){
				if(max<works[i]){
					maxIndex = i;
					max = works[i];
				} 
			}
			works[maxIndex]--;
		}
		
		System.out.println(Arrays.toString(works));
		for(int i=0; i<works.length;i++){
			result += works[i]*works[i];
		}
		
		return result;
	}
	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {4,3,3};
		System.out.println(c.noOvertime(4,test));
	}
}


//�߱� ����
//ȸ����� �����̴� ���� ���� �׿� �ֽ��ϴ�. �����̴� �߱��� �ּ�ȭ�ϱ� ���� ���� ���� 
//�۾����� ���ڷ� �ޱ��, �Ͽ� ���� �߱� ������ ���̱�� �����߽��ϴ�. �߱� ������ ���� 
//���� �۾����� �����Ͽ� ���� ���� �ǹ��մϴ�. �����̴� 1�ð� ���� ���� �� �� �ϳ��� ��� 
//�۾��� 1��ŭ ó���� �� �ֽ��ϴ�. �������� ��ٱ��� ���� N �ð��� �� �Ͽ� ���� �۾����� ���� ��,
//noOvertime �Լ��� �����Ͽ� �������� �߱� ������ �ּ�ȭ �� ����� ����� �ּ���. ���� ���,
//N=4 �� ��, ���� ���� �۾����� [4, 3, 3] �̶�� �߱� ������ �ּ�ȭ�ϱ� ���� ���� �� ����� 
//[2, 2, 2]�� �ǰ� �߱� ������ 22 + 22 + 22 = 12�� �Ǿ� 12�� ��ȯ�� �ݴϴ�.