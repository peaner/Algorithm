package Tree;

/**
 * ��������
 * @author PEANER-Li
 */
public class MyTree {

	//���ڵ�
	private Node root;
	
	/**
	 * ����ڵ�
	 * @param value
	 */
	public void insert(long value){
		//��װ�ڵ�
		Node newNode = new Node(value);
		//���õ�ǰ�ڵ�
		Node current = root;
		//���ø��ڵ�
		Node parent;
		//���rootΪnull��Ҳ���ǵ�һ�����ʱ��
		if(root == null){
			root = newNode;
		}else {
			//���ڵ�ָ��ǰ�ڵ�
			parent = current;
			if(current.data > value){
				current = current.leftChild;
			}else {
				current = current.rightChild;
			}
		}
	}
	
	/**
	 * ���ҽڵ�
	 * @param value
	 */
	public Node find(long value){
		//���õ�ǰ�ڵ㣬�Ӹ��ڵ㿪ʼ
		Node current = root;
		
		//ѭ����ֻҪ����ֵ�����ڵ�ǰ�ڵ��������
		while(current.data != value){
			//���бȽϣ��Ƚϲ���ֵ�͵�ǰ�ڵ�Ĵ�С
			if(current.data > value){
				current = current.leftChild;
			}else {
				current = current.rightChild;
			}
			if(current == null){
				return null;
			}
		}
		return current;
	}
	
	/**
	 * ɾ���ڵ�
	 * @param value
	 */
	public void delete(long value){
		
	}
	
}
