package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("area: " + getArea() + "base1: " + base1 + "base2: " + base2 + "height: "
                + height + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }
}
