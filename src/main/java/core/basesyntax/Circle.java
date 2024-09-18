package core.basesyntax;

public class Circle extends Figure {

    private static final double PI = 3.14;

    public Circle(Colors color, double side) {
        super(color, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + getArea() + "sq. units, radius "
                + getSide() + " units, color: "
                + getColor().name());
    }

    @Override
    public double getArea() {
        return PI * Math.pow(getSide(), 2);
    }
}
