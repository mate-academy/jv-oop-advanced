package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String colorFigure, int radius) {
        super(colorFigure);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColorFigure());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
