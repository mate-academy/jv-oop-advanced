package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        String circleInformation = new StringBuilder().append("Figure: circle, area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(this.radius)
                .append(" units, color: ")
                .append(this.color).toString();
        System.out.println(circleInformation);
    }
}
