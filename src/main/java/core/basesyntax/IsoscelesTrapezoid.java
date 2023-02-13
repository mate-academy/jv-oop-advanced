package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) / 2.0) * height;
    }

    @Override
    public String draw() {
        return "IsoscelesTrapezoid{"
                + "area=" + getArea()
                + ", firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + ", height=" + height
                + ", color=" + getColor().name() + '}';
    }
}
