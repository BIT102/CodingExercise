package Programmers3;

class TryHelloWorld2
{
    public int nextBigNumber(int n)
    {
        String bi = Integer.toBinaryString(n);
        int cnt = 0;
        String biNext = bi;
        
        
        
        for(int i=0;i<bi.length();i++)
        	if(bi.charAt(i)=='1') cnt++;
           
        while(true){
        	biNext = Integer.toBinaryString((Integer.parseInt(biNext,2)+1));
        	int checkCnt = 0;
        	
	        for(int i=0;i<biNext.length();i++)
	        	if(biNext.charAt(i)=='1') checkCnt++;
	        
	        if(checkCnt==cnt) return Integer.parseInt(biNext,2);
        }
    }
    public static void main(String[] args)
    {
        TryHelloWorld2 test = new TryHelloWorld2();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}


//� �� N(1��N��1,000,000) �� �־����� ��, N�� ���� ū ���ڴ� ������ �����ϴ�.
//
//N�� ���� ū ���ڴ� N�� 2������ �ٲپ��� ���� 1�� ������ ���� ������ �̷���� ���Դϴ�.
//1��° ������ �����ϴ� ���ڵ� �� N���� ū �� �߿��� ���� ���� ���ڸ� ã�ƾ� �մϴ�.
//���� ���, 78�� 2������ �ٲٸ� 1001110 �̸�, 78�� ���� ū ���ڴ� 83���� 2������ 1010011 �Դϴ�.
//N�� �־��� ��, N�� ���� ū ���ڸ� ã�� nextBigNumber �Լ��� �ϼ��ϼ���.