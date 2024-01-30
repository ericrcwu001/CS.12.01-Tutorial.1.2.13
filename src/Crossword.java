public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        Square temp;
        int num = 1;
        for (int i = 0; i < blackSquares.length; ++i) {
            for (int j = 0; j < blackSquares[i].length; ++j) {
                temp = toBeLabeled(i, j, blackSquares) ?
                        new Square(blackSquares[i][j], num++) :
                        new Square(blackSquares[i][j], 0);
                puzzle[i][j] = temp;
            }
        }
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        if (blackSquares[r][c]) return false;
        if (r == 0 || c == 0) return true;
        return blackSquares[r - 1][c] || blackSquares[r][c - 1];
    }

    public Square[][] getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(Square[][] puzzle) {
        this.puzzle = puzzle;
    }
}
