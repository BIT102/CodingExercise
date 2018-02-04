package Programmers4;

import java.util.Arrays;
import java.util.Vector;

class Hopscotch2 {
	
    int[] resultLoc = null; // 각 행의 최종 선택값을 담기위한 배열
	int[] maxVsSemi = null; // max값과 semi의 차이값의 모임
    int[] max = null; // max 값의 위치값
    int[] semi = null; // semiMax 값의 위치값
    
    void compareUp(int i){

    	if(i == 0) return;
    	
    	if(resultLoc[i]!=resultLoc[i-1] && resultLoc[i-1]==max[i-1]) return; //잘못됨
    	
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
        
        // 그냥 board2 = board 하면 주소값이 옮겨져 sort시 정렬 되어 버림.
        for(int i=0;i<size;i++){
        	for(int j=0;j<4;j++){
        		board2[i][j] = board[i][j];
        	}
        }

        // 각 배열에 값을 입력하는 for문
        for (int i = 0; i < size; i++) {
        	vector.clear();
        	
			for(int j=0;j<4;j++)
				vector.add(board2[i][j]);
			
			Arrays.sort(board2[i]);  //max 값을 쉽게 찾기위해 복사한 배열을 정렬한다.
			
			max[i] = vector.indexOf(board2[i][3]); // max값은 정렬된 값중 최대가 된다.
			
			if(board2[i][3]==board2[i][2]){ // 간단하게 할 수 있을 것 같다.
				vector.remove(vector.indexOf(board2[i][3]));
				semi[i] = vector.indexOf(board2[i][2])+1;
			}else{
				semi[i] = vector.indexOf(board2[i][2]);
			}
			maxVsSemi[i] = board2[i][3] - board2[i][2]; 
		} // 배열입력 for문 끝
        
        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(semi));
        System.out.println(Arrays.toString(maxVsSemi));
        
        resultLoc[0] = max[0]; // 첫항의 값은 미리 입력해 준다.
        
        for (int i = 1; i < size; i++) {
        	
        	System.out.println();
        	
        	if(resultLoc[i-1] == max[i]){
        		if(maxVsSemi[i-1] >= maxVsSemi[i]){ //현재값을 바꾸는 것이 더 옳다면 현재값만 semi로 바꾼다.
        			resultLoc[i] = semi[i];
        		}else{ //현재값을 max로 상위값을 semi로 바꿔야한다면 compareUp 메서드를 호출해 상위중복값까지 변경해준다.
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
        System.out.println("결과 위치값 : "+Arrays.toString(resultLoc)); // 연속된 값이 나오면 안됨
        
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
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test3, 10));  // 82가 나와야함
    }

}


//영희는 땅따먹기 게임에 푹 빠졌습니다. 땅따먹기 게임의 땅은 총 N행 4열로 나누어져 있고, 모든 칸에는 점수가 쓰여 있습니다.
//땅을 밟으면서 한 행씩 내려올 때, 영희는 각 행의 4칸 중 1칸만 밟으면서 내려올 수 있습니다. 땅따먹기 게임에는 같은 열을
//연속해서 밟을 수가 없는 특수 규칙이 있습니다. 즉, 1행에서 (5)를 밟았다면, 2행의 (8)은 밟을 수가 없게 됩니다. 마지막 행까지 
//모두 내려왔을 때, 점수가 가장 높은 사람이 게임의 승자가 됩니다. 여러분이 hopscotch 함수를 제작하여 영희가 최대 몇 점을 얻을 수 
//있는지 알려주세요. 예를 들어
//1 2 3 5
//5 6 7 8
//4 3 2 1
//의 땅이 있다면, 영희는 각 줄에서 (5), (7), (4) 땅을 밟아 16점을 최고점으로 받을 수 있으며, 
//hopscotch 함수에서는 16을 반환해주면 됩니다.


//{6, 7, 4, 3}, {1, 8, 7, 2}, {3, 7, 6, 5}, {9, 10, 10, 7}, {6, 9, 1, 2}, {1, 8, 8, 3}, {9, 1, 9, 1}, {3, 7, 5, 7}, {5, 6, 5, 3}, {9, 10, 1, 10}