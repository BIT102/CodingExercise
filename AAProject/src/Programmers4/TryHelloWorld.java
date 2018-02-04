package Programmers4;

import java.util.Arrays;
import java.util.Comparator;

class MySort implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof int[] && o2 instanceof int[]){
			int[] a1 = (int[]) o1;
			int[] a2 = (int[]) o2;
			return a1[0]>a2[0]?1:(a1[0]==a2[0]?0:-1);
		}
		return -1;
	}
}

class TryHelloWorld 
{
    public int chooseCity(int n, int [][]city)
    {
        int answer = 0;
        
        Arrays.sort(city, new MySort());
        int min = 100;
        int[] cntResult = new int[n];
        
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++)
        		cntResult[i] += Math.abs(city[j][0]-city[i][0])*city[j][1];
        	
        	if(min>cntResult[i]){
        		min = cntResult[i];
        		answer = city[i][0];
        	}
        }
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int tn = 3;
        int [][]tcity = {{2,2},{1,5},{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }

}

//1���� ū N���� ���� �� �� ���� ������ ���� �����Դϴ�. ������� ���Ǹ� ���� �������κ��� �� ���������� ���ð� �̵� �Ÿ��� 
//�ּҰ� �Ǵ� ���ÿ� ����� �Ͽ����ϴ�. ���ǻ� ���ô� �������� �����ִٰ� �����ϸ� ��ǥ�� ������ ������ ���Ե˴ϴ�.
//���� ��ǥ�� ���ĵǾ� ���� �ʽ��ϴ�. �������� ��ġ�� �� ���ÿ� ��� ������� ���� �־��� ��, ������ ���� ������ ��ġ�� ��ȯ���ִ�
//�Լ� chooseCity �Լ��� �ϼ��ϼ���. �Ÿ��� ���� ���ð� 2�� �̻��� ��� ��ġ�� �� ���� ���� ���ø� �����ϸ� �˴ϴ�. 
//���� ��� ������ ���� ������ ���ð� �ִٰ� ������ ���ô�.