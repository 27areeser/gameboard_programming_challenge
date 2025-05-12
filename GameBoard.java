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
    row = 0;
    col = 0;
    gameBoard = new String[boardHeight][boardWidth]; // Creates gameBoard based on inputted dimensions
  }

  // Prints the game board w/ current player piece location.
  public void printGameBoard() {
    for (int i = 0; i < gameBoard.length; i++) // iterates through number of rows
    {
      for (int j = 0; j < gameBoard[0].length; j++) // iterates through number of columns
      {
        if (row == i && col == j)
        {
          System.out.print("[X]");
        }
        else{
        System.out.print("[ ]");
        }
      }
      System.out.println();
    }

  }

  /* Checks if player can move.  Should be programmed so that
  player cannot move off of board.
  */
  private boolean checkIfCanMove(String moveCommand) {
    // Checks up movement
    if (moveCommand.equals("U"))
    {
      row--;
      if (row < 0)
      {
        row++;
        return false;
      }
      else
      {
        return true;
      }
    }
    // Checks left movement
    else if (moveCommand.equals("L"))
    {
      col--;
      if (col < 0)
      {
        col++;
        return false;
      }
      else
      {
        return true;
      }
    }
    // Checks right movement
    else if (moveCommand.equals("R"))
    {
      col++;
      if (col > gameBoard[0].length - 1)
      {
        col--;
        return false;
      }
      else
      {
        return true;
      }
    }
    // Checks down movement
    else if (moveCommand.equals("D"))
    {
      row++;
      if (row > gameBoard.length - 1)
      {
        row--;
        return false;
      }
      else
      {
        return true;
      }
    }
    return false;
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
    boolean moveable = false;

    // No move
    if (moveCommand.equals("NM")) 
    {
      printGameBoard();
    }

    // Move up
    else if (moveCommand.equals("U"))
    {
      moveable = checkIfCanMove("U");
      if (moveable == true)
      {
        printGameBoard();
      }
      else
      {
        System.out.println("The move you entered was invalid. Make sure it is one of the accepted moves and contains all capital letters.");
        printGameBoard();
        System.out.println();
      }
    }

    // Move right
    else if (moveCommand.equals("R"))
    {
      moveable = checkIfCanMove("R");
      if (moveable == true)
      {
        printGameBoard();
      }
      else
      {
        System.out.println("The move you entered was invalid. Make sure it is one of the accepted moves and contains all capital letters.");
        printGameBoard();
        System.out.println();
      }
    }

    // Move left
    else if (moveCommand.equals("L"))
    {
      moveable = checkIfCanMove("L");
      if (moveable == true)
      {
        printGameBoard();
      }
      else
      {
        System.out.println("The move you entered was invalid. Make sure it is one of the accepted moves and contains all capital letters.");
        printGameBoard();
        System.out.println();
      }
    }

    // Move down
    else if (moveCommand.equals("D"))
    {
      moveable = checkIfCanMove("D");
      if (moveable == true)
      {
        printGameBoard();

      }
      else
      {
        System.out.println("The move you entered was invalid. Make sure it is one of the accepted moves and contains all capital letters.");
        printGameBoard();
        System.out.println();
      }
    }

    else
    {
      System.out.println("This move is not recognized. Make sure it is one of the accepted moves and contains all capital letters.");
      System.out.println();
    }
  }
}