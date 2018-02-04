package Programmers3;

class NLCM {
	public long gcd(long a, long b){
		int smallNum = (int)Math.min(a, b);
		
		for(int i=smallNum;i>=1;i--)
			if(a%i==0&&b%i==0){
				System.out.println("�����  "+i);
				return i;
			}
		return -1;
	}
	
	public long nlcm(int[] num) {
		long answer = 0;
		
		answer=(num[0]*num[1])/gcd(num[0],num[1]);
		for(int i=1; i<num.length;i++){
			answer=(answer*num[i])/gcd(answer,num[i]);
			System.out.println("�����:"+answer);
		}
		return answer;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.nlcm(ex));
	}
}

//�� ���� �ּҰ����(Least Common Multiple)�� �Էµ� �� ���� ��� �� ������
//�Ǵ� ���� ���� ���ڸ� �ǹ��մϴ�. ���� ��� 2�� 7�� �ּҰ������ 14�� �˴ϴ�. 
//���Ǹ� Ȯ���ؼ�, n���� ���� �ּҰ������ n ���� ������ ��� �� ������ �Ǵ� ���� ���� ���ڰ� �˴ϴ�.
//nlcm �Լ��� ���� n���� ���ڰ� �ԷµǾ��� ��, �ּҰ������ ��ȯ�� �ּ���. ������� [2,6,8,14] 
//		�� �Էµȴٸ� 168�� ��ȯ�� �ָ� �˴ϴ�.