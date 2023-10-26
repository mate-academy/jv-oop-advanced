package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, Color color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + "  sq. units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor());
    }
}
