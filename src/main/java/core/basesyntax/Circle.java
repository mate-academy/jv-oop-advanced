package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Radius: " + radius + " units");
    }
}
