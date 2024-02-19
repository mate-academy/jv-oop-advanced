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

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (sideA - sideB) * height / 2;
    }

    @Override
    public void draw()  {
        System.out.println("Figure: IsoscelesTrapezoid, "
                + "area: " + calculateArea() + " sq. units, "
                + "sideA: " + getSideA() + " units, "
                + "sideB: " + getSideB() + " units, "
                + "height: " + getHeight() + " units, "
                + "color: " + this.getColor());
    }
}
