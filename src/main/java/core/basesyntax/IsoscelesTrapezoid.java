package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double topSide;
    private final double base;

    public IsoscelesTrapezoid(String color, double height, double topSide, double base) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.base = base;
    }

    @Override
    public double getArea() {
        return height * (topSide + base) / 2;
    }

    @Override
    public void name() {
        System.out.println("Color is " + getColor() + " Area = " + getArea() + " height = "
                + height + " topSide = " + topSide + " base = " + base);
    }
}
