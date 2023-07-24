package core.basesyntax;

class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String draw() {
        return ("Figure: Circle, area: "
                + getArea()
                + " sq.units, radius: "
                + radius + " units, color: "
                + color);
    }
}
