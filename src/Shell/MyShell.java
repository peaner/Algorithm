package Shell;
/**
 * ϣ������
 * @author PEANER-Li
 *
 */
public class MyShell {
	/**
	 * ���򷽷�
	 */
	public static void sort(long[] array){
		//��ʼ�����
		int h = 1;
		//���������
		while(h<array.length/3){
			h = h*3 + 1;
		}
		
		while(h > 0 ){
			//���в�������
			long temp = 0 ;
			for(int i = h ; i < array.length ;i++){
				temp = array[i];
				int j = i ; 
				while(j > 0 && array[j] >= temp){
					array[j] = array[j - 1];
					j--;
				}
				array[j] = temp;
			}
			//��С���
			h = (h - 1) / 3;
		}
	}
}
