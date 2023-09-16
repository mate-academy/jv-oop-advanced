package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure : circle, area: " + (Math.round(calculateArea() * 100) / 100d)
                        + " sq.units, "
                        + "radius: " + radius + " units, "
                        + "color: " + color);
    }

}
