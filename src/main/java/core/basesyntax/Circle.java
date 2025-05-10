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
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
