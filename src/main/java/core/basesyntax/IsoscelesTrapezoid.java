package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int oneSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int oneSide, int secondSide, int height) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((oneSide + secondSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, one side: " + oneSide + " second side " + secondSide + " height "
                + height + ", color: " + color);
    }
}
