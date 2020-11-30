package core.basesyntax.model;

public class RightTriangle extends Figure {

    private final int sideLength;

    public RightTriangle(int sideLength, Color color) {
        this.sideLength = sideLength;
        this.color = color;
        this.area = Math.round(Math.pow(sideLength, 2) * Math.sqrt(3) / 4);
    }

    public RightTriangle() {
        this((int) (Math.random() * 19) + 1, Color.randomColor());
    }

    @Override
    public String draw() {
        return new StringBuilder("Right triangle: ")
                .append("area = ")
                .append(this.area)
                .append(", side length = ")
                .append(this.sideLength)
                .append(", color = ")
                .append(this.color)
                .toString();
    }

    public int getSideLength() {
        return sideLength;
    }

    public Color getColor() {
        return this.color;
    }
}
