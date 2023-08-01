package core.basesyntax;

public class Rectangle extends IsoscelesTrapezoid {
    public Rectangle(final Color color, final int base, final int height) {
        super(color, base, height);
    }

    @Override
    public double getArea() {
        return bottomBase * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "rectangle,"
                + " area: "
                + getArea()
                + " sq.units,"
                + " base: "
                + bottomBase
                + " units, "
                + " height: "
                + height
                + " units, "
                + "color: "
                + getColor());
    }
}
