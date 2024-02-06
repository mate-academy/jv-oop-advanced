package core.basesyntax;

class Circle extends Figure {
    private String name = "circle";
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double calculateFigureArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String getFigureInformation() {
        return "Figure: " + name + ", area: " + calculateFigureArea()
                + " sq. units, radius: " + radius
                + " units, color: " + color;
    }
}
