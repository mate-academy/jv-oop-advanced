package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + FigureName.CIRCLE.name()
                + ", area: "
                + findArea()
                + " sq. units, color: "
                + getColor()
                + ", radius: "
                + radius);
    }
}
