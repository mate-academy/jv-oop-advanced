package core.basesyntax;

public class Circle extends Figure{
    private final double radius;

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("This is circle with radius - "
                + this.radius + " ,color - " + this.color
                + " and area - " + this.calcArea());
    }
}
