import java.util.Scanner;



class Main {

	  
	
public static void main(String[] args) {
	
		
  char[][] board = new char[3][3];

   for(int i = 0; i < 3; i++) {
			   
   for(int j = 0; j < 3; j++) {
		    
   board[i][j] = '-';
			    
   }

}
   Scanner in = new Scanner(System.in);
		
   System.out.println("Let's play Tic Tac Toe!");
	
    System.out.print("Player 1, what is your name? ");

    String p1 = in.nextLine();
		
    System.out.print("Player 2, what is your name? ");
		
    String p2 = in.nextLine();
     boolean player1 = true;

     boolean gameEnded = false;
		
  while(!gameEnded) {
  drawBoard(board);

			
  if(player1) {
				
  System.out.println(p1 + "'s Turn (x):");
			
 }    