package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
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
