package core.basesyntax;

public class Circle extends Figure {
    private final FigureEnum figureName;
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.figureName = FigureEnum.CIRCLE;
    }

    public Circle(FigureEnum figureName, double radius, String color) {
        super(color);
        this.figureName = figureName;
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + getFigureArea() + " sq.unit, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
