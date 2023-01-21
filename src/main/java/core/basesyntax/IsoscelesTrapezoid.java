package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int oneSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int oneSide, int secondSide, int height, String color) {
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
        System.out.println("Figure: " + getClass().getSimpleName() + ", "
                + "area: " + this.getArea() + " sq.units, "
                + "oneSide: " + this.oneSide + " units, "
                + "secondSide: " + this.secondSide + " units, "
                + "height: " + this.height + " units, "
                + "color: " + this.color);
    }
}
