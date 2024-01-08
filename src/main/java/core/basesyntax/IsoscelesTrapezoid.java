package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private int h;
    private int a;
    private int b;

    public IsoscelesTrapezoid(String color, int h, int a, int b) {
        super(color);
        this.h = h;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return ((a + b) / 2) * h;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq. units, "
                + "firstBases: " + a + " units, "
                + "secondBases: " + b + " units, "
                + "height: " + h + " units, "
                + "color: " + getColor());
    }
}
