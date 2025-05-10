package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int DIVIDER = 2;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / DIVIDER;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "right triangle" + ", area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + " secondLeg: " + secondLeg
                + " units, color: " + getColor().toLowerCase());
    }
}

