package core.basesyntax;

class Circle extends Figure {
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    private double radius;
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println("Figure: Circle, Color: " + color + ", Radius: " + radius + ", Area: " + area());
    }
}
