package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getAreaFigure() {

        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ")
                .append(getAreaFigure())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
