package Programmers;

public class GetMeansangwook {
	public int get(int[] array) {
		
		int sum=0;
		int a=0;
		for(int i=0; i<array.length; i++) {
			//?��?��구한?��
			sum+=array[i];
		}
		
		//길이만큼?��?��?��
		a=sum/array.length;
		
		return a;
	}
	
	public static void main(String[] args) {
		
		int[] x= {5, 4, 3};
		GetMeansangwook get = new GetMeansangwook();
		System.out.println("?���? �? : " + get.get(x));

	}

}
