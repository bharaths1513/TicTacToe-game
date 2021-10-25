package tictactoe;

import java.util.Scanner;

class tictac
{
	char board[] = new char[10];
	char cross ='x';
	char zero = 'o';
	char player;
	char computer;
	
	public void init()
	{
		for(int i=1; i<board.length; i++)
		{
			board[i]= ' ';
		}
	}
	
	
	public void allow_player()
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
	
	public void show_board()
	{
		 System.out.println("game board  :");
	        System.out.println("");
	        System.out.println("   "+board[1]+"   " + "|" +"   "+board[2]+ "   " + "|" +"   "+board[3]+ "   ");
	        System.out.println("  -------------------");
	        System.out.println("   "+board[4]+"   " + "|" +"   "+board[5]+ "   " + "|" +"   "+board[6]+ "   ");
	        System.out.println("  -------------------");
	        System.out.println("   "+board[7]+"   " + "|" +"   "+board[8]+ "   " + "|" +"   "+board[9]+ "   ");
	}
	public void user_move()
	{
		System.out.println("Enter between(1-9) where you have to move ");
		Scanner n=new Scanner(System.in);
		int position = n.nextInt();
		
		if(position>=1 && position<=9)
		{
			if(board[position]== ' ' )
			{
				board[position] = player;
				show_board();
			}
			else
			{
				System.out.println("Invalied move,Position is not Empty");
			}
		}
	}
}

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("Welcome to TIC-TAC-TOE Game");
		
		tictac o=new tictac();
		o.init();
		o.allow_player();
		o.show_board();
		o.user_move();
	}

}
