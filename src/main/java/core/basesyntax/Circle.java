package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public int getRadius() {
        return radius;
    }
}
