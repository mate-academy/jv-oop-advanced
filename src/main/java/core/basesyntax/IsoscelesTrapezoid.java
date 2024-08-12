package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lengthFirstBase;
    private int lengthSecondtBase;
    private int heightTrapezoid;

    public IsoscelesTrapezoid(String color, int lengthFirstBase,
                              int lengthSecondtBase, int heightTrapezoid) {
        super(color);
        this.lengthFirstBase = lengthFirstBase;
        this.lengthSecondtBase = lengthSecondtBase;
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public double getArea() {
        return 0.5 * (lengthFirstBase + lengthSecondtBase) * heightTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, lengthFirstBase: "
                + lengthFirstBase + " units, lengthSecondtBase: "
                + lengthSecondtBase + " units, heightTrapezoid: "
                + lengthSecondtBase + " units, color: " + getColor());
    }
}
