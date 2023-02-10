package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private final FigureType figureType = FigureType.CIRCLE;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    @Override
    public int getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }
}
