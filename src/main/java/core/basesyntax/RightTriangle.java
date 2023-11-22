package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int SIDE_RIGHT_TRIANGLE = 4;

    private int catheteA;
    private int catheteB;

    public RightTriangle(int catheteA, int catheteB, Color color) {
        super(color);
        this.catheteA = catheteA;
        this.catheteB = catheteB;
    }

    public int getCatheteA() {
        return catheteA;
    }

    public int getCatheteB() {
        return catheteB;
    }

    @Override
    public double getArea() {
        return 0.5 * getCatheteA() * getCatheteB();
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq.cm., sides: " + SIDE_RIGHT_TRIANGLE + " units, firstLeg: "
                + getCatheteA() + " cm., secondLeg: " + getCatheteB()
                + " cm., color: " + getColor());
    }
}
