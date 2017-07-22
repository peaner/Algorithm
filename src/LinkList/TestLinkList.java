package LinkList;

public class TestLinkList {
	public static void main(String[] args) {
		MyLinkList linkList = new MyLinkList();
		linkList.insertFirst(34);
		linkList.insertFirst(23);
		linkList.insertFirst(12);
		
		linkList.display();
		System.out.println("====");
		linkList.delete(12);
		linkList.display();
	}

}
 