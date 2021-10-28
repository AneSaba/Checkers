//Aneesh Saba
//Period 2
import java.util.*;
import java.io.*;

public class Checkers
{
	ArrayList<Pieces> board;
	private Scanner input;

	public Checkers(){
		board = new ArrayList<Pieces>();
		addRow(0, 1, false);
		addRow(1, 0, false);
		addRow(2, 1, false);
		addRow(5, 0, true);
		addRow(6, 1, true);
		addRow(7, 0, true);
		input = new Scanner(System.in);
		while(true)
		{
			printBoard();
			System.out.println("Player White's turn. Enter coordinates of the piece you want to move(0-7): ");
			printXBoard();
			boolean invx1 = false;
			int x1 = 0;
			while(invx1==false)
			{
				System.out.println("Enter the x coordinate: ");
				x1 = input.nextInt(); 
				if(x1<0||x1>7)
					System.out.println("Invalid move");
				else
					invx1=true;
			}
			

			printYBoard();
			boolean invy1 = false;
			int y1 = 0;
			while(invy1==false)
			{
				System.out.println("Enter the y coordinate: ");
				y1 = input.nextInt(); 

				input.nextLine();
				if(y1<0||y1>7)
					System.out.println("Invalid move");
				else
					invy1=true;
			}

			System.out.println("Where do you want your piece to go?");
			boolean invx2 = false;
			int x2 = 0;
			while(invx2==false)
			{
				System.out.println("Enter the x coordinate: ");
				x2 = input.nextInt(); 
				input.nextLine();
				if(x2<0||x2>7)
					System.out.println("Invalid move");
				else
					invx2=true;
			}
			boolean invy2 = false;
			int y2 = 0;
			while(invy2==false)
			{
				
				System.out.println("Enter the y coordinate: ");
				y2 = input.nextInt();
				if(y2<0||y2>7)
					System.out.println("Invalid move");
				else
					invy2=true;
			}
			Pieces xsave = new Pieces(-1,0,true);
			boolean repeat = true;
			while(repeat == true){
				for(Pieces p:board)
				{
					while(x2==p.getX()&&y2==p.getY()){		
						System.out.println("Invalid move");
						System.out.println("Enter the x coordinate: ");
						x2 = input.nextInt(); 

						input.nextLine();
						System.out.println("Enter the y coordinate: ");
						y2 = input.nextInt(); 

						input.nextLine();
						if(y2<0||y2>7)
						{
							System.out.println("Invalid move");
							System.out.println("Enter the x coordinate: ");
							x2 = input.nextInt(); 
							System.out.println("Enter the y coordinate: ");
							y2 = input.nextInt(); 
						}
					}
					if(x1==p.getX()&&y1==p.getY())
					{
						
						for(Pieces x:board){
						if((x1+1==x2&&y1+1==y2)||(x1-1==x2&&y1-1==y2)||(x1-1==x2&&y1+1==y2)||(x1+1==x2&&y1-1==y2))
						{

						}
						else if((x1+2==x2&&y1+2==y2))
							{
								if(x.getX()+1==x2&&x.getY()+1==y2){
									repeat = true;
									xsave = x;
									
								}
								else
									repeat = false;

							}
						else if(x1-2==x2&&y1-2==y2)
						{
							if(x.getX()-1==x2&&x.getY()-1==y2)
							{
								repeat = true;
									xsave = x;
							}
							else
								repeat = false;
						}
						else if(x1-2==x2&&y1+2==y2)
						{
							if(x.getX()-1==x2&&x.getY()+1==y2)
							{
								repeat = true;
									xsave = x;
							}
							else
								repeat = false;
						}
						else if(x1+2==x2&&y1-2==y2)
						{
							if(x.getX()+1==x2&&x.getY()-1==y2)
							{
								repeat = true;
								xsave = x;
							}
							else
								repeat = false;
						}
						else
							{
								System.out.println("Invalid move");
								System.out.println("Enter the x coordinate: ");
								x2 = input.nextInt(); 
								System.out.println("Enter the y coordinate: ");
								y2 = input.nextInt(); 
							}
						p.setX(x2);
						p.setY(y2);
						}

						repeat = false;
						break;
					}

				}
				if(xsave.getX()!=-1)
					{
						board.remove(xsave);
					}
			}
			printBoard();
			System.out.println("Player Black's turn. Enter coordinates of the piece you want to move(0-7): ");
			printXBoard();
			invx1 = false;
			x1 = 0;
			while(invx1==false)
			{
				System.out.println("Enter the x coordinate: ");
				x1 = input.nextInt(); 
				if(x1<0||x1>7)
					System.out.println("Invalid move");
				else
					invx1=true;
			}
			

			printYBoard();
			invy1 = false;
			y1 = 0;
			while(invy1==false)
			{
				System.out.println("Enter the y coordinate: ");
				y1 = input.nextInt(); 

				input.nextLine();
				if(y1<0||y1>7)
					System.out.println("Invalid move");
				else
					invy1=true;
			}

			System.out.println("Where do you want your piece to go?");
			invx2 = false;
			x2 = 0;
			while(invx2==false)
			{
				System.out.println("Enter the x coordinate: ");
				x2 = input.nextInt(); 
				input.nextLine();
				if(x2<0||x2>7)
					System.out.println("Invalid move");
				else
					invx2=true;
			}

			invy2 = false;
			y2 = 0;
			while(invy2==false)
			{
				System.out.println("Enter the y coordinate: ");
				y2 = input.nextInt(); 

				input.nextLine();
				if(y2<0||y2>7)
					System.out.println("Invalid move");
				else
					invy2=true;
			}
			xsave = new Pieces(-1,0,true);
			repeat = true;
			while(repeat == true){
				for(Pieces p:board)
				{
					while(x2==p.getX()&&y2==p.getY()){		
						System.out.println("Invalid move");
						System.out.println("Enter the x coordinate: ");
						x2 = input.nextInt(); 

						input.nextLine();
						System.out.println("Enter the y coordinate: ");
						y2 = input.nextInt(); 

						input.nextLine();
						if(y2<0||y2>7)
						{
							System.out.println("Invalid move");
							System.out.println("Enter the x coordinate: ");
							x2 = input.nextInt(); 
							System.out.println("Enter the y coordinate: ");
							y2 = input.nextInt(); 
						}
					}
					if(x1==p.getX()&&y1==p.getY())
					{
						
						for(Pieces x:board){
						if((x1+1==x2&&y1+1==y2)||(x1-1==x2&&y1-1==y2)||(x1-1==x2&&y1+1==y2)||(x1+1==x2&&y1-1==y2))
						{

						}
						else if((x1+2==x2&&y1+2==y2))
							{
								if(x.getX()+1==x2&&x.getY()+1==y2){
									repeat = true;
									xsave = x;
									
								}
								else
									repeat = false;

							}
						else if(x1-2==x2&&y1-2==y2)
						{
							if(x.getX()-1==x2&&x.getY()-1==y2)
							{
								repeat = true;
									xsave = x;
							}
							else
								repeat = false;
						}
						else if(x1-2==x2&&y1+2==y2)
						{
							if(x.getX()-1==x2&&x.getY()+1==y2)
							{
								repeat = true;
									xsave = x;
							}
							else
								repeat = false;
						}
						else if(x1+2==x2&&y1-2==y2)
						{
							if(x.getX()+1==x2&&x.getY()-1==y2)
							{
								repeat = true;
								xsave = x;
							}
							else
								repeat = false;
						}
						else
							{
								System.out.println("Invalid move");
								System.out.println("Enter the x coordinate: ");
								x2 = input.nextInt(); 
								System.out.println("Enter the y coordinate: ");
								y2 = input.nextInt(); 
							}
						p.setX(x2);
						p.setY(y2);
						}

						repeat = false;
						break;
					}

				}
				if(xsave.getX()!=-1)
					{
						board.remove(xsave);
					}
			}

		}
	}

