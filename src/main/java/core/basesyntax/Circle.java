package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public float areaOfFigure() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void drawFigure() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: circle, area: ")
                        .append(areaOfFigure())
                        .append(" sq.units, radius: ")
                        .append(radius)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
