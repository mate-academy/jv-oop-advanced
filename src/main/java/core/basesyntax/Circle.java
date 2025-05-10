package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(getClass().getSimpleName())
                .append(", area: ").append(getArea()).append(" sq.units, radius: ")
                .append(radius).append(" units, color: ").append(getColor()).toString();
        System.out.println(sb);
    }
}
