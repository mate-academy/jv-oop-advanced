package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int)(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Circle, color: " + color
                + ", radius: " + radius + ", area: " + calculateArea());
    }
}
