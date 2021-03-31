package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String figureColor) {
        super("Rectangle", figureColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq. units, side A length: " + sideA + " units, side B length: "
                + sideB + " units, color: " + getFigureColor();
    }
}
