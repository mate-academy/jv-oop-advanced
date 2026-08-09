package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public int calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Rectangle, color: " + color
                + ", firstSide: " + firstSide + ", secondSide: " + secondSide
                + ", area: " + calculateArea());
    }
}
