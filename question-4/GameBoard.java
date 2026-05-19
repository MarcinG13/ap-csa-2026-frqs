public class GameBoard {
  
  public int getPointsForRow(int targetRow) {
    int points = 0;
    String lastColor = board[targetRow][0].getColor();
    boolean same = true;

    for (Space s : board[targetRow]) {
      String currentColor = s.getColor();

      if (!lastColor.equals(currentColor)) {
        same = false;
      }

      points += s.getPoints();
      lastColor = currentColor;
    }

    if (same) {
      points *= 2;
    }

    return points;
  }
  
}
