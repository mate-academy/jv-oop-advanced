package core.basesyntax;

public class Circle extends Figure {
    private static final String NAME = "circle";
    private int radius;

    public Circle() {
        setName(NAME);
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
        setName(NAME);
        calculateArea();
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor()
        );
    }
}
