package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String draw() {
        return "Rectangle{"
                + "firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + ", color='" + color + '\''
                + '}';
    }
}
