package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round((Math.PI * radius * radius) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.calculateArea()
                + " sq. units, radius: "
                + this.radius
                + " units, color : "
                + super.getColor());
    }
}
