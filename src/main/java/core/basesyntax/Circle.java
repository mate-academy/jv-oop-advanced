package core.basesyntax;

public class Circle extends Figure implements Areacount,Figuredrawing {
    private int radius;

    public Circle(int radius,String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ").append("circle, ").append("area: ").append(getArea())
                .append(" sq.units, ").append("radius: ").append(radius)
                .append(" units, ").append("color: ").append(getColor());
        return builder.toString();
    }

    @Override
    public String toString() {
        return draw();
    }
}
