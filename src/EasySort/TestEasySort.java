package EasySort;

public class TestEasySort {
	public static void main(String[] args) {
		long[] array = new long[5];
		array[0] = 34 ;
		array[1] = 23;
		array[2] = 2;
		array[3] = 1;
		array[4] = -4;
		
		System.out.println("≈≈–Ú«∞");
		System.out.print("{");
		for (long num : array) {
			System.out.print(num+" ");
		}
		System.out.print("}");
		System.out.println();
		
		//EasySort.BubbleSort(array);
		//EasySort.SelectSort(array);
		EasySort.InsertSort(array);
		System.out.println("≈≈–Ú∫Û");
		System.out.print("{");
		for (long num : array) {
			System.out.print(num+" ");
		}
		System.out.print("}");
		System.out.println();
		
	}
}
