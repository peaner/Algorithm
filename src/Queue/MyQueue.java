package Queue;

public class MyQueue {

	//底层使用数组
	private long[] array;
	//有效数据大小
	private int elements;
	//队头
	private int front;
	//队尾
	private int end;

	/**
	 * 默认构造方法
	 * 
	 */
	public MyQueue(){
		array = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * 带参数的构造方法，参数为数组的大小
	 * @param maxsize
	 */
	public MyQueue(int maxsize){
		array = new long[maxsize];
		elements = 0 ;
		front = 0;
		end = -1;
	}
	
	/**
	 * 队列==进队列
	 */
	public void insert(long value){
		if(end == array.length - 1 ){
			end = -1;
		}
		array[++end] = value;
		elements++;
	}
	
	
	/**
	 * 队列==出队列
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
	 * 队列==查队列
	 */
	public long peek(){
		return array[front];
	}
	
	
	
	/**
	 * 队列==判断队列是否为空
	 */
	public boolean isEmpty(){
		return elements == 0;
	}
	
	
	
	/**
	 * 队列==判断队列是否满
	 */
	public boolean isFull(){
		return elements == array.length;
	}
}
