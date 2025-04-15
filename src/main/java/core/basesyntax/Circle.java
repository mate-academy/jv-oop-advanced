package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + String.format("%.2f", getArea())
                + " sq. units, radius: " + radius + " units, color: "
                + super.getColor().toLowerCase());
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }
}
