public class SecondSmallest{
public static int getSecondSmallest(int[] array, int total) {
		int temp;
		for( int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[1];
	}
	public static void main(String args[]) {
		int array[] = {5, 3, 7, 8, 4};
		System.out.println("Second smallest number is :"+getSecondSmallest(array, 5));
	}
}