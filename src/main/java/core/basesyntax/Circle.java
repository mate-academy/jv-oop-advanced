package core.basesyntax;

class Circle extends Figure {
    private final int radius;
    private final String color;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String formattedArea = String.format("%.1f", getArea());
        System.out.println("Figure: circle, area: " + formattedArea + " sq.units, radius: "
                + radius + " units, color: " + color);
    }
}
