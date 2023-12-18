package core.basesyntax;

class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public String draw() {
        return "radius: " + radius + " unit, " + "color: " + getColor();
    }
}
