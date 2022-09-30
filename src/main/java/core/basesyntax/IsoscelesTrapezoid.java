package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int width1;
    private int width2;

    public IsoscelesTrapezoid(int width1, int width2, String color) {
        super(color);
        this.width1 = width1;
        this.width2 = width2;
    }

    public int getWidth1() {
        return width1;
    }

    public int getWidth2() {
        return width2;
    }

    @Override
    public double getArea() {
        return ((width1 * width2) >> 1) * (width2 + width1) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "width1: " + getWidth1() + " units, "
                + "width2: " + getWidth2() + " units, color: " + getColor().toLowerCase());
    }
}
