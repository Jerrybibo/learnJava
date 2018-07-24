package exercise;

public class Arr {
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 5;
 		a[1] = 3;
 		System.out.println(a[1]);
 		
 		int[] i= {1,2,3,4,5,6,8};
 		System.out.println(i[5]);
 		printArray(i);
 		
	}

	public static void printArray(int[] array) {
	  for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	  }
	}

}
