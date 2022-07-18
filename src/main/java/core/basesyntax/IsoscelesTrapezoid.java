package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int heightTrapezoid;

    public IsoscelesTrapezoid(String color, int baseOne, int baseTwo, int heightTrapezoid) {
        super(color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseOne + baseTwo) * heightTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq.units, baseOne: " + baseOne + " units, baseTwo: "
                + baseTwo + " units, height: " + heightTrapezoid + " color: "
                + getColor());
    }
}
