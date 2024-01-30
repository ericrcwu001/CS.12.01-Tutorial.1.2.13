public class Square {
    private boolean isBlack;
    private int num;

    public Square(boolean isBlack, int num) {
        this.isBlack = isBlack;
        this.num = num;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}