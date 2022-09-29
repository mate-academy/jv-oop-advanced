package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double areaCalculation() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public void display() {
        System.out.println("Figure: " + name() + ", area: " + areaCalculation()
                + " sq.units, radius: " + this.radius + " units, color: " + getColor());
    }

    @Override
    public String name() {
        return Figures.CIRCLE.name();
    }
}
