package tictactoe;

import java.util.Scanner;

class tictac
{
	char board[] = new char[10];
	char cross = 'x';
	char zero = 'o';
	char player;
	char computer;
	
	void init()
	{
		for(int i=1; i<board.length; i++)
		{
			board[i]= ' ';
		}
	}
	
	
	void allow_player()
	{
		System.out.println("Enter X or O you want to choose");
		Scanner n=new Scanner(System.in);
		player = n.next().charAt(0);
		if( player == cross)
		{
			player = cross;
			computer = zero;
			
		}
		else if(player == zero)
		{
			player = zero;
			computer = cross;
		}
		else
		{
			System.out.println("Invalied character");
		}
			
	}
	
	void show_board()
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
		o.allow_player();
		o.show_board();
	}

}
