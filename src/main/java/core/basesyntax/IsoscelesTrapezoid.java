package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double heightTrapezoid;

    public IsoscelesTrapezoid(String color, double base1, double base2, double heightTrapezoid) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * heightTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1 + " units, base2: " + base2 + " units, height: "
                + heightTrapezoid + " units, color: " + getColor());
    }
}
