package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        double area = getArea();
        System.out.println(new StringBuilder()
                .append("Figure: circle, ")
                .append("area: ").append(area).append(" sq. units, ")
                .append("radius: ").append(radius).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
