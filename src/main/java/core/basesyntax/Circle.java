package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private final NameOfFigure name = NameOfFigure.CIRCLE;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public NameOfFigure getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + calculateArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
