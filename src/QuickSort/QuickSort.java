package QuickSort;

/**
 * ��������
 * @author PEANER-Li
 */
public class QuickSort {
	
	/**
	 * ��������
	 * @param array
	 * @param left
	 * @param right
	 * @param point
	 */
	public static void partition(long[] array,int left,int right,long point){
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while(true){
			//ѭ�������ȹؼ���С���������
			while(leftPtr<rightPtr && array[++leftPtr] < point);
			//ѭ�������ȹؼ��ִ�������Ҷ�
			
		}
	}
}
