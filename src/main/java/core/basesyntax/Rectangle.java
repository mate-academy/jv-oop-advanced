package core.basesyntax;

public class Rectangle extends Figure {
    private double sizeOfFirstSide;
    private double sizeOfSecondSide;

    public Rectangle(double sizeOfFirstSide, double sizeOfSecondSide, String color) {
        super("Rectangle", color);
        this.sizeOfFirstSide = sizeOfFirstSide;
        this.sizeOfSecondSide = sizeOfSecondSide;
    }

    @Override
    public double calculateArea() {
        return this.sizeOfSecondSide * this.sizeOfFirstSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure:" + getName()
                + " area : " + this.calculateArea() + " sq. units,"
                + " first side length : " + this.sizeOfFirstSide
                + " second side length : " + this.sizeOfSecondSide
                + " color: " + getColor());
    }
}
