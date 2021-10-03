package core.basesyntax;

public class Circle extends Figure implements FigureArea {

    private int radius;

    public Circle() {

    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double AreaCalculator() {
        return (3.1416 * radius * radius / 2) ;
    }

    @Override
    public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: circle, area: ").append(AreaCalculator())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(color);
        System.out.println(stringBuilder);
    }
}
