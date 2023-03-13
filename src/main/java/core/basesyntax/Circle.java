package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: Circle, ").append("area: ")
                .append(getArea())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ").append(getColor()));
    }
}
