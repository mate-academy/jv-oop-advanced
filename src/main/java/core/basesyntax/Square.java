package core.basesyntax;

public class Square extends Figure {
    private double sizeOfSide;

    public Square(double sizeOfSide, String color) {
        super("Square", color);
        this.sizeOfSide = sizeOfSide;
    }

    @Override
    public double calculateArea() {
        return this.sizeOfSide * this.sizeOfSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure:" + getName()
                + " area : " + calculateArea() + " sq. units,"
                + " side length : " + sizeOfSide
                + " color: " + getColor());
    }
}
