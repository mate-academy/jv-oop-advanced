package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: circle, area: ").append(getArea())
                     .append(", radius: ").append(radius)
                     .append(", color: ").append(getColor())
                     .append('\n');
        System.out.println(stringBuilder.toString());
    }
}
