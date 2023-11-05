package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int side;
    private final int height;

    public IsoscelesTrapezoid(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return height * side;
    }
}
