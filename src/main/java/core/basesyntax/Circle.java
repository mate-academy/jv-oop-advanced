package core.basesyntax;

class Circle extends AbstractFigure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + getArea());
    }
}