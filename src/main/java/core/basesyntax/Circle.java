package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    private final double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = Math.ceil(radius * 10) / 10;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.ceil((Math.PI * radius * radius) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Circle, area: " + area + " sq. units, radius: " + radius + ", color: "
                + getColor());
    }
}
