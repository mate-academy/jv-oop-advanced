package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (int)(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("\nCircle with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("radius:" + radius + "\n");
    }
}
