package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName()
                + ", area: " + calculateArea()
                + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

}
