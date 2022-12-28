package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    final double sideDown;
    final double sideUpper;
    final double heightTrapezoid;

    public IsoscelesTrapezoid(String color, double sideDown, double sideUpper,
                              double heightTrapezoid) {
        super(color);
        this.sideDown = sideDown;
        this.sideUpper = sideUpper;
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public double getArea() {
        return ((sideDown + sideUpper) / 2) * heightTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area:  " + getArea()
                + " sq.units " + " sideDown: "
                + sideDown + " units " + " sideUpper: " + sideUpper + " units "
                + " heightTrapezoid: "
                + heightTrapezoid + " units " + " color: " + getColor());
    }
}
