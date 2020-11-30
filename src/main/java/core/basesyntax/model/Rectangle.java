package core.basesyntax.model;

public class Rectangle extends IsoscelesTrapezoid {

    private final int perimeter;

    public Rectangle(int sideLength, int baseLength, Color color) {
        super(90, sideLength, baseLength, baseLength, color);
        this.area = sideLength * baseLength;
        this.perimeter = (sideLength + baseLength) * 2;
        this.color = color;
    }

    public Rectangle() {
        this((int) (Math.random() * 5) + 1, (int) (Math.random() * 15) + 1, Color.randomColor());
    }

    @Override
    public String draw() {
        return new StringBuilder("Rectangle: ")
                .append("area = ")
                .append(this.area)
                .append(", perimeter = ")
                .append(this.perimeter)
                .append(", sides = ")
                .append("{")
                .append(this.getSideLength()).append(", ").append(this.getBiggerBase())
                .append("}")
                .append(", color = ")
                .append(this.color)
                .toString();
    }

    public int getPerimeter() {
        return perimeter;
    }

}
