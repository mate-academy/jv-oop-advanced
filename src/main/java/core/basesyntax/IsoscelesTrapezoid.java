package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int DIVIDER_TWO = 2;
    private int paralelSideFirst;
    private int paralelSideSecond;
    private int height;

    public IsoscelesTrapezoid(String color, int paralelSideFirst, int paralelSideSecond,
                              int height) {
        super(color);
        this.paralelSideFirst = paralelSideFirst;
        this.paralelSideSecond = paralelSideSecond;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) ((paralelSideFirst + paralelSideSecond) / DIVIDER_TWO) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "paralel side 1: " + paralelSideFirst + " units, paralel side 2: "
                + paralelSideSecond + " units, height: " + height + " units,color: "
                + getColor().toLowerCase());
    }
}
