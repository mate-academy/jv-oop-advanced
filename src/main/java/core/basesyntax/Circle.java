package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private String type;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        this.setType("circle");
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + " units, radius: " + radius + " units, color: " + getColor());
    }
}
