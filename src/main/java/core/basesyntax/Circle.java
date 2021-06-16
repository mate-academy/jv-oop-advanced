package core.basesyntax;

public class Circle extends Figure implements Drawing {
    private double radius;

    public Circle(String name, double area, double radius, String color) {
        super(name, area, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure: ").append(getName())
                .append(", ").append("area: ").append(getArea()).append(", ")
                .append("radius: ").append(getRadius()).append(", ").append("color: ")
                .append(getColor()).toString());
    }
}
