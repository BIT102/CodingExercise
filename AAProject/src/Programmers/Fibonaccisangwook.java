package Programmers;

public class Fibonaccisangwook {

	public long fi(int num) {
		long answer = 0;

		long n1 =0;
		long n2 =1;

		//?Όλ³΄λμΉ? ===== 0+1=1    1+1=2     1+2=3     2+3=5  
		for(int i=0; i<num; i++){
			//answer? 0λΆ??° ???΄?Ό? 
			if(i==0){
				answer=0;	
			} else {
				//λ³??λ₯? ???λ‘? λ°κΎΌ?€ ?€???΄μ£ΌκΈ°
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
