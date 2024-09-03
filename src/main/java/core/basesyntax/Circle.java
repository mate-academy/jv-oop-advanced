package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private final int index = 2;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,index);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle" + ", area: " + area() + ", radius: " + radius + ", unit"
                             + ", color: " + color);
    }
}
