package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculatorArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle"
                + ", area: "
                + calculatorArea() + " sq.units, radius: "
                + radius + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
