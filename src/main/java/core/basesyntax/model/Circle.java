package core.basesyntax.model;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("Figure: circle, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, radius: ")
                .append(radius).append(" units, color: ")
                .append(super.getColor().toLowerCase()));
    }
}
