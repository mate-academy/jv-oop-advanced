package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: circle, area: ")
                        .append(getArea())
                        .append(" sq.units, radius: ")
                        .append(radius)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
