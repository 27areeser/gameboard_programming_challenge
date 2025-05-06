public class GameBoard {

  // instance variables
  private String [][] gameBoard;
  private int row;
  private int col;

  /* GameBoard constructor - sets the dimension of the board.
  boardWidth defines the number of horizontal spaces.
  boardHeight defines the number of vertical spaces.
  boardWidth * boardHeight gives the number of spaces on your
  gameboard.  Constructor also fills all spaces of the board
  with "[ ]", sets row = 0 and col = 0, and finally places a
  player piece in position (0, 0) by setting that location
  to "[X]".
  */
  public GameBoard(int boardWidth, int boardHeight) {
    // your code goes here
  }

  // Prints the game board w/ current player piece location.
  public void printGameBoard() {
    // your code goes here
  }

  /* Checks if player can move.  Should be programmed so that
  player cannot move off of board.
  */
  private boolean checkIfCanMove(String moveCommand) {
    // your code goes here
  }

  /* Moves player piece on board and makes a call to
  printGameBoard() method.  Needs to check if a viable
  move is supplied by making a call to checkIfCanMove()
  method.  If "NM" is supplied as an argument, no move
  should take place and game board should be printed out.
  If viable move is supplied, game piece is moved and 
  game board is printed out. If invalid input is supplied
  a message should br printed out to the user letting
  them know that they cannot make that move.
  */
  public void move(String moveCommand) {
    // your code goes here
  }
}