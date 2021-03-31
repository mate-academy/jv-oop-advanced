package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sides;
    private double sideA;
    private double sideB;

    public IsoscelesTrapezoid(double sides, double sideA, double sideB, String figureColor) {
        super("Isosceles trapezoid", figureColor);
        this.sides = sides;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 4) * Math.sqrt((4 * (sides * sides))
                - ((sideA - sideB) * (sideA - sideB)));
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units, side A length: "
                + sideA + " units, side B length: " + sideB + " units, another sides length: "
                + sides + " units, color: " + getFigureColor();
    }
}
