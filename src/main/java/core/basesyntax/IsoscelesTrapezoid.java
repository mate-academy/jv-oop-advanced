package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int height;
    private final int firstSide;
    private final int secondSide;

    public IsoscelesTrapezoid(Color color, int height, int firstSide, int secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure : IsoscelesTrapezoid; area : " + getArea() + " sq.units, "
                + " first side : " + firstSide + " units, "
                + " second side : " + secondSide + " units, "
                + " height : " + height + " units, "
                + " color : " + getColor().name());
    }

    @Override
    public double getArea() {
        return height / 2 * (firstSide + secondSide);
    }
}
