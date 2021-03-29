package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double side1, double secondSide, String color) {
        super(color, "rectangle");
        this.firstSide = side1;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units"
                + ", first side: " + firstSide + ", second side: " + secondSide
                + " units, color: " + getColor();
    }
}
