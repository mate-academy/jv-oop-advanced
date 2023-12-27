package core.basesyntax;

class Circle extends Figure {
    private double radius;

    public Circle(double radius, ColorSupplier.Color color) {
        super(color);
        this.radius = radius;
        setName("circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        String figureDetails = "radius: " + radius + " unit, " + "color: " + getColor();

        // include additional information for draw()
        return super.draw() + "\n" + figureDetails;
    }
}
