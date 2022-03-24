package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        this.area = Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Figure: " + "circle,"
                + " area: " + area + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + super.getColor().toLowerCase();
    }

    @Override
    public void paint() {
        System.out.println(this);
    }
}
