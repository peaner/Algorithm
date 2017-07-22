package Stack;

public class MyStack {

	//�ײ�ʵ����һ������
	private long[] array;
	private int top;
	
	/**
	 * Ĭ�ϵĹ��췽��
	 */
	public MyStack(){
		array = new long[10];
		top = -1;
	}
	
	/**
	 * �������Ĺ��췽��������Ϊ�����ʼ����С
	 */
	
	public MyStack(int maxsize){
		array = new long[maxsize];
		top = -1;
	}
	
	/**
	 * ջ==�������
	 */
	public void push(int value){
		array[++top] = value;
	}
	
	/**
	 * ջ==�Ƴ�����
	 */
	public long pop(){
		return array[top--];
	}
	
	/**
	 * ջ==�鿴����
	 */
	public long peek(){
		return array[top];
	}
	
	/**
	 * ջ==�ж��Ƿ�Ϊ��
	 */
	public boolean isEmpty(){
		return top == -1;
	}
	
	/**
	 * �ж��Ƿ�����
	 */
	public boolean isFull(){
		return top == array.length -1 ;
	}
	
	
}
