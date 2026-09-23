package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area = " + getArea()
                + " sq. units, height = " + height + " units, " + "side a = "
                + sideA + " units, " + "side b = " + sideB + " units, "
                + " color = " + getColor());
    }

}
