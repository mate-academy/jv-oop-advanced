package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int halfWayLine;
    private final int height;

    public IsoscelesTrapezoid(String color, String name, int halfWayLine, int height) {
        super(color, name);
        this.halfWayLine = halfWayLine;
        this.height = height;
    }

    @Override
    public double getArea() {
        return halfWayLine * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "," + " area:"
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
