package core.basesyntax;

public class Square extends Figure{
    private int side;

    public int getSide() {
        return side;
    }

    public Square() {}

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    public Square(String color) {
        this.color = color;
    }
}
