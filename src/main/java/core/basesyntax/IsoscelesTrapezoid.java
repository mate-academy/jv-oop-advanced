package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBaseOfTrapezoid;
    private int lowerBaseOfTrapezoid;
    private int heightOfTrapezoid;

    public IsoscelesTrapezoid(int upperBaseOfTrapezoid,
                              int lowerBaseOfTrapezoid,
                              int heightOfTrapezoid, String color) {
        super(color);
        this.upperBaseOfTrapezoid = upperBaseOfTrapezoid;
        this.lowerBaseOfTrapezoid = lowerBaseOfTrapezoid;
        this.heightOfTrapezoid = heightOfTrapezoid;
    }

    @Override
    public int getArea() {
        return ((upperBaseOfTrapezoid + lowerBaseOfTrapezoid) / 2) * heightOfTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea() + " sq.units, upperBaseOfTrapezoid: "
                + upperBaseOfTrapezoid
                + " units, lowerBaseOfTrapezoid: "
                + lowerBaseOfTrapezoid
                + " units, heightOfTrapezoid: "
                + heightOfTrapezoid + " units, color: "
                + getColor());
    }
}
