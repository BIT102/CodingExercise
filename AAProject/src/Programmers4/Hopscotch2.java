package Programmers4;

import java.util.Arrays;
import java.util.Vector;

class Hopscotch2 {
	
    int[] resultLoc = null; // �� ���� ���� ���ð��� ������� �迭
	int[] maxVsSemi = null; // max���� semi�� ���̰��� ����
    int[] max = null; // max ���� ��ġ��
    int[] semi = null; // semiMax ���� ��ġ��
    
    void compareUp(int i){

    	if(i == 0) return;
    	
    	if(resultLoc[i]!=resultLoc[i-1] && resultLoc[i-1]==max[i-1]) return; //�߸���
    	
    	if(resultLoc[i-1]!=max[i-1]){}
    	
    	if(resultLoc[i-1] == max[i-1])
    		resultLoc[i-1] = semi[i-1];
    	else if(resultLoc[i-1] == semi[i-1])
    		resultLoc[i-1] = max[i-1];
    	
    	if(resultLoc[i]!=resultLoc[i-1] && resultLoc[i-1] != max[i-1]){
    		resultLoc[i-1] = max[i-1]; 
    		compareUp(i);
    	}
    	
    	compareUp(i-1);
    }
    
	int hopscotch(int[][] board, int size) {
        int result = 0;
        resultLoc = new int[size];
        maxVsSemi = new int[size];
        max = new int[size];
        semi = new int[size];
        
        Vector vector = new Vector(size);
        int[][] board2 = new int[size][4];
        
        // �׳� board2 = board �ϸ� �ּҰ��� �Ű��� sort�� ���� �Ǿ� ����.
        for(int i=0;i<size;i++){
        	for(int j=0;j<4;j++){
        		board2[i][j] = board[i][j];
        	}
        }

        // �� �迭�� ���� �Է��ϴ� for��
        for (int i = 0; i < size; i++) {
        	vector.clear();
        	
			for(int j=0;j<4;j++)
				vector.add(board2[i][j]);
			
			Arrays.sort(board2[i]);  //max ���� ���� ã������ ������ �迭�� �����Ѵ�.
			
			max[i] = vector.indexOf(board2[i][3]); // max���� ���ĵ� ���� �ִ밡 �ȴ�.
			
			if(board2[i][3]==board2[i][2]){ // �����ϰ� �� �� ���� �� ����.
				vector.remove(vector.indexOf(board2[i][3]));
				semi[i] = vector.indexOf(board2[i][2])+1;
			}else{
				semi[i] = vector.indexOf(board2[i][2]);
			}
			maxVsSemi[i] = board2[i][3] - board2[i][2]; 
		} // �迭�Է� for�� ��
        
        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(semi));
        System.out.println(Arrays.toString(maxVsSemi));
        
        resultLoc[0] = max[0]; // ù���� ���� �̸� �Է��� �ش�.
        
        for (int i = 1; i < size; i++) {
        	
        	System.out.println();
        	
        	if(resultLoc[i-1] == max[i]){
        		if(maxVsSemi[i-1] >= maxVsSemi[i]){ //���簪�� �ٲٴ� ���� �� �Ǵٸ� ���簪�� semi�� �ٲ۴�.
        			resultLoc[i] = semi[i];
        		}else{ //���簪�� max�� �������� semi�� �ٲ���Ѵٸ� compareUp �޼��带 ȣ���� �����ߺ������� �������ش�.
        			resultLoc[i] = max[i];
        			compareUp(i);
        		}
        	}else{
        		resultLoc[i] = max[i];
        		}
        	for(int j=0;j<i+1;j++){
            	System.out.print(board[j][resultLoc[j]]+ " ");
            	}
		}
        System.out.println();
        System.out.println("��� ��ġ�� : "+Arrays.toString(resultLoc)); // ���ӵ� ���� ������ �ȵ�
        
        for(int i=0;i<size;i++){
        	result += board[i][resultLoc[i]];
        	System.out.print(board[i][resultLoc[i]]+ " ");
        	}
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        Hopscotch2 c = new Hopscotch2();
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
        
        int[][] test3 = { {6, 7, 4, 3}, 
        				  {1, 8, 7, 2}, 
        				  {3, 7, 6, 5}, 
        				  {9, 10, 10, 7}, 
        				  {6, 9, 1, 2}, 
        				  {1, 8, 8, 3}, 
        				  {9, 1, 9, 1}, 
        				  {3, 7, 5, 7}, 
        				  {5, 6, 5, 3}, 
        				  {9, 10, 1, 10} };
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.hopscotch(test3, 10));  // 82�� ���;���
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


//{6, 7, 4, 3}, {1, 8, 7, 2}, {3, 7, 6, 5}, {9, 10, 10, 7}, {6, 9, 1, 2}, {1, 8, 8, 3}, {9, 1, 9, 1}, {3, 7, 5, 7}, {5, 6, 5, 3}, {9, 10, 1, 10}