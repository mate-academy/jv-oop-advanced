package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "area=" + getArea()
                + ", firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + ", color=" + getColor() + '}';
    }
}
