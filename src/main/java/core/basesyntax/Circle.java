package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drow() {
        System.out.println("Figure: Circle, color: " + getColor()
                + ", radius: " + radius + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
