package core.basesyntax;

public class Circle extends Figure{

    private int radius;
    private static final double PI = 3.14;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * (radius * radius);
    }

    @Override
    public void draw() {
        super.draw();
    }
}
