import java.util.Scanner;

/* Main class to drive/test code.  You can add code
for testing purposes, but remove them when finished.
I will test your implementation of the methods in the
GameBoard class using this Main class as is.
*/
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String move = "NM";
    System.out.println("This program simulates a game board.");
    System.out.println("You can move up - 'U'");
    System.out.println("You can move down - 'D'");
    System.out.println("You can move left - 'L'");
    System.out.println("You can move right - 'R'");
    System.out.println("Or, you can choose not to move - 'NM'");
    System.out.println("Enter 'EXIT' to complete simulation.");
    System.out.println("First enter the board grid size.");
    System.out.print("Enter the width: ");
    int width = scanner.nextInt();
    System.out.print("Enter the height: ");
    int height = scanner.nextInt();
    GameBoard gb = new GameBoard(width, height);
    while (!move.equals("EXIT")) {
      System.out.print("Please enter your move: ");
      move = scanner.nextLine();
      gb.move(move);
    }
    System.out.println("Thanks for playing the game!");
  }
}