package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(Color color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (side * height) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle "
                + " area " + calculateArea() + " sq.units,"
                + " side " + side + " units"
                + " height " + height + " units"
                + " color " + getColor());
    }
}
