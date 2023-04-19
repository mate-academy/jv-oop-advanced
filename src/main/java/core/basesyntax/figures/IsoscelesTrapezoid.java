package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int smallerSide;
    private final int biggerSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int smallerSide, int biggerSide, int height) {
        super(color);
        this.smallerSide = smallerSide;
        this.biggerSide = biggerSide;
        this.height = height;
    }

    public int getSmallerSide() {
        return smallerSide;
    }

    public int getBiggerSide() {
        return biggerSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * (biggerSide * smallerSide) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, "
                + "area: " + getArea()
                + ", bigger side: " + getBiggerSide()
                + ", smaller side: " + getSmallerSide()
                + ", height: " + getHeight()
                + ", color: " + getColor());
    }
}
