package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private Color color;
    private int side;
    private int height;

    public IsoscelesTrapezoid(Color color, int side, int height) {
        this.color = color;
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((side + side) * 0.5) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square "
                + " area " + calculateArea() + " sq.units,"
                + " side " + side + " units,"
                + " height " + height + " units,"
                + " color " + color);
    }
}
