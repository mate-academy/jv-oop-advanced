package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final int sideAngle;
    private final int sideLength;
    private final int biggerBase;
    private final int smallerBase;

    public IsoscelesTrapezoid(
            int sideAngle, int sideLength, int smallerBase, int biggerBase, Color color) {
        super(((smallerBase + biggerBase) / 2)
                * Math.sqrt(Math.pow(sideLength, 2)
                - ((Math.pow(biggerBase - smallerBase, 2)) / 4)), color);
        this.sideLength = sideLength;
        this.sideAngle = sideAngle;
        this.smallerBase = smallerBase;
        this.biggerBase = biggerBase;
    }

    @Override
    public String draw() {
        return new StringBuilder("Trapezoid: ")
                .append("area = ")
                .append(this.getArea())
                .append(", sides = ")
                .append("{")
                .append(this.biggerBase).append(", ")
                .append(this.smallerBase).append(", ")
                .append(this.sideLength)
                .append("}")
                .append(", side angle = ")
                .append(this.sideAngle)
                .append(", color = ")
                .append(this.getColor())
                .toString();
    }

    public int getSideAngle() {
        return sideAngle;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int getBiggerBase() {
        return biggerBase;
    }

    public int getSmallerBase() {
        return smallerBase;
    }
}
