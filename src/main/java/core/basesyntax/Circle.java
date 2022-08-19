package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder("Figure: circle, ")
                        .append("area: ")
                        .append(String.format("%.1f", getArea()))
                        .append(" sq.units, radius: ")
                        .append(radius)
                        .append(" units, color: ")
                        .append(getColor().toLowerCase())
        );
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
