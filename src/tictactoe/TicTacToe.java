package tictactoe;

import java.util.Scanner;

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

}

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("Welcome to TIC-TAC-TOE Game");
		
		tictac o=new tictac();
		o.init();
		
		
	}

}
