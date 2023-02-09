package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
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
                .append(" color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
