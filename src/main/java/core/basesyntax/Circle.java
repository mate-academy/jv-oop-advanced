package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
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
        stringBuilder.append("Figure: circle, ")
                        .append("area: ").append(getArea()).append(" sq.units, ")
                        .append("radius: ").append(radius).append(" units, ")
                        .append("color: ").append(color);
        System.out.println(stringBuilder.toString());
    }
}
