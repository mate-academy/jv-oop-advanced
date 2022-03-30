package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private double radius;
    private double area;
    private Color color;

    public Circle(double radius) {
        this.radius = radius;
        this.area = getArea();
        this.color = super.getColor();
    }

    public Circle() {
        this.radius = 10;
        this.area = getArea();
        this.color = Color.white;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: "
                + area + " sq.units, radius: "
                + radius + " units, color: "
                + color;
    }
}
