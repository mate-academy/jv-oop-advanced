package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    {
        setFigureName("Rectangle");
    }

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", area: " + String.valueOf(getArea())
                + " sq.units, first side: " + String.valueOf(firstSide)
                + " units, second side: " + String.valueOf(secondSide)
                + " units, color: " + getColor());
    }
}
