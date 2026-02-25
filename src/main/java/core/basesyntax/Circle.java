package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        this.setColor(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure : circle, "
                + "area: " + calcArea() + " sq. units, "
                + "radius :" + radius + " units, "
                + "color : " + getColor());
    }
}
