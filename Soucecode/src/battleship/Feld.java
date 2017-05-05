package battleship;

public class Feld {
	char feld[][]; 
	void feldausgeben() {
		
		System.out.println("   A   B   C   D   E   F   G   H   I   J ");
		System.out.println(" 1   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 2   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 3   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 4   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 5   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 6   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 7   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 8   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println(" 9   |   |   |   |   |   |   |   |   |   ");
		System.out.println("  ---+---+---+---+---+---+---+---+---+---");
		System.out.println("10   |   |   |   |   |   |   |   |   |   ");
		char escCode = 0x1B;
		int row = 10; int column = 10;
		System.out.print(String.format("%c[%d;%df",escCode,row,column));
		/*for (int i = 0; i <= 2; i++) //Schreibt aktuell besetzte Felder
		{
			for (int k = 0; k <= 2; k++)
			{
				gotoxy((4 * k) + 2, (2 * i) + 1);

				printf("%c", feld[i][k]);
			}
		}*/
	}
}
