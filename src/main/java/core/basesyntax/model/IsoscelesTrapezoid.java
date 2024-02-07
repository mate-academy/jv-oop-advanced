package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final int topBaseLength;
    private final int bottomBaseLength;
    private final int height;

    public IsoscelesTrapezoid(String color, int topBaseLength, int bottomBaseLength, int height) {
        super(color);
        this.topBaseLength = topBaseLength;
        this.bottomBaseLength = bottomBaseLength;
        this.height = height;
    }

    public int getTopBaseLength() {
        return topBaseLength;
    }

    public int getBottomBaseLength() {
        return bottomBaseLength;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int calculateArea() {
        return (topBaseLength + bottomBaseLength) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + calculateArea()
                + " sq.units, base1: "
                + topBaseLength
                + " units, base2: "
                + bottomBaseLength
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
