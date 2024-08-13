package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Figure: circle, radius: " + radius + " color: " + Color.WHITE);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
