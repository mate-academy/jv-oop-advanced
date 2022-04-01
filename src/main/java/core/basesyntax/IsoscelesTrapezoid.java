package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color,
                              String name,
                              double base1,
                              double base2,
                              double height) {
        super(color, name);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + getArea() + " Up Base: " + base1
                + " Bottom base: " + base2 + " height: " + height + " color: " + color);

    }
}