	private void addRow(int row, int startCol, boolean isWhite)
	{
		if(startCol==1)
		{
		 board.add(new Pieces(1,row,isWhite));
		 board.add(new Pieces(3,row,isWhite));
		 board.add(new Pieces(5,row,isWhite));
		 board.add(new Pieces(7,row,isWhite));
		}
		else{
			board.add(new Pieces(0,row,isWhite));
			board.add(new Pieces(2,row,isWhite));
		 	board.add(new Pieces(4,row,isWhite));
		 	board.add(new Pieces(6,row,isWhite));
		 }

	}

	public void printBoard()
	{
		    String [][] x = new String[8][8];
		    for(int i = 0;i<board.size() ;i++)
		    {
		    	if(board.get(i).isWhite())
		    		x[board.get(i).getX()][board.get(i).getY()] = "W";
		    	else
		    		x[board.get(i).getX()][board.get(i).getY()] = "B";

		    }
		    for(int i = 0;i<=7;i++)
		    {
		    	for(int j = 0;j<=7;j++)
		    	{
		    		if(x[i][j]==null)
		    			x[i][j] = " ";
		    	}
		    }
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][0]+"  |  "+x[1][0]+"  |  "+x[2][0]+"  |  "+x[3][0]+"  |  "+x[4][0]+"  |  "+x[5][0]+"  |  "+x[6][0]+"  |  "+x[7][0]+"  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][1]+"  |  "+x[1][1]+"  |  "+x[2][1]+"  |  "+x[3][1]+"  |  "+x[4][1]+"  |  "+x[5][1]+"  |  "+x[6][1]+"  |  "+x[7][1]+"  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][2]+"  |  "+x[1][2]+"  |  "+x[2][2]+"  |  "+x[3][2]+"  |  "+x[4][2]+"  |  "+x[5][2]+"  |  "+x[6][2]+"  |  "+x[7][2]+"  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][3]+"  |  "+x[1][3]+"  |  "+x[2][3]+"  |  "+x[3][3]+"  |  "+x[4][3]+"  |  "+x[5][3]+"  |  "+x[6][3]+"  |  "+x[7][3]+"  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][4]+"  |  "+x[1][4]+"  |  "+x[2][4]+"  |  "+x[3][4]+"  |  "+x[4][4]+"  |  "+x[5][4]+"  |  "+x[6][4]+"  |  "+x[7][4]+"  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][5]+"  |  "+x[1][5]+"  |  "+x[2][5]+"  |  "+x[3][5]+"  |  "+x[4][5]+"  |  "+x[5][5]+"  |  "+x[6][5]+"  |  "+x[7][5]+"  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][6]+"  |  "+x[1][6]+"  |  "+x[2][6]+"  |  "+x[3][6]+"  |  "+x[4][6]+"  |  "+x[5][6]+"  |  "+x[6][6]+"  |  "+x[7][6]+"  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  "+x[0][7]+"  |  "+x[1][7]+"  |  "+x[2][7]+"  |  "+x[3][7]+"  |  "+x[4][7]+"  |  "+x[5][7]+"  |  "+x[6][7]+"  |  "+x[7][7]+"  |");
		    System.out.println("  -------------------------------------------------");



	}
	public void printXBoard()
	{

		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
		    System.out.println("  -------------------------------------------------");



	}
	public void printYBoard()
	{

		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  1  |  1  |  1  |  1  |  1  |  1  |  1  |  1  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  2  |  2  |  2  |  2  |  2  |  2  |  2  |  2  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  3  |  3  |  3  |  3  |  3  |  3  |  3  |  3  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  4  |  4  |  4  |  4  |  4  |  4  |  4  |  4  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  5  |  5  |  5  |  5  |  5  |  5  |  5  |  5  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  6  |  6  |  6  |  6  |  6  |  6  |  6  |  6  |");
		    System.out.println("  -------------------------------------------------");
		    System.out.println("  |  7  |  7  |  7  |  7  |  7  |  7  |  7  |  7  |");
		    System.out.println("  -------------------------------------------------");

	}
	public void invalidMove()
	{

	}
	public void king()
	{

	}
	public static void main(String[] args) {
		Checkers game = new Checkers();
	}
	
}