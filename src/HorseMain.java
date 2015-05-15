import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class HorseMain {

	public static void main(String[] args) {
		HorseBoard myBoard = new HorseBoard();
        myBoard.setList(new MyLinkedList() );
		myBoard.board[0][0]=1;
        myBoard.move(myBoard.board, 1, 0, 0 );
		myBoard.move(myBoard.board, 1, 0, 0 );
		System.out.println(myBoard.mlist.length);
		myBoard.matrixPrint(myBoard.mlist.getMatrix(1, myBoard.mlist.head));
		
		
		
		
		
		
		
		
		
		
		//		List<Box> myList=new LinkedList<>( );
//		   myList.add(new Box(1,1));
//		   myList.add(new Box(2,2));
//		   myList.add(new Box(3,3));
//		   myList.add(new Box(4,4));
//		   System.out.println((myList.get(3)).x+" "+myList.get(3).y);
//		   System.out.println(myList);
//		   for (i = 0,i< )
//		  for ( int n = 0; n < 5; n++ ){
//			  for( int m = 0; m < 5; m++ ){
		  
		
		
		
//		     }
//		 }
		
//		int [][] dim = {
//			{0,2,3,4,5},
//			{6,7,8,9,10},
//			{11,12,13,14,15},
//			{16,17,18,19,20},
//			{21,22,23,24,25},
//		};
//		
//		int [][] dim1 = {
//				{1,2,3,4,5},
//				{6,7,8,9,10},
//				{11,12,13,14,15},
//				{16,17,18,19,20},
//				{21,22,23,24,25},
//			};
//		int [][] dim2 = {
//				{2,2,3,4,5},
//				{6,7,8,9,10},
//				{11,12,13,14,15},
//				{16,17,18,19,20},
//				{21,22,23,24,25},
//			};
//		int [][] dim3 = {
//				{3,2,3,4,5},
//				{6,7,8,9,10},
//				{11,12,13,14,15},
//				{16,17,18,19,20},
//				{21,22,23,24,25},
//			};
	    
//		int [][] copyDim=Arrays.copyOf(dim, dim.length); 
//	    myBoard.matrixPrint(copyDim);
	    
	    
//	    myList.saveMatrix(dim,   myList.head);
//	    myList.saveMatrix(dim1,  myList.head);
//	    myList.saveMatrix(dim2,  myList.head);
//	    myList.saveMatrix(dim3,  myList.head);
//	    
//	    myBoard.matrixPrint( myList.getMatrix(3, myList.head));
//	    System.out.println( myList.length);
	    
	    
//	    myLib.setInt(1, myLib.head);
//	    myLib.setInt(2, myLib.head);
//	    myLib.setInt(3, myLib.head);
//	    myLib.setInt(4, myLib.head);
//	    myLib.setInt(5, myLib.head);
////	    System.out.println(myLib.getInt(3, myLib.head));
//	    System.out.println(myLib.head.next.n);
	    
	    
	    
	    
	    
	}
	
	

}
