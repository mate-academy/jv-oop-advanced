package core.basesyntax;

class Circle extends Figure {
    private double radius;

    Circle(double radius, Color color) {
        super(color.name());
        this.setRadius(radius);
    }

    @Override
    public double area() {
        return 3.1415 * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + area()
                + "units, side: " + getRadius() + " units, color: " + getColor();
    }
}
