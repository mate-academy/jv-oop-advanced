package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double alpha;

    public IsoscelesTrapezoid(double sideA, double sideB, double alpha, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.alpha = alpha;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * (sideA - sideB) * Math.tan(alpha) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Isosceles Trapezoid " + "color: " + getColor()
                + " Side A: " + String.format("%.2f", sideA)
                + "Side B: " + String.format("%.2f", sideB)
                + " height: " + String.format("%.2f", alpha)
                + " area: " + String.format("%.2f", getArea()) + '}');
    }
}
