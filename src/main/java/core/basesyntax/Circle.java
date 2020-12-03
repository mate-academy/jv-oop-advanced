package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String name;

    public Circle(Color color, double radius, String name) {
        super(color);
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.round(Math.PI * getRadius() * getRadius());
    }

    public String getName() {
        return name;
    }

    public String draw() {
        String returnLine = "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, radius: " + getRadius() + " units, color: "
                + getColor().toString().toLowerCase();
        return returnLine;
    }
}
