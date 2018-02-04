package Programmers4;

import java.util.Arrays;
import java.util.Vector;

class Hopscotch {
	
	int hopscotch(int[][] board, int size) {
        int result = 0;
        // 함수를 완성하세요.
        int[] resultArr = new int[size]; // 각 행의 최종 결과를 담을 배열
        int[] maxVsSemi = new int[size]; // max값과 semimax의 차이값의 모임
        int[] max = new int[size]; // max 값의 위치값
        int[] semi = new int[size]; // semiMax 값의 위치값
        
        Vector vector = new Vector(size);
        int[][] board2 = new int[size][4];
        
        // 그냥 board2 = board 하면 주소값이 옮겨져 sort시 정렬 되어 버림.
        for(int i=0;i<size;i++){
        	for(int j=0;j<4;j++){
        		board2[i][j] = board[i][j];
        	}
        }
        
        for (int i = 0; i < size; i++) {
        	vector.clear();
        	
			for(int j=0;j<4;j++)
				vector.add(board2[i][j]);
			
			Arrays.sort(board2[i]);  //max 값을 쉽게 찾기위해 복사한 배열을 정렬한다.
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
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test2, 10));  // 82가 나와야함
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

//[{8, 10, 10, 5}, {2, 6, 9, 10}, {5, 5, 6, 4}, {4, 4, 9, 9}, {2, 10, 9, 7}, {1, 6, 2, 3}, {1, 2, 4, 5}, {4, 2, 7, 9}, {6, 9, 6, 3}, {3, 2, 5, 10}] expected:<82> but was:<83>