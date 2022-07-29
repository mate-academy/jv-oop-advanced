package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String figureColor, int radius) {
        super(figureColor);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        StringBuilder squareStringBuilder = new StringBuilder();
        String area = String.format("%.2f", obtainArea()).replace(',', '.');
        squareStringBuilder.append("Figure: circle, color: ").append(getFigureColor())
                .append(", radius: ").append(radius).append(" units")
                .append(", area: ").append(area).append(" sq.units");
        System.out.println(squareStringBuilder);
    }
}
