package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.sideA + this.sideB) / 2 * this.height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FigureType.ISOSCELES_TRAPEZOID.getValue() + ", area: "
                + df.format(calculateArea()) + " sq.units, height: " + this.height
                + " units, side A: " + this.sideA + " units, side B " + this.sideB
                + " units, color: " + super.color);
    }

}
