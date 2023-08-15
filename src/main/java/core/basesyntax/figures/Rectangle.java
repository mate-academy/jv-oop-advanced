package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                + ", firstSide: " + firstSide
                + ", secondSide: " + secondSide
                + ", color: " + getColor()
                + "\n");
    }
}
