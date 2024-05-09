package core.basesyntax.figures;

public class Circle extends Figure {
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
        System.out.println(
                "This is a "
                + this.getColor()
                + " rectangle with radius = " + radius + " cm "
                + " and area " + this.getArea() + " square cm"
        );
    }
}
