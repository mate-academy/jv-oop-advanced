package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        if (getArea() == 0.0) {
            return radius * radius * Math.PI;
        } else {
            System.out.println("The area has been already calculated");
            return getArea();
        }
    }

    @Override
    public String draw() {
        return "Figure: Circle, "
                + "radius: " + radius
                + " units, area: " + findArea()
                + " sq.units: "
                + "color: " + getColor();
    }
}
