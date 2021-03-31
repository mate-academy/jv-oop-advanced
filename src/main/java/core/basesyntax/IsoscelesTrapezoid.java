package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private final int halfWayLine;
    private final int height;

    public IsoscelesTrapezoid(String color, int halfWayLine, int height) {
        super(color);
        this.halfWayLine = halfWayLine;
        this.height = height;
    }

    @Override
    public double getArea() {
        return halfWayLine * height;
    }

    @Override
    public void getDraw() {
        String name = "isoscelesTrapezoid";
        System.out.println("Figure: " + name + "," + " area:"
                + getArea() + " sq. units, halfWayLine length: "
                + halfWayLine + " units,  height length: "
                + height + " units, color: " + getColor());
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "halfWayLine=" + halfWayLine
                + ", height=" + height
                + '}';
    }
}

