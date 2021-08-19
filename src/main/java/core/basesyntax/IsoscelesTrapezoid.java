package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double legA;
    private double legB;
    private double height;

    public IsoscelesTrapezoid(double legA, double legB, double height, String color) {
        super("IsoscelesTrapezoid", color);
        this.legA = legA;
        this.legB = legB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((legA + legB) * height) / 2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure: isosceles trapezoid"
                    + ", area: " + getArea() + " sq.units"
                    + ", first base length: " + legA
                    + ", second base length: " + legB
                    + ", height: " + height
                    + ", color: " + super.getColor());
    }
}

