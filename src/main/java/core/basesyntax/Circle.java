package core.basesyntax;

public class Circle extends Figure implements FigureArea {

    private int radius;

    public Circle() {

    }

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double areaCalculator() {
        return (3.1416 * radius * radius / 2);
    }

    @Override
    public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: circle, area: ").append(areaCalculator())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
