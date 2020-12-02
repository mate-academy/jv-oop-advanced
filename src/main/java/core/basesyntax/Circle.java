package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String name;

    public Circle(double radius, String name) {
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

    private String getColor() {
        return ColorProducer.get().toString().toLowerCase();
    }

    public String draw() {
        String returnLine = "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, radius: " + getRadius() + " units, color: "
                + getColor();
        return returnLine;
    }
}
