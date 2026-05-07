package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder(
                String.format(BASIC_PRINT_INFO, "circle", getArea(), color)
        );

        info.append(", radius: ").append(String.format("%.1f", radius)).append(" units");
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
