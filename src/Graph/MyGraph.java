package Graph;

/**
 * ͼ
 * @author PEANER-Li
 */
public class MyGraph {
	//��������
	private Vertex[] vertexList;
	//�ڽӾ���
	private int[][] adjMat;
	//����������Ŀ
	private int maxSize;
	//��ǰ����
	private int nVertex;
	
	public MyGraph(){
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for(int i = 0 ; i < maxSize ; i++){
			for(int j = 0 ; j < maxSize ; j++){
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
	}
	
	/**
	 * ��Ӷ���
	 * @param lable
	 */
	public void addVertex(char lable){
		vertexList[nVertex++] = new Vertex(lable);
	}
	
	/**
	 * ��ӱ�
	 * @param start
	 * @param end
	 */
	public void addEdge(int start , int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
}




















