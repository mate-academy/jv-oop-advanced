package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    public Circle () {
        double defaultRadius = 10;
        radius = defaultRadius;
    }
    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    @Override
    public void Draw () {
        System.out.println("" + getColor() + " circle with area of " + Area()
                + " sq.units and radius of " + radius + " units");
    }
    @Override
    public double Area () {
        return Math.PI  * radius * radius;
    }
}
