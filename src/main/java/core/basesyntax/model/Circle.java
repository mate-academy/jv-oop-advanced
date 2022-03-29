package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculation() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + areaCalculation()
                + " sq.units, radius: " + radius + " units, color: "
                + getColor());
    }
}
