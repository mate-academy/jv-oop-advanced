package core.basesyntax.model;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String name, double area, String color, int firstSide, int secondSide) {
        super(name, area, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String toString() {
        return super.toString() + ", firstSide: " + firstSide + ", secondSide: " + secondSide;
    }
}
