package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double radius, String color) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double obtainTheArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: " + super.getName().toLowerCase() + ", area: "
                + obtainTheArea() + " sq.units, radius: " + this.radius
                + " units, color: " + super.getColor().toLowerCase());
    }
}
