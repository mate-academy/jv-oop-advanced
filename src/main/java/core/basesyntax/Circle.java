package core.basesyntax;

class Circle extends Figure {
    private  double radius;
    private Color color;

    Circle(double radius, Color color) {
        name = "Circle";
        this.setColor(color);
        this.setRadius(radius);
    }

    @Override
    String color() {
        return getColor().name().toLowerCase();
    }

    @Override
    double area() {
        return 3.1415 * getRadius() * getRadius();
    }

    @Override
    String showName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + showName() + ", area: " + area()
                + "units, side: " + getRadius() + " units, color: " + color();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
