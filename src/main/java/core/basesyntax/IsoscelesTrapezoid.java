package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int lengthBase;
    private final int lengthSmallSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int lengthBase, int lengthSmallSide, int height) {
        super(color);
        this.lengthBase = lengthBase;
        this.lengthSmallSide = lengthSmallSide;
        this.height = height;
    }

    @Override
    public double obtainTheArea() {
        return (double) ((lengthBase + lengthSmallSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + obtainTheArea()
                + " sq. units, lengthBase: " + lengthBase + " units, lengthSmallSide: "
                + lengthSmallSide + " units, height: " + height + "units, color: "
                + getColor().toLowerCase());
    }
}
