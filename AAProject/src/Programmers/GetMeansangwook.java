package Programmers;

public class GetMeansangwook {
	public int get(int[] array) {
		
		int sum=0;
		int a=0;
		for(int i=0; i<array.length; i++) {
			//?©?κ΅¬ν?€
			sum+=array[i];
		}
		
		//κΈΈμ΄λ§νΌ???€
		a=sum/array.length;
		
		return a;
	}
	
	public static void main(String[] args) {
		
		int[] x= {5, 4, 3};
		GetMeansangwook get = new GetMeansangwook();
		System.out.println("?κ·? κ°? : " + get.get(x));

	}

}
