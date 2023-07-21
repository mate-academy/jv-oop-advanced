package core.basesyntax;

class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
