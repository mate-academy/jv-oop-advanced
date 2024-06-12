package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawFigure() {
        double area = calculateArea();
        System.out.println("Figure: rectangle, area: " + area
                + " sq. units, firstSide: " + getFirstSide() + " units, secondSide "
                + getSecondSide() + " units, color: " + getColor());
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }
}
