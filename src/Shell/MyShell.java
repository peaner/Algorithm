package Shell;
/**
 * 希尔排序
 * @author PEANER-Li
 *
 */
public class MyShell {
	/**
	 * 排序方法
	 */
	public static void sort(long[] array){
		//初始化间隔
		int h = 1;
		//计算最大间隔
		while(h<array.length/3){
			h = h*3 + 1;
		}
		
		while(h > 0 ){
			//进行插入排序
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
			//减小间隔
			h = (h - 1) / 3;
		}
	}
}
