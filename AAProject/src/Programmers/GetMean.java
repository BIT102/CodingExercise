package Programmers;

public class GetMean {
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
        GetMean getMean = new GetMean();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}
