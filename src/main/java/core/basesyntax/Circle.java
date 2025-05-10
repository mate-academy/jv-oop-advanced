package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {

        System.out.println(new StringBuilder()
                .append("Figure: circle, ")
                .append("area: ").append(getArea()).append(" sq. units, ")
                .append("radius: ").append(radius).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
