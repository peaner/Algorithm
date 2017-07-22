package LinkList;


/**
 * �����൱�ڻ�
 * @author PEANER-Li
 *
 */
public class MyLinkList {
	//ͷ���
	private MyNode first;
	
	public MyLinkList(){
		first = null;
	}
	
	/**
	 * ����һ����㣬��ͷ������в���
	 */
	public void insertFirst(long value){
		MyNode node = new MyNode(value);
		if(first == null){
			first = node;
		}else {
			node.next = first.next;
			first.next = node;
		}

	}
	
	
	/**
	 * ɾ��һ����㣬��ͷ�������ɾ��
	 */
	public MyNode deleteFirst(){
		MyNode temp = (MyNode) first.next;
		first.next = temp.next;
		return temp;
	}
	
	/**
	 * ��ʾ����
	 */
	public void display(){
		MyNode current = first;
		while(current != null){
			current.display();
			current =  current.next;
		}
	}
	
	/**
	 * ���ҷ���
	 */
	public MyNode find(long value){
		MyNode current = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	/**
	 * ɾ������������������������ɾ��
	 */
	public MyNode delete(long value){
		MyNode current = first;
		MyNode previous = null;
		
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			previous = current;
			current = current.next;
		}
		if(current == first){
			MyNode temp = first;
			first = temp.next;
			return temp;
		}else {
			previous.next = current.next;
			return current;
		}
		
	}
	
}
