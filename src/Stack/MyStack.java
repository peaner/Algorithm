package Stack;

public class MyStack {

	//底层实现是一个数组
	private long[] array;
	private int top;
	
	/**
	 * 默认的构造方法
	 */
	public MyStack(){
		array = new long[10];
		top = -1;
	}
	
	/**
	 * 带参数的构造方法，参数为数组初始化大小
	 */
	
	public MyStack(int maxsize){
		array = new long[maxsize];
		top = -1;
	}
	
	/**
	 * 栈==添加数据
	 */
	public void push(int value){
		array[++top] = value;
	}
	
	/**
	 * 栈==移除数据
	 */
	public long pop(){
		return array[top--];
	}
	
	/**
	 * 栈==查看数据
	 */
	public long peek(){
		return array[top];
	}
	
	/**
	 * 栈==判断是否为空
	 */
	public boolean isEmpty(){
		return top == -1;
	}
	
	/**
	 * 判断是否满了
	 */
	public boolean isFull(){
		return top == array.length -1 ;
	}
	
	
}
