package core.basesyntax;
class Circle extends AbstractFigure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq. units,"
                        + " radius: %.1f units, color: %s%n",
                getArea(), radius, getColor());
    }
}
