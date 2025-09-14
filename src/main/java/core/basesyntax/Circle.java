package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: circle, ");
        builder.append("area: ").append(String.format("%.1f",getArea())).append(" sq. units, ");
        builder.append("radius: ").append(getRadius()).append(" units, ");
        builder.append("color: ").append(getColor().name());
        System.out.println(builder.toString());
    }
}
