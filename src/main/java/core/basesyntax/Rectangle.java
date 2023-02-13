package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color, FigureType.RECTANGLE);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, color: " + getColor());
    }
}
