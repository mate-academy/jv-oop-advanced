package core.basesyntax;

public class Rectangle extends Figure {
    private double sideB;

    public Rectangle(Colors color, double side, double sideB, double height) {
        super(color, side);
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea() + "sq. units, side "
                + getSide() + " units, sideB " + sideB
                + " units, color: " + getColor().name());
    }

    @Override
    public double getArea() {
        return (getSide() * sideB);
    }
}
