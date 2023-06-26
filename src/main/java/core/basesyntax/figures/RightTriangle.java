package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getSide() {
        return firstLeg;
    }

    public int getHeight() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (float) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.unit, side: "
                + getSide() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
