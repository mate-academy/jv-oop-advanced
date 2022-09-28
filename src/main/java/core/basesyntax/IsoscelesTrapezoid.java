package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static int firstSide;
    private static int secondSide;
    private static int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;

    }

    @Override
    public String name() {
        return "Isosceles Trapezoid";
    }

    @Override
    public float getArea() {
        return ((firstSide + secondSide) >> 1) * height;
    }

    @Override
    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(name()).append(", area: ")
                .append(getArea()).append(" units, first side: ")
                .append(firstSide).append(" units, second side: ")
                .append(secondSide).append(", height: ").append(height)
                .append(", color: ").append(getColor());
        return sb.toString();
    }
}
