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

//1보다 큰 N개의 도시 중 한 곳에 공항을 지을 예정입니다. 사람들의 편의를 위해 공항으로부터 각 사람들까지의 도시간 이동 거리가 
//최소가 되는 도시에 짓기로 하였습니다. 편의상 도시는 일직선상에 놓여있다고 가정하며 좌표의 범위는 음수가 포함됩니다.
//또한 좌표는 정렬되어 있지 않습니다. 직선상의 위치와 그 도시에 사는 사람들의 수가 주어질 때, 공항을 지을 도시의 위치를 반환해주는
//함수 chooseCity 함수를 완성하세요. 거리가 같은 도시가 2개 이상일 경우 위치가 더 작은 쪽의 도시를 선택하면 됩니다. 
//예를 들어 다음과 같은 정보의 도시가 있다고 가정해 봅시다.