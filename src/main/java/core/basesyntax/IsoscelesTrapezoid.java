package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double height, double base2) {
        super(color);
        this.base1 = base1;
        this.height = height;
        this.base2 = base2;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (base1 * base2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, " + "area: " + getArea() + " sq. units, base1: " + getBase1() + ", base2: " + getBase2() + ", height: " + getHeight() + ", color: " + getColor());
    }
}
