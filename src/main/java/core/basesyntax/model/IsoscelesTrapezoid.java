package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {

    private final int sideAngle;
    private final int sideLength;
    private final int biggerBase;
    private final int smallerBase;

    public IsoscelesTrapezoid(int sideAngle, int sideLength, int smallerBase, int biggerBase, Color color) {
        this.sideLength = sideLength;
        this.sideAngle = sideAngle;
        this.smallerBase = smallerBase;
        this.biggerBase = biggerBase;
        this.color = color;
        this.area = Math.round(((smallerBase + biggerBase) / 2)
                * Math.sqrt(Math.pow(sideLength, 2) - ((Math.pow(biggerBase - smallerBase, 2)) / 4)));
    }

    public IsoscelesTrapezoid() {
        this((int) (Math.random() * 99) + 1,
                (int) (Math.random() * 9) + 1,
                (int) (Math.random() * 12) + 1,
                (int) (Math.random() * 15) + 1,
                Color.randomColor());
    }

    @Override
    public String draw() {
        return new StringBuilder("Trapezoid: ")
                .append("area = ")
                .append(this.area)
                .append(", sides = ")
                .append("{")
                .append(this.biggerBase).append(", ").append(this.smallerBase).append(", ").append(this.sideLength)
                .append("}")
                .append(", side angle = ")
                .append(this.sideAngle)
                .append(", color = ")
                .append(this.color)
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

    public Color getColor() {
        return this.color;
    }

    public int getSmallerBase() {
        return smallerBase;
    }
}
