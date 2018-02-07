package Programmers;

import java.util.Arrays;

public class TryHelloWorldsangwook {
	
	public int[] gc(int a, int b) {
		int[] answer = new int[2]; 
		int maxa=1; //ìµœë?ê³µì•½?ˆ˜
		int minb=1; //ìµœì†Œê³µì•½?ˆ˜
		//ìµœë? ê³µì•½?ˆ˜
		
		for(int i=1; i<=a*b; i++) {
			
			if(a%i==0&&b%i==0){
				maxa *= i; 
			}
		}
		//ìµœì†Œ ê³µë°°?ˆ˜
		minb = a*b/maxa;
		
		answer[0]=maxa;
		answer[1]=minb;
		
	
		return answer;
	}
	
	public static void main(String[] args) {
		TryHelloWorldsangwook c = new TryHelloWorldsangwook();
		System.out.println(Arrays.toString(c.gc(4, 18)));
		
	}

}
