package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: ");
        stringBuilder.append("circle, area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" color: ").append(color);
        System.out.println(stringBuilder);
    }
}
