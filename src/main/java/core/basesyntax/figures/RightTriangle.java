package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, "
                + "area: " + getArea()
                + ", first leg: " + getFirstLeg()
                + ", second leg: " + getSecondLeg()
                + ", color: " + getColor());
    }
}
