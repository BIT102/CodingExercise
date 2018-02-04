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


//어떤 수 N(1≤N≤1,000,000) 이 주어졌을 때, N의 다음 큰 숫자는 다음과 같습니다.
//
//N의 다음 큰 숫자는 N을 2진수로 바꾸었을 때의 1의 개수와 같은 개수로 이루어진 수입니다.
//1번째 조건을 만족하는 숫자들 중 N보다 큰 수 중에서 가장 작은 숫자를 찾아야 합니다.
//예를 들어, 78을 2진수로 바꾸면 1001110 이며, 78의 다음 큰 숫자는 83으로 2진수는 1010011 입니다.
//N이 주어질 때, N의 다음 큰 숫자를 찾는 nextBigNumber 함수를 완성하세요.