package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("circle,"
                + " area: " + getArea()
                + " sq.units,"
                + " radius: "
                + radius + " sq.units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
