package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int heightTrapezoid;
    private int lowerBase;
    private int upperBase;

    public IsoscelesTrapezoid(String color, int heightTrapezoid, int lowerBase, int upperBase) {
        super(color);
        this.heightTrapezoid = heightTrapezoid;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
    }

    @Override
    public double getArea() {
        return 0.5 * (lowerBase + upperBase) * heightTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", "
                + "area: " + getArea() + ", "
                + " heightTrapezoid: " + heightTrapezoid + ", "
                + " lowerBase: " + lowerBase + ", "
                + " upperBase: " + upperBase + ", "
                + " color: " + getColor());
    }
}
