package Queue;

public class MyQueue {

	//�ײ�ʹ������
	private long[] array;
	//��Ч���ݴ�С
	private int elements;
	//��ͷ
	private int front;
	//��β
	private int end;

	/**
	 * Ĭ�Ϲ��췽��
	 * 
	 */
	public MyQueue(){
		array = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * �������Ĺ��췽��������Ϊ����Ĵ�С
	 * @param maxsize
	 */
	public MyQueue(int maxsize){
		array = new long[maxsize];
		elements = 0 ;
		front = 0;
		end = -1;
	}
	
	/**
	 * ����==������
	 */
	public void insert(long value){
		if(end == array.length - 1 ){
			end = -1;
		}
		array[++end] = value;
		elements++;
	}
	
	
	/**
	 * ����==������
	 */
	public long remove(){
		long value = array[front++];
		if(front == array.length ){
			front = 0;
		}
		elements--;
		return value;
	}
	
	
	/**
	 * ����==�����
	 */
	public long peek(){
		return array[front];
	}
	
	
	
	/**
	 * ����==�ж϶����Ƿ�Ϊ��
	 */
	public boolean isEmpty(){
		return elements == 0;
	}
	
	
	
	/**
	 * ����==�ж϶����Ƿ���
	 */
	public boolean isFull(){
		return elements == array.length;
	}
}
