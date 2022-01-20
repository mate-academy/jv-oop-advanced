package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: circle, area: ").append(getArea())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(getColor()).toString());
    }
}


