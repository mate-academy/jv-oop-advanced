package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color, FigureType.CIRCLE);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
