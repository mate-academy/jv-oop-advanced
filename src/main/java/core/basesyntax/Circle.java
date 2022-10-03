package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    public double calcArea() {
        return super.setArea(Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public String toString() {
        return "Figure: Circle, " +
                "area: " + calcArea() +
                " sq.units, radius: " + radius  +
                " units, color: " + super.getColor();
    }
}
