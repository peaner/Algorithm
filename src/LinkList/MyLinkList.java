package LinkList;


/**
 * 链表，相当于火车
 * @author PEANER-Li
 *
 */
public class MyLinkList {
	//头结点
	private MyNode first;
	
	public MyLinkList(){
		first = null;
	}
	
	/**
	 * 插入一个结点，在头结点后进行插入
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
	 * 删除一个结点，在头结点后进行删除
	 */
	public MyNode deleteFirst(){
		MyNode temp = (MyNode) first.next;
		first.next = temp.next;
		return temp;
	}
	
	/**
	 * 显示方法
	 */
	public void display(){
		MyNode current = first;
		while(current != null){
			current.display();
			current =  current.next;
		}
	}
	
	/**
	 * 查找方法
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
	 * 删除方法，根据数据域来进行删除
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
