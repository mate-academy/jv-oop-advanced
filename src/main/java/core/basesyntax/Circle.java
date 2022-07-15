package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        info.append("Figure: Circle, area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(color);
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
