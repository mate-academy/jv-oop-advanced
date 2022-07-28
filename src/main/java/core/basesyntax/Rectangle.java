package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
