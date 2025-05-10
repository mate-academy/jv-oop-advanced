package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: circle, color: "
                + getColor().toString().toLowerCase()
                + ", area: " + Math.round(getArea()) + " sq. units, "
                + "radius: " + radius + " units");
    }
}
