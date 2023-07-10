package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, color: " + super.getColor() + ", radius: " + radius);
    }
}
