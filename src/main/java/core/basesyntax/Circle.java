package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.figureType = "circle";
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + figureType + ", area: " + area
                + " sq.units, radius: " + radius + ", color: " + color);
    }
}
