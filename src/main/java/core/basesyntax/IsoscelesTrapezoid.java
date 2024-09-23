package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double sideB;
    private double height;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea() + "sq. units, side "
                + side + " units, sideB " + sideB
                + " units, color: " + getColor().name());
    }

    public double getArea() {
        return (side + sideB) / 2 * height;
    }
}
