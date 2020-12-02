package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * this.radius * this.radius);
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' radius is " + getRadius()
                + " units , color: " + getColor().toLowerCase());
    }

}
