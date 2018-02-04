package Programmers2;

class Collatz {
	public int collatz(int num) {
		int answer = 0;
		
		
		while(num!=1){
			answer++;
			if(answer>=500) return -1;
			
			if(num%2==0){
				num = num/2;
			}else{
				num = num*3+1;
			}
		}
		
		
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 626331;
		System.out.println(c.collatz(ex));
	}
}