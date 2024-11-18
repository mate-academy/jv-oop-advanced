package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractColor implements Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Trapezoid, area: " + getArea() + " sq. units, base1: "
                + base1 + " units, base2: " + base2 + " units, height: " + height
                + " units, color: " + getColor());
    }
}

/*package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    double base1;
    double base2;
    double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }
    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq. units, base1: " + base1 
        + " units, base2: " + base2 + " units, height: " + height + " units, color: " + color);
    }
}
*/
