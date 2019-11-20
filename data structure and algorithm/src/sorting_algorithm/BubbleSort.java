package sorting_algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int mainArray [] = {12,8,-15,33,21,27,-22,-13,38,25,9,12};
		
		int i;
		
		for(int lastUnsortedIndex = mainArray.length-1;0 < lastUnsortedIndex;
				
				lastUnsortedIndex-- ) {
			for(i = 0;i<lastUnsortedIndex;i++) {
				if(mainArray[i]>mainArray[i+1]) {
					swap(mainArray, i, i+1);
				}
			}
		}
		
		
		for (int j = 0; j < mainArray.length; j++) {
			System.out.print(mainArray[j]+" ");
		}

	}
	
	
	public static void swap(int array[],int i,int j) {
		if(i==j) {
			return;
		}
		
		int temp= array[i];
		array[i] = array[j];
		array[j]= temp;
	}

}
