package Programmers3;

class JumpCase2 {
	// ������ ���� ���� �ϳ��� Ǯ��Ẹ�� �Ǻ���ġ ������ �����ϴ� ���� �� �� �־���.
    public int jumpCase(int num) {

        if(num<=2) return num;
        // �ͳ������� �ѹ��� �ذ��� �����ϴ�.
        return jumpCase(num-1)+jumpCase(num-2);
    }

    public static void main(String[] args) {
        JumpCase2 c = new JumpCase2();
        int testCase = 20;
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.jumpCase(testCase));
    }
}