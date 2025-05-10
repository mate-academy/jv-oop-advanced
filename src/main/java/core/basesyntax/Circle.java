package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        super(FigureType.CIRCLE.name());
    }

    public Circle(int radius, String color) {
        this();
        this.radius = radius;
        setColor(color);
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
