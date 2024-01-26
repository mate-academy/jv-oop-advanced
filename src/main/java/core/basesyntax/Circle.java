package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        // Округляем площадь и радиус до двух знаков после запятой
        double roundedArea = Math.round(getArea() * 100.0) / 100.0;
        double roundedRadius = Math.round(radius * 100.0) / 100.0;

        return "Figure: circle, area: " + roundedArea + " sq. units, radius: "
                + roundedRadius + " units, color: " + color;
    }
}
