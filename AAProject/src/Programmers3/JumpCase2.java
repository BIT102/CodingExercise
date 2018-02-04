package Programmers3;

class JumpCase2 {
	// 점프에 관한 식을 하나씩 풀어써보니 피보나치 수열을 만족하는 것을 볼 수 있었다.
    public int jumpCase(int num) {

        if(num<=2) return num;
        // 귀납식으로 한번에 해결이 가능하다.
        return jumpCase(num-1)+jumpCase(num-2);
    }

    public static void main(String[] args) {
        JumpCase2 c = new JumpCase2();
        int testCase = 20;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}