package TheBest;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame{
	
	
	
	private static final long serialVersionUID = 1L;
	int aW= 1360;
	int aH= 820;
	
	
	boolean bool_hot_stay =true;
	
	Font fontButton = new Font("Times new Roman",Font.PLAIN,30);
	//color
	Color colorBackground = new Color(226,173,26);
	Color colorButton = new Color(201,46,201);
	//buttons
	JButton bHit = new JButton();
	JButton bstay = new JButton();
	JButton bno = new JButton();
	JButton byes = new JButton();
	
	
	//card grid position and dimensions 
	int gridX =50;
	int gridY = 50;
	int gridW= 990;
	int gridH = 250;
	
	//dimensions and spacing
	int cardSpacing =15;
	int cardTW = gridW/6;
	int cardTH =gridH/32 ;
	int cardAW = cardTW-2*cardSpacing;
	int cardAH =cardTH*2*cardSpacing;
	
	
	
	
	//totals and hitstay grid positioning  and dimensions 
	int hsX = gridX + gridW + 50;
	int hsY = gridY;
	int hsw=250;
	int hsh= 400;
	
	//play more 
	int pmX = hsX;
	int pmY = hsY +hsh+50;
	int pmH =200;
	int pmW = hsw;
	
	
	
	
	
	
	
	
public Gui() {
	this.setSize(aW+6,aH+29);
	this.setTitle("Black JAcks");
	this.setVisible(true);
	this.setResizable(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Board board = new Board();
	this.setContentPane(board);
	
	this.setLayout(null);
	ActHit aHit = new ActHit();
	bHit.addActionListener(aHit);
	bHit.setBounds(hsX+55, hsY+40, 120, 80);
	
	bHit.setBackground(colorButton);
	board.add(bHit);
	bHit.setText("HIT");
	bHit.setFont(fontButton);
	//button stuff
	
	ActStay astay = new ActStay();
	bstay.addActionListener(astay);
	bstay.setBounds(hsX+55, hsY+280, 120, 80);
	
	bstay.setBackground(colorButton);
	board.add(bstay);
	bstay.setText("STAY");
	bstay.setFont(fontButton);
	
	
	ActYes aYes = new ActYes();
	byes.addActionListener(aYes);
	byes.setBounds(pmX+10, pmY+110, 100, 80);
	
	byes.setBackground(colorButton);
	board.add(byes);
	byes.setText("YES");
	byes.setFont(fontButton);
	
	
	ActNo aNo = new ActNo();
	bno.addActionListener(aNo);
	bno.setBounds(pmX+120, pmY+110, 100, 80);
	
	bno.setBackground(colorButton);
	board.add(bno);
	bno.setText("NO");
	bno.setFont(fontButton);
	
	
	
	
	
	
	
	
}
public void refresher() {
	if (bool_hot_stay ==true) {
		bHit.setVisible(true);
		bstay.setVisible(true);
		byes.setVisible(false);
		bno.setVisible(false);
	}
}


public class Board extends JPanel{
	
 



	public void paintComponent(Graphics g)
	{
		g.setColor(colorBackground);
		g.fillRect(0, 0, aW, aH);
		//g.setColor(colorBackground);
		
		
		//tmporary
		g.setColor(Color.black);
		g.drawRect(gridX,gridY,gridW,gridH);
		
		g.drawRect(gridX, gridY+gridH+120, gridW, 500);
		
		//totals and hit stay messages and buttons grid
		
		g.drawRect(hsX, hsY,hsw, hsh);
		
		
		g.drawRect(pmX,pmY,pmW,pmH);
		
		for (int i = 0 ;i<6 ;i++) {
			
			g.drawRect(gridX+i*cardTW+cardSpacing, gridY+cardSpacing, cardAW, cardAH);
		
		}
		
	}
}

public class ActHit implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("you just clicked the Hit Button");
	}
}
	
	
	
	public class ActStay implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("you just clicked the Stay Button");
		}}
		
		
		
		
		public class ActYes implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you just clicked the Yes Button");
			}
	}
		
		public class ActNo implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you just clicked the No Button");
			}}}
			
	
			
		


