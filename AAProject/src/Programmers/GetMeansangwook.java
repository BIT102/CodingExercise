package Programmers;

public class GetMeansangwook {
	public int get(int[] array) {
		
		int sum=0;
		int a=0;
		for(int i=0; i<array.length; i++) {
			//?•©?„êµ¬í•œ?‹¤
			sum+=array[i];
		}
		
		//ê¸¸ì´ë§Œí¼?‚˜?ˆˆ?‹¤
		a=sum/array.length;
		
		return a;
	}
	
	public static void main(String[] args) {
		
		int[] x= {5, 4, 3};
		GetMeansangwook get = new GetMeansangwook();
		System.out.println("?‰ê·? ê°? : " + get.get(x));

	}

}
