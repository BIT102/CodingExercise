package Programmers3;

class Caesar2 {
	String caesar(String s, int n) {
		String result = "";
		// �Լ��� �ϼ��ϼ���.
		// 'a'=97 'z'=122 'A'=65 'Z'=90
		for(int i=0;i<s.length();i++){
			int n2 = n;
			if(s.charAt(i)==' '){ // ������ �״��
				result+=" ";
			}
			if(65<=s.charAt(i)&&s.charAt(i)<=90){ //�ҹ��ڿ� �빮�ڸ� ����� ����
				n2=n2%26; //������ ���� ������ ��Ŭ�� ���� �ϱ� ����     <%26 ���� �ϴ°��� ȿ������>
				if(n2+s.charAt(i)>90) n2 = n2-26;
				result += (char)(s.charAt(i)+n2); 
			}
			if(97<=s.charAt(i)&&s.charAt(i)<=122){
				n2=n2%26;
				if(n2+s.charAt(i)>122) n2 = n2-26;
				result += (char)(s.charAt(i)+n2);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Caesar2 c = new Caesar2();
		System.out.println("s�� 'a B z', n�� 4�� ���: " + c.caesar("a B z", 4));
	}
}



//� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
//A�� 3��ŭ �и� D�� �ǰ� z�� 1��ŭ �и� a�� �˴ϴ�. ������ �������� �ʽ��ϴ�.
//���� ���ڿ� s�� �󸶳� ���� �˷��ִ� n�� �Է¹޾� ��ȣ���� ����� caesar �Լ��� �ϼ��� ������.
//��a B z��,4�� �Է¹޾Ҵٸ� ��e F d���� �����մϴ�.