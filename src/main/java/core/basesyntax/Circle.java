package core.basesyntax;

public class Circle extends Figure {
    private static final FigureName figureName = FigureName.CIRCLE;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure:\t" + figureName
                + ",\tColor:\t" + this.getColor()
                + ",\tArea:\t" + this.getArea()
                + ",\tRadius:\t" + this.getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
