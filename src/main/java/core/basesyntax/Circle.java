package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String type, String color, int radius) {
        super(type, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDrawing() {
        return "Figure : " + getType() + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: "
                + getColor();
    }
}
