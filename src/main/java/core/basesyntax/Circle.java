package core.basesyntax;

public class Circle extends Figure {
    public static final int MAX_RADIUS;

    static {
        MAX_RADIUS = 100;
    }

    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int)(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("\nCircle with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("radius:" + radius + "\n");
    }
}
