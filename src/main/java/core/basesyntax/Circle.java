package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.calculateArea()
                + "sq. units, radius: "
                + this.radius
                + " units, color: "
                + this.color);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
