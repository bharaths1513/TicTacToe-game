package tictactoe;

class tictac
{
	char board[] = new char[10];
	
	void init()
	{
		for(int i=1; i<board.length; i++)
		{
			board[i]= ' ';
		}
	}
	void game_board()
	{
		 System.out.println("Unassigned board  :");
	        System.out.println("");
	        System.out.println("   "+board[1]+"   " + "|" +"   "+board[2]+ "   " + "|" +"   "+board[3]+ "   ");
	        System.out.println("  -------------------");
	        System.out.println("   "+board[4]+"   " + "|" +"   "+board[5]+ "   " + "|" +"   "+board[6]+ "   ");
	        System.out.println("  -------------------");
	        System.out.println("   "+board[7]+"   " + "|" +"   "+board[8]+ "   " + "|" +"   "+board[9]+ "   ");
	}
}

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("Welcome to TIC-TAC-TOE Game");
		
		tictac o=new tictac();
		o.init();
		o.game_board();
		
	}

}
