package core.basesyntax;

class Circle extends Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "circle";
    }

    public String getInfo() {
        return "radius: " + radius + " unit, " + "color: " + color;
    }
}


