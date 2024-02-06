package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double gerArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "Circle " + "\n" + "radius " + "= " + radius + " degrees" + "\n" + "Square "
                + "= " + gerArea() + " sq.units" + "\n" + "colors " + "= " + getColor());
    }
}
