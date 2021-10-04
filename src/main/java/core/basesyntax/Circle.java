package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculator() {
        return (Math.PI * radius * radius / 2);
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: circle, area: " + areaCalculator()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
