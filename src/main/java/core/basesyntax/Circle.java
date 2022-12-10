package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String drawTheFigure() {
        return "Figure : circle, area: "
                + calculateArea() + " sq.units, radius: "
                + radius + " units, color: " + color.toLowerCase();
    }
}
