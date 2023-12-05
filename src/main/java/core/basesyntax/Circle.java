package core.basesyntax;

public class Circle extends Figure {

    private String color;
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Circle " + ", Color: " + color + ", radius " + radius);
    }
}


