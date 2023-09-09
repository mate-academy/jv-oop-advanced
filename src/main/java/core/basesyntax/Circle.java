package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private final int defaultRadius = 10;

    public Circle() {
        this.color = Colors.WHITE;
        this.radius = defaultRadius;
    }

    public Circle(Colors color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public int areaCalculator() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void informationCalculator() {
        String circleInformation = new StringBuilder().append("Figure: circle, area: ")
                .append(areaCalculator())
                .append(" sq.units, radius: ")
                .append(this.radius)
                .append(" units, color: ")
                .append(this.color).toString();
        System.out.println(circleInformation);
    }
}
