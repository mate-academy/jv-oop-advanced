package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.CIRCLE
                 + ", area :" + calculateArea()
                 + " sq.units, radius:" + radius
                 + ", color:" + getColor());
    }
}
