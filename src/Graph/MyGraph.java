package Graph;

/**
 * 图
 * @author PEANER-Li
 */
public class MyGraph {
	//顶点数组
	private Vertex[] vertexList;
	//邻接矩阵
	private int[][] adjMat;
	//顶点的最大数目
	private int maxSize;
	//当前顶点
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
	 * 添加顶点
	 * @param lable
	 */
	public void addVertex(char lable){
		vertexList[nVertex++] = new Vertex(lable);
	}
	
	/**
	 * 添加边
	 * @param start
	 * @param end
	 */
	public void addEdge(int start , int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
}




















