package Programmers3;

class Caesar2 {
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
		// 'a'=97 'z'=122 'A'=65 'Z'=90
		for(int i=0;i<s.length();i++){
			int n2 = n;
			if(s.charAt(i)==' '){ // 공백은 그대로
				result+=" ";
			}
			if(65<=s.charAt(i)&&s.charAt(i)<=90){ //소문자와 대문자를 나누어서 생각
				n2=n2%26; //범위에 들지 않으면 서클을 돌게 하기 위함     <%26 으로 하는것이 효율적임>
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
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}



//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
//A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다. 공백은 수정하지 않습니다.
//보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 암호문을 만드는 caesar 함수를 완성해 보세요.
//“a B z”,4를 입력받았다면 “e F d”를 리턴합니다.