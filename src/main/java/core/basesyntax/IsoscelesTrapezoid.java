package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int height;

    public IsoscelesTrapezoid(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side + side) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " units, side: "
                + side + " units, height: " + height + " units, color: " + getColor());
    }
}
