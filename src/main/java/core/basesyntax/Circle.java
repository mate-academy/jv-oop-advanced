package core.basesyntax;

public class Circle extends Figure {
    private final String name = "Circle";
    private int radius;

    public Circle(String color, int radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        StringBuilder draw = new StringBuilder();
        draw.append("Figure: " + getName());
        draw.append(", area: " + getArea() + " sq.units");
        draw.append(", radius: " + radius);
        draw.append(", color: " + getColor());
        System.out.println(draw.toString());
    }
}
