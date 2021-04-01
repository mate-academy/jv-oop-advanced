package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius,String id, String color) {
        super(id, color);
        this.radius = radius;
    }

    @Override
    public String drawFigure() {
        return "Figure:" + getId()
                + ", Area " + calculateArea()
                + " sq, "
                + "Radius: " + radius
                + ", color " + getColor();

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
