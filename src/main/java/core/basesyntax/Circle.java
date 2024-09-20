package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color, Math.PI * Math.pow(radius, 2));
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %f, radius: %f, color: %s\n",
                area,
                radius,
                color
        );
    }
}
