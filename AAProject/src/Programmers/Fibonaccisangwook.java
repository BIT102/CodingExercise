package Programmers;

public class Fibonaccisangwook {

	public long fi(int num) {
		long answer = 0;

		long n1 =0;
		long n2 =1;

		//?”¼ë³´ë‚˜ì¹? ===== 0+1=1    1+1=2     1+2=3     2+3=5  
		for(int i=0; i<num; i++){
			//answer?Š” 0ë¶??„° ?‹œ?ž‘?•´?•¼?˜ 
			if(i==0){
				answer=0;	
			} else {
				//ë³??ˆ˜ë¥? ?•ž?˜?ˆ˜ë¡? ë°”ê¾¼?‹¤ ?‹¤?‹œ?”?•´ì£¼ê¸°
				answer=n1+n2;
				n1 = n2;
				n2 = answer;
			}
		}

		return answer;
	}
	public static void main(String[] args) {

		Fibonaccisangwook c = new Fibonaccisangwook();
		int te = 3;
		System.out.println(c.fi(te));

	}

}
