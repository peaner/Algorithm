package EasySort;

import java.util.Stack;

/**
 * ºÚµ•≈≈–Ú
 * @author PEANER-Li
 */
public class EasySort {
	
	/**
	 * √∞≈›≈≈–Ú
	 * @param array
	 */
	public static void  BubbleSort(long[] array){
		long temp = 0;
		for(int i = 0 ; i < array.length ; i++){
			for(int j = array.length-1;j>i;j--){
				if(array[j] < array[j-1]){
					//Ω¯––Ωªªª
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * —°‘Ò≈≈–Ú
	 */
	public static void SelectSort(long[] array){
		int k = 0 ;
		long temp = 0;
		for(int i =0 ; i < array.length - 1; i++){
			k = i;
			for(int j = i; j < array.length;j++){
				if(array[j] < array[k]){
					k = j ;
				}
			}
			temp = array[i];
			array[i] = array[k];
			array[k] = temp;
		}
	}
	
	
	/**
	 * ≤Â»Î≈≈–Ú
	 */
	public static void InsertSort(long[] array){
		
		long temp = 0;
		
		for(int i = 1; i < array.length ; i++){
			temp = array[i];
			int j = i ;
			while (j>0 && array[j-1] >= temp) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
		}
	}
	
	
}
