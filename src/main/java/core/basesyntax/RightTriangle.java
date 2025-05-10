package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String SHAPE_NAME = "Right Triangle";

    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (1.0d * firstLeg * secondLeg) / 2;
    }

    @Override
    protected String getShapeName() {
        return SHAPE_NAME;
    }

    @Override
    protected String getSizeDescription() {
        return "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units";
    }
}
