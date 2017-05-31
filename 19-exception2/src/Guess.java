//Assignment #: 19
//Student Name: Dhanush Patel
//Class:  COMSC-255
//Section: 8306

public class Guess 
{
  private int selection;
 
  public Guess()
  {
    //randomly select a number between 1 and 7 and save it in selection.
    selection = ((int) (Math.random() * 7)) + 1;
  }
 
  public void checkGuess (String guess ) throws GuessOutOfBoundsException,
            GuessTooLargeException, GuessTooSmallException, GuessNotWholeNumberException
  {
    int n = 0;
 
    //Convert User’s Guess received as a String into an int.
    try
   {
      //convert String guess into an int
      n = Integer.parseInt (guess);
    }
    catch (NumberFormatException ex)
    {
      //The user’s guess is not an int
      throw new GuessNotWholeNumberException( );
    }
 
    //User’s guess is now converted into an int
    if ( n > 7 || n < 1)
    {
      //User’s guess is outside the bounds of 1 and 7.
      throw new GuessOutOfBoundsException( );
    }
    else if ( n > selection )
   {
      //User’s guess is larger than the game’s selection.
      throw new GuessTooLargeException ( );
    }
    else if (n < selection)
    {
      //User’s guess is smaller than the game’s selection.
      throw new GuessTooSmallException ( );
    }
     //User’s guess matches selection, simply return.
     return;
  }
}
