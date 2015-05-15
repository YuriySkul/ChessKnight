import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

//
public class HorseBoard extends JPanel {
//   int width = 5;
//   int higth = 5;
//   int scale = 60;
//    JFrame frame;
//   
     MyLinkedList mlist; 
     
     public void setList(MyLinkedList list){
    	 mlist = list;
     }
//   HorseBoard(){ 
     
//	   frame = new JFrame("Ekkel Horse");
//	   frame.setResizable(false);
//	   frame.setSize(width*scale+7,higth*scale+34);
//	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   	   frame.add(this);
//       frame.setVisible(true);
//       frame.setLocationRelativeTo(null);
//   }
//   public Color color( int a, int b, int c ){
//	   return new Color( a, b, c );
//   }
//   public void paint(Graphics g){
//	   frame.setBackground(color(195,170,150));
//	   g.setColor( color( 230, 230, 230 ));
//	   for( int k = 0; k <= width*scale; k += scale ){ 
//		   g.drawLine(k, 0, k, higth*scale);
//	   }
//	   for( int k = 0; k <= higth*scale; k += scale ){ 
//		   g.drawLine(0, k, width*scale, k);
//	   }
//   }
//   
//   List<Box> myList=new LinkedList<>( );
// ����� �����5�5 ����� ������������ ����� ������� 5�5 int board[5][5],
//   ������ ������ ����� �������� 0 - ������, ��� ����� - ���������� ����� ���� ����� �� ��;
   int board[][] = new int[5][5];
   
   int finish=0;
   int moveCounter = 0;
//   ����� ����� ����� �� ��������� ��������� - ���������� 
//   ���� �� ������� 24 �������� ����
   public void move( int matrix[][],int i,int x,int y){
	   moveCounter++;
       System.out.println("������� "+i+">>>>>>"+moveCounter);
       matrixPrint(matrix);
	   if ( i < 25){
		   
		   
	       if(checkNextPlace(x+2,y+1,matrix)){
	    	   System.out.println("����� � ������ �����");
	            matrix[y+1][x+2]=i+1;
	    	   move(matrix,i+1, (x+2), (y+1));
	          	       matrix[y+1][x+2]=0;
	       }

	       
	       
	       if(checkNextPlace(x+1,y+2,matrix)){
	    	   System.out.println("����� �� ������ �����");
	    	   matrix[y+2][x+1]=i+1;
	    	   move(matrix,i+1, (x+1), (y+2));
	          matrix[y+2][x+1]=0;
	       }
	       
	        
	       
	       if(checkNextPlace(x-1,y+2,matrix)){
	    	   System.out.println("����� � ������ �����");
	           matrix[y+2][x-1]=i+1;
	    	   move(matrix,i+1, (x-1), (y+2));
	    	   matrix[y+2][x-1]=0;
	       }   
	       
	       
	       
	       if(checkNextPlace(x-2,y+1,matrix)){
	    	   matrix[y+1][x-2]=i+1;
	    	   System.out.println("����� � ��������� �����");
	           move(matrix,i+1, (x-2), (y+1));
	           matrix[y+1][x-2]=0;
	       }
	       
	       
	       
	       if(checkNextPlace(x-2,y-1,matrix)){
	    	    matrix[y-1][x-2]=i+1;
	    	    System.out.println("����� � ����� �����");
	    	    move( matrix,i+1, (x-2), (y-1));
	    	    matrix[y-1][x-2]=0;
	       } 
	       
	       
	       
	       if(checkNextPlace(x-1,y-2,matrix)){
	    	   matrix[y-2][x-1]=i+1;
	    	   System.out.println("����� � ������ �����");
	    	   move(matrix, i+1, (x-1), (y-2));
	       	   matrix[y-2][x-1]=0;
	       }    
	       
	       
	       
	       if(checkNextPlace(x+1,y-2,matrix)){
	    	   matrix[y-2][x+1]=i+1;
	    	   System.out.println("����� � ������� �����");
	    	   move( matrix,i+1, (x+1), (y-2));
	    	   matrix[y-2][x+1]=0;
	       }
	       
	       
	       if(checkNextPlace(x+2,y-1,matrix)){
	    	   matrix[y-1][x+2]=i+1;
	    	   System.out.println("����� � ������� �����");
	           move(matrix, i+1, (x+2), (y-1));
	           matrix[y-1][x+2]=0;
	       }
	      
	           
	   }else{
		   System.out.println("ONE SOLUTION HAVE BEEN FOUND!!!!!!!!!!!");
		   matrixPrint( matrix );
		   mlist.saveMatrix(matrix, mlist.head);
		   System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,");
		   matrixPrint(mlist.getMatrix(0, mlist.head));
		   
		   System.out.println(mlist.length);
		   		if(mlist.length == 5){
		   			System.out.println("�������"+mlist.length+"�������");
		   			matrixPrint(mlist.getMatrix(0, mlist.head));
		   			System.out.println();
		   			matrixPrint(mlist.getMatrix(1, mlist.head));
		   			System.out.println();
		   			matrixPrint(mlist.getMatrix(2, mlist.head));
		   			System.out.println();
		   			matrixPrint(mlist.getMatrix(3, mlist.head));
		   			System.out.println();
		   			matrixPrint(mlist.getMatrix(4, mlist.head));
		   			System.out.println();
		   			System.exit(5);
		   		}
		   
	   }
	   
   }
   
   public void matrixPrint(int [][] mtrx){
	   for (int i = 0; i < 5 ; i++){
		   for (int j = 0; j < 5 ; j++){
			   if (mtrx[i][j]<10){
				   System.out.print("0"+mtrx[i][j]+"   ");
			   }else{
				   System.out.print(mtrx[i][j]+"   ");
			   }
		   }
		   System.out.println();
	   }   
   }
   
   public boolean checkNextPlace(int xNext,int yNext,int [][] mtrx){
	   return((xNext>=0)&&(yNext>=0)&&(xNext<5)&&(yNext<5)&&(mtrx[yNext][xNext]==0));           
   }
   
   
   
   
   
}
