package LinkList;

/**
 * �����,�൱���ǳ���
 * @author PEANER-Li
 *
 */
public class MyNode {
	//������
	public long data;
	//�����
	public MyNode next;
	
	public MyNode(long value){
		this.data = value;
	}
	
	/**
	 * ��ʾ����
	 */
	public void display(){
		System.out.println(data+" ");
	}

}
