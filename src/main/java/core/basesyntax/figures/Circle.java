package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        calcArea();
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Radius: " + roundDouble(radius) + " units");
    }

    @Override
    public void calcArea() {
        area = Math.PI * radius * radius;
    }
}
