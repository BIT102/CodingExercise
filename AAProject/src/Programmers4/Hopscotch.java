package Programmers4;

import java.util.Arrays;
import java.util.Vector;

class Hopscotch {
	
	int hopscotch(int[][] board, int size) {
        int result = 0;
        // �Լ��� �ϼ��ϼ���.
        int[] resultArr = new int[size]; // �� ���� ���� ����� ���� �迭
        int[] maxVsSemi = new int[size]; // max���� semimax�� ���̰��� ����
        int[] max = new int[size]; // max ���� ��ġ��
        int[] semi = new int[size]; // semiMax ���� ��ġ��
        
        Vector vector = new Vector(size);
        int[][] board2 = new int[size][4];
        
        // �׳� board2 = board �ϸ� �ּҰ��� �Ű��� sort�� ���� �Ǿ� ����.
        for(int i=0;i<size;i++){
        	for(int j=0;j<4;j++){
        		board2[i][j] = board[i][j];
        	}
        }
        
        for (int i = 0; i < size; i++) {
        	vector.clear();
        	
			for(int j=0;j<4;j++)
				vector.add(board2[i][j]);
			
			Arrays.sort(board2[i]);  //max ���� ���� ã������ ������ �迭�� �����Ѵ�.
			max[i] = vector.indexOf(board2[i][3]);
			if(board2[i][3]==board2[i][2]){
				vector.remove(vector.indexOf(board2[i][3]));
				semi[i] = vector.indexOf(board2[i][2])+1;
			}else{
				semi[i] = vector.indexOf(board2[i][2]);
			}
			maxVsSemi[i] = board2[i][3] - board2[i][2]; 
		}
        
        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(semi));
        System.out.println(Arrays.toString(maxVsSemi));
        resultArr[0] = board[0][max[0]];
        int cnt = 0;
        
        for (int i = 1; i < size; i++) {
        	if(max[i-1]==max[i]){
        		if(maxVsSemi[i-1]>maxVsSemi[i]){
        			resultArr[i] = board[i][semi[i]];
        			System.out.println(board[i][semi[i]]);
        			cnt=0;
        		}else{
        			resultArr[i] = board[i][max[i]];
        			int k = i;
        			for(int j=0;j<cnt;j++){
        				k--;
        				if(j%2==0){
        					resultArr[k] = board[k][semi[k]];
        				}else{
        					resultArr[k] = board[k][max[k]];
        				}
        			}
        			cnt++;
        		}
        	}else{
        		resultArr[i] = board[i][max[i]];
        		System.out.println(board[i][max[i]]);
        		System.out.println("maxi"+max[i]+i);
        		}
		}
        
        System.out.println(Arrays.toString(resultArr));
        for(int i=0;i<resultArr.length;i++){
        	result += resultArr[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        int[][] test2 = {{8, 10, 10, 5}, 
        				 {2, 6, 9, 10}, 
        				 {5, 5, 6, 4}, 
        				 {4, 4, 9, 9}, 
        				 {2, 10, 9, 7}, 
        				 {1, 6, 2, 3}, 
        				 {1, 2, 4, 5}, 
        				 {4, 2, 7, 9}, 
        				 {6, 9, 6, 3}, 
        				 {3, 2, 5, 10}};
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.hopscotch(test2, 10));  // 82�� ���;���
    }

}


//����� �����Ա� ���ӿ� ǫ �������ϴ�. �����Ա� ������ ���� �� N�� 4���� �������� �ְ�, ��� ĭ���� ������ ���� �ֽ��ϴ�.
//���� �����鼭 �� �྿ ������ ��, ����� �� ���� 4ĭ �� 1ĭ�� �����鼭 ������ �� �ֽ��ϴ�. �����Ա� ���ӿ��� ���� ����
//�����ؼ� ���� ���� ���� Ư�� ��Ģ�� �ֽ��ϴ�. ��, 1�࿡�� (5)�� ��Ҵٸ�, 2���� (8)�� ���� ���� ���� �˴ϴ�. ������ ����� 
//��� �������� ��, ������ ���� ���� ����� ������ ���ڰ� �˴ϴ�. �������� hopscotch �Լ��� �����Ͽ� ���� �ִ� �� ���� ���� �� 
//�ִ��� �˷��ּ���. ���� ���
//1 2 3 5
//5 6 7 8
//4 3 2 1
//�� ���� �ִٸ�, ����� �� �ٿ��� (5), (7), (4) ���� ��� 16���� �ְ������� ���� �� ������, 
//hopscotch �Լ������� 16�� ��ȯ���ָ� �˴ϴ�.

//[{8, 10, 10, 5}, {2, 6, 9, 10}, {5, 5, 6, 4}, {4, 4, 9, 9}, {2, 10, 9, 7}, {1, 6, 2, 3}, {1, 2, 4, 5}, {4, 2, 7, 9}, {6, 9, 6, 3}, {3, 2, 5, 10}] expected:<82> but was:<83>