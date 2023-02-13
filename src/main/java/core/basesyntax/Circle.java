package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle"
                + ", area: "
                + calculateArea() + " sq.units, radius: "
                + radius + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
