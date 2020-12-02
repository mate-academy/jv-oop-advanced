package core.basesyntax.model;

public class Rectangle extends IsoscelesTrapezoid {
    private final int perimeter;

    public Rectangle(int sideLength, int baseLength, Color color) {
        super(90, sideLength, baseLength, baseLength, color);
        this.perimeter = (sideLength + baseLength) * 2;
    }

    @Override
    public String draw() {
        return new StringBuilder("Rectangle: ")
                .append("area = ")
                .append(this.getArea())
                .append(", perimeter = ")
                .append(this.perimeter)
                .append(", sides = ")
                .append("{")
                .append(this.getSideLength()).append(", ").append(this.getBiggerBase())
                .append("}")
                .append(", color = ")
                .append(this.getColor())
                .toString();
    }

    public int getPerimeter() {
        return perimeter;
    }
}
