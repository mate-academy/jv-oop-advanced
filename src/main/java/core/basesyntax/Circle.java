package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public Double getAreaCalculator() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: circle, area: " + this.getAreaCalculator()
                + " sq.units, radius: " + radius + " units, color: "
                + super.getColor());
    }
}
