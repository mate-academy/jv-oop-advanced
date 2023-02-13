package core.basesyntax;

public class Rectangle extends Figure{
    private int firstSide;
    private int secondSide;

    public Rectangle() {
    }

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle(String color) {
        super(color);
    }
}
