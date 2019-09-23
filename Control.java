package TheBest;
import java.util.Scanner;
import javax.swing.*;
public class Control implements Runnable {
	
	
	Gui gui = new Gui();
	public static void main(String[]args) 
	
	{
		new Thread(new Control()).start();
		
		
		
		
		
		//Deck myDeck = new Deck(1,true);
		//myDeck.printDeck(24);
		
		
		
		
		Scanner scan = new Scanner(System.in);
		Deck actualDeck = new Deck (1,true);
		JOptionPane.showInputDialog(null, "Please enter your name : ", "Player Name" );
		String theName = scan.nextLine();
		Player mySelf = new Player(theName+"'s ");
		System.out.println();
		Player player = new Player("Dealer");
		
		
		mySelf.appendCard(actualDeck.Distribute_nextCard());
		player.appendCard(actualDeck.Distribute_nextCard());
		
		
		
		
		mySelf.appendCard(actualDeck.Distribute_nextCard());
		player.appendCard(actualDeck.Distribute_nextCard());
		
		
		
		
		
		System.out.println(" CARDS ARE DEALT :");
		System.out.println("_______________");
		mySelf.DisplayHand(true);
		player.DisplayHand(false);
		System.out.println("\n");
		
		boolean myselfDone= false;
		boolean dealerDone= false;
		String ans;
		
		while (!myselfDone || !dealerDone)
		
		{
			if(!myselfDone)
			
			{
				
				System.out.println("Hit or stay ? <<<Enter H or S>> :");
				ans = scan.nextLine();
				System.out.println("\n");
				
				
				
				if(ans.equalsIgnoreCase("H") )
				{
					//System.out.println("____________");
					mySelf.appendCard(actualDeck.Distribute_nextCard());// check if the new sum is over 21
					if(mySelf.SumOfHand()>21) {System.out.println("BUST");myselfDone=true; }
					mySelf.DisplayHand(true);
				}else
				
				{
					myselfDone = true;
				
					
				}
			}
		
		if(!dealerDone)
		{
			if(player.SumOfHand() <17)
			
			{
				player.appendCard(actualDeck.Distribute_nextCard());
				if(player.SumOfHand()>21) {System.out.println("dealer bust");dealerDone=true;}
				player.DisplayHand(false);}
			else
			{
				System.out.println("The Dealer stays");
				dealerDone = true;
				
			}
			}
		
		System.out.println();
		
	}
		scan.close();
	
	mySelf.DisplayHand(true);
	player.DisplayHand(true);
	
	int mySum = mySelf.SumOfHand();
	int dealerSum= player.SumOfHand();
	boolean greaterThanDealer = mySum>dealerSum;
	if ((greaterThanDealer && mySum <=21) || dealerSum > 21)
	
	{
		
		System.out.println(" Congratualations ! you have won the Game !!!");
	}
	else 
	
	{
		System.out.println("The dealer has Won  ");
		
		
		
		
	}}

	@Override
	public void run() {
		
		
	}}
	
	
	
	

