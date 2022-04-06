package core.basesyntax.figures;

public class Circle extends Figure {
    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
        area();
    }

    @Override
    public void area() {
        area = 3.14 * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: circle," + "area:" + area + "sq.units," + "radius:" + radius + "units," + "color:" + color;
    }
}
