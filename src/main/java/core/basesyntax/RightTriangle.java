package core.basesyntax;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(String color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        String triangleInformation = String.valueOf(new StringBuilder()
                .append("Figure: right triangle, area: ")
                .append(getArea())
                .append("sq.units, base: ")
                .append(this.base)
                .append(" units, height: ")
                .append(this.height)
                .append(" units, color: ")
                .append(color));
        System.out.println(triangleInformation);
    }
}