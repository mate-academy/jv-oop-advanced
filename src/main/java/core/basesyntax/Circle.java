package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaOfFigure() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle"
                + ", radius = "
                + radius
                + " units"
                + ", area = "
                + areaOfFigure()
                + " units"
                + ", color = "
                + getColor()
        );
    }

    @Override
    public Figure getRandomFigure() {
        Circle circle = new Circle();
        circle.setColor(ColorSupplier.getRandomColor());
        circle.setRadius(random.nextDouble(30));
        return circle;
    }
}
