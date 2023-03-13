package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: circle, area: ");
        stringBuilder.append(getArea());
        stringBuilder.append(" units, radius: ");
        stringBuilder.append(radius);
        stringBuilder.append(" units, color: ");
        stringBuilder.append(getColor());
        System.out.println(stringBuilder.toString());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
