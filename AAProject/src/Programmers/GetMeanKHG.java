package Programmers;

public class GetMeanKHG {
    public int getMean(int[] array) {
    	int leng = array.length;
    	int sum = 0;
    	for(int i=0;i<array.length;i++){
    		sum += array[i];
    	}
        return sum/leng;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMeanKHG getMean = new GetMeanKHG();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}
