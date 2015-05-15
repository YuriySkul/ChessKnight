import java.util.Arrays;


public class MyLinkedList {
	   Box head;
	   int length = 0;
	   
	   public  void saveMatrix(int [][] date,Box b){
		     int [][] copyMatrix = Arrays.copyOf(date, date.length);
		     head = new Box(copyMatrix,head);
		     length++;
		}
		    
		public int[][] getMatrix(int boxPosition,Box b){
			Box pointer = b;
			
			for (int i=0;i<boxPosition; i++){
				 pointer = pointer.next;
			}
			return pointer.solutionMatrix;
		}
}
