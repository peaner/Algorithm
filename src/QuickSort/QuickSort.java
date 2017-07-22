package QuickSort;

/**
 * 快速排序
 * @author PEANER-Li
 */
public class QuickSort {
	
	/**
	 * 划分数组
	 * @param array
	 * @param left
	 * @param right
	 * @param point
	 */
	public static void partition(long[] array,int left,int right,long point){
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while(true){
			//循环，将比关键字小的留在左端
			while(leftPtr<rightPtr && array[++leftPtr] < point);
			//循环，将比关键字大的留在右端
			
		}
	}
}
