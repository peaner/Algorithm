package LinkList;

/**
 * 链结点,相当于是车厢
 * @author PEANER-Li
 *
 */
public class MyNode {
	//数据域
	public long data;
	//结点域
	public MyNode next;
	
	public MyNode(long value){
		this.data = value;
	}
	
	/**
	 * 显示方法
	 */
	public void display(){
		System.out.println(data+" ");
	}

}
