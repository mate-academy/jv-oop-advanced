package core.basesyntax;

public class Circle extends Figure {
    static final  FigType type = FigType.Circle;
    private float radius;

    public Circle(Color color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
