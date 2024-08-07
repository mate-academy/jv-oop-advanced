package core.basesyntax;

public class Circle extends Figure {
    private static final double NUMBER_TEN = 10.0;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round((Math.PI * radius * radius) * NUMBER_TEN) / NUMBER_TEN;
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
