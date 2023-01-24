package core.basesyntax;

public class Circle extends Figure implements Area {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append("circle, area: ").append(getArea()).append(" sq.units, ").append("radius: ").append(radius).append(" units, ").append("color: ").append(getColor());
        System.out.println(builder.toString());
    }
}
