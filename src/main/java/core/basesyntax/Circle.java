package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle"
                + ", area: " + countArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor().toString().toLowerCase());
    }
}
