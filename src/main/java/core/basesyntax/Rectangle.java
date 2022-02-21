package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq.units, firstSide: "
                + firstSide
                + " units, secondSide: "
                + secondSide
                + " units, color: "
                + color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
