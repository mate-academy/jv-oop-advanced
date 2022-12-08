package core.basesyntax;

public class Circle extends Figure {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double figureArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void figureInformation() {
        System.out.println("Figure: circle, area: " + this.figureArea() + "sq.units, radius: " + this.getRadius() + ", color: " + this.getColor());
    }

    @Override
    public Figure getRandomFigure() {
        this.setColor(new ColorSupplier().getRandomColor());

    }
}
