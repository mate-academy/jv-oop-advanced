package core.basesyntax;

public class Circle extends Figure {
    private static final int POWER_VALUE = 2;
    private double radius;

    public Circle(String color, double radius) {
        super(color.toLowerCase());
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, POWER_VALUE);
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: circle, area ").append(String.format("%.2f", calculateArea()))
                .append(" sq. units, radius ").append(radius)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
