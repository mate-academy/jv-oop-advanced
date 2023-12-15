package core.basesyntax;

class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "circle";
    }

    public String draw() {
        return "radius: " + radius + " unit, " + "color: " + getColor();
    }
}
