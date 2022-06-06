package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: Circle, area: ")
                        .append(this.getArea())
                        .append(" sq.units, radius: ")
                        .append(radius)
                        .append(" units, color: ")
                        .append(this.getColor())
        );
    }
}
